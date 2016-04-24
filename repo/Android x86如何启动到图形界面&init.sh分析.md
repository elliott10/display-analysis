# Android系统在启动的过程中，
最多可以出现三个画面
- 第一个开机画面是在内核启动的过程中出现的，它是一个静态的画面。在默认情况下，这个画面是不会出现的，除非我们在编译内核的时候，
- 第二个开机画面是在init进程启动的过程中出现的，它也是一个静态的画面。
- 第三个开机画面由应用程序bootanimation来负责显示的。是在系统服务启动的过程中出现的，它是一个动态的画面。无论是哪一个画面，它们都是在一个称为帧缓冲区（frame buffer，简称fb）的硬件设备上进行渲染的。
## 具体

- Android系统的SurfaceFlinger服务有两种启动方式：

 1、 在SystemServer进程中以服务线程的方式提供服务;
启动Zygote=》调用SystemServer.java[frameworks\base\services\java\com\android\server]的main函数，=》调用本地函数init1()=》frameworks\base\services\java JNI的com_android_server_SystemServer.cpp里面的android_server_SystemServer_init1函数=》然后调用
System_init.cpp[frameworks\base\cmds\system_server\library]的system_init函数，通过获取属性字段system_init.startsurfaceflinger，如果字段值为1，那么就在这里启动surfaceflinger。


 2、启动SurfaceFlinger独立的进程通过服务。
第二中方式是在Android启动脚本init.rc中配置SurfaceFlinger服务，通过init进程来启动的。
具体：
有一个可执行文件surfaceflinger，由framework/base/cmds/surfaceflinger编译产生，目录下的主要文件main_surfaceflinger.cpp里面就一个main函数：以上两者都会调用SurfaceFlinger.cpp文件的instantiate函数

- 启动surfaceflinger后：
 1、 surfaceflinger构造函数调用readyToRun函数, 该函数定义了线程循环前需要初始化的内容。
readyToRun()调用过程： 
（1）执行new DisplayHardware(this,dpy)，通过DisplayHardware初始化Framebuffer、EGL并获取OpenGL ES信息。 
（2）创建共享的内存控制块。 
（3）将EGL与当前屏幕绑定。 
（4）初始化共享内存控制块。 
（5）初始化OpenGL ES。 
（6）显示开机动画。
 
- 相关的函数及位置：
 DisplayHardware.cpp[frameworks\base\libs\surfaceflinger\displayhardware]

 gralloc.cpp [hardware\libhardware\modules\gralloc]

 gralloc.h[hardware\libhardware\include\hardware]
 




 
###  /andriod-x86/device/generic/common/init.sh   的分析
     
 -  和显示相关的代码主要有两部分
  

1、表示初始化

 
```sh

function do_init()
{
	init_misc
	init_hal_audio
	init_hal_bluetooth
	init_hal_camera
	init_hal_gps
	init_hal_gralloc  //初始化gralloc
	init_hal_hwcomposer
	init_hal_lights
	init_hal_power
	init_hal_sensors
	init_tscal
	init_ril
	chmod 640 /x86.prop
	post_init
}
  ```
 
  
   2、  帧缓冲的初始化
```sh
function init_hal_gralloc()
{

	case "$(cat /proc/fb | head -1)" in    // 帧缓冲设备列表，包括数量和控制它的驱动
		0*inteldrmfb|0*radeondrmfb|0*nouveaufb|0*svgadrmfb)
			set_property ro.hardware.gralloc drm   // ro.hardware.gralloc = drm . drm 是一个 Linux 内核的显示系统驱动框架,模拟一个 fb device
			set_drm_mode    //设置分辨率1366x768
			;;
		"")
			init_uvesafb     //根据情况设置为：1280x800,1600x900,1024x600,1024x768
			;&
		0*)
			[ "$HWACCEL" = "1" ] || set_property debug.egl.hw 0  //debug.egl.hw = 0
			;;
	esac

```

