####参照
- [1][ SurfaceFlinger启动过程分析](http://blog.chinaunix.net/uid-29043620-id-4859377.html)

###surfacelinger
> surfacelinger中维护mEGLContext,mEGLDisplay。通过mEGLContext能实现与mesa的同步，这个变量也是mesa维护的一个全局变量，mesa绘图操作会使用读写缓存。
> mEGLDisplay中包含了驱动信息与链接，egl平台（这里就是android平台）。
###surfcacelinger main函数
> main 函数中flinger->init()函数初始化了egl，display，driver，eglcontext等等

```sh
//Main_surfacelinger.cpp
int main(int, char**) {
    // When SF is launched in its own process, limit the number of
    // binder threads to 4.
    ProcessState::self()->setThreadPoolMaxThreadCount(4);

    // start the thread pool
    sp<ProcessState> ps(ProcessState::self());
    ps->startThreadPool();

    // instantiate surfaceflinger
    sp<SurfaceFlinger> flinger = new SurfaceFlinger();

#if defined(HAVE_PTHREADS)
    setpriority(PRIO_PROCESS, 0, PRIORITY_URGENT_DISPLAY);
#endif
    set_sched_policy(0, SP_FOREGROUND);

    // initialize before clients can connect
    flinger->init();//init

    // publish surface flinger
    sp<IServiceManager> sm(defaultServiceManager());
    sm->addService(String16(SurfaceFlinger::getServiceName()), flinger, false);

    // run in this thread
    flinger->run();

    return 0;
}
```

###SurfaceFlinger::init函数


> eglInitialize(mEGLDisplay, NULL, NULL);初始化为Display设置对应驱动

```c
//SurfaceFlinger.h SurfaceFlinger.c
void SurfaceFlinger::init() {
    ALOGI(  "SurfaceFlinger's main thread ready to run. "
            "Initializing graphics H/W...");

    status_t err;
    Mutex::Autolock _l(mStateLock);

    // initialize EGL for the default display
    mEGLDisplay = eglGetDisplay(EGL_DEFAULT_DISPLAY);
    eglInitialize(mEGLDisplay, NULL, NULL);

    // Initialize the H/W composer object.  There may or may not be an
    // actual hardware composer underneath.
    mHwc = new HWComposer(this,
            *static_cast<HWComposer::EventHandler *>(this));

    // get a RenderEngine for the given display / config (can't fail)
    mRenderEngine = RenderEngine::create(mEGLDisplay, mHwc->getVisualID());

    // retrieve the EGL context that was selected/created
    mEGLContext = mRenderEngine->getEGLContext();

    LOG_ALWAYS_FATAL_IF(mEGLContext == EGL_NO_CONTEXT,
            "couldn't create EGLContext");
    .......
    startBootAnim();
}
```

###surfacelinger 初始化函数中会调用eglGetDisplay并返回一个display[_EGLDisplay* 变量]
> 这个函数会先获取系统EGL的平台

- { _EGL_PLATFORM_X11, "x11" },
- { _EGL_PLATFORM_WAYLAND, "wayland" },
- { _EGL_PLATFORM_DRM, "drm" },
- { _EGL_PLATFORM_ANDROID, "android" },
- { _EGL_PLATFORM_HAIKU, "haiku" },
- { _EGL_PLATFORM_SURFACELESS, "surfaceless" }

> 再依据平台找到一个display[_EGLDisplay* 变量]，若不存在就创建一个display
> _EGLDisplay是struct _egl_display的别名



###接着初始化函数调用eglInitialize,在这里才会真正加载硬件驱动。
> 主要操作_eglMatchDriver(disp, EGL_FALSE)，为display匹配的驱动
> 在_eglMatchDriver 首先会_eglAddDrivers()加载driver。首先会依据环境变量加载driver，如果不存在才会加载内置的driver，
代码中为egl_dri2或者egl_haiku两种驱动。

```c
/**
 * This is typically the second EGL function that an application calls.
 * Here we load/initialize the actual hardware driver.
 */
EGLBoolean EGLAPIENTRY
eglInitialize(EGLDisplay dpy, EGLint *major, EGLint *minor)
{
   _EGLDisplay *disp = _eglLockDisplay(dpy);
....
   if (!disp->Initialized) {
      if (!_eglMatchDriver(disp, EGL_FALSE))
         RETURN_EGL_ERROR(disp, EGL_NOT_INITIALIZED, EGL_FALSE);
.....
   RETURN_EGL_SUCCESS(disp, EGL_TRUE);
}

const struct {
   const char *name;
   _EGLMain_t main;
} _eglBuiltInDrivers[] = {
#ifdef _EGL_BUILT_IN_DRIVER_DRI2
   { "egl_dri2", _eglBuiltInDriverDRI2 },
#endif
#ifdef _EGL_BUILT_IN_DRIVER_HAIKU
   { "egl_haiku", _eglBuiltInDriverHaiku },
#endif
   { NULL, NULL }
};
```

### 接着调用RenderEngine::create(mEGLDisplay, mHwc->getVisualID())

> 从log信息来看，这里是实现对eglContext的设置
> 主要操作在create的eglMakeCurrent
> 与freeglut类似，这里调用_mesa_make_current。从而达到与mesa的交互。




#### struct _egl_display
```c
 struct _egl_display
{
   /* used to link displays */
   _EGLDisplay *Next;

   mtx_t Mutex;

   _EGLPlatformType Platform; /**< The type of the platform display */
   void *PlatformDisplay;     /**< A pointer to the platform display */

   _EGLDriver *Driver;        /**< Matched driver of the display */
   EGLBoolean Initialized;    /**< True if the display is initialized */

   /* options that affect how the driver initializes the display */
   struct {
      EGLBoolean TestOnly;    /**< Driver should not set fields when true */
      EGLBoolean UseFallback; /**< Use fallback driver (sw or less features) */
   } Options;

   /* these fields are set by the driver during init */
   void *DriverData;          /**< Driver private data */
   EGLint Version;            /**< EGL version major*10+minor */
   EGLint ClientAPIs;         /**< Bitmask of APIs supported (EGL_xxx_BIT) */
   _EGLExtensions Extensions; /**< Extensions supported */

   /* these fields are derived from above */
   char VersionString[100];                        /**< EGL_VERSION */
   char ClientAPIsString[100];                     /**< EGL_CLIENT_APIS */
   char ExtensionsString[_EGL_MAX_EXTENSIONS_LEN]; /**< EGL_EXTENSIONS */

   _EGLArray *Screens;
   _EGLArray *Configs;

   /* lists of resources */
   _EGLResource *ResourceLists[_EGL_NUM_RESOURCES];
};
```