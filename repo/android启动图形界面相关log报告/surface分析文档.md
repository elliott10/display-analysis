### surfacefliner 

#### [初始化](./surfacelinger-init.md) [点击](./surfacelinger-init.md)

#### onMessageReceived

> surfacefliner 在初始化之后就会等待信息
>> 由以下三个函数处理不同的信息
>>   [handleMessageTransaction函数处理系统显示屏以及应用程序窗口的属性变化，并不进行绘制](http://blog.csdn.net/yangwen123/article/details/17001405)。
>> 	 handleMessageInvalidate 会确定是否需要重绘，若需要以及区域。
>>   handleMessageRefresh 进行窗口绘制。

### handleMessageRefresh 绘制
	void SurfaceFlinger::handleMessageRefresh() {
	    ATRACE_CALL();
	    preComposition();
	    rebuildLayerStacks();
	    setUpHWComposer();
	    doDebugFlashRegions();
	    doComposition();
	    postComposition();
	}

-  preComposition 依照层次排序，过滤去需要刷新的图层;
-  rebuildLayerStacks(); 对需要绘制进行再次过滤（对图层进行仿射变换后，考虑图层的属性进行过滤，同时显示某个屏幕是否有效也会被考虑）。
- setUpHWComposer();初始化一个硬件容器
-  doComposition();主要的合成过程，将合成完的BUFFER由mesa处理。
-  postComposition();

### doComposition()

void SurfaceFlinger::doComposition() {
			.....
            // transform the dirty region into this screen's coordinate space
            const Region dirtyRegion(hw->getDirtyRegion(repaintEverything));

            // repaint the framebuffer (if needed)
            doDisplayComposition(hw, dirtyRegion);

            hw->dirtyRegion.clear();
            hw->flip(hw->swapRegion);
            hw->swapRegion.clear();
            .....
    }
    postFramebuffer();

- - -

> 是mesa的交互接口。重绘操作在doDisplayComposition(hw, dirtyRegion);执行。
而上面这个函数主要操作为hw->swapBuffers(getHwComposer());

	void SurfaceFlinger::doDisplayComposition(const sp<const DisplayDevice>& hw,
	        const Region& inDirtyRegion)
	{
	 	......

	    // update the swap region and clear the dirty region
	    hw->swapRegion.orSelf(dirtyRegion);

	    // swap buffers (presentation)
	    hw->swapBuffers(getHwComposer());
	}
- - -
	void DisplayDevice::swapBuffers(HWComposer& hwc) const {

	    if (hwc.initCheck() != NO_ERROR ||(hwc.hasGlesComposition(mHwcDisplayId) &&
	             (hwc.supportsFramebufferTarget() || mType >= DISPLAY_VIRTUAL))) {
	        EGLBoolean success = eglSwapBuffers(mDisplay, mSurface);
	        if (!success) {
					......
	        }
	    }
					.....
	}

- - -


> 这步调用了mesa的eglSwapBuffers。而这里的参数mDisplay与mSurface来自DisplayDevice构造函数

    EGLDisplay display = eglGetDisplay(EGL_DEFAULT_DISPLAY);
    if (config == EGL_NO_CONFIG) {
        config = RenderEngine::chooseEglConfig(display, format);
    }
    surface = eglCreateWindowSurface(display, config, window, NULL);

> eglSwapBuffers使用了使用API.SwapBuffers，而之前已经介绍了这个分发表的机制。其对应函数为以下。
 _EGL_CHECK_SURFACE 中将drv 赋值为disp->driver

	EGLBoolean EGLAPIENTRY
	eglSwapBuffers(EGLDisplay dpy, EGLSurface surface)
	{
		......
	   _EGL_CHECK_SURFACE(disp, surf, EGL_FALSE, drv);
		......
	   ret = drv->API.SwapBuffers(drv, disp, surf);
	   RETURN_EGL_EVAL(disp, ret);
	}
- - -

	egl_dri2.c
	dri2_drv->base.API.SwapBuffers = dri2_swap_buffers;

- - -

#### dri2_swap_buffers 

> 对应dri2_swap_buffers代码很简单，具体实现牵扯很多。

- - - 
	static EGLBoolean
	dri2_swap_buffers(_EGLDriver *drv, _EGLDisplay *dpy, _EGLSurface *surf)
	{
	   struct dri2_egl_display *dri2_dpy = dri2_egl_display(dpy);
	   return dri2_dpy->vtbl->swap_buffers(drv, dpy, surf);
	}



##### dri2_swap_buffers 内部类型转换

>&nbsp;&nbsp;&nbsp;&nbsp;1.对_EGLDriver类型变量的DriverData（void*）变量强制转换为dri2_egl_display类型变量。具体实现就是使用了一个宏定义,这个宏会在egl_dri.h文件中直接被调用---> _EGL_DRIVER_STANDARD_TYPECASTS(dri2_egl)。
- - -
	// eglDriver.h
	#define _EGL_DRIVER_STANDARD_TYPECASTS(drvname)                            \
   _EGL_DRIVER_TYPECAST(drvname ## _driver, _EGLDriver, obj)               \
   /* note that this is not a direct cast */                               \
   _EGL_DRIVER_TYPECAST(drvname ## _display, _EGLDisplay, obj->DriverData) \
   _EGL_DRIVER_TYPECAST(drvname ## _context, _EGLContext, obj)             \
   _EGL_DRIVER_TYPECAST(drvname ## _surface, _EGLSurface, obj)             \
   _EGL_DRIVER_TYPECAST(drvname ## _config, _EGLConfig, obj)


	#define _EGL_DRIVER_TYPECAST(drvtype, egltype, code)      \
	   static inline struct drvtype *drvtype(const egltype *obj) \
	   { return (struct drvtype *) code; }
	//也就是定义了以下函数：
		 static inline struct dri2_egl_driver *dri2_egl_driver(const _EGLDriver *obj)
	   { return (struct dri2_egl_driver *) obj; }

	    static inline struct dri2_egl_driver *dri2_egl_display(const_EGLDisplay *obj)
	   { return (struct dri2_egl_display *) obj->DriverData; }

	    static inline struct dri2_egl_driver *dri2_egl_context(const _EGLContext *obj)
	   { return (struct dri2_egl_context *) obj; }

	    static inline struct dri2_egl_driver *dri2_egl_surface(const _EGLSurface *obj)
	   { return (struct dri2_egl_surface *) obj; }

	    static inline struct dri2_egl_driver *dri2_egl_config(const _EGLConfig *obj)
	   { return (struct dri2_egl_config *) obj; }


##### dri2_swap_buffers 调用swap_buffers [droid_swap_buffers]

> &nbsp;&nbsp;&nbsp;&nbsp;2.dri2_dpy的vtbl属性从哪里来。surfacefliner在初始化时候会初始化display以及它对应driver模块（存放在_eglGlobal.DisplayList），同时调用_EGLdriver变量的API的Initialize()函数,这个函数的实现为dri2_initialize，在android平台下会调用 dri2_initialize_android。在dri2_initialize_android完成_EGLdriver变量的DriverData（void*)赋值。是一个dri2_egl_display_vtbl结构的静态变量。
	
	//platform_android.c
	EGLBoolean
	dri2_initialize_android(_EGLDriver *drv, _EGLDisplay *dpy) 
	{
	   struct dri2_egl_display *dri2_dpy;
	......
	   dpy->DriverData = (void *) dri2_dpy;

	......
	   dri2_dpy->vtbl = &droid_display_vtbl;

	   return EGL_TRUE;
	......
	}
	//platform_android.c
	static struct dri2_egl_display_vtbl droid_display_vtbl = { 
	.....
   		.swap_buffers = droid_swap_buffers,
	.....
	};


> 因此这里vtbl->swap_buffers函数指针所对应函数为droid_swap_buffers
> dri2_drv->glFlush = (void (*)(void))dri2_drv->get_proc_address("glFlush");
> 这里flush是通过dlsym 实现初始化，具体实现在libglapi.so，也就是mesa的glflush,强制执行缓冲区刷新。
> 
	static EGLBoolean
	droid_swap_buffers(_EGLDriver *drv, _EGLDisplay *disp, _EGLSurface *draw)
	{
	   struct dri2_egl_driver *dri2_drv = dri2_egl_driver(drv);
	   struct dri2_egl_display *dri2_dpy = dri2_egl_display(disp);
	   struct dri2_egl_surface *dri2_surf = dri2_egl_surface(draw);
	   _EGLContext *ctx;

	   if (dri2_surf->base.Type != EGL_WINDOW_BIT)
	      return EGL_TRUE;

	   if (dri2_drv->glFlush) {
	      ctx = _eglGetCurrentContext();
	      if (ctx && ctx->DrawSurface == &dri2_surf->base)
	         dri2_drv->glFlush();
	   }

	   dri2_flush_drawable_for_swapbuffers(disp, draw);

	   if (dri2_surf->buffer)
	      droid_window_enqueue_buffer(dri2_surf);

	   (*dri2_dpy->flush->invalidate)(dri2_surf->dri_drawable);

	   return EGL_TRUE;
	}


### void SurfaceFlinger::postFramebuffer() 将后台buffer交换到前台（显示）。

> 首先调用  getDefaultDisplayDevice()->makeCurrent(mEGLDisplay, mEGLContext);这个函数会调用eglMakecurrent 使得context绑定当前的缓冲线程和读写buffer。
接着调用 hwc.commit();在这个函数中会调用mHwc->set(mHwc,mDpy, mSur, mList);

	void SurfaceFlinger::postFramebuffer()
	{
	    ATRACE_CALL();

	    const nsecs_t now = systemTime();
	    mDebugInSwapBuffers = now;

	    HWComposer& hwc(getHwComposer());
	    if (hwc.initCheck() == NO_ERROR) {
	        if (!hwc.supportsFramebufferTarget()) {
	            getDefaultDisplayDevice()->makeCurrent(mEGLDisplay, mEGLContext);
	        }
	        hwc.commit();
	    }
		.......
	    getDefaultDisplayDevice()->makeCurrent(mEGLDisplay, mEGLContext);
	    进行按层次刷新
	}

> mHwc->set是个函数指针会调用egl_window_surface_v2_t::swapBuffers()
> swapBuffers这里,通过queueBuffer来入队显示，然后通过dequeueBuffer重新申请一个buffer以用于下一轮的刷新。

	EGLBoolean egl_window_surface_v2_t::swapBuffers()
	{
			.....

	    if (previousBuffer) {
	        previousBuffer->common.decRef(&previousBuffer->common); 
	        previousBuffer = 0;
	    }
	    
	    unlock(buffer);
	    previousBuffer = buffer;
	    nativeWindow->queueBuffer(nativeWindow, buffer, -1);
	    buffer = 0;

	    // dequeue a new buffer
	    int fenceFd = -1;
	    if (nativeWindow->dequeueBuffer(nativeWindow, &buffer, &fenceFd) == NO_ERROR) {
	        .....
	        }
		.....
		.....
	}
