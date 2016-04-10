## [dmesg](./dmesg.txt) 
- 应该是vga设置

```sh
<6>[    0.062740] vgaarb: setting as boot device: PCI:0000:00:02.0
<6>[    0.062742] vgaarb: device added: PCI:0000:00:02.0,decodes=io+mem,owns=io+mem,locks=none
<6>[    0.062743] vgaarb: loaded
<6>[    0.062743] vgaarb: bridge control possible 0000:00:02.0
```

## [logcat](./logcat.txt)
[logcat](./logcat.md)
###display初始化相关
####SurfaceFlinger开始初始化
```sh
I/SurfaceFlinger( 1099): SurfaceFlinger is starting
I/SurfaceFlinger( 1099): SurfaceFlinger's main thread ready to run. Initializing graphics H/W...
```
####验证egl,egl初始化
```sh
D/libEGL  ( 1099): 3D hardware acceleration is disabled
D/libEGL  ( 1099): Emulator without GPU support detected. Fallback to software renderer.
D/libEGL  ( 1099): loaded /system/lib/egl/libGLES_android.so
```

####下面应该是对设备的基本显示进行配置
```sh
W/gralloc ( 1099): page flipping not supported (yres_virtual=600, requested=1200)
I/gralloc ( 1099): using (fd=11)
I/gralloc ( 1099): id           = VESA VGA
I/gralloc ( 1099): xres         = 800 px
I/gralloc ( 1099): yres         = 600 px
I/gralloc ( 1099): xres_virtual = 800 px
I/gralloc ( 1099): yres_virtual = 600 px
I/gralloc ( 1099): bpp          = 16
I/gralloc ( 1099): r            = 11:5
I/gralloc ( 1099): g            =  5:6
I/gralloc ( 1099): b            =  0:5
I/gralloc ( 1099): width        = 127 mm (160.000000 dpi)
I/gralloc ( 1099): height       = 95 mm (160.421051 dpi)
I/gralloc ( 1099): refresh rate = 91.11 Hz
```

####hwcomposer 初始化

```sh
W/hwcomposer( 1099): getting VSYNC period from fb HAL: 10975503
D/hwcomposer( 1099): Intel hwcomposer module
I/SurfaceFlinger( 1099): Using composer version 1.0
```sh


#### 选择EGLconfig。这步可能在设置EGLContext的时候有点问题，电源管理服务调用eglContext相关的函数出错，在后面给出了。
```sh
W/SurfaceFlinger( 1099): no suitable EGLConfig found, trying a simpler query
W/SurfaceFlinger( 1099): EGL_SLOW_CONFIG selected!
I/SurfaceFlinger( 1099): EGL information:
I/SurfaceFlinger( 1099): vendor    : Android
I/SurfaceFlinger( 1099): version   : 1.4 Android META-EGL
I/SurfaceFlinger( 1099): extensions: EGL_KHR_get_all_proc_addresses EGL_ANDROID_presentation_time EGL_KHR_image_base EGL_KHR_fence_sync EGL_ANDROID_image_native_buffer 
I/SurfaceFlinger( 1099): Client API: OpenGL_ES
I/SurfaceFlinger( 1099): EGLSurface: 5-6-5-0, config=0x0
W/SurfaceFlinger( 1099): no suitable EGLConfig found, trying a simpler query
W/SurfaceFlinger( 1099): EGL_SLOW_CONFIG selected!
I/SurfaceFlinger( 1099): EGL information:
I/SurfaceFlinger( 1099): vendor    : Android
I/SurfaceFlinger( 1099): version   : 1.4 Android META-EGL
I/SurfaceFlinger( 1099): extensions: EGL_KHR_get_all_proc_addresses EGL_ANDROID_presentation_time EGL_KHR_image_base EGL_KHR_fence_sync EGL_ANDROID_image_native_buffer 
```

