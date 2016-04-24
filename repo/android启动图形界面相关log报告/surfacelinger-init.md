#### 参照
- [1][ SurfaceFlinger启动过程分析](http://blog.chinaunix.net/uid-29043620-id-4859377.html)



###surfaceFlinger

> surfacelinger中维护mEGLContext,mEGLDisplay。通过mEGLContext能实现与mesa的同步，这个变量也是mesa维护的一个全局变量，mesa绘图操作会使用读写缓存。
> mEGLDisplay中包含了驱动信息与链接，egl平台（这里就是android平台）。
###surfcacelinger main函数
> main 函数中flinger->init()函数初始化了egl，display，driver，eglcontext等等


	//Main_surfaceFlinger.cpp
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


### SurfaceFlinger::init函数


> eglInitialize(mEGLDisplay, NULL, NULL);初始化为Display设置对应驱动


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

<<<<<<< HEAD
### surfacelinger 初始化函数中会调用eglGetDisplay并返回一个display[_EGLDisplay* 变量]
=======
###surfaceFlinger 初始化函数中会调用eglGetDisplay并返回一个display[_EGLDisplay* 变量]
>>>>>>> a677db62b8e00b0812dd3ba8b0c64e1f4bb0423f
> 这个函数会先获取系统EGL的平台

- { _EGL_PLATFORM_X11, "x11" },
- { _EGL_PLATFORM_WAYLAND, "wayland" },
- { _EGL_PLATFORM_DRM, "drm" },
- { _EGL_PLATFORM_ANDROID, "android" },
- { _EGL_PLATFORM_HAIKU, "haiku" },
- { _EGL_PLATFORM_SURFACELESS, "surfaceless" }

> 再依据平台找到一个display[_EGLDisplay* 变量]，若不存在就创建一个display
> _EGLDisplay是struct _egl_display的别名



### Driver初始化
> 接着初始化函数调用eglInitialize,在这里才会真正加载硬件驱动。
> 主要操作_eglMatchDriver(disp, EGL_FALSE)，为display匹配的驱动



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
	----------------------------------------------------------
> _eglMatchDriver 主要操作就是执行 _eglMatchAndInitialize。

	_EGLDriver *
	_eglMatchDriver(_EGLDisplay *dpy, EGLBoolean test_only)
	{
	   _EGLDriver *best_drv;

	  	.....
	   best_drv = _eglMatchAndInitialize(dpy);
	   if (!best_drv) {
	      dpy->Options.UseFallback = EGL_TRUE;
	      best_drv = _eglMatchAndInitialize(dpy);
	   }
		.....
		 dpy->Driver = best_drv;
         dpy->Initialized = EGL_TRUE;
		.....
	   return best_drv;
	----------------------------------------------------------

#### 匹配Dirver
	>  以下是 _eglMatchAndInitialize的具体实现。可以看出首先是调用_eglAddDrivers。

	/**
	 * A helper function for _eglMatchDriver.  It finds the first driver that can
	 * initialize the display and return.
	 */
	static _EGLDriver *
	_eglMatchAndInitialize(_EGLDisplay *dpy)
	{
	   _EGLDriver *drv = NULL;
	   EGLint i = 0;

	   if (!_eglAddDrivers()) {
	      _eglLog(_EGL_WARNING, "failed to find any driver");
	      return NULL;
	   }

	   if (dpy->Driver) {
	      drv = dpy->Driver;
	      /* no re-matching? */
	      if (!drv->API.Initialize(drv, dpy))
	         drv = NULL;
	      return drv;
	   }

	   while (i < _eglModules->Size) {
	      _EGLModule *mod = (_EGLModule *) _eglModules->Elements[i];

	      if (!_eglLoadModule(mod)) {
	         /* remove invalid modules */
	         _eglEraseArray(_eglModules, i, _eglFreeModule);
	         continue;
	      }

	      if (mod->Driver->API.Initialize(mod->Driver, dpy)) {
	         drv = mod->Driver;
	         break;
	      }
	      else {
	         i++;
	      }
	   }

	   return drv;
	}

	static EGLBoolean
	_eglAddDrivers(void)
	{
	   if (_eglModules)
	      return EGL_TRUE;

	   if (!_eglAddUserDriver()) {
	      /*
	       * Add other drivers only when EGL_DRIVER is not set.  The order here
	       * decides the priorities.
	       */
	      _eglAddBuiltInDrivers();
	   }

	   return (_eglModules != NULL);
	}
#### 加载Driver 模块

> _eglBuiltInDrivers 数组最多会包含{{ "egl_dri2", _eglBuiltInDriverDRI2 }
> { "egl_haiku", _eglBuiltInDriverHaiku },{ NULL, NULL }} 。
> _eglModules 是eglDrivers的一个全局变量(初次使用_eglAddModule会被初始化)。
> 同时这里为对应driver模块复制入口函数。
> _eglAddBuiltInDrivers 功能与 _eglAddUserDriver类似，汇总后者调用失败是调用，这里会将预置的driverModule都加入。.
> driverModule 会保存在一个全局变量 _eglModules中。

	static EGLBoolean
	_eglAddUserDriver(void)
	{
	   char *env;

	   env = getenv("EGL_DRIVER");
	   if (env) {
	      EGLint i;

	      for (i = 0; _eglBuiltInDrivers[i].name; i++) {
	         if (!strcmp(_eglBuiltInDrivers[i].name, env)) {
	            _EGLModule *mod = _eglAddModule(env);
	            if (mod)
	               mod->BuiltIn = _eglBuiltInDrivers[i].main;

	            return EGL_TRUE;
	         }
	      }
	   }

	   return EGL_FALSE;
	----------------------------------------------------------

#### 初始化eglAPI函数

> 这一步非常关键，_eglLoadModule不仅仅只加载模块。它会执行一步操作drv = mod->BuiltIn(NULL)，而BuiltIn函数指针在android平台下就是 _eglBuiltInDriverDRI2。

	if (!_eglLoadModule(mod)) {
		         /* remove invalid modules */
		         _eglEraseArray(_eglModules, i, _eglFreeModule);
		         continue;
		      }

>	进一步查看 _eglBuiltInDriverDRI2。首先是 
_eglInitDriverFallbacks这里也是为dri2_drv这个变量设置函数指针所指向的函数。
> dri2_drv->base.API.Initialize = dri2_initialize; 这一句会将API.Initialize指向dri2_initialize，而这个函数会在下面用到。最后mod->Driver会被设置为一个 _EGLDriver 变量（已初始化,包含函数分发表）

	/**
	 * This is the main entrypoint into the driver, called by libEGL.
	 * Create a new _EGLDriver object and init its dispatch table.
	 */
	_EGLDriver *
	_eglBuiltInDriverDRI2(const char *args)
	{
	   struct dri2_egl_driver *dri2_drv;

	   (void) args;

	   dri2_drv = calloc(1, sizeof *dri2_drv);
	   if (!dri2_drv)
	      return NULL;

	   if (!dri2_load(&dri2_drv->base)) {
	      free(dri2_drv);
	      return NULL;
	   }

	   _eglInitDriverFallbacks(&dri2_drv->base);
	   dri2_drv->base.API.Initialize = dri2_initialize;
	   dri2_drv->base.API.Terminate = dri2_terminate;
	   .....
	   return &dri2_drv->base;
	   }

#### 为display 设置与初始化 Driver

> 这里看代码，首先是调用一个Initialize函数，这里的Initialize函数就是上一步中的dri2_initialize。在android平台下
这一部会执行 dri2_initialize_android.

	/**
	 * Called via eglInitialize(), GLX_drv->API.Initialize().
	 */
	static EGLBoolean
	dri2_initialize(_EGLDriver *drv, _EGLDisplay *disp)
	{
	   /* not until swrast_dri is supported */
	   if (disp->Options.UseFallback) // 环境变量重不存在driver就会执行这步操作
	      return EGL_FALSE;

	......
	#ifdef HAVE_X11_PLATFORM
	   case _EGL_PLATFORM_X11:
	      if (disp->Options.TestOnly)
	         return EGL_TRUE;
	      return dri2_initialize_x11(drv, disp);
	#endif
	......
	#ifdef HAVE_ANDROID_PLATFORM
	   case _EGL_PLATFORM_ANDROID:
	      if (disp->Options.TestOnly)
	         return EGL_TRUE;
	      return dri2_initialize_android(drv, disp);
	#endif
	.....
	}

> dri2_initialize_android 看不太明白，大致是完成一些初始化，往后分析应该能确认它的作用。

> 初始化结束后会返回一个_EGLDriver 变量，这个变量会赋值到display


> 这里的API也是一个 _egl_api 对象，里面包含着函数指针。


### 接着调用RenderEngine::create(mEGLDisplay, mHwc->getVisualID())

> 从log信息来看，这里是实现对eglContext的设置
> 主要操作在create的eglMakeCurrent，这个函数会调用函数分发表的MakeCurrent。
> 之前理解错误。实际上这个函数会指向dri2_make_current。这一步会传递Driver对象,以及用于读写的EGlsurface。





#### struct _egl_display

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
<<<<<<< HEAD
	http://blog.csdn.net/DroidPhone/article/details/5799792
=======
>>>>>>> a677db62b8e00b0812dd3ba8b0c64e1f4bb0423f
