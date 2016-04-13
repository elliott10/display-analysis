# Gralloc的实现原理分析
屏幕中画出一个画面流程：
 1.  分配一个匹配屏幕大小的图形缓冲区
 2.  将分配好的图形缓冲区注册（映射）到当前进程的地址空间来
 3.  将要绘制的画面的内容写入到已经注册好的图形缓冲区中去，并且渲染（拷贝）到系统帧缓冲区中去
为了实现以上三个操作，我们还需要：
1. 加载Gralloc模块
2. 打开Gralloc模块中的gralloc设备和fb设备
其中，gralloc设备负责分配图形缓冲区，Gralloc模块负责注册图形缓冲区，而fb设备负责渲染图形缓冲区。

- Android设备的显示屏被抽象为一个帧缓冲区，而Android系统中的SurfaceFlinger服务就是通过向这个帧缓冲区写入内容来绘制应用程序的用户界面的。Android系统在硬件抽象层中提供了一个Gralloc模块，封装了对帧缓冲区的所有访问操作。
- Linux内核在启动的过程中会创建一个类别和名称分别为“graphics”和“fb0”的设备，用来描述系统中的第一个帧缓冲区，即第一个显示屏。
init进程—>启动进程ueventd来管理系统的设备文件—>ueventd进程通过netlink接口来Linux内核通信，以便可以获得内核中的硬件设备变化通知。而当ueventd进程发现内核中创建了一个类型和名称分别为“graphics”和“fb0”的设备的时候，就会这个设备创建一个/dev/graphics/fb0设备文件。这样，用户空间的应用程序就可以通过设备文件/dev/graphics/fb0来访问内核中的帧缓冲区，即在设备的显示屏中绘制指定的画面。
- 当用户空间中的应用程序不再需要使用一块图形缓冲区的时候，就可以通过gralloc设备来释放它，并且将它从地址空间中解除映射。

- ### 图解
![](http://i4.piimg.com/7f6e950a62410438.png)


-  一、  Gralloc模块的加载过程。
        HAL模块都有ID值，hw_get_module就通过ID模块加载到内存，并且获得一个hw_module_t接口来打开相应的设备。
    Gralloc模块的ID值在hardware/libhardware/include/hardware/gralloc.h文件中，
  
  ![](http://i4.piimg.com/96f56c2931fa715d.png)

函数hw_get_module实现在hardware/libhardware/hardware.c文件中



```sh

#include <hardware/hardware.h>

#include <cutils/properties.h>

#include <dlfcn.h>
#include <string.h>
#include <pthread.h>
#include <errno.h>
#include <limits.h>

#define LOG_TAG "HAL"
#include <utils/Log.h>

/**     hal modules 的查找路径  */
#if defined(__LP64__)
#define HAL_LIBRARY_PATH1 "/system/lib64/hw"
#define HAL_LIBRARY_PATH2 "/vendor/lib64/hw"
#else
#define HAL_LIBRARY_PATH1 "/system/lib/hw"
#define HAL_LIBRARY_PATH2 "/vendor/lib/hw"
#endif

static const char *variant_keys[] = {
    "ro.hardware",  /* This goes first so that it can pick up a different
                       file on the emulator. */
    "ro.product.board",
    "ro.board.platform",
    "ro.arch"
};

static const int HAL_VARIANT_KEYS_COUNT =
    (sizeof(variant_keys)/sizeof(variant_keys[0]));

static int load(const char *id,
        const char *path,
        const struct hw_module_t **pHmi)
{
    int status;
    void *handle;
    struct hw_module_t *hmi;

    handle = dlopen(path, RTLD_NOW);
    if (handle == NULL) {
        char const *err_str = dlerror();
        ALOGE("load: module=%s\n%s", path, err_str?err_str:"unknown");
        status = -EINVAL;
        goto done;
    }

    const char *sym = HAL_MODULE_INFO_SYM_AS_STR;
    hmi = (struct hw_module_t *)dlsym(handle, sym);   
    
    /*Gralloc模块加载到内存中来之后，就可以调用函数dlsym来获得它所导出的符号
    *HMI。由于这个符号指向的是一个hw_module_t结构体，因此，最后函数load就可以强制地
    *将这个符号转换为一个hw_module_t结构体指针，并且保存在输出参数pHmi中返回给调用者。
    调用者获得了这个hw_module_t结构体指针之后，就可以创建一个gralloc设备或者一个fb设备
    */
    if (hmi == NULL) {
        ALOGE("load: couldn't find symbol %s", sym);
        status = -EINVAL;
        goto done;
    }

    /* Check that the id matches */
    if (strcmp(id, hmi->id) != 0) {
        ALOGE("load: id=%s != hmi->id=%s", id, hmi->id);
        status = -EINVAL;
        goto done;
    }

    hmi->dso = handle;

    /* success */
    status = 0;

    done:
    if (status != 0) {
        hmi = NULL;
        if (handle != NULL) {
            dlclose(handle);
            handle = NULL;
        }
    } else {
        ALOGV("loaded HAL id=%s path=%s hmi=%p handle=%p",
                id, path, *pHmi, handle);
    }

    *pHmi = hmi;

    return status;
}

static int hw_module_exists(char *path, size_t path_len, const char *name,
                            const char *subname)
{
    snprintf(path, path_len, "%s/%s.%s.so",
             HAL_LIBRARY_PATH2, name, subname);
    if (access(path, R_OK) == 0)
        return 0;

    snprintf(path, path_len, "%s/%s.%s.so",
             HAL_LIBRARY_PATH1, name, subname);
    if (access(path, R_OK) == 0)
        return 0;

    return -ENOENT;
}

int hw_get_module_by_class(const char *class_id, const char *inst,
                           const struct hw_module_t **module)
{
    int i;
    char prop[PATH_MAX];
    char path[PATH_MAX];
    char name[PATH_MAX];
    char prop_name[PATH_MAX];

    if (inst)
        snprintf(name, PATH_MAX, "%s.%s", class_id, inst);
    else
        strlcpy(name, class_id, PATH_MAX);
        
    /* First try a property specific to the class and possibly instance */
    snprintf(prop_name, sizeof(prop_name), "ro.hardware.%s", name);
    if (property_get(prop_name, prop, NULL) > 0) {
        if (hw_module_exists(path, sizeof(path), name, prop) == 0) {
            goto found;
        }
    }
    /*  查找一个名称为
       gralloc.<ro.hardware>.so
       gralloc.<ro.product.board>.so
       gralloc.<ro.board.platform>.so
       gralloc.<ro.arch>.so */
    for (i=0 ; i<HAL_VARIANT_KEYS_COUNT; i++) {
        if (property_get(variant_keys[i], prop, NULL) == 0) {
            continue;
        }
        if (hw_module_exists(path, sizeof(path), name, prop) == 0) {
            goto found;
        }
    }
    /* 若不存在上述四个，则看是否有default.so, 如果存在的话，那么也会调用函数load将它加载到内存中来。*/
    if (hw_module_exists(path, sizeof(path), name, "default") == 0) {
        goto found;
    }
    return -ENOENT;
found:
    return load(class_id, path, module);
}
int hw_get_module(const char *id, const struct hw_module_t **module)
{
    return hw_get_module_by_class(id, NULL, module);   /**返回hw_get_module_by_class*/
}

```

- 调用过程：hw_get_module——hw_get_module_by_class——hw_module_exist，load。
   
- 在Linux系统中，后缀名为"so"的文件为动态链接库文件，load可通过函数dlopen来加载到内存中。硬件抽象层模块编写规范规定每一个硬件抽象层模块都必须导出一个符号名称为HAL_MODULE_INFO_SYM_AS_STR的符号，类型为hw_module_t

- 文件位置：hardware/libhardware/include/hardware/hardware.h

  1.#define HAL_MODULE_INFO_SYM         HMI  
  2.#define HAL_MODULE_INFO_SYM_AS_STR  "HMI"  
HAMI描述hw_module_t的结构体的。
符号HAL_MODULE_INFO_SYM的类型为private_module_t（继承于结构体hw_module_t）。
    
- 将Gralloc模块加载到内存中来之后，就可以调用函数dlsym来获得它所导出的符号HMI。由于这个符号指向的是一个hw_module_t结构体，因此，最后函数load就可以强制地将这个符号转换为一个hw_module_t结构体指针，并且保存在输出参数pHmi中返回给调用者。调用者获得了这个hw_module_t结构体指针之后，就可以创建一个gralloc设备或者一个fb设备。
Gralloc实现在hardware/libhardware/modules/gralloc/gralloc.cpp中。