#### OpenGL ES 初始化操作
```sh
I/SurfaceFlinger( 1099): Client API: OpenGL_ES
I/SurfaceFlinger( 1099): EGLSurface: 5-6-5-0, config=0x0
I/SurfaceFlinger( 1099): OpenGL ES informations:
I/SurfaceFlinger( 1099): vendor    : Android
I/SurfaceFlinger( 1099): renderer  : Android PixelFlinger 1.4
I/SurfaceFlinger( 1099): version   : OpenGL ES-CM 1.0
I/SurfaceFlinger( 1099): extensions: GL_OES_byte_coordinates GL_OES_fixed_point GL_OES_single_precision GL_OES_read_format GL_OES_compressed_paletted_texture GL_OES_draw_texture GL_OES_matrix_get GL_OES_query_matrix GL_OES_EGL_image GL_OES_EGL_sync GL_OES_compressed_ETC1_RGB8_texture GL_ARB_texture_compression GL_ARB_texture_non_power_of_two GL_ANDROID_user_clip_plane GL_ANDROID_vertex_buffer_object GL_ANDROID_generate_mipmap 
I/SurfaceFlinger( 1099): GL_MAX_TEXTURE_SIZE = 4096
I/SurfaceFlinger( 1099): GL_MAX_VIEWPORT_DIMS = 4096
W/SurfaceFlinger( 1099): no suitable EGLConfig found, trying a simpler query
W/SurfaceFlinger( 1099): EGL_SLOW_CONFIG selected!
I/SurfaceFlinger( 1099): EGL information:
I/SurfaceFlinger( 1099): vendor    : Android
I/SurfaceFlinger( 1099): version   : 1.4 Android META-EGL
I/SurfaceFlinger( 1099): extensions: EGL_KHR_get_all_proc_addresses EGL_ANDROID_presentation_time EGL_KHR_image_base EGL_KHR_fence_sync EGL_ANDROID_image_native_buffer 
I/SurfaceFlinger( 1099): Client API: OpenGL_ES
I/SurfaceFlinger( 1099): EGLSurface: 5-6-5-0, config=0x0
```

####初始化显示设备，这里是tty0
```sh
D/SurfaceFlinger( 1099): Open /dev/tty0 OK
D/SurfaceFlinger( 1099): Set power mode=2, type=0 flinger=0xb685c000
I/SurfaceFlinger( 1099): auto set density to 130
D/libEGL  ( 1149): 3D hardware acceleration is disabled
D/libEGL  ( 1149): Emulator without GPU support detected. Fallback to software renderer.
D/libEGL  ( 1149): loaded /system/lib/egl/libGLES_android.so 
```
--------------------以上为初始化-------------------
####Zygote初始化过程中的debug信息
```sh
D/libEGL  ( 1108): 3D hardware acceleration is disabled
D/libEGL  ( 1108): Emulator without GPU support detected. Fallback to software renderer.
D/libEGL  ( 1108): loaded /system/lib/egl/libGLES_android.so
```

####AssetAtlasService使用EGL过程的一个警告
- 负责将预加载的bitmap组装成纹理贴图，生成的纹理贴图可以被用来跨进程使用，以减少内存。
 
```sh
W/AssetAtlasService( 1317): Could not find EGL configuration
```

####渲染警告
```sh
W/OpenGLRenderer( 1757): can't set property, no Caches instance
W/OpenGLRenderer( 1757): can't set property, no Caches instance
```

####PowerManagerService初始化的过程中错误。eglcontext相关错误

```
E/libEGL  ( 1317): eglGetConfigAttrib(EGL_NATIVE_VISUAL_ID) failed: 0x3005
E/libEGL  ( 1317): eglMakeCurrent:811 error 3009 (EGL_BAD_MATCH)
E/ColorFade( 1317): eglMakeCurrent failed: error 12297
E/ColorFade( 1317): java.lang.Throwable
E/ColorFade( 1317): 	at com.android.server.display.ColorFade.logEglError(ColorFade.java:671)
E/ColorFade( 1317): 	at com.android.server.display.ColorFade.attachEglContext(ColorFade.java:651)
E/ColorFade( 1317): 	at com.android.server.display.ColorFade.captureScreenshotTextureAndSetViewport(ColorFade.java:450)
E/ColorFade( 1317): 	at com.android.server.display.ColorFade.prepare(ColorFade.java:154)
E/ColorFade( 1317): 	at com.android.server.display.DisplayPowerState.prepareColorFade(DisplayPowerState.java:183)
E/ColorFade( 1317): 	at com.android.server.display.DisplayPowerController.animateScreenStateChange(DisplayPowerController.java:885)
E/ColorFade( 1317): 	at com.android.server.display.DisplayPowerController.updatePowerState(DisplayPowerController.java:581)
E/ColorFade( 1317): 	at com.android.server.display.DisplayPowerController.access$400(DisplayPowerController.java:72)
E/ColorFade( 1317): 	at com.android.server.display.DisplayPowerController$DisplayControllerHandler.handleMessage(DisplayPowerController.java:1160)
E/ColorFade( 1317): 	at android.os.Handler.dispatchMessage(Handler.java:102)
E/ColorFade( 1317): 	at android.os.Looper.loop(Looper.java:135)
E/ColorFade( 1317): 	at android.os.HandlerThread.run(HandlerThread.java:61)
E/ColorFade( 1317): 	at com.android.server.ServiceThread.run(ServiceThread.java:46)
I/libsuspend( 1317): autosuspend_earlysuspend_enable
D/SurfaceFlinger( 1099): Set power mode=0, type=0 flinger=0xb685c000
```