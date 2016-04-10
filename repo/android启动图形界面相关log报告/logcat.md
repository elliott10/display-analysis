--------- beginning of main
I/Netd    (    0): Netd 1.0 starting
E/Netd    (    0): Failed to open /proc/sys/net/ipv6/conf/default/accept_ra_rt_table: No such file or directory
E/Netd    (    0): Failed to open /proc/sys/net/ipv6/conf/eth0/accept_ra_rt_table: No such file or directory
E/Netd    (    0): Failed to open /proc/sys/net/ipv6/conf/ip6tnl0/accept_ra_rt_table: No such file or directory
E/Netd    (    0): Failed to open /proc/sys/net/ipv6/conf/lo/accept_ra_rt_table: No such file or directory
E/Netd    (    0): Failed to open /proc/sys/net/ipv6/conf/sit0/accept_ra_rt_table: No such file or directory
I/        (    0): debuggerd: Oct  7 2015 00:32:19
E/ProbeModule( 1128): insmod_by_dep: cannot load module: [net-pf-16-proto-9]
--------- beginning of system
I/Vold    ( 1098): Vold 2.1 (the revenge) firing up
E/DirectVolume( 1098): Vold managed volumes must have auto mount point; ignoring /storage/usb0
D/Vold    ( 1098): Volume usb0 state changing -1 (Initializing) -> 0 (No-Media)
E/DirectVolume( 1098): Vold managed volumes must have auto mount point; ignoring /storage/usb1
D/Vold    ( 1098): Volume usb1 state changing -1 (Initializing) -> 0 (No-Media)
E/DirectVolume( 1098): Vold managed volumes must have auto mount point; ignoring /storage/usb2
D/Vold    ( 1098): Volume usb2 state changing -1 (Initializing) -> 0 (No-Media)
E/DirectVolume( 1098): Vold managed volumes must have auto mount point; ignoring /storage/usb3
D/Vold    ( 1098): Volume usb3 state changing -1 (Initializing) -> 0 (No-Media)
I/lowmemorykiller( 1096): Using in-kernel low memory killer interface
I/keystore( 1107): SELinux: Keystore SELinux is disabled.
```sh
I/SurfaceFlinger( 1099): SurfaceFlinger is starting
I/SurfaceFlinger( 1099): SurfaceFlinger's main thread ready to run. Initializing graphics H/W...
D/libEGL  ( 1099): 3D hardware acceleration is disabled
D/libEGL  ( 1099): Emulator without GPU support detected. Fallback to software renderer.
D/libEGL  ( 1099): loaded /system/lib/egl/libGLES_android.so
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
W/hwcomposer( 1099): getting VSYNC period from fb HAL: 10975503
D/hwcomposer( 1099): Intel hwcomposer module
I/SurfaceFlinger( 1099): Using composer version 1.0
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
D/SurfaceFlinger( 1099): Open /dev/tty0 OK
D/SurfaceFlinger( 1099): Set power mode=2, type=0 flinger=0xb685c000
I/SurfaceFlinger( 1099): auto set density to 130
D/libEGL  ( 1149): 3D hardware acceleration is disabled
D/libEGL  ( 1149): Emulator without GPU support detected. Fallback to software renderer.
D/libEGL  ( 1149): loaded /system/lib/egl/libGLES_android.so
```
I/mediaserver( 1105): ServiceManager: 0xb5c356a0
I/AudioFlinger( 1105): Using default 3000 mSec as standby time.
I/ServiceManager( 1105): Waiting for service batterystats...
I/X86Assembler( 1149): generated scanline__00000077:03010102_00000A01_00000000 [ 81 ipp ins size] (225 ins size) at [0xb51fd1f0:0xb51fd2d1] in 557050 ns
I/X86Assembler( 1149): generated scanline__00000077:03545402_00000A01_00000000 [287 ipp ins size] (431 ins size) at [0xb51fd2e0:0xb51fd48f] in 1065928 ns
E/pixelflinger( 1149): error generating or caching assembly. Reverting to NOP.  cache_err: 1 
D/AndroidRuntime( 1108): >>>>>> START com.android.internal.os.ZygoteInit uid 0 <<<<<<
D/AndroidRuntime( 1108): CheckJNI is OFF
I/art     ( 1108): option[0]=-Xzygote
I/art     ( 1108): option[1]=-Xstacktracefile:/data/anr/traces.txt
I/art     ( 1108): option[2]=exit
I/art     ( 1108): option[3]=vfprintf
I/art     ( 1108): option[4]=sensitiveThread
I/art     ( 1108): option[5]=-verbose:gc
I/art     ( 1108): option[6]=-Xms16m
I/art     ( 1108): option[7]=-Xmx512m
I/art     ( 1108): option[8]=-XX:mainThreadStackSize=24K
I/art     ( 1108): option[9]=-XX:HeapGrowthLimit=192m
I/art     ( 1108): option[10]=-XX:HeapMinFree=512k
I/art     ( 1108): option[11]=-XX:HeapMaxFree=8m
I/art     ( 1108): option[12]=-XX:HeapTargetUtilization=0.75
I/art     ( 1108): option[13]=-Xgenregmap
I/art     ( 1108): option[14]=-Xgc:precise
I/art     ( 1108): option[15]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
I/art     ( 1108): option[16]=-Xlockprofthreshold:500
I/art     ( 1108): option[17]=-Ximage-compiler-option
I/art     ( 1108): option[18]=--runtime-arg
I/art     ( 1108): option[19]=-Ximage-compiler-option
I/art     ( 1108): option[20]=-Xms64m
I/art     ( 1108): option[21]=-Ximage-compiler-option
I/art     ( 1108): option[22]=--runtime-arg
I/art     ( 1108): option[23]=-Ximage-compiler-option
I/art     ( 1108): option[24]=-Xmx64m
I/art     ( 1108): option[25]=-Ximage-compiler-option
I/art     ( 1108): option[26]=--image-classes=/system/etc/preloaded-classes
I/art     ( 1108): option[27]=-Xcompiler-option
I/art     ( 1108): option[28]=--runtime-arg
I/art     ( 1108): option[29]=-Xcompiler-option
I/art     ( 1108): option[30]=-Xms64m
I/art     ( 1108): option[31]=-Xcompiler-option
I/art     ( 1108): option[32]=--runtime-arg
I/art     ( 1108): option[33]=-Xcompiler-option
I/art     ( 1108): option[34]=-Xmx512m
I/art     ( 1108): option[35]=-Duser.language=en
I/art     ( 1108): option[36]=-Duser.region=US
I/art     ( 1108): option[37]=-XX:NativeBridge=libnb.so
I/art     ( 1108): Pruning dalvik-cache since we are relocating an image and will need to recompile
I/art     ( 1108): RelocateImage: /system/bin/patchoat --input-image-location=/system/framework/boot.art --output-image-file=/data/dalvik-cache/x86/system@framework@boot.art --input-oat-location=/system/framework/boot.oat --output-oat-file=/data/dalvik-cache/x86/system@framework@boot.oat --instruction-set=x86 --base-offset-delta=-2678784
I/ServiceManager( 1105): Waiting for service batterystats...
E/memtrack( 1108): Couldn't load memtrack module (No such file or directory)
E/android.os.Debug( 1108): failed to load memtrack module: -2
I/SamplingProfilerIntegration( 1108): Profiling disabled.
D/Zygote  ( 1108): begin preload
I/Zygote  ( 1108): Preloading classes...
I/art     ( 1108): Explicit concurrent mark sweep GC freed 798(36KB) AllocSpace objects, 0(0B) LOS objects, 95% free, 44KB/1068KB, paused 6.080ms total 7.362ms
I/art     ( 1108): Counter: 1
I/art     ( 1108): Explicit concurrent mark sweep GC freed 559(34KB) AllocSpace objects, 0(0B) LOS objects, 94% free, 64KB/1088KB, paused 25us total 1.089ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 650(41KB) AllocSpace objects, 0(0B) LOS objects, 93% free, 72KB/1096KB, paused 25us total 1.224ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 381(22KB) AllocSpace objects, 0(0B) LOS objects, 90% free, 102KB/1126KB, paused 25us total 1.036ms
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGujarati-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGujarati-Bold.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGujaratiUI-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGujaratiUI-Bold.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGurmukhi-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGurmukhi-Bold.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGurmukhiUI-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGurmukhiUI-Bold.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansSinhala-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansSinhala-Bold.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansThaana-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansThaana-Bold.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansCham-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansCham-Bold.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansBalinese-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansBatak-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansBuginese-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansBuhid-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansCanadianAboriginal-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansCherokee-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansCoptic-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansGlagolitic-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansHanunoo-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansJavanese-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansKayahLi-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansLepcha-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansLimbu-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansMeeteiMayek-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansOlChiki-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansRejang-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansSaurashtra-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansSundanese-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansSylotiNagri-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansTagbanwa-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansTaiTham-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansTaiViet-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansTifinagh-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansYi-Regular.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/Lohit-Odia.ttf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansHans-Regular.otf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansHant-Regular.otf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansJP-Regular.otf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansKR-Regular.otf
E/Minikin ( 1108): addFont failed to create font /system/fonts/NotoSansTaiLe-Regular.ttf
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1798(129KB) AllocSpace objects, 0(0B) LOS objects, 90% free, 113KB/1137KB, paused 25us total 1.126ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1933(92KB) AllocSpace objects, 0(0B) LOS objects, 86% free, 154KB/1178KB, paused 24us total 1.392ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1977(87KB) AllocSpace objects, 0(0B) LOS objects, 84% free, 189KB/1213KB, paused 24us total 1.327ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 371(19KB) AllocSpace objects, 0(0B) LOS objects, 82% free, 222KB/1246KB, paused 24us total 1.326ms
I/art     ( 1108): Thread[1,tid=1108,WaitingForJniOnLoad,Thread*=0xb3c25800,peer=0x12c31160,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
D/MtpDeviceJNI( 1108): register_android_mtp_MtpDevice
I/art     ( 1108): Thread[1,tid=1108,WaitingForJniOnLoad,Thread*=0xb3c25800,peer=0x12c31160,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
I/art     ( 1108): Thread[1,tid=1108,WaitingForJniOnLoad,Thread*=0xb3c25800,peer=0x12c31160,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
I/art     ( 1108): Explicit concurrent mark sweep GC freed 661(37KB) AllocSpace objects, 0(0B) LOS objects, 80% free, 244KB/1268KB, paused 25us total 1.473ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 578(29KB) AllocSpace objects, 0(0B) LOS objects, 79% free, 264KB/1288KB, paused 25us total 1.405ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 454(27KB) AllocSpace objects, 0(0B) LOS objects, 77% free, 303KB/1327KB, paused 24us total 1.146ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1788(104KB) AllocSpace objects, 0(0B) LOS objects, 69% free, 452KB/1476KB, paused 25us total 1.411ms
E/EmojiFactory_jni( 1108): Failed to load libemoji.so: dlopen failed: library "libemoji.so" not found
I/art     ( 1108): Explicit concurrent mark sweep GC freed 350(45KB) AllocSpace objects, 0(0B) LOS objects, 57% free, 750KB/1774KB, paused 26us total 1.824ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 438(30KB) AllocSpace objects, 0(0B) LOS objects, 57% free, 768KB/1792KB, paused 25us total 8.660ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 789(49KB) AllocSpace objects, 0(0B) LOS objects, 57% free, 770KB/1794KB, paused 25us total 1.424ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 956(105KB) AllocSpace objects, 0(0B) LOS objects, 55% free, 812KB/1836KB, paused 26us total 2.102ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 597(42KB) AllocSpace objects, 0(0B) LOS objects, 55% free, 819KB/1843KB, paused 25us total 7.513ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 265(20KB) AllocSpace objects, 0(0B) LOS objects, 54% free, 848KB/1872KB, paused 26us total 1.386ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 89(3KB) AllocSpace objects, 0(0B) LOS objects, 45% free, 1226KB/2MB, paused 29us total 7.819ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 572(33KB) AllocSpace objects, 0(0B) LOS objects, 45% free, 1242KB/2MB, paused 28us total 1.990ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 741(45KB) AllocSpace objects, 0(0B) LOS objects, 45% free, 1246KB/2MB, paused 28us total 7.601ms
I/System  ( 1108): Loaded time zone names for "" in 26ms (25ms in ICU)
I/System  ( 1108): Loaded time zone names for "en_US" in 7ms (6ms in ICU)
I/art     ( 1108): Explicit concurrent mark sweep GC freed 2345(178KB) AllocSpace objects, 0(0B) LOS objects, 42% free, 1404KB/2MB, paused 27us total 7.989ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 136(12KB) AllocSpace objects, 0(0B) LOS objects, 41% free, 1470KB/2MB, paused 26us total 1.801ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 288(24KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 1515KB/2MB, paused 27us total 9.049ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 679(47KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 1517KB/2MB, paused 27us total 1.865ms
I/Zygote  ( 1108): ...preloaded 3005 classes in 587ms.
I/art     ( 1108): VMRuntime.preloadDexCaches starting
I/art     ( 1108): VMRuntime.preloadDexCaches strings total=214641 before=38996 after=38996
I/art     ( 1108): VMRuntime.preloadDexCaches types total=18345 before=6389 after=6425
I/art     ( 1108): VMRuntime.preloadDexCaches fields total=85569 before=32261 after=32595
I/art     ( 1108): VMRuntime.preloadDexCaches methods total=151780 before=66835 after=67736
I/art     ( 1108): VMRuntime.preloadDexCaches finished
I/art     ( 1108): Counter: 0
I/art     ( 1108): Counter: 1
I/art     ( 1108): Explicit concurrent mark sweep GC freed 61(15KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 1503KB/2MB, paused 26us total 2.566ms
D/idmap   ( 1284): error: no read access to /vendor/overlay: No such file or directory
I/Zygote  ( 1108): Preloading resources...
I/art     ( 1108): Explicit concurrent mark sweep GC freed 86(3KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1551KB/2MB, paused 33us total 2.043ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 89(4KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 1597KB/2MB, paused 27us total 1.763ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 122(5KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1646KB/2MB, paused 32us total 1.839ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 101(4KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1691KB/2MB, paused 28us total 1.792ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 93(4KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 1735KB/2MB, paused 29us total 1.785ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 103(4KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1782KB/2MB, paused 28us total 1.861ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 112(5KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1827KB/2MB, paused 30us total 2.538ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 117(5KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1873KB/3MB, paused 30us total 2.152ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 108(5KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1922KB/3MB, paused 30us total 1.852ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 147(6KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 1993KB/3MB, paused 30us total 1.888ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 136(5KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2036KB/3MB, paused 29us total 1.918ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 84(7KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 2MB/3MB, paused 30us total 1.891ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 112(4KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/3MB, paused 30us total 1.934ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 135(5KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 2MB/3MB, paused 30us total 1.954ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 62(2752B) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/3MB, paused 30us total 2.110ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 111(4KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/4MB, paused 31us total 8.019ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 206(9KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 2MB/4MB, paused 31us total 2.006ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 370(16KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/4MB, paused 32us total 2.040ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 214(9KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 2MB/4MB, paused 31us total 1.992ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 112(6KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 2MB/4MB, paused 33us total 1.961ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 113(5KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/4MB, paused 31us total 9.071ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 49(8KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/4MB, paused 31us total 2.094ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 101(4KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/4MB, paused 31us total 1.967ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 105(4KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 2MB/4MB, paused 33us total 2.004ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 99(4KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/4MB, paused 33us total 9.352ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 172(7KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 2MB/4MB, paused 640us total 2.630ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 417(18KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 3MB/5MB, paused 34us total 2.311ms
I/ServiceManager( 1105): Waiting for service batterystats...
I/art     ( 1108): Explicit concurrent mark sweep GC freed 363(16KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 3MB/5MB, paused 34us total 2.159ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 174(8KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 34us total 9.286ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 515(19KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 34us total 2.285ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 353(14KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 34us total 8.187ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1153(40KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 34us total 2.143ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1499(50KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 34us total 2.203ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1381(49KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 44us total 4.767ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 1453(56KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 34us total 8.350ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 603(27KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 35us total 2.238ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 344(20KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/6MB, paused 36us total 2.281ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 384(17KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/6MB, paused 37us total 2.447ms
I/Zygote  ( 1108): ...preloaded 343 resources in 306ms.
I/art     ( 1108): Explicit concurrent mark sweep GC freed 639(39KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/6MB, paused 36us total 8.372ms
I/Zygote  ( 1108): ...preloaded 41 resources in 10ms.
I/art     ( 1108): Counter: 0
```sh
D/libEGL  ( 1108): 3D hardware acceleration is disabled
D/libEGL  ( 1108): Emulator without GPU support detected. Fallback to software renderer.
D/libEGL  ( 1108): loaded /system/lib/egl/libGLES_android.so
``sh
I/Zygote  ( 1108): Preloading shared libraries...
D/Zygote  ( 1108): end preload
I/art     ( 1108): Explicit concurrent mark sweep GC freed 450(20KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/6MB, paused 63us total 2.419ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 389(16KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/6MB, paused 36us total 8.405ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/6MB, paused 37us total 2.377ms
I/Zygote  ( 1108): System server process 1317 has been created
I/Zygote  ( 1108): Accepting command socket connections
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/services.odex needs to be relocated for /system/framework/services.jar
I/InstallerConnection( 1317): connecting...
I/installd( 1106): new connection
E/installd( 1334): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/services.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@services.jar@classes.dex)
E/sdcard  ( 1110): missing packages.list; retrying
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/ethernet-service.odex needs to be relocated for /system/framework/ethernet-service.jar
E/installd( 1349): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/ethernet-service.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@ethernet-service.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/wifi-service.odex needs to be relocated for /system/framework/wifi-service.jar
E/installd( 1356): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/wifi-service.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@wifi-service.jar@classes.dex)
V/NatController( 1101): runCmd(/system/bin/iptables -F natctrl_FORWARD) res=0
V/NatController( 1101): runCmd(/system/bin/iptables -A natctrl_FORWARD -j DROP) res=0
I/InstallerConnection( 1317): disconnecting...
E/installd( 1106): eof
E/installd( 1106): failed to read size
I/installd( 1106): closing connection
I/SystemServer( 1317): Entered the Android system server!
V/Fingerprint-JNI( 1317): FingerprintManager JNI ready.
D/SensorService( 1317): nuSensorService starting...
D/KbdSensor( 1317): open_kbd_sensor: id=poll
D/KbdSensor( 1317): SensorFd: module=0xb274b2c0 dev=0xb3c51a80
V/NatController( 1101): runCmd(/system/bin/iptables -t nat -F natctrl_nat_POSTROUTING) res=0
V/NatController( 1101): runCmd(/system/bin/iptables -F natctrl_tether_counters) res=1
V/NatController( 1101): runCmd(/system/bin/iptables -X natctrl_tether_counters) res=1
V/NatController( 1101): runCmd(/system/bin/iptables -N natctrl_tether_counters) res=0
V/NatController( 1101): runCmd(/system/bin/iptables -t mangle -A natctrl_mangle_FORWARD -p tcp --tcp-flags SYN SYN -j TCPMSS --clamp-mss-to-pmtu) res=0
I/KbdSensor( 1317): Open AT Translated Set 2 keyboard ok, fd=19
D/KbdSensor( 1317): SensorPollContext: dev=0xb3c51a80 fd=19
D/KbdSensor( 1317): poll_activate: dev=0xb3c51a80 handle=0 enabled=0
I/SystemServiceManager( 1317): Starting com.android.server.pm.Installer
I/Installer( 1317): Waiting for installd to be ready.
I/InstallerConnection( 1317): connecting...
I/installd( 1106): new connection
I/SystemServiceManager( 1317): Starting com.android.server.am.ActivityManagerService$Lifecycle
D/SensorService( 1317): nuSensorService thread starting...
I/ActivityManager( 1317): Memory class: 192
D/SensorService( 1317): new thread SensorEventAckReceiver
I/AppOps  ( 1317): No existing app ops /data/system/appops.xml; starting empty
I/IntentFirewall( 1317): Read new rules (A:0 B:0 S:0)
D/AppOps  ( 1317): AppOpsService published
I/SystemServiceManager( 1317): Starting com.android.server.power.PowerManagerService
I/libsuspend( 1317): Selected early suspend
E/libsuspend( 1317): Error accessing /sys/power/wait_for_fb_sleep: No such file or directory
I/SystemServiceManager( 1317): Starting com.android.server.display.DisplayManagerService
I/SystemServiceManager( 1317): Starting phase 100
I/DisplayManagerService( 1317): Display device added: DisplayDeviceInfo{"Built-in Screen": uniqueId="local:0", 800 x 600, 91.11201 fps, supportedRefreshRates [91.11201], density 130, 160.0 x 160.42105 dpi, appVsyncOff 0, presDeadline 11975502, touch INTERNAL, rotation 0, type BUILT_IN, state UNKNOWN, FLAG_DEFAULT_DISPLAY, FLAG_ROTATES_WITH_CONTENT, FLAG_SECURE, FLAG_SUPPORTS_PROTECTED_BUFFERS}
I/SystemServer( 1317): Package Manager
W/SELinuxMMAC( 1317): Error opening /data/system/seapp_hash. Assuming first boot.
W/FileUtils( 1317): Failed to chmod(/data/system/packages.list): android.system.ErrnoException: chmod failed: ENOENT (No such file or directory)
W/SystemConfig( 1317): No directory /system/etc/sysconfig, skipping
D/SELinuxMMAC( 1317): Using policy file /system/etc/security/mac_permissions.xml
I/PackageManager( 1317): No settings file; creating initial state
I/dex2oat ( 1388): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/framework/com.google.android.media.effects.jar --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@framework@com.google.android.media.effects.jar@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/dex2oat ( 1388): Decided to run without swap.
I/iptables( 1101): iptables: Invalid argument. Run `dmesg' for more information.
I/CameraService( 1105): CameraService started (pid=1105)
D/Camera_Factory( 1105): CameraFactory::CameraFactory
D/Camera_Factory( 1105): CameraFactory::parseConfig: configFile = /etc/camera.cfg
D/Camera_Factory( 1105): /etc/camera.cfg not found, using camera configuration defaults
I/CameraService( 1105): Loaded "Camera Module" camera module
D/Camera_Factory( 1105): CameraFactory::get_number_of_cameras
D/Camera_Factory( 1105): CameraFactory::getCameraNum: 0
I/AudioPolicyService( 1105): AudioPolicyService CSTOR in new mode
I/AudioPolicyManager( 1105): loadAudioPolicyConfig() loaded /system/etc/audio_policy.conf
E/audio_hw_primary( 1105): Unable to open the mixer, aborting.
I/AudioFlinger( 1105): loadHwModule() Loaded primary audio interface from Grouper audio HW HAL (audio) handle 1
I/AudioFlinger( 1105): HAL output buffer size 512 frames, normal sink buffer size 1024 frames
I/AudioMixer( 1105): found effect "Multichannel Downmix To Stereo" from The Android Open Source Project
E/MonoPipe( 1105): Failed to fetch local time frequency when constructing a MonoPipe (res = -32).  getNextWriteTimestamp calls will be non-functional
I/iptables( 1101): iptables terminated by exit(1)
E/BandwidthController( 1101): runIptablesCmd(): res=1 status=256 failed /system/bin/iptables -A bw_INPUT -m owner --socket-exists
I/ip6tables( 1101): ip6tables: Invalid argument. Run `dmesg' for more information.
I/ip6tables( 1101): ip6tables terminated by exit(1)
E/BandwidthController( 1101): runIptablesCmd(): res=1 status=256 failed /system/bin/ip6tables -A bw_INPUT -m owner --socket-exists
I/dex2oat ( 1388): dex2oat took 289.056ms (threads: 1) arena alloc=279KB java alloc=128KB native alloc=874KB free=3MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/com.android.location.provider.odex needs to be relocated for /system/framework/com.android.location.provider.jar
E/installd( 1436): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/com.android.location.provider.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@com.android.location.provider.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/com.android.future.usb.accessory.odex needs to be relocated for /system/framework/com.android.future.usb.accessory.jar
E/installd( 1438): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/com.android.future.usb.accessory.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@com.android.future.usb.accessory.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/javax.obex.odex needs to be relocated for /system/framework/javax.obex.jar
E/installd( 1439): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/javax.obex.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@javax.obex.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/android.test.runner.odex needs to be relocated for /system/framework/android.test.runner.jar
E/installd( 1440): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/android.test.runner.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@android.test.runner.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/com.android.media.remotedisplay.odex needs to be relocated for /system/framework/com.android.media.remotedisplay.jar
E/installd( 1441): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/com.android.media.remotedisplay.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@com.android.media.remotedisplay.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/com.android.mediadrm.signer.odex needs to be relocated for /system/framework/com.android.mediadrm.signer.jar
E/installd( 1442): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/com.android.mediadrm.signer.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@com.android.mediadrm.signer.jar@classes.dex)
E/ProbeModule( 1446): insmod_by_dep: cannot load module: [net-pf-16-proto-5]
E/Netd    ( 1101): Unable to create netlink socket: Protocol not supported
E/Netd    ( 1101): Unable to open quota2 logging socket
D/MDnsDS  ( 1101): MDnsSdListener::Hander starting up
D/MDnsDS  ( 1101): MDnsSdListener starting to monitor
D/MDnsDS  ( 1101): Going to poll with pollCount 1
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/am.odex needs to be relocated for /system/framework/am.jar
E/installd( 1452): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/am.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@am.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/appops.odex needs to be relocated for /system/framework/appops.jar
E/installd( 1453): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/appops.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@appops.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/appwidget.odex needs to be relocated for /system/framework/appwidget.jar
E/installd( 1454): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/appwidget.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@appwidget.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/bmgr.odex needs to be relocated for /system/framework/bmgr.jar
E/installd( 1455): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/bmgr.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@bmgr.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/bu.odex needs to be relocated for /system/framework/bu.jar
E/installd( 1456): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/bu.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@bu.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/content.odex needs to be relocated for /system/framework/content.jar
E/installd( 1457): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/content.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@content.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/dpm.odex needs to be relocated for /system/framework/dpm.jar
E/installd( 1458): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/dpm.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@dpm.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/ime.odex needs to be relocated for /system/framework/ime.jar
E/installd( 1459): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/ime.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@ime.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/input.odex needs to be relocated for /system/framework/input.jar
E/installd( 1460): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/input.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@input.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/media_cmd.odex needs to be relocated for /system/framework/media_cmd.jar
E/installd( 1461): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/media_cmd.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@media_cmd.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/monkey.odex needs to be relocated for /system/framework/monkey.jar
E/installd( 1462): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/monkey.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@monkey.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/pm.odex needs to be relocated for /system/framework/pm.jar
E/installd( 1463): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/pm.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@pm.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/requestsync.odex needs to be relocated for /system/framework/requestsync.jar
E/installd( 1464): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/requestsync.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@requestsync.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/settings.odex needs to be relocated for /system/framework/settings.jar
E/installd( 1465): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/settings.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@settings.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/svc.odex needs to be relocated for /system/framework/svc.jar
E/installd( 1466): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/svc.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@svc.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/uiautomator.odex needs to be relocated for /system/framework/uiautomator.jar
E/installd( 1467): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/uiautomator.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@uiautomator.jar@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/framework/x86/wm.odex needs to be relocated for /system/framework/wm.jar
E/installd( 1468): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/framework/x86/wm.odex) out-fd=6 (/data/dalvik-cache/x86/system@framework@wm.jar@classes.dex)
D/PackageManager( 1317): No files in app dir /vendor/overlay
I/PackageManager( 1317): /system/framework/framework-res.apk changed; collecting certs
W/PackageManager( 1317): Failed to parse /system/framework/x86: Missing base APK in /system/framework/x86
I/PackageManager( 1317): /system/priv-app/BackupRestoreConfirmation changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/BackupRestoreConfirmation/x86/BackupRestoreConfirmation.odex needs to be relocated for /system/priv-app/BackupRestoreConfirmation/BackupRestoreConfirmation.apk
I/PackageManager( 1317): /system/priv-app/CalendarProvider changed; collecting certs
I/PackageManager( 1317): New shared user android.uid.calendar: id=10001
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/CalendarProvider/x86/CalendarProvider.odex needs to be relocated for /system/priv-app/CalendarProvider/CalendarProvider.apk
W/PackageParser( 1317): No actions in intent filter at /system/priv-app/Contacts/Contacts.apk Binary XML file line #356
I/PackageManager( 1317): /system/priv-app/Contacts changed; collecting certs
I/PackageManager( 1317): New shared user android.uid.shared: id=10002
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Contacts/x86/Contacts.odex needs to be relocated for /system/priv-app/Contacts/Contacts.apk
I/PackageManager( 1317): /system/priv-app/ContactsProvider changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ContactsProvider/x86/ContactsProvider.odex needs to be relocated for /system/priv-app/ContactsProvider/ContactsProvider.apk
I/PackageManager( 1317): /system/priv-app/DefaultContainerService changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/DefaultContainerService/x86/DefaultContainerService.odex needs to be relocated for /system/priv-app/DefaultContainerService/DefaultContainerService.apk
W/PackageParser( 1317): No actions in intent filter at /system/priv-app/Dialer/Dialer.apk Binary XML file line #166
I/PackageManager( 1317): /system/priv-app/Dialer changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Dialer/x86/Dialer.odex needs to be relocated for /system/priv-app/Dialer/Dialer.apk
I/PackageManager( 1317): /system/priv-app/DownloadProvider changed; collecting certs
I/PackageManager( 1317): New shared user android.media: id=10005
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/DownloadProvider/x86/DownloadProvider.odex needs to be relocated for /system/priv-app/DownloadProvider/DownloadProvider.apk
I/PackageManager( 1317): /system/priv-app/ExternalStorageProvider changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ExternalStorageProvider/x86/ExternalStorageProvider.odex needs to be relocated for /system/priv-app/ExternalStorageProvider/ExternalStorageProvider.apk
I/PackageManager( 1317): /system/priv-app/FusedLocation changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/FusedLocation/x86/FusedLocation.odex needs to be relocated for /system/priv-app/FusedLocation/FusedLocation.apk
W/Resources( 1317): Converting to boolean: TypedValue{t=0x3/d=0x333f "true" a=2 r=0x7f120a3e}
I/PackageManager( 1317): /system/priv-app/GmsCore changed; collecting certs
I/PackageManager( 1317): New shared user com.google.uid.shared: id=10007
I/PackageManager( 1317): /system/priv-app/GoogleBackupTransport changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleBackupTransport/x86/GoogleBackupTransport.odex needs to be relocated for /system/priv-app/GoogleBackupTransport/GoogleBackupTransport.apk
I/PackageManager( 1317): /system/priv-app/GoogleFeedback changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleFeedback/x86/GoogleFeedback.odex needs to be relocated for /system/priv-app/GoogleFeedback/GoogleFeedback.apk
I/PackageManager( 1317): /system/priv-app/GoogleLoginService changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleLoginService/x86/GoogleLoginService.odex needs to be relocated for /system/priv-app/GoogleLoginService/GoogleLoginService.apk
I/PackageManager( 1317): /system/priv-app/GoogleOneTimeInitializer changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleOneTimeInitializer/x86/GoogleOneTimeInitializer.odex needs to be relocated for /system/priv-app/GoogleOneTimeInitializer/GoogleOneTimeInitializer.apk
I/PackageManager( 1317): /system/priv-app/GooglePartnerSetup changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GooglePartnerSetup/x86/GooglePartnerSetup.odex needs to be relocated for /system/priv-app/GooglePartnerSetup/GooglePartnerSetup.apk
I/PackageManager( 1317): /system/priv-app/GoogleServicesFramework changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleServicesFramework/x86/GoogleServicesFramework.odex needs to be relocated for /system/priv-app/GoogleServicesFramework/GoogleServicesFramework.apk
I/PackageManager( 1317): /system/priv-app/InputDevices changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/InputDevices/x86/InputDevices.odex needs to be relocated for /system/priv-app/InputDevices/InputDevices.apk
I/PackageManager( 1317): /system/priv-app/ManagedProvisioning changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ManagedProvisioning/x86/ManagedProvisioning.odex needs to be relocated for /system/priv-app/ManagedProvisioning/ManagedProvisioning.apk
I/PackageManager( 1317): /system/priv-app/MediaProvider changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/MediaProvider/x86/MediaProvider.odex needs to be relocated for /system/priv-app/MediaProvider/MediaProvider.apk
I/PackageManager( 1317): /system/priv-app/Mms changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Mms/x86/Mms.odex needs to be relocated for /system/priv-app/Mms/Mms.apk
I/PackageManager( 1317): /system/priv-app/MmsService changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/MmsService/x86/MmsService.odex needs to be relocated for /system/priv-app/MmsService/MmsService.apk
I/PackageManager( 1317): /system/priv-app/MusicFX changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/MusicFX/x86/MusicFX.odex needs to be relocated for /system/priv-app/MusicFX/MusicFX.apk
I/PackageManager( 1317): /system/priv-app/Phonesky changed; collecting certs
I/PackageManager( 1317): /system/priv-app/ProxyHandler changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ProxyHandler/x86/ProxyHandler.odex needs to be relocated for /system/priv-app/ProxyHandler/ProxyHandler.apk
I/PackageManager( 1317): /system/priv-app/Settings changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Settings/x86/Settings.odex needs to be relocated for /system/priv-app/Settings/Settings.apk
I/PackageManager( 1317): /system/priv-app/SettingsProvider changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SettingsProvider/x86/SettingsProvider.odex needs to be relocated for /system/priv-app/SettingsProvider/SettingsProvider.apk
W/PackageParser( 1317): No actions in intent filter at /system/priv-app/SetupWizard/SetupWizard.apk Binary XML file line #170
W/PackageParser( 1317): No actions in intent filter at /system/priv-app/SetupWizard/SetupWizard.apk Binary XML file line #347
I/PackageManager( 1317): /system/priv-app/SetupWizard changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SetupWizard/x86/SetupWizard.odex needs to be relocated for /system/priv-app/SetupWizard/SetupWizard.apk
I/PackageManager( 1317): /system/priv-app/SharedStorageBackup changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SharedStorageBackup/x86/SharedStorageBackup.odex needs to be relocated for /system/priv-app/SharedStorageBackup/SharedStorageBackup.apk
I/PackageManager( 1317): /system/priv-app/Shell changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Shell/x86/Shell.odex needs to be relocated for /system/priv-app/Shell/Shell.apk
I/PackageManager( 1317): /system/priv-app/SystemUI changed; collecting certs
I/PackageManager( 1317): New shared user android.uid.systemui: id=10018
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SystemUI/x86/SystemUI.odex needs to be relocated for /system/priv-app/SystemUI/SystemUI.apk
I/PackageManager( 1317): /system/priv-app/TSCalibration2 changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/TSCalibration2/x86/TSCalibration2.odex needs to be relocated for /system/priv-app/TSCalibration2/TSCalibration2.apk
W/ResourceType( 1317): Failure getting entry for 0x7f08026f (t=7 e=623) (error -75)
I/PackageManager( 1317): /system/priv-app/TeleService changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/TeleService/x86/TeleService.odex needs to be relocated for /system/priv-app/TeleService/TeleService.apk
W/PackageParser( 1317): Unknown element under <intent-filter>: android at /system/priv-app/Telecom/Telecom.apk Binary XML file line #232
I/PackageManager( 1317): /system/priv-app/Telecom changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Telecom/x86/Telecom.odex needs to be relocated for /system/priv-app/Telecom/Telecom.apk
I/PackageManager( 1317): /system/priv-app/TelephonyProvider changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/TelephonyProvider/x86/TelephonyProvider.odex needs to be relocated for /system/priv-app/TelephonyProvider/TelephonyProvider.apk
I/PackageManager( 1317): /system/priv-app/VpnDialogs changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/VpnDialogs/x86/VpnDialogs.odex needs to be relocated for /system/priv-app/VpnDialogs/VpnDialogs.apk
I/PackageManager( 1317): /system/priv-app/WallpaperCropper changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/WallpaperCropper/x86/WallpaperCropper.odex needs to be relocated for /system/priv-app/WallpaperCropper/WallpaperCropper.apk
W/PackageParser( 1317): No actions in intent filter at /system/app/AndroidTerm/AndroidTerm.apk Binary XML file line #149
I/PackageManager( 1317): /system/app/AndroidTerm changed; collecting certs
I/PackageManager( 1317): /system/app/BasicDreams changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/BasicDreams/x86/BasicDreams.odex needs to be relocated for /system/app/BasicDreams/BasicDreams.apk
I/PackageManager( 1317): /system/app/BasicSmsReceiver changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/BasicSmsReceiver/x86/BasicSmsReceiver.odex needs to be relocated for /system/app/BasicSmsReceiver/BasicSmsReceiver.apk
W/PackageParser( 1317): No actions in intent filter at /system/app/Bluetooth/Bluetooth.apk Binary XML file line #209
I/PackageManager( 1317): /system/app/Bluetooth changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Bluetooth/x86/Bluetooth.odex needs to be relocated for /system/app/Bluetooth/Bluetooth.apk
I/PackageManager( 1317): /system/app/Browser changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Browser/x86/Browser.odex needs to be relocated for /system/app/Browser/Browser.apk
W/PackageParser( 1317): No actions in intent filter at /system/app/CMFileManager/CMFileManager.apk Binary XML file line #166
I/PackageManager( 1317): /system/app/CMFileManager changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/CMFileManager/x86/CMFileManager.odex needs to be relocated for /system/app/CMFileManager/CMFileManager.apk
I/PackageManager( 1317): /system/app/Calculator changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Calculator/x86/Calculator.odex needs to be relocated for /system/app/Calculator/Calculator.apk
I/PackageManager( 1317): /system/app/Calendar changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Calendar/x86/Calendar.odex needs to be relocated for /system/app/Calendar/Calendar.apk
I/PackageManager( 1317): /system/app/Camera2 changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Camera2/x86/Camera2.odex needs to be relocated for /system/app/Camera2/Camera2.apk
I/PackageManager( 1317): /system/app/CaptivePortalLogin changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/CaptivePortalLogin/x86/CaptivePortalLogin.odex needs to be relocated for /system/app/CaptivePortalLogin/CaptivePortalLogin.apk
I/PackageManager( 1317): /system/app/CertInstaller changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/CertInstaller/x86/CertInstaller.odex needs to be relocated for /system/app/CertInstaller/CertInstaller.apk
I/PackageManager( 1317): /system/app/ConfigUpdater changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/ConfigUpdater/x86/ConfigUpdater.odex needs to be relocated for /system/app/ConfigUpdater/ConfigUpdater.apk
I/PackageManager( 1317): /system/app/DeskClock changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/DeskClock/x86/DeskClock.odex needs to be relocated for /system/app/DeskClock/DeskClock.apk
I/PackageManager( 1317): /system/app/Development changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Development/x86/Development.odex needs to be relocated for /system/app/Development/Development.apk
I/PackageManager( 1317): /system/app/DocumentsUI changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/DocumentsUI/x86/DocumentsUI.odex needs to be relocated for /system/app/DocumentsUI/DocumentsUI.apk
I/PackageManager( 1317): /system/app/DownloadProviderUi changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/DownloadProviderUi/x86/DownloadProviderUi.odex needs to be relocated for /system/app/DownloadProviderUi/DownloadProviderUi.apk
I/PackageManager( 1317): /system/app/Email changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Email/x86/Email.odex needs to be relocated for /system/app/Email/Email.apk
I/PackageManager( 1317): /system/app/Exchange2 changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Exchange2/x86/Exchange2.odex needs to be relocated for /system/app/Exchange2/Exchange2.apk
I/PackageManager( 1317): /system/app/Galaxy4 changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Galaxy4/x86/Galaxy4.odex needs to be relocated for /system/app/Galaxy4/Galaxy4.apk
W/PackageParser( 1317): Unknown element under <application>: permission at /system/app/Gallery2/Gallery2.apk Binary XML file line #242
W/PackageParser( 1317): Unknown element under <application>: permission at /system/app/Gallery2/Gallery2.apk Binary XML file line #245
I/PackageManager( 1317): /system/app/Gallery2 changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Gallery2/x86/Gallery2.odex needs to be relocated for /system/app/Gallery2/Gallery2.apk
I/PackageManager( 1317): /system/app/Gmail2 changed; collecting certs
I/PackageManager( 1317): /system/app/GoogleCalendarSyncAdapter changed; collecting certs
I/PackageManager( 1317): New shared user com.google.android.calendar.uid.shared: id=10040
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/GoogleCalendarSyncAdapter/x86/GoogleCalendarSyncAdapter.odex needs to be relocated for /system/app/GoogleCalendarSyncAdapter/GoogleCalendarSyncAdapter.apk
I/PackageManager( 1317): /system/app/GoogleContactsSyncAdapter changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/GoogleContactsSyncAdapter/x86/GoogleContactsSyncAdapter.odex needs to be relocated for /system/app/GoogleContactsSyncAdapter/GoogleContactsSyncAdapter.apk
I/PackageManager( 1317): /system/app/HTMLViewer changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/HTMLViewer/x86/HTMLViewer.odex needs to be relocated for /system/app/HTMLViewer/HTMLViewer.apk
I/PackageManager( 1317): /system/app/HoloSpiralWallpaper changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/HoloSpiralWallpaper/x86/HoloSpiralWallpaper.odex needs to be relocated for /system/app/HoloSpiralWallpaper/HoloSpiralWallpaper.apk
I/PackageManager( 1317): /system/app/KeyChain changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/KeyChain/x86/KeyChain.odex needs to be relocated for /system/app/KeyChain/KeyChain.apk
I/PackageManager( 1317): /system/app/LatinIME changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/LatinIME/x86/LatinIME.odex needs to be relocated for /system/app/LatinIME/LatinIME.apk
I/PackageManager( 1317): /system/app/Launcher3 changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Launcher3/x86/Launcher3.odex needs to be relocated for /system/app/Launcher3/Launcher3.apk
I/PackageManager( 1317): /system/app/LiveWallpapers changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/LiveWallpapers/x86/LiveWallpapers.odex needs to be relocated for /system/app/LiveWallpapers/LiveWallpapers.apk
I/PackageManager( 1317): /system/app/LiveWallpapersPicker changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/LiveWallpapersPicker/x86/LiveWallpapersPicker.odex needs to be relocated for /system/app/LiveWallpapersPicker/LiveWallpapersPicker.apk
I/PackageManager( 1317): /system/app/Music2 changed; collecting certs
I/PackageManager( 1317): /system/app/NotePad changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/NotePad/x86/NotePad.odex needs to be relocated for /system/app/NotePad/NotePad.apk
I/PackageManager( 1317): /system/app/PacProcessor changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PacProcessor/x86/PacProcessor.odex needs to be relocated for /system/app/PacProcessor/PacProcessor.apk
I/PackageManager( 1317): /system/app/PackageInstaller changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PackageInstaller/x86/PackageInstaller.odex needs to be relocated for /system/app/PackageInstaller/PackageInstaller.apk
I/PackageManager( 1317): /system/app/PhaseBeam changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PhaseBeam/x86/PhaseBeam.odex needs to be relocated for /system/app/PhaseBeam/PhaseBeam.apk
I/PackageManager( 1317): /system/app/PicoTts changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PicoTts/x86/PicoTts.odex needs to be relocated for /system/app/PicoTts/PicoTts.apk
I/PackageManager( 1317): /system/app/PrintSpooler changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PrintSpooler/x86/PrintSpooler.odex needs to be relocated for /system/app/PrintSpooler/PrintSpooler.apk
I/PackageManager( 1317): /system/app/Provision changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Provision/x86/Provision.odex needs to be relocated for /system/app/Provision/Provision.apk
I/PackageManager( 1317): /system/app/QuickSearchBox changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/QuickSearchBox/x86/QuickSearchBox.odex needs to be relocated for /system/app/QuickSearchBox/QuickSearchBox.apk
I/PackageManager( 1317): /system/app/RSSReader changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/RSSReader/x86/RSSReader.odex needs to be relocated for /system/app/RSSReader/RSSReader.apk
I/PackageManager( 1317): /system/app/SoundRecorder changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/SoundRecorder/x86/SoundRecorder.odex needs to be relocated for /system/app/SoundRecorder/SoundRecorder.apk
I/PackageManager( 1317): /system/app/UserDictionaryProvider changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/UserDictionaryProvider/x86/UserDictionaryProvider.odex needs to be relocated for /system/app/UserDictionaryProvider/UserDictionaryProvider.apk
I/PackageManager( 1317): /system/app/VisualizationWallpapers changed; collecting certs
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/VisualizationWallpapers/x86/VisualizationWallpapers.odex needs to be relocated for /system/app/VisualizationWallpapers/VisualizationWallpapers.apk
E/sdcard  ( 1110): missing packages.list; retrying
I/PackageManager( 1317): /system/app/YouTube changed; collecting certs
I/PackageManager( 1317): /system/app/webview changed; collecting certs
D/PackageManager( 1317): No files in app dir /system/vendor/app
D/PackageManager( 1317): No files in app dir /oem/app
D/PackageManager( 1317): No files in app dir /data/app
D/PackageManager( 1317): No files in app dir /data/app-private
W/PackageManager( 1317): Package com.google.android.gms desires unavailable shared library com.google.android.ble; ignoring!
I/PackageManager( 1317): Adjusting ABI for : com.google.android.gsf to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleServicesFramework/x86/GoogleServicesFramework.odex needs to be relocated for /system/priv-app/GoogleServicesFramework/GoogleServicesFramework.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.gsf
E/installd( 1485): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/GoogleServicesFramework/x86/GoogleServicesFramework.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@GoogleServicesFramework@GoogleServicesFramework.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.google.android.syncadapters.contacts to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/GoogleContactsSyncAdapter/x86/GoogleContactsSyncAdapter.odex needs to be relocated for /system/app/GoogleContactsSyncAdapter/GoogleContactsSyncAdapter.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.syncadapters.contacts
E/installd( 1486): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/GoogleContactsSyncAdapter/x86/GoogleContactsSyncAdapter.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@GoogleContactsSyncAdapter@GoogleContactsSyncAdapter.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.google.android.backuptransport to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleBackupTransport/x86/GoogleBackupTransport.odex needs to be relocated for /system/priv-app/GoogleBackupTransport/GoogleBackupTransport.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.backuptransport
E/installd( 1487): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/GoogleBackupTransport/x86/GoogleBackupTransport.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@GoogleBackupTransport@GoogleBackupTransport.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.google.android.gsf.login to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleLoginService/x86/GoogleLoginService.odex needs to be relocated for /system/priv-app/GoogleLoginService/GoogleLoginService.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.gsf.login
E/installd( 1488): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/GoogleLoginService/x86/GoogleLoginService.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@GoogleLoginService@GoogleLoginService.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.android.inputdevices to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/InputDevices/x86/InputDevices.odex needs to be relocated for /system/priv-app/InputDevices/InputDevices.apk
I/PackageManager( 1317): Running patchoat on: com.android.inputdevices
E/installd( 1489): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/InputDevices/x86/InputDevices.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@InputDevices@InputDevices.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.android.providers.settings to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SettingsProvider/x86/SettingsProvider.odex needs to be relocated for /system/priv-app/SettingsProvider/SettingsProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.settings
E/installd( 1490): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/SettingsProvider/x86/SettingsProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@SettingsProvider@SettingsProvider.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.android.server.telecom to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Telecom/x86/Telecom.odex needs to be relocated for /system/priv-app/Telecom/Telecom.apk
I/PackageManager( 1317): Running patchoat on: com.android.server.telecom
E/installd( 1491): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/Telecom/x86/Telecom.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@Telecom@Telecom.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.android.settings to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Settings/x86/Settings.odex needs to be relocated for /system/priv-app/Settings/Settings.apk
I/PackageManager( 1317): Running patchoat on: com.android.settings
E/installd( 1492): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/Settings/x86/Settings.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@Settings@Settings.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.android.location.fused to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/FusedLocation/x86/FusedLocation.odex needs to be relocated for /system/priv-app/FusedLocation/FusedLocation.apk
I/PackageManager( 1317): Running patchoat on: com.android.location.fused
E/installd( 1493): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/FusedLocation/x86/FusedLocation.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@FusedLocation@FusedLocation.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : com.android.keychain to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/KeyChain/x86/KeyChain.odex needs to be relocated for /system/app/KeyChain/KeyChain.apk
I/PackageManager( 1317): Running patchoat on: com.android.keychain
E/installd( 1494): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/KeyChain/x86/KeyChain.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@KeyChain@KeyChain.apk@classes.dex)
I/PackageManager( 1317): Adjusting ABI for : org.zeroxlab.util.tscal to x86
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/TSCalibration2/x86/TSCalibration2.odex needs to be relocated for /system/priv-app/TSCalibration2/TSCalibration2.apk
I/PackageManager( 1317): Running patchoat on: org.zeroxlab.util.tscal
E/installd( 1495): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/TSCalibration2/x86/TSCalibration2.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@TSCalibration2@TSCalibration2.apk@classes.dex)
I/PackageManager( 1317): Time to scan packages: 2.922 seconds
W/PackageManager( 1317): Not granting permission android.permission.MANAGE_DOCUMENTS to package com.google.android.youtube (protectionLevel=2 flags=0x583e45)
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.READ_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.WRITE_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Unknown permission com.google.android.launcher.permission.READ_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Unknown permission com.google.android.launcher.permission.WRITE_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Not granting permission android.permission.GLOBAL_SEARCH to package com.android.quicksearchbox (protectionLevel=18 flags=0x8be45)
W/PackageManager( 1317): Not granting permission android.permission.ACCESS_DOWNLOAD_MANAGER to package com.android.browser (protectionLevel=18 flags=0x9be45)
W/PackageManager( 1317): Not granting permission android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS to package com.android.browser (protectionLevel=2 flags=0x9be45)
W/PackageManager( 1317): Not granting permission android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS to package com.android.vending (protectionLevel=2 flags=0x400abe45)
W/PackageManager( 1317): Unknown permission android.permission.SEND_SMS_NO_CONFIRMATION in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.USE_FINGERPRINT in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.GET_PACKAGE_IMPORTANCE in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.GET_ACCOUNTS_PRIVILEGED in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.INSTALL_GRANT_RUNTIME_PERMISSIONS in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.GRANT_RUNTIME_PERMISSIONS in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.REVOKE_RUNTIME_PERMISSIONS in package com.android.vending
W/PackageManager( 1317): Not granting permission android.permission.BIND_WALLPAPER to package com.android.camera2 (protectionLevel=18 flags=0x58bc45)
W/PackageManager( 1317): Unknown permission android.permission.INSTALL_DRM in package com.android.mms
W/PackageManager( 1317): Not granting permission android.permission.BIND_APPWIDGET to package com.android.launcher3 (protectionLevel=18 flags=0x483e45)
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.READ_SETTINGS in package com.android.launcher3
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.WRITE_SETTINGS in package com.android.launcher3
W/PackageManager( 1317): Unknown permission com.google.android.calendar.permission.READ_OOBE in package com.google.android.gm
W/PackageManager( 1317): Unknown permission com.google.android.voicesearch.AUDIO_FILE_ACCESS in package com.google.android.gm
W/PackageManager( 1317): Unknown permission com.google.android.email.permission.READ_ATTACHMENT in package com.google.android.gm
W/PackageManager( 1317): Unknown permission com.google.android.email.permission.ACCESS_PROVIDER in package com.google.android.gm
W/PackageManager( 1317): Unknown permission android.permission.READ_OWNER_DATA in package com.google.android.setupwizard
W/PackageManager( 1317): Unknown permission android.permission.WRITE_OWNER_DATA in package com.google.android.setupwizard
W/PackageManager( 1317): Unknown permission com.google.android.apps.now.OPT_IN_WIZARD in package com.google.android.setupwizard
W/PackageManager( 1317): Unknown permission com.google.android.gms.permission.CONTACTS_SYNC_DELEGATION in package com.google.android.syncadapters.contacts
W/PackageManager( 1317): Unknown permission android.permission.OBSERVE_GRANT_REVOKE_PERMISSIONS in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.apps.enterprise.dmagent.permission.AutoSyncPermission in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.googlequicksearchbox.permission.PAUSE_HOTWORD in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.hangouts.START_HANGOUT in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.wearable.READ_SETTINGS in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.INTENT_FILTER_VERIFICATION_AGENT in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.LOCAL_MAC_ADDRESS in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.NOTIFY_PENDING_SYSTEM_UPDATE in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.launcher.permission.RECEIVE_LAUNCH_BROADCASTS in package com.google.android.gms
W/PackageManager( 1317): Not granting permission android.permission.MANAGE_DOCUMENTS to package com.google.android.gms (protectionLevel=2 flags=0xc0483e45)
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.PRELOAD_WORKSPACE in package com.google.android.partnersetup
W/PackageManager( 1317): Not granting permission android.permission.DELETE_PACKAGES to package com.svox.pico (protectionLevel=18 flags=0x8be45)
W/PackageManager( 1317): Unknown permission com.cyanogenmod.filemanager.permissions.READ_THEME in package com.cyanogenmod.filemanager
W/PackageManager( 1317): Not granting permission android.permission.CONTROL_KEYGUARD to package com.google.android.gsf.login (protectionLevel=2 flags=0x4048be45)
W/PackageManager( 1317): Unknown permission com.android.vending.billing.IBillingAccountService.BIND2 in package com.google.android.gsf.login
W/PackageManager( 1317): Unknown permission com.android.chrome.TOS_ACKED in package com.google.android.gsf.login
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.READ_SETTINGS in package com.android.settings
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.WRITE_SETTINGS in package com.android.settings
W/PackageManager( 1317): Unknown permission com.android.smspush.WAPPUSH_MANAGER_BIND in package com.android.phone
W/PackageManager( 1317): Not granting permission android.permission.DEVICE_POWER to package com.android.deskclock (protectionLevel=2 flags=0x48be45)
W/PackageManager( 1317): Unknown permission com.google.android.gallery3d.permission.GALLERY_PROVIDER in package com.android.bluetooth
I/art     ( 1317): Explicit concurrent mark sweep GC freed 72133(3MB) AllocSpace objects, 15(1072KB) LOS objects, 33% free, 5MB/7MB, paused 76us total 8.528ms
I/SystemServer( 1317): User Service
I/lowmemorykiller( 1096): ActivityManager connected
I/SystemServiceManager( 1317): Starting com.android.server.lights.LightsService
E/lights  ( 1317): Unable to detect max_brightness. Try to set backlight.max_brightness_file
I/SystemServiceManager( 1317): Starting com.android.server.BatteryService
I/SystemServiceManager( 1317): Starting com.android.server.usage.UsageStatsService
I/UsageStatsDatabase( 1317): Upgrading from version 0 to 2
I/UsageStatsDatabase( 1317): Deleting all usage stats files
I/UsageStatsService( 1317): User[0] Rollover scheduled @ 2016-04-11 00:00:00(1460332800000)
I/SystemServiceManager( 1317): Starting com.android.server.webkit.WebViewUpdateService
I/SystemServer( 1317): Reading configuration...
I/SystemServer( 1317): Scheduling Policy
I/SystemServiceManager( 1317): Starting com.android.server.telecom.TelecomLoaderService
I/SystemServer( 1317): Telephony Registry
I/SystemServer( 1317): Entropy Mixer
W/EntropyMixer( 1317): No existing entropy file -- first boot?
I/EntropyMixer( 1317): Writing entropy...
I/SystemServer( 1317): Account Manager
I/SystemServer( 1317): Content Manager
I/SystemServer( 1317): System Content Providers
I/SyncManager( 1317): No initial accounts
I/SyncManager( 1317): No initial status
I/SyncManager( 1317): No initial statistics
D/SettingsProvider( 1317): Generated and saved new ANDROID_ID [a73ff9e4cba19545] for user 0
I/SystemServer( 1317): Vibrator Service
I/SystemServer( 1317): Consumer IR Service
E/ConsumerIrService( 1317): Can't open consumer IR HW Module, error: -2
I/SystemServiceManager( 1317): Starting com.android.server.AlarmManagerService
I/SystemServer( 1317): Init Watchdog
I/SystemServer( 1317): Input Manager
I/InputManager( 1317): Initializing input manager, mUseDevInputEventForAudioJack=true
I/SystemServer( 1317): Window Manager
I/WindowManager( 1317): No existing display settings /data/system/display_settings.xml; starting empty
D/PermissionCache( 1099): checking android.permission.ACCESS_SURFACE_FLINGER for uid=1000 => granted (47 us)
I/InputManager( 1317): Starting input manager
I/SystemServer( 1317): Bluetooth Manager Service
D/BluetoothManagerService( 1317): Loading stored name and address
D/BluetoothManagerService( 1317): Stored bluetooth Name=null,Address=null
I/SystemServer( 1317): Input Method Service
D/EventHub( 1317): No input device configuration file found for device 'ImExPS/2 Generic Explorer Mouse'.
I/EventHub( 1317): New device: id=1, fd=76, path='/dev/input/event4', name='ImExPS/2 Generic Explorer Mouse', classes=0x8, configuration='', keyLayout='', keyCharacterMap='', builtinKeyboard=false, wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
E/EventHub( 1317): could not get driver version for /dev/input/mouse0, Not a typewriter
D/EventHub( 1317): No input device configuration file found for device 'Android Power Button'.
W/EventHub( 1317): Unable to disable kernel key repeat for /dev/input/event3: Function not implemented
I/EventHub( 1317): New device: id=2, fd=78, path='/dev/input/event3', name='Android Power Button', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
I/EventHub( 1317): ignoring event id /dev/input/event0 driver Power Button
W/InputMethodManagerService( 1317): No IME selected. Choose the most applicable IME.
I/InputMethodManagerService( 1317): Default found, using com.android.inputmethod.latin/.LatinIME
I/SystemServer( 1317): Accessibility Manager
I/ActivityManager( 1317): Config changes=1df8 {1.0 ?mcc?mnc en_US ?layoutDir sw738dp w984dp h738dp 130dpi xlrg land ?uimode ?night -touch -keyb/h/h -nav/h s.2}
D/EventHub( 1317): No input device configuration file found for device 'PC Speaker'.
I/ActivityManager( 1317): Config changes=500 {1.0 ?mcc?mnc en_US ?layoutDir sw738dp w984dp h665dp 130dpi lrg land ?uimode ?night -touch -keyb/h/h -nav/h s.3}
I/SystemServer( 1317): Mount Service
D/MountService( 1317): got storage path: null description: Internal storage primary: true removable: false emulated: true mtpReserve: 100 allowMassStorage: false maxFileSize: 0
D/MountService( 1317): addVolumeLocked() StorageVolume:
D/MountService( 1317):     mStorageId=65537 mPath=/storage/emulated/0 mDescriptionId=17040805 
D/MountService( 1317):     mPrimary=true mRemovable=false mEmulated=true mMtpReserveSpace=100 
D/MountService( 1317):     mAllowMassStorage=false mMaxFileSize=0 mOwner=UserHandle{0} mUuid=null 
D/MountService( 1317):     mUserLabel=null mState=null 
D/MountService( 1317): got storage path: /storage/sdcard1 description: SD card primary: false removable: true emulated: false mtpReserve: 0 allowMassStorage: false maxFileSize: 4294967296
D/MountService( 1317): addVolumeLocked() StorageVolume:
D/MountService( 1317):     mStorageId=0 mPath=/storage/sdcard1 mDescriptionId=17040806 mPrimary=false 
D/MountService( 1317):     mRemovable=true mEmulated=false mMtpReserveSpace=0 mAllowMassStorage=false 
D/MountService( 1317):     mMaxFileSize=4294967296 mOwner=null mUuid=null mUserLabel=null mState=null 
D/MountService( 1317): got storage path: /storage/usb0 description: USB storage primary: false removable: true emulated: false mtpReserve: 0 allowMassStorage: false maxFileSize: 4294967296
D/MountService( 1317): addVolumeLocked() StorageVolume:
D/MountService( 1317):     mStorageId=0 mPath=/storage/usb0 mDescriptionId=17040807 mPrimary=false 
D/MountService( 1317):     mRemovable=true mEmulated=false mMtpReserveSpace=0 mAllowMassStorage=false 
D/MountService( 1317):     mMaxFileSize=4294967296 mOwner=null mUuid=null mUserLabel=null mState=null 
D/MountService( 1317): got storage path: /storage/usb1 description: USB storage primary: false removable: true emulated: false mtpReserve: 0 allowMassStorage: false maxFileSize: 4294967296
D/MountService( 1317): addVolumeLocked() StorageVolume:
D/MountService( 1317):     mStorageId=0 mPath=/storage/usb1 mDescriptionId=17040807 mPrimary=false 
D/MountService( 1317):     mRemovable=true mEmulated=false mMtpReserveSpace=0 mAllowMassStorage=false 
D/MountService( 1317):     mMaxFileSize=4294967296 mOwner=null mUuid=null mUserLabel=null mState=null 
D/MountService( 1317): got storage path: /storage/usb2 description: USB storage primary: false removable: true emulated: false mtpReserve: 0 allowMassStorage: false maxFileSize: 4294967296
D/MountService( 1317): addVolumeLocked() StorageVolume:
D/MountService( 1317):     mStorageId=0 mPath=/storage/usb2 mDescriptionId=17040807 mPrimary=false 
D/MountService( 1317):     mRemovable=true mEmulated=false mMtpReserveSpace=0 mAllowMassStorage=false 
D/MountService( 1317):     mMaxFileSize=4294967296 mOwner=null mUuid=null mUserLabel=null mState=null 
D/MountService( 1317): got storage path: /storage/usb3 description: USB storage primary: false removable: true emulated: false mtpReserve: 0 allowMassStorage: false maxFileSize: 4294967296
D/MountService( 1317): addVolumeLocked() StorageVolume:
D/MountService( 1317):     mStorageId=0 mPath=/storage/usb3 mDescriptionId=17040807 mPrimary=false 
D/MountService( 1317):     mRemovable=true mEmulated=false mMtpReserveSpace=0 mAllowMassStorage=false 
D/MountService( 1317):     mMaxFileSize=4294967296 mOwner=null mUuid=null mUserLabel=null mState=null 
W/PackageManager( 1317): No disk maintenance in 1460276251268; running immediately
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ProxyHandler/x86/ProxyHandler.odex needs to be relocated for /system/priv-app/ProxyHandler/ProxyHandler.apk
I/PackageManager( 1317): Running patchoat on: com.android.proxyhandler
E/installd( 1503): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/ProxyHandler/x86/ProxyHandler.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@ProxyHandler@ProxyHandler.apk@classes.dex)
D/MountService( 1317): volume state changed for /storage/usb0 (unmounted -> removed)
D/MountService( 1317): volume state changed for /storage/usb1 (unmounted -> removed)
D/MountService( 1317): volume state changed for /storage/usb2 (unmounted -> removed)
D/MountService( 1317): volume state changed for /storage/usb3 (unmounted -> removed)
I/MountService( 1317): Running fstrim idle maintenance
I/PackageManager( 1317): No secure containers found
W/PackageManager( 1317): Not granting permission android.permission.MANAGE_DOCUMENTS to package com.google.android.youtube (protectionLevel=2 flags=0x583e45)
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.READ_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.WRITE_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Unknown permission com.google.android.launcher.permission.READ_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Unknown permission com.google.android.launcher.permission.WRITE_SETTINGS in package com.google.android.onetimeinitializer
W/PackageManager( 1317): Not granting permission android.permission.GLOBAL_SEARCH to package com.android.quicksearchbox (protectionLevel=18 flags=0x8be45)
W/PackageManager( 1317): Not granting permission android.permission.ACCESS_DOWNLOAD_MANAGER to package com.android.browser (protectionLevel=18 flags=0x9be45)
W/PackageManager( 1317): Not granting permission android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS to package com.android.browser (protectionLevel=2 flags=0x9be45)
W/PackageManager( 1317): Not granting permission android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS to package com.android.vending (protectionLevel=2 flags=0x400abe45)
W/PackageManager( 1317): Unknown permission android.permission.SEND_SMS_NO_CONFIRMATION in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.USE_FINGERPRINT in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.GET_PACKAGE_IMPORTANCE in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.GET_ACCOUNTS_PRIVILEGED in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.INSTALL_GRANT_RUNTIME_PERMISSIONS in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.GRANT_RUNTIME_PERMISSIONS in package com.android.vending
W/PackageManager( 1317): Unknown permission android.permission.REVOKE_RUNTIME_PERMISSIONS in package com.android.vending
W/PackageManager( 1317): Not granting permission android.permission.BIND_WALLPAPER to package com.android.camera2 (protectionLevel=18 flags=0x58bc45)
W/PackageManager( 1317): Unknown permission android.permission.INSTALL_DRM in package com.android.mms
W/PackageManager( 1317): Not granting permission android.permission.BIND_APPWIDGET to package com.android.launcher3 (protectionLevel=18 flags=0x483e45)
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.READ_SETTINGS in package com.android.launcher3
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.WRITE_SETTINGS in package com.android.launcher3
W/PackageManager( 1317): Unknown permission com.google.android.calendar.permission.READ_OOBE in package com.google.android.gm
W/PackageManager( 1317): Unknown permission com.google.android.voicesearch.AUDIO_FILE_ACCESS in package com.google.android.gm
W/PackageManager( 1317): Unknown permission com.google.android.email.permission.READ_ATTACHMENT in package com.google.android.gm
W/PackageManager( 1317): Unknown permission com.google.android.email.permission.ACCESS_PROVIDER in package com.google.android.gm
W/PackageManager( 1317): Unknown permission android.permission.READ_OWNER_DATA in package com.google.android.setupwizard
W/PackageManager( 1317): Unknown permission android.permission.WRITE_OWNER_DATA in package com.google.android.setupwizard
W/PackageManager( 1317): Unknown permission com.google.android.apps.now.OPT_IN_WIZARD in package com.google.android.setupwizard
W/PackageManager( 1317): Unknown permission com.google.android.gms.permission.CONTACTS_SYNC_DELEGATION in package com.google.android.syncadapters.contacts
W/PackageManager( 1317): Unknown permission android.permission.OBSERVE_GRANT_REVOKE_PERMISSIONS in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.apps.enterprise.dmagent.permission.AutoSyncPermission in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.googlequicksearchbox.permission.PAUSE_HOTWORD in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.hangouts.START_HANGOUT in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.wearable.READ_SETTINGS in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.INTENT_FILTER_VERIFICATION_AGENT in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.LOCAL_MAC_ADDRESS in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST in package com.google.android.gms
W/PackageManager( 1317): Unknown permission android.permission.NOTIFY_PENDING_SYSTEM_UPDATE in package com.google.android.gms
W/PackageManager( 1317): Unknown permission com.google.android.launcher.permission.RECEIVE_LAUNCH_BROADCASTS in package com.google.android.gms
W/PackageManager( 1317): Not granting permission android.permission.MANAGE_DOCUMENTS to package com.google.android.gms (protectionLevel=2 flags=0xc0483e45)
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.PRELOAD_WORKSPACE in package com.google.android.partnersetup
W/PackageManager( 1317): Not granting permission android.permission.DELETE_PACKAGES to package com.svox.pico (protectionLevel=18 flags=0x8be45)
W/PackageManager( 1317): Unknown permission com.cyanogenmod.filemanager.permissions.READ_THEME in package com.cyanogenmod.filemanager
W/PackageManager( 1317): Not granting permission android.permission.CONTROL_KEYGUARD to package com.google.android.gsf.login (protectionLevel=2 flags=0x4048be45)
W/PackageManager( 1317): Unknown permission com.android.vending.billing.IBillingAccountService.BIND2 in package com.google.android.gsf.login
W/PackageManager( 1317): Unknown permission com.android.chrome.TOS_ACKED in package com.google.android.gsf.login
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.READ_SETTINGS in package com.android.settings
W/PackageManager( 1317): Unknown permission com.android.launcher.permission.WRITE_SETTINGS in package com.android.settings
W/PackageManager( 1317): Unknown permission com.android.smspush.WAPPUSH_MANAGER_BIND in package com.android.phone
W/PackageManager( 1317): Not granting permission android.permission.DEVICE_POWER to package com.android.deskclock (protectionLevel=2 flags=0x48be45)
W/PackageManager( 1317): Unknown permission com.google.android.gallery3d.permission.GALLERY_PROVIDER in package com.android.bluetooth
I/fstrim  ( 1098): Starting fstrim work...
I/fstrim  ( 1098): Invoking FITRIM ioctl on /cache
E/fstrim  ( 1098): FITRIM ioctl failed on /cache (error 25/Not a typewriter)
I/fstrim  ( 1098): Finished fstrim work.
D/EventHub( 1317): No input device configuration file found for device 'AT Translated Set 2 keyboard'.
I/EventHub( 1317): New device: id=4, fd=83, path='/dev/input/event2', name='AT Translated Set 2 keyboard', classes=0x3, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
E/EventHub( 1317): could not get driver version for /dev/input/mice, Not a typewriter
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/MmsService/x86/MmsService.odex needs to be relocated for /system/priv-app/MmsService/MmsService.apk
I/PackageManager( 1317): Running patchoat on: com.android.mms.service
E/installd( 1506): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/MmsService/x86/MmsService.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@MmsService@MmsService.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/DefaultContainerService/x86/DefaultContainerService.odex needs to be relocated for /system/priv-app/DefaultContainerService/DefaultContainerService.apk
I/PackageManager( 1317): Running patchoat on: com.android.defcontainer
E/installd( 1507): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/DefaultContainerService/x86/DefaultContainerService.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@DefaultContainerService@DefaultContainerService.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Shell/x86/Shell.odex needs to be relocated for /system/priv-app/Shell/Shell.apk
I/PackageManager( 1317): Running patchoat on: com.android.shell
E/installd( 1508): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/Shell/x86/Shell.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@Shell@Shell.apk@classes.dex)
I/InputReader( 1317): Device added: id=-1, name='Virtual', sources=0x00000301
I/InputReader( 1317): Device added: id=4, name='AT Translated Set 2 keyboard', sources=0x00000101
I/InputReader( 1317): Device added: id=2, name='Android Power Button', sources=0x00000101
I/InputReader( 1317): Device added: id=1, name='ImExPS/2 Generic Explorer Mouse', sources=0x00002002
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000004
I/ActivityManager( 1317): Config changes=30 {1.0 ?mcc?mnc en_US ?layoutDir sw738dp w984dp h665dp 130dpi lrg land ?uimode ?night -touch qwerty/v/v -nav/h s.4}
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/TeleService/x86/TeleService.odex needs to be relocated for /system/priv-app/TeleService/TeleService.apk
I/PackageManager( 1317): Running patchoat on: com.android.phone
E/installd( 1509): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/TeleService/x86/TeleService.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@TeleService@TeleService.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SystemUI/x86/SystemUI.odex needs to be relocated for /system/priv-app/SystemUI/SystemUI.apk
I/PackageManager( 1317): Running patchoat on: com.android.systemui
E/installd( 1510): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/SystemUI/x86/SystemUI.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@SystemUI@SystemUI.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Dialer/x86/Dialer.odex needs to be relocated for /system/priv-app/Dialer/Dialer.apk
I/PackageManager( 1317): Running patchoat on: com.android.dialer
E/installd( 1511): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/Dialer/x86/Dialer.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@Dialer@Dialer.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/TelephonyProvider/x86/TelephonyProvider.odex needs to be relocated for /system/priv-app/TelephonyProvider/TelephonyProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.telephony
E/installd( 1512): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/TelephonyProvider/x86/TelephonyProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@TelephonyProvider@TelephonyProvider.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/LatinIME/x86/LatinIME.odex needs to be relocated for /system/app/LatinIME/LatinIME.apk
I/PackageManager( 1317): Running patchoat on: com.android.inputmethod.latin
E/installd( 1513): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/LatinIME/x86/LatinIME.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@LatinIME@LatinIME.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/MediaProvider/x86/MediaProvider.odex needs to be relocated for /system/priv-app/MediaProvider/MediaProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.media
E/installd( 1514): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/MediaProvider/x86/MediaProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@MediaProvider@MediaProvider.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ManagedProvisioning/x86/ManagedProvisioning.odex needs to be relocated for /system/priv-app/ManagedProvisioning/ManagedProvisioning.apk
I/PackageManager( 1317): Running patchoat on: com.android.managedprovisioning
E/installd( 1515): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/ManagedProvisioning/x86/ManagedProvisioning.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@ManagedProvisioning@ManagedProvisioning.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/CalendarProvider/x86/CalendarProvider.odex needs to be relocated for /system/priv-app/CalendarProvider/CalendarProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.calendar
E/installd( 1516): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/CalendarProvider/x86/CalendarProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@CalendarProvider@CalendarProvider.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ContactsProvider/x86/ContactsProvider.odex needs to be relocated for /system/priv-app/ContactsProvider/ContactsProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.contacts
E/installd( 1517): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/ContactsProvider/x86/ContactsProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@ContactsProvider@ContactsProvider.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/SoundRecorder/x86/SoundRecorder.odex needs to be relocated for /system/app/SoundRecorder/SoundRecorder.apk
I/PackageManager( 1317): Running patchoat on: com.android.soundrecorder
E/installd( 1518): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/SoundRecorder/x86/SoundRecorder.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@SoundRecorder@SoundRecorder.apk@classes.dex)
I/PackageManager( 1317): Running dexopt on: /system/priv-app/Phonesky/Phonesky.apk pkg=com.android.vending isa=x86 vmSafeMode=false
I/dex2oat ( 1519): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/priv-app/Phonesky/Phonesky.apk --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@priv-app@Phonesky@Phonesky.apk@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/AudioFlinger( 1105): Using module 1 has the primary audio interface
I/AudioFlinger( 1105): AudioFlinger's thread 0xb5ca4000 ready to run
I/AudioFlinger( 1105): AudioFlinger's thread 0xb5d3a000 ready to run
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:audio_open() 
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:audio_ipc_init() 
E/BlueZ   ( 1105): APTX: failed to open library libbt-aptx.so (dlopen failed: library "libbt-aptx.so" not found)
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:audio_init_check() 
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:audio_set_master_volume() 
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:set_master_mute() 
I/AudioFlinger( 1105): loadHwModule() Loaded a2dp audio interface from A2DP Bluez HW HAL (audio) handle 4
I/AudioFlinger( 1105): loadHwModule() Loaded usb audio interface from USB audio HW HAL (audio) handle 5
E/SoundTriggerHwService( 1105): couldn't load sound trigger module sound_trigger.primary (No such file or directory)
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:ipc_handler() 
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:ipc_handler() Waiting for connection ...
I/dex2oat ( 1519): Decided to run without swap.
I/dex2oat ( 1519): dex2oat took 3.466s (threads: 1) arena alloc=787KB java alloc=13MB native alloc=20MB free=7MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/GoogleCalendarSyncAdapter/x86/GoogleCalendarSyncAdapter.odex needs to be relocated for /system/app/GoogleCalendarSyncAdapter/GoogleCalendarSyncAdapter.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.syncadapters.calendar
E/installd( 1525): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/GoogleCalendarSyncAdapter/x86/GoogleCalendarSyncAdapter.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@GoogleCalendarSyncAdapter@GoogleCalendarSyncAdapter.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Bluetooth/x86/Bluetooth.odex needs to be relocated for /system/app/Bluetooth/Bluetooth.apk
I/PackageManager( 1317): Running patchoat on: com.android.bluetooth
E/installd( 1526): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Bluetooth/x86/Bluetooth.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Bluetooth@Bluetooth.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/BackupRestoreConfirmation/x86/BackupRestoreConfirmation.odex needs to be relocated for /system/priv-app/BackupRestoreConfirmation/BackupRestoreConfirmation.apk
I/PackageManager( 1317): Running patchoat on: com.android.backupconfirm
E/installd( 1527): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/BackupRestoreConfirmation/x86/BackupRestoreConfirmation.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@BackupRestoreConfirmation@BackupRestoreConfirmation.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PhaseBeam/x86/PhaseBeam.odex needs to be relocated for /system/app/PhaseBeam/PhaseBeam.apk
I/PackageManager( 1317): Running patchoat on: com.android.phasebeam
E/installd( 1528): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/PhaseBeam/x86/PhaseBeam.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@PhaseBeam@PhaseBeam.apk@classes.dex)
I/PackageManager( 1317): Running dexopt on: /system/app/AndroidTerm/AndroidTerm.apk pkg=jackpal.androidterm isa=x86 vmSafeMode=false
I/dex2oat ( 1529): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/app/AndroidTerm/AndroidTerm.apk --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@app@AndroidTerm@AndroidTerm.apk@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/dex2oat ( 1529): Decided to run without swap.
I/dex2oat ( 1529): dex2oat took 93.861ms (threads: 1) arena alloc=21KB java alloc=412KB native alloc=1253KB free=2MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Gallery2/x86/Gallery2.odex needs to be relocated for /system/app/Gallery2/Gallery2.apk
I/PackageManager( 1317): Running patchoat on: com.android.gallery3d
E/installd( 1531): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Gallery2/x86/Gallery2.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Gallery2@Gallery2.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GooglePartnerSetup/x86/GooglePartnerSetup.odex needs to be relocated for /system/priv-app/GooglePartnerSetup/GooglePartnerSetup.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.partnersetup
E/installd( 1532): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/GooglePartnerSetup/x86/GooglePartnerSetup.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@GooglePartnerSetup@GooglePartnerSetup.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SharedStorageBackup/x86/SharedStorageBackup.odex needs to be relocated for /system/priv-app/SharedStorageBackup/SharedStorageBackup.apk
I/PackageManager( 1317): Running patchoat on: com.android.sharedstoragebackup
E/installd( 1533): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/SharedStorageBackup/x86/SharedStorageBackup.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@SharedStorageBackup@SharedStorageBackup.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Calendar/x86/Calendar.odex needs to be relocated for /system/app/Calendar/Calendar.apk
I/PackageManager( 1317): Running patchoat on: com.android.calendar
E/installd( 1534): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Calendar/x86/Calendar.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Calendar@Calendar.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Exchange2/x86/Exchange2.odex needs to be relocated for /system/app/Exchange2/Exchange2.apk
I/PackageManager( 1317): Running patchoat on: com.android.exchange
E/installd( 1535): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Exchange2/x86/Exchange2.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Exchange2@Exchange2.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Provision/x86/Provision.odex needs to be relocated for /system/app/Provision/Provision.apk
I/PackageManager( 1317): Running patchoat on: com.android.provision
E/installd( 1536): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Provision/x86/Provision.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Provision@Provision.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Development/x86/Development.odex needs to be relocated for /system/app/Development/Development.apk
I/PackageManager( 1317): Running patchoat on: com.android.development
E/installd( 1537): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Development/x86/Development.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Development@Development.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/WallpaperCropper/x86/WallpaperCropper.odex needs to be relocated for /system/priv-app/WallpaperCropper/WallpaperCropper.apk
I/PackageManager( 1317): Running patchoat on: com.android.wallpapercropper
E/installd( 1538): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/WallpaperCropper/x86/WallpaperCropper.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@WallpaperCropper@WallpaperCropper.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Email/x86/Email.odex needs to be relocated for /system/app/Email/Email.apk
I/PackageManager( 1317): Running patchoat on: com.android.email
E/installd( 1539): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Email/x86/Email.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Email@Email.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Launcher3/x86/Launcher3.odex needs to be relocated for /system/app/Launcher3/Launcher3.apk
I/PackageManager( 1317): Running patchoat on: com.android.launcher3
E/installd( 1540): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Launcher3/x86/Launcher3.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Launcher3@Launcher3.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/DocumentsUI/x86/DocumentsUI.odex needs to be relocated for /system/app/DocumentsUI/DocumentsUI.apk
I/PackageManager( 1317): Running patchoat on: com.android.documentsui
E/installd( 1541): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/DocumentsUI/x86/DocumentsUI.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@DocumentsUI@DocumentsUI.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PacProcessor/x86/PacProcessor.odex needs to be relocated for /system/app/PacProcessor/PacProcessor.apk
I/PackageManager( 1317): Running patchoat on: com.android.pacprocessor
E/installd( 1542): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/PacProcessor/x86/PacProcessor.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@PacProcessor@PacProcessor.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/ConfigUpdater/x86/ConfigUpdater.odex needs to be relocated for /system/app/ConfigUpdater/ConfigUpdater.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.configupdater
E/installd( 1543): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/ConfigUpdater/x86/ConfigUpdater.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@ConfigUpdater@ConfigUpdater.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/CertInstaller/x86/CertInstaller.odex needs to be relocated for /system/app/CertInstaller/CertInstaller.apk
I/PackageManager( 1317): Running patchoat on: com.android.certinstaller
E/installd( 1544): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/CertInstaller/x86/CertInstaller.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@CertInstaller@CertInstaller.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PicoTts/x86/PicoTts.odex needs to be relocated for /system/app/PicoTts/PicoTts.apk
I/PackageManager( 1317): Running patchoat on: com.svox.pico
E/installd( 1545): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/PicoTts/x86/PicoTts.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@PicoTts@PicoTts.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/BasicSmsReceiver/x86/BasicSmsReceiver.odex needs to be relocated for /system/app/BasicSmsReceiver/BasicSmsReceiver.apk
I/PackageManager( 1317): Running patchoat on: com.android.basicsmsreceiver
E/installd( 1546): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/BasicSmsReceiver/x86/BasicSmsReceiver.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@BasicSmsReceiver@BasicSmsReceiver.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/LiveWallpapersPicker/x86/LiveWallpapersPicker.odex needs to be relocated for /system/app/LiveWallpapersPicker/LiveWallpapersPicker.apk
I/PackageManager( 1317): Running patchoat on: com.android.wallpaper.livepicker
E/installd( 1547): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/LiveWallpapersPicker/x86/LiveWallpapersPicker.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@LiveWallpapersPicker@LiveWallpapersPicker.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/NotePad/x86/NotePad.odex needs to be relocated for /system/app/NotePad/NotePad.apk
I/PackageManager( 1317): Running patchoat on: com.example.android.notepad
E/installd( 1548): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/NotePad/x86/NotePad.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@NotePad@NotePad.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleOneTimeInitializer/x86/GoogleOneTimeInitializer.odex needs to be relocated for /system/priv-app/GoogleOneTimeInitializer/GoogleOneTimeInitializer.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.onetimeinitializer
E/installd( 1549): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/GoogleOneTimeInitializer/x86/GoogleOneTimeInitializer.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@GoogleOneTimeInitializer@GoogleOneTimeInitializer.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/DownloadProviderUi/x86/DownloadProviderUi.odex needs to be relocated for /system/app/DownloadProviderUi/DownloadProviderUi.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.downloads.ui
E/installd( 1550): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/DownloadProviderUi/x86/DownloadProviderUi.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@DownloadProviderUi@DownloadProviderUi.apk@classes.dex)
I/PackageManager( 1317): Running dexopt on: /system/app/Gmail2/Gmail2.apk pkg=com.google.android.gm isa=x86 vmSafeMode=false
I/dex2oat ( 1551): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/app/Gmail2/Gmail2.apk --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@app@Gmail2@Gmail2.apk@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/dex2oat ( 1551): Decided to run without swap.
I/dex2oat ( 1551): dex2oat took 2.930s (threads: 1) arena alloc=1053KB java alloc=10MB native alloc=18MB free=5MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/SetupWizard/x86/SetupWizard.odex needs to be relocated for /system/priv-app/SetupWizard/SetupWizard.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.setupwizard
E/installd( 1553): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/SetupWizard/x86/SetupWizard.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@SetupWizard@SetupWizard.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/UserDictionaryProvider/x86/UserDictionaryProvider.odex needs to be relocated for /system/app/UserDictionaryProvider/UserDictionaryProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.userdictionary
E/installd( 1554): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/UserDictionaryProvider/x86/UserDictionaryProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@UserDictionaryProvider@UserDictionaryProvider.apk@classes.dex)
I/PackageManager( 1317): Running dexopt on: /system/app/webview/webview.apk pkg=com.android.webview isa=x86 vmSafeMode=false
I/dex2oat ( 1555): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/app/webview/webview.apk --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@app@webview@webview.apk@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/dex2oat ( 1555): Decided to run without swap.
I/dex2oat ( 1555): dex2oat took 319.311ms (threads: 1) arena alloc=35KB java alloc=1365KB native alloc=2MB free=5MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/CMFileManager/x86/CMFileManager.odex needs to be relocated for /system/app/CMFileManager/CMFileManager.apk
I/PackageManager( 1317): Running patchoat on: com.cyanogenmod.filemanager
E/installd( 1557): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/CMFileManager/x86/CMFileManager.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@CMFileManager@CMFileManager.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Mms/x86/Mms.odex needs to be relocated for /system/priv-app/Mms/Mms.apk
I/PackageManager( 1317): Running patchoat on: com.android.mms
E/installd( 1558): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/Mms/x86/Mms.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@Mms@Mms.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Browser/x86/Browser.odex needs to be relocated for /system/app/Browser/Browser.apk
I/PackageManager( 1317): Running patchoat on: com.android.browser
E/installd( 1559): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Browser/x86/Browser.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Browser@Browser.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/DeskClock/x86/DeskClock.odex needs to be relocated for /system/app/DeskClock/DeskClock.apk
I/PackageManager( 1317): Running patchoat on: com.android.deskclock
E/installd( 1560): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/DeskClock/x86/DeskClock.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@DeskClock@DeskClock.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Calculator/x86/Calculator.odex needs to be relocated for /system/app/Calculator/Calculator.apk
I/PackageManager( 1317): Running patchoat on: com.android.calculator2
E/installd( 1561): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Calculator/x86/Calculator.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Calculator@Calculator.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/QuickSearchBox/x86/QuickSearchBox.odex needs to be relocated for /system/app/QuickSearchBox/QuickSearchBox.apk
I/PackageManager( 1317): Running patchoat on: com.android.quicksearchbox
E/installd( 1562): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/QuickSearchBox/x86/QuickSearchBox.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@QuickSearchBox@QuickSearchBox.apk@classes.dex)
I/PackageManager( 1317): Running dexopt on: /system/app/YouTube/YouTube.apk pkg=com.google.android.youtube isa=x86 vmSafeMode=false
I/dex2oat ( 1563): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/app/YouTube/YouTube.apk --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@app@YouTube@YouTube.apk@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/dex2oat ( 1563): Decided to run without swap.
I/dex2oat ( 1563): dex2oat took 5.418s (threads: 1) arena alloc=2MB java alloc=15MB native alloc=32MB free=7MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/HTMLViewer/x86/HTMLViewer.odex needs to be relocated for /system/app/HTMLViewer/HTMLViewer.apk
I/PackageManager( 1317): Running patchoat on: com.android.htmlviewer
E/installd( 1565): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/HTMLViewer/x86/HTMLViewer.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@HTMLViewer@HTMLViewer.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/BasicDreams/x86/BasicDreams.odex needs to be relocated for /system/app/BasicDreams/BasicDreams.apk
I/PackageManager( 1317): Running patchoat on: com.android.dreams.basic
E/installd( 1566): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/BasicDreams/x86/BasicDreams.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@BasicDreams@BasicDreams.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/MusicFX/x86/MusicFX.odex needs to be relocated for /system/priv-app/MusicFX/MusicFX.apk
I/PackageManager( 1317): Running patchoat on: com.android.musicfx
E/installd( 1567): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/MusicFX/x86/MusicFX.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@MusicFX@MusicFX.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/LiveWallpapers/x86/LiveWallpapers.odex needs to be relocated for /system/app/LiveWallpapers/LiveWallpapers.apk
I/PackageManager( 1317): Running patchoat on: com.android.wallpaper
E/installd( 1568): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/LiveWallpapers/x86/LiveWallpapers.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@LiveWallpapers@LiveWallpapers.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PackageInstaller/x86/PackageInstaller.odex needs to be relocated for /system/app/PackageInstaller/PackageInstaller.apk
I/PackageManager( 1317): Running patchoat on: com.android.packageinstaller
E/installd( 1569): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/PackageInstaller/x86/PackageInstaller.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@PackageInstaller@PackageInstaller.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/CaptivePortalLogin/x86/CaptivePortalLogin.odex needs to be relocated for /system/app/CaptivePortalLogin/CaptivePortalLogin.apk
I/PackageManager( 1317): Running patchoat on: com.android.captiveportallogin
E/installd( 1570): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/CaptivePortalLogin/x86/CaptivePortalLogin.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@CaptivePortalLogin@CaptivePortalLogin.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/VpnDialogs/x86/VpnDialogs.odex needs to be relocated for /system/priv-app/VpnDialogs/VpnDialogs.apk
I/PackageManager( 1317): Running patchoat on: com.android.vpndialogs
E/installd( 1571): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/VpnDialogs/x86/VpnDialogs.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@VpnDialogs@VpnDialogs.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Camera2/x86/Camera2.odex needs to be relocated for /system/app/Camera2/Camera2.apk
I/PackageManager( 1317): Running patchoat on: com.android.camera2
E/installd( 1572): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Camera2/x86/Camera2.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Camera2@Camera2.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/DownloadProvider/x86/DownloadProvider.odex needs to be relocated for /system/priv-app/DownloadProvider/DownloadProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.providers.downloads
E/installd( 1573): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/DownloadProvider/x86/DownloadProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@DownloadProvider@DownloadProvider.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/Contacts/x86/Contacts.odex needs to be relocated for /system/priv-app/Contacts/Contacts.apk
I/PackageManager( 1317): Running patchoat on: com.android.contacts
E/installd( 1574): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/Contacts/x86/Contacts.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@Contacts@Contacts.apk@classes.dex)
I/PackageManager( 1317): Running dexopt on: /system/app/Music2/Music2.apk pkg=com.google.android.music isa=x86 vmSafeMode=false
I/dex2oat ( 1575): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/app/Music2/Music2.apk --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@app@Music2@Music2.apk@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/dex2oat ( 1575): Decided to run without swap.
I/dex2oat ( 1575): dex2oat took 4.633s (threads: 1) arena alloc=2MB java alloc=16MB native alloc=29MB free=6MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/PrintSpooler/x86/PrintSpooler.odex needs to be relocated for /system/app/PrintSpooler/PrintSpooler.apk
I/PackageManager( 1317): Running patchoat on: com.android.printspooler
E/installd( 1577): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/PrintSpooler/x86/PrintSpooler.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@PrintSpooler@PrintSpooler.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/RSSReader/x86/RSSReader.odex needs to be relocated for /system/app/RSSReader/RSSReader.apk
I/PackageManager( 1317): Running patchoat on: com.example.android.rssreader
E/installd( 1578): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/RSSReader/x86/RSSReader.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@RSSReader@RSSReader.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/GoogleFeedback/x86/GoogleFeedback.odex needs to be relocated for /system/priv-app/GoogleFeedback/GoogleFeedback.apk
I/PackageManager( 1317): Running patchoat on: com.google.android.feedback
E/installd( 1579): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/GoogleFeedback/x86/GoogleFeedback.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@GoogleFeedback@GoogleFeedback.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/HoloSpiralWallpaper/x86/HoloSpiralWallpaper.odex needs to be relocated for /system/app/HoloSpiralWallpaper/HoloSpiralWallpaper.apk
I/PackageManager( 1317): Running patchoat on: com.android.wallpaper.holospiral
E/installd( 1580): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/HoloSpiralWallpaper/x86/HoloSpiralWallpaper.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@HoloSpiralWallpaper@HoloSpiralWallpaper.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/priv-app/ExternalStorageProvider/x86/ExternalStorageProvider.odex needs to be relocated for /system/priv-app/ExternalStorageProvider/ExternalStorageProvider.apk
I/PackageManager( 1317): Running patchoat on: com.android.externalstorage
E/installd( 1581): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/priv-app/ExternalStorageProvider/x86/ExternalStorageProvider.odex) out-fd=6 (/data/dalvik-cache/x86/system@priv-app@ExternalStorageProvider@ExternalStorageProvider.apk@classes.dex)
I/PackageManager( 1317): Running dexopt on: /system/priv-app/GmsCore/GmsCore.apk pkg=com.google.android.gms isa=x86 vmSafeMode=false
I/dex2oat ( 1582): /system/bin/dex2oat --zip-fd=5 --zip-location=/system/priv-app/GmsCore/GmsCore.apk --oat-fd=6 --oat-location=/data/dalvik-cache/x86/system@priv-app@GmsCore@GmsCore.apk@classes.dex --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xms64m --runtime-arg -Xmx512m --swap-fd=7
I/dex2oat ( 1582): Accepted running with swap.
I/dex2oat ( 1582): Method exceeds compiler instruction limit: 20154 in void com.google.android.gms.icing.proxy.l.<init>()
I/dex2oat ( 1582): Method exceeds compiler instruction limit: 21296 in void g.a.a.a.f.<init>()
I/dex2oat ( 1582): dex2oat took 15.211s (threads: 1) arena alloc=9MB java alloc=39MB native alloc=23MB free=16MB swap=64MB
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/Galaxy4/x86/Galaxy4.odex needs to be relocated for /system/app/Galaxy4/Galaxy4.apk
I/PackageManager( 1317): Running patchoat on: com.android.galaxy4
E/installd( 1584): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/Galaxy4/x86/Galaxy4.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@Galaxy4@Galaxy4.apk@classes.dex)
I/art     ( 1317): DexFile_isDexOptNeeded file /system/app/VisualizationWallpapers/x86/VisualizationWallpapers.odex needs to be relocated for /system/app/VisualizationWallpapers/VisualizationWallpapers.apk
I/PackageManager( 1317): Running patchoat on: com.android.musicvis
E/installd( 1585): Running /system/bin/patchoat isa=x86 in-fd=5 (/system/app/VisualizationWallpapers/x86/VisualizationWallpapers.odex) out-fd=6 (/data/dalvik-cache/x86/system@app@VisualizationWallpapers@VisualizationWallpapers.apk@classes.dex)
I/SystemServer( 1317): LockSettingsService
I/SystemServiceManager( 1317): Starting com.android.server.devicepolicy.DevicePolicyManagerService$Lifecycle
I/SystemServer( 1317): Status Bar
I/SystemServer( 1317): Clipboard Service
I/SystemServer( 1317): NetworkManagement Service
I/SystemServer( 1317): Text Service Manager Service
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
I/SystemServer( 1317): Network Score Service
I/SystemServer( 1317): NetworkStats Service
I/SystemServer( 1317): NetworkPolicy Service
I/SystemServiceManager( 1317): Starting com.android.server.wifi.p2p.WifiP2pService
I/WifiP2pService( 1317): Registering wifip2p
I/SystemServiceManager( 1317): Starting com.android.server.wifi.WifiService
E/WifiConfigStore( 1317): associatedPartialScanPeriodMilli set to 20000
D/WifiController( 1317): isAirplaneModeOn = false, isWifiEnabled = false, isScanningAvailable = false
I/WifiService( 1317): Registering wifi
I/SystemServiceManager( 1317): Starting com.android.server.wifi.WifiScanningService
I/WifiScanningService( 1317): Creating wifiscanner
I/WifiScanningService( 1317): Starting wifiscanner
I/SystemServiceManager( 1317): Starting com.android.server.wifi.RttService
I/RttService( 1317): Creating rttmanager
I/RttService( 1317): Starting rttmanager
I/SystemServiceManager( 1317): Starting com.android.server.ethernet.EthernetService
I/EthernetServiceImpl( 1317): Creating EthernetConfigStore
E/IpConfigStore( 1317): Error parsing configuration: java.io.FileNotFoundException: /data/misc/ethernet/ipconfig.txt: open failed: ENOENT (No such file or directory)
W/EthernetConfigStore( 1317): No Ethernet configuration found. Using default.
I/EthernetServiceImpl( 1317): Read stored IP configuration: IP assignment: DHCP
I/EthernetServiceImpl( 1317): Proxy settings: NONE
I/EthernetService( 1317): Registering service ethernet
I/SystemServer( 1317): Connectivity Service
D/ConnectivityService( 1317): ConnectivityService starting up
D/ConnectivityService( 1317): wifiOnly=false
E/ConnectivityService( 1317): Ignoring protectedNetwork 14
E/ConnectivityService( 1317): Ignoring protectedNetwork 15
I/SystemServer( 1317): Network Service Discovery Service
D/NsdService( 1317): Network service discovery enabled true
I/SystemServer( 1317): UpdateLock Service
I/SystemServiceManager( 1317): Starting com.android.server.notification.NotificationManagerService
D/ZenLog  ( 1317): set_zen_mode: off,setting
I/SystemServiceManager( 1317): Starting com.android.server.storage.DeviceStorageMonitorService
I/SystemServer( 1317): Location Manager
I/SystemServer( 1317): Country Detector
I/SystemServer( 1317): Search Service
I/SystemServer( 1317): DropBox Service
I/SystemServer( 1317): Wallpaper Service
W/WallpaperManagerService( 1317): no current wallpaper -- first boot?
I/SystemServer( 1317): Audio Service
W/TelecomManager( 1317): Telecom Service not found.
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:audio_set_mic_mute() 
I/SystemServiceManager( 1317): Starting com.android.server.DockObserver
W/DockObserver( 1317): This kernel does not have dock station support
I/SystemServer( 1317): Wired Accessory Manager
W/WiredAccessoryManager( 1317): This kernel does not have usb audio support
W/WiredAccessoryManager( 1317): This kernel does not have HDMI audio support
I/SystemServiceManager( 1317): Starting com.android.server.usb.UsbService$Lifecycle
I/SystemServer( 1317): Serial Service
I/SystemServiceManager( 1317): Starting com.android.server.twilight.TwilightService
I/SystemServiceManager( 1317): Starting com.android.server.UiModeManagerService
I/SystemServiceManager( 1317): Starting com.android.server.job.JobSchedulerService
I/SystemServiceManager( 1317): Starting com.android.server.backup.BackupManagerService$Lifecycle
I/SystemServiceManager( 1317): Starting com.android.server.appwidget.AppWidgetService
I/SystemServiceManager( 1317): Starting com.android.server.voiceinteraction.VoiceInteractionManagerService
W/SoundTriggerHelper( 1317): listModules status=0, # of modules=0
I/SystemServer( 1317): DiskStats Service
I/SystemServer( 1317): SamplingProfiler Service
I/SystemServer( 1317): NetworkTimeUpdateService
I/SystemServer( 1317): CommonTimeManagementService
I/SystemServer( 1317): CertBlacklister
I/SystemServiceManager( 1317): Starting com.android.server.dreams.DreamManagerService
I/SystemServer( 1317): Assets Atlas Service
I/SystemServiceManager( 1317): Starting com.android.server.print.PrintManagerService
I/SystemServiceManager( 1317): Starting com.android.server.restrictions.RestrictionsManagerService
I/SystemServiceManager( 1317): Starting com.android.server.media.MediaSessionService
I/SystemServer( 1317): Media Router Service
I/SystemServiceManager( 1317): Starting com.android.server.trust.TrustManagerService
D/AssetAtlas( 1317): Computing best atlas configuration...
D/AssetAtlas( 1317): Running Thread-52
I/SystemServiceManager( 1317): Starting com.android.server.fingerprint.FingerprintService
V/Fingerprint-JNI( 1317): nativeInit()
V/Fingerprint-JNI( 1317): nativeOpenHal()
E/Fingerprint-JNI( 1317): Can't open fingerprint HW Module, error: -2
I/SystemServer( 1317): BackgroundDexOptService
I/SystemServiceManager( 1317): Starting com.android.server.pm.LauncherAppsService
I/SystemServiceManager( 1317): Starting com.android.server.media.projection.MediaProjectionManagerService
I/WindowManager( 1317): SAFE MODE not enabled
I/SystemServiceManager( 1317): Starting com.android.server.MmsServiceBroker
E/SQLiteLog( 1317): (1) no such table: locksettings
I/LockSettingsService( 1317): Migrated lock settings to new location
I/LockSettingsService( 1317): Migrated per-user lock settings to new location
E/LockSettingsStorage( 1317): Cannot read file java.io.FileNotFoundException: /data/system/password.key: open failed: ENOENT (No such file or directory)
E/LockSettingsStorage( 1317): Cannot read file java.io.FileNotFoundException: /data/system/gesture.key: open failed: ENOENT (No such file or directory)
I/SystemServiceManager( 1317): Starting phase 480
I/SystemServiceManager( 1317): Starting phase 500
I/WifiService( 1317): WifiService starting up with Wi-Fi disabled
D/WifiService( 1317): New client listening to asynchronous messages
I/WifiScanningService( 1317): Registering wifiscanner
D/WifiScanningService( 1317): New client, channel: null messenger: null
I/RttService( 1317): Registering rttmanager
D/WifiChangeStateMachine( 1317): Entering IdleState
D/WifiScanningService( 1317): DefaultState
D/AssetAtlas( 1317): Found best atlas configuration in 0.03s
D/AssetAtlas( 1317): Loaded configuration: SliceMinArea (768x768) flags=0x2 count=446
I/EthernetServiceImpl( 1317): Starting Ethernet service
W/AssetAtlasService( 1317): Could not find EGL configuration
D/AssetAtlas( 1317): Rendered atlas in 2.60ms (2.54+0.06ms)
D/Ethernet( 1317): Registering NetworkFactory
D/ConnectivityService( 1317): Got NetworkFactory Messenger for Ethernet
D/EthernetNetworkFactory( 1317): Started tracking interface eth0
D/CommandListener( 1101): Setting iface cfg
D/CommandListener( 1101): Trying to bring up eth0
D/EthernetNetworkFactory( 1317): updateInterface: eth0 link up
I/ActivityManager( 1317): Config changes=200 {1.0 ?mcc?mnc en_US ?layoutDir sw738dp w984dp h665dp 130dpi lrg land -touch qwerty/v/v -nav/h s.5}
D/Ethernet( 1317): got request NetworkRequest [ id=1, legacyType=-1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
I/EthernetNetworkFactory( 1317): dhcpThread(+eth0): mNetworkInfo=[type: Ethernet[], state: UNKNOWN/IDLE, reason: (unspecified), extra: 52:54:00:12:34:56, roaming: false, failover: false, isAvailable: true, isConnectedToProvisioningNetwork: false]
V/BackupManagerService( 1317): No ancestral data
D/BackupManagerService( 1317): Now staging backup of com.android.browser
D/BackupManagerService( 1317): Now staging backup of com.android.vending
D/BackupManagerService( 1317): Now staging backup of android
D/BackupManagerService( 1317): Now staging backup of com.google.android.gm
D/BackupManagerService( 1317): Now staging backup of com.android.calendar
D/BackupManagerService( 1317): Now staging backup of com.android.providers.settings
D/BackupManagerService( 1317): Now staging backup of com.android.sharedstoragebackup
D/BackupManagerService( 1317): Now staging backup of com.android.dialer
D/BackupManagerService( 1317): Now staging backup of com.android.providers.userdictionary
V/BackupManagerService( 1317): Starting with transport android/com.android.internal.backup.LocalTransport
V/BackupManagerService( 1317): Found transports: 3
I/BackupManagerService( 1317): Binding to transport host ComponentInfo{android/com.android.internal.backup.LocalTransportService}
I/BackupManagerService( 1317): Binding to transport host ComponentInfo{com.google.android.gms/com.google.android.gms.backup.BackupTransportService}
I/BackupManagerService( 1317): Binding to transport host ComponentInfo{com.google.android.backuptransport/com.google.android.backup.BackupTransportService}
E/dhcpcd  ( 1607): fopen `/system/etc/dhcpcd/dhcpcd.conf': No such file or directory
I/dhcpcd  ( 1607): version 5.5.6 starting
E/dhcpcd  ( 1607): fopen `/system/etc/dhcpcd/dhcpcd.conf': No such file or directory
E/dhcpcd  ( 1607): get_duid: Read-only file system
I/ActivityManager( 1317): Sending system update to ComponentInfo{com.android.providers.calendar/com.android.providers.calendar.CalendarUpgradeReceiver} for user 0
I/ActivityManager( 1317): Sending system update to ComponentInfo{com.android.providers.contacts/com.android.providers.contacts.ContactsUpgradeReceiver} for user 0
I/ActivityManager( 1317): Sending system update to ComponentInfo{com.google.android.gsf/com.google.android.gsf.loginservice.MigrateToAccountManagerBroadcastReceiver} for user 0
I/ActivityManager( 1317): Sending system update to ComponentInfo{com.android.managedprovisioning/com.android.managedprovisioning.PreBootListener} for user 0
I/ActivityManager( 1317): Sending system update to ComponentInfo{com.android.providers.media/com.android.providers.media.MediaUpgradeReceiver} for user 0
I/ActivityManager( 1317): Sending system update to ComponentInfo{com.android.settings/com.android.settings.ManagedProfileSetup} for user 0
I/ActivityThread( 1317): Switching default density from 160 to 130
V/ActivityManager( 1317): Display changed displayId=0
V/ActivityManager( 1317): Display changed displayId=0
D/WifiScanningService( 1317): SCAN_AVAILABLE : 1
D/RttService( 1317): SCAN_AVAILABLE : 1
D/WifiScanningService( 1317): DefaultState got{ when=0 what=160007 target=com.android.internal.util.StateMachine$SmHandler }
D/RttService( 1317): DefaultState got{ when=0 what=160513 target=com.android.internal.util.StateMachine$SmHandler }
I/Zygote  ( 1317): Process: zygote socket opened, supported ABIS: x86,armeabi-v7a,armeabi
I/dhcpcd  ( 1607): eth0: broadcasting for a lease
I/ActivityManager( 1317): Start proc 1617:com.android.providers.calendar/u0a1 for broadcast com.android.providers.calendar/.CalendarUpgradeReceiver
I/ActivityManager( 1317): Launching preboot mode app: ProcessRecord{18b96313 1617:com.android.providers.calendar/u0a1}
I/dhcpcd  ( 1607): eth0: offered 10.0.2.15 from 10.0.2.2
I/dhcpcd  ( 1607): eth0: acknowledged 10.0.2.15 from 10.0.2.2
I/ActivityThread( 1617): Switching default density from 160 to 130
W/ResourcesManager( 1617): Asset path '/system/framework/android.test.runner.jar' does not exist or contains no resources.
I/dhcpcd  ( 1607): eth0: leased 10.0.2.15 for 86400 seconds
V/BackupManagerService( 1317): Connected to transport ComponentInfo{android/com.android.internal.backup.LocalTransportService}
V/BackupManagerService( 1317): Registering transport android/com.android.internal.backup.LocalTransportService::android/com.android.internal.backup.LocalTransport = android.app.backup.BackupTransport$TransportImpl@36d12950
I/ActivityManager( 1317): Start proc 1635:android.process.acore/u0a2 for broadcast com.android.providers.contacts/.ContactsUpgradeReceiver
I/ActivityManager( 1317): Launching preboot mode app: ProcessRecord{15852749 1635:android.process.acore/u0a2}
I/ActivityThread( 1635): Switching default density from 160 to 130
I/ContactsUpgradeReceiver( 1635): Creating or opening contacts database
I/ContactsDatabaseHelper( 1635): Bootstrapping database version: 910
I/ContactsProviderV1( 1635): Bootstrapping database legacy support
I/ContactsDatabaseHelper( 1635): Bootstrapping database version: 910
I/ContactsProviderV1( 1635): Bootstrapping database legacy support
I/ContactsProvider( 1635): Locale has changed from null to en-US
I/ContactsDatabaseHelper( 1635): Switching to locale en-US (ICU v53.1.0.1)
I/ContactsDatabaseHelper( 1635): Locale change completed in 7ms
I/ContactsDatabaseHelper( 1635): Switching to locale en-US (ICU v53.1.0.1)
I/ContactsDatabaseHelper( 1635): Locale change completed in 10ms
I/ActivityManager( 1317): Start proc 1672:com.google.process.gapps/u0a7 for broadcast com.google.android.gsf/.loginservice.MigrateToAccountManagerBroadcastReceiver
I/ActivityManager( 1317): Launching preboot mode app: ProcessRecord{1eb8218b 1672:com.google.process.gapps/u0a7}
I/ActivityThread( 1672): Switching default density from 160 to 130
D/GoogleLoginService( 1672): no legacy android id exists to migrate
D/GoogleLoginService( 1672): skipping migration because /data/data/com.google.android.gsf/databases/accounts.db doesn't exist
D/GoogleLoginService( 1672): disabling the migration script since the migration is complete
I/ActivityManager( 1317): Start proc 1690:com.android.managedprovisioning/u0a11 for broadcast com.android.managedprovisioning/.PreBootListener
I/ActivityManager( 1317): Launching preboot mode app: ProcessRecord{2b20d268 1690:com.android.managedprovisioning/u0a11}
I/ActivityThread( 1690): Switching default density from 160 to 130
I/ActivityManager( 1317): Start proc 1705:android.process.media/u0a5 for broadcast com.android.providers.media/.MediaUpgradeReceiver
I/ActivityManager( 1317): Launching preboot mode app: ProcessRecord{1857681 1705:android.process.media/u0a5}
I/ActivityThread( 1705): Switching default density from 160 to 130
I/ActivityManager( 1317): Start proc 1721:com.android.settings/1000 for broadcast com.android.settings/.ManagedProfileSetup
I/ActivityManager( 1317): Launching preboot mode app: ProcessRecord{38b4f326 1721:com.android.settings/1000}
I/ActivityThread( 1721): Switching default density from 160 to 130
I/ActivityManager( 1317): Removing system update proc: ProcessRecord{18b96313 1617:com.android.providers.calendar/u0a1}
I/ActivityManager( 1317): Killing 1617:com.android.providers.calendar/u0a1 (adj 13): system update done
I/ActivityManager( 1317): Removing system update proc: ProcessRecord{15852749 1635:android.process.acore/u0a2}
I/ActivityManager( 1317): Killing 1635:android.process.acore/u0a2 (adj 13): system update done
I/ActivityManager( 1317): Removing system update proc: ProcessRecord{1eb8218b 1672:com.google.process.gapps/u0a7}
I/ActivityManager( 1317): Killing 1672:com.google.process.gapps/u0a7 (adj 11): system update done
I/ActivityManager( 1317): Removing system update proc: ProcessRecord{2b20d268 1690:com.android.managedprovisioning/u0a11}
I/ActivityManager( 1317): Killing 1690:com.android.managedprovisioning/u0a11 (adj 11): system update done
I/ActivityManager( 1317): Removing system update proc: ProcessRecord{1857681 1705:android.process.media/u0a5}
I/ActivityManager( 1317): Killing 1705:android.process.media/u0a5 (adj 9): system update done
I/ActivityManager( 1317): Removing system update proc: ProcessRecord{38b4f326 1721:com.android.settings/1000}
I/ActivityManager( 1317): Killing 1721:com.android.settings/1000 (adj 9): system update done
I/ActivityManager( 1317): System now ready
W/ActivityManager( 1317): Spurious death for ProcessRecord{18b96313 1617:com.android.providers.calendar/u0a1}, curProc for 1617: null
W/ActivityManager( 1317): Spurious death for ProcessRecord{15852749 1635:android.process.acore/u0a2}, curProc for 1635: null
W/ActivityManager( 1317): Spurious death for ProcessRecord{1eb8218b 1672:com.google.process.gapps/u0a7}, curProc for 1672: null
W/ActivityManager( 1317): Spurious death for ProcessRecord{2b20d268 1690:com.android.managedprovisioning/u0a11}, curProc for 1690: null
W/ActivityManager( 1317): Spurious death for ProcessRecord{1857681 1705:android.process.media/u0a5}, curProc for 1705: null
W/ActivityManager( 1317): Spurious death for ProcessRecord{38b4f326 1721:com.android.settings/1000}, curProc for 1721: null
I/SystemServer( 1317): Making services ready
I/SystemServiceManager( 1317): Starting phase 550
I/SystemServer( 1317): WebViewFactory preparation
I/Telecom ( 1317): TelecomGlobals: TelecomGlobals initializing
V/WebViewFactory( 1743): RelroFileCreator (64bit = false),  32-bit lib: /system/app/webview/lib/x86/libwebviewchromium.so, 64-bit lib: 
I/ActivityManager( 1317): Start proc 1743:WebViewLoader-x86/1037 [android.webkit.WebViewFactory$RelroFileCreator] for 
I/ActivityManager( 1317): Start proc 1757:com.android.systemui/u0a18 for service com.android.systemui/.SystemUIService
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
E/MountService( 1317): Boot-time mount failed (-1)
W/MountService( 1317): Duplicate state transition (mounted -> mounted) for /storage/emulated/0
D/NetworkManagementService( 1317): not enabling bandwidth control
I/art     ( 1108): Explicit concurrent mark sweep GC freed 703(30KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 37us total 36.524ms
I/art     ( 1743): System.exit called, status: 0
I/AndroidRuntime( 1743): VM exiting with result code 0, cleanup skipped.
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 52us total 5.919ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 35us total 8.594ms
I/ActivityManager( 1317): Start proc 1777:android.process.acore/u0a2 for content provider com.android.providers.contacts/.CallLogProvider
D/BluetoothManagerService( 1317): Trying to bind to profile: 1, while Bluetooth was disabled
D/BluetoothManagerService( 1317): Message: 20
D/BluetoothManagerService( 1317): Added callback: android.bluetooth.BluetoothAdapter$1@3ad8837b:true
D/BluetoothManagerService( 1317): Message: 30
I/Telecom ( 1317): TelecomGlobals: CallsManager initialized
W/ContextImpl( 1317): Calling a method in the system process without a qualified user: android.app.ContextImpl.startService:1692 android.content.ContextWrapper.startService:516 com.android.server.telecom.BluetoothPhoneService.start:440 com.android.server.telecom.TelecomGlobals.initialize:93 com.android.server.telecom.TelecomService.onCreate:164 
D/BluetoothManagerService( 1317): Trying to bind to profile: 1, while Bluetooth was disabled
D/BluetoothManagerService( 1317): Message: 30
I/ActivityThread( 1757): Switching default density from 160 to 130
V/SystemUIService( 1757): Starting SystemUI services.
V/FingerprintService( 1317): startListening(android.service.fingerprint.IFingerprintServiceReceiver$Stub$Proxy@3dff0279)
E/WVMExtractor( 1105): Failed to open libwvm.so: dlopen failed: library "libwvm.so" not found
D/NuPlayerDriver( 1105): start(0xb5d3a100)
I/GenericSource( 1105): start
D/ConnectivityService( 1317): registerNetworkAgent NetworkAgentInfo{ ni{[type: Ethernet[], state: CONNECTED/CONNECTED, reason: (unspecified), extra: 52:54:00:12:34:56, roaming: false, failover: false, isAvailable: true, isConnectedToProvisioningNetwork: false]}  network{null}  lp{{InterfaceName: eth0 LinkAddresses: [10.0.2.15/24,]  Routes: [10.0.2.0/24 -> 0.0.0.0 eth0,0.0.0.0/0 -> 10.0.2.2 eth0,] DnsAddresses: [10.0.2.3,] Domains:  MTU: 0 TcpBufferSizes: 524288,1048576,3145728,524288,1048576,2097152}}  nc{[ Transports: ETHERNET Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN LinkUpBandwidth>=100000Kbps LinkDnBandwidth>=100000Kbps]}  Score{30}  everValidated{false}  lastValidated{false}  created{false}  explicitlySelected{false} }
D/ConnectivityService( 1317): NetworkAgentInfo [Ethernet () - 100] EVENT_NETWORK_INFO_CHANGED, going from null to CONNECTED
W/NetworkStats( 1317): bandwidth controls disabled, unable to track stats
W/NetworkPolicy( 1317): bandwidth controls disabled, unable to enforce policy
D/ConnectivityService( 1317): Adding iface eth0 to network 100
W/OMXNodeInstance( 1105): [e:google.mpeg4.decoder] component does not support metadata mode; using fallback
W/OMXNodeInstance( 1105): [f:google.h263.decoder] component does not support metadata mode; using fallback
W/OMXNodeInstance( 1105): [10:google.h264.decoder] component does not support metadata mode; using fallback
D/SoftHEVC( 1105): Number of CPU cores: 1
D/SoftHEVC( 1105): Initializing decoder
D/SoftHEVC( 1105): Set number of cores to 1
D/SoftHEVC( 1105): Ittiam decoder version number: @(#)Id:HEVCDEC_production Ver:04.01 Released by ITTIAM Build: Oct  7 2015 @ 00:32:57
W/OMXNodeInstance( 1105): [11:google.hevc.decoder] component does not support metadata mode; using fallback
D/SoftHEVC( 1105): Freeing codec memory
D/SoftHEVC( 1105): Number of CPU cores: 1
D/SoftHEVC( 1105): Initializing decoder
D/SoftHEVC( 1105): Set number of cores to 1
D/SoftHEVC( 1105): Ittiam decoder version number: @(#)Id:HEVCDEC_production Ver:04.01 Released by ITTIAM Build: Oct  7 2015 @ 00:32:57
I/ActivityThread( 1777): Switching default density from 160 to 130
D/SoftHEVC( 1105): In SoftHEVC::~SoftHEVC
D/SoftHEVC( 1105): Freeing codec memory
W/OMXNodeInstance( 1105): [12:google.vp8.decoder] component does not support metadata mode; using fallback
W/OMXNodeInstance( 1105): [13:google.vp9.decoder] component does not support metadata mode; using fallback
I/SoftMPEG4Encoder( 1105): Construct SoftMPEG4Encoder
W/ACodec  ( 1105): do not know color format 0x7f000789 = 2130708361
I/SoftAVCEncoder( 1105): Construct SoftAVCEncoder
W/ACodec  ( 1105): do not know color format 0x7f000789 = 2130708361
I/SoftMPEG4Encoder( 1105): Construct SoftMPEG4Encoder
W/ACodec  ( 1105): do not know color format 0x7f000789 = 2130708361
W/ACodec  ( 1105): do not know color format 0x7f000789 = 2130708361
E/ConnectivityService( 1317): Unexpected mtu value: 0, eth0
D/ConnectivityService( 1317): Adding Route [10.0.2.0/24 -> 0.0.0.0 eth0] to network 100
D/NuPlayerDriver( 1105): reset(0xb5d3a100)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5d3a100)
D/NuPlayerDriver( 1105): start(0xb5c4ef40)
I/GenericSource( 1105): start
D/VolumeUI( 1757): Registering volume controller
D/NuPlayerDriver( 1105): reset(0xb5c4ef40)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5c4ef40)
I/StatusBarManagerService( 1317): registerStatusBar bar=com.android.internal.statusbar.IStatusBar$Stub$Proxy@13033aa3
D/NuPlayerDriver( 1105): start(0xb5c4eca0)
I/GenericSource( 1105): start
D/NuPlayerDriver( 1105): reset(0xb5c4eca0)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5c4eca0)
D/PermissionMonitor( 1317): Monitoring
D/PermissionMonitor( 1317): Users: 1, Apps: 65
D/ConnectivityService( 1317): Adding Route [0.0.0.0/0 -> 10.0.2.2 eth0] to network 100
D/ConnectivityService( 1317): Setting Dns servers for network 100 to [/10.0.2.3]
D/ConnectivityService( 1317): notifyType IP_CHANGED for NetworkAgentInfo [Ethernet () - 100]
D/ConnectivityService( 1317): notifyType PRECHECK for NetworkAgentInfo [Ethernet () - 100]
D/ConnectivityService( 1317): rematching NetworkAgentInfo [Ethernet () - 100]
D/ConnectivityService( 1317):    accepting network in place of null
D/ConnectivityService( 1317): Switching to new default network: NetworkAgentInfo{ ni{[type: Ethernet[], state: CONNECTED/CONNECTED, reason: (unspecified), extra: 52:54:00:12:34:56, roaming: false, failover: false, isAvailable: true, isConnectedToProvisioningNetwork: false]}  network{100}  lp{{InterfaceName: eth0 LinkAddresses: [10.0.2.15/24,]  Routes: [10.0.2.0/24 -> 0.0.0.0 eth0,0.0.0.0/0 -> 10.0.2.2 eth0,] DnsAddresses: [10.0.2.3,] Domains:  MTU: 0 TcpBufferSizes: 524288,1048576,3145728,524288,1048576,2097152}}  nc{[ Transports: ETHERNET Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN LinkUpBandwidth>=100000Kbps LinkDnBandwidth>=100000Kbps]}  Score{30}  everValidated{false}  lastValidated{false}  created{true}  explicitlySelected{false} }
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): DefaultState{ when=0 what=532481 target=com.android.internal.util.StateMachine$SmHandler }
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): Connected
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): EvaluatingState{ when=0 what=532486 arg1=1 target=com.android.internal.util.StateMachine$SmHandler }
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): Checking http://connectivitycheck.android.com/generate_204 on 52:54:00:12:34:56
D/ConnectivityService( 1317): Setting tx/rx TCP buffers to 524288,1048576,3145728,524288,1048576,2097152
D/ConnectivityService( 1317): notifyType AVAILABLE for NetworkAgentInfo [Ethernet () - 100]
D/CSLegacyTypeTracker( 1317): Sending connected broadcast for type 9 NetworkAgentInfo [Ethernet () - 100] isDefaultNetwork=true
D/ConnectivityService( 1317): sendStickyBroadcast: action=android.net.conn.CONNECTIVITY_CHANGE_IMMEDIATE
D/ConnectivityService( 1317): sendStickyBroadcast: action=android.net.conn.CONNECTIVITY_CHANGE
I/SystemServiceManager( 1317): Starting phase 600
D/ZenLog  ( 1317): downtime: Autotrigger skipped: not in downtime
D/BluetoothManagerService( 1317): Trying to bind to profile: 1, while Bluetooth was disabled
D/BluetoothManagerService( 1317): Message: 30
D/BluetoothManagerService( 1317): Message: 30
I/BackupManagerService( 1317): Backup enabled => false
I/BackupManagerService( 1317): Opting out of backup
E/InputMethodManagerService( 1317): Ignoring setImeWindowStatus due to an invalid token. uid:1000 token:null
W/InputMethodManagerService( 1317): Reset the default IME as "Resource" is ready here.
I/InputMethodManagerService( 1317): Selected default: com.android.inputmethod.latin/.LatinIME
I/sh      ( 1882): /system/etc/init.sh[390]: cat: /sys/class/dmi/id/board_name: No such file or directory
D/NuPlayerDriver( 1105): start(0xb5d3a100)
I/GenericSource( 1105): start
I/ActivityManager( 1317): Start proc 1898:com.android.inputmethod.latin/u0a43 for service com.android.inputmethod.latin/.LatinIME
V/InputMethodManagerService( 1317): Adding window token: android.os.Binder@4000930
W/InputMethodManagerService( 1317): Illegal subtype state: old subtype = null, new subtype = android.view.inputmethod.InputMethodSubtype@c9194f98
D/gps_serial( 1317): GPS dev open_gps
D/gps_serial( 1317): GPS dev get_hardware_interface
D/GpsLocationProvider( 1317): Reset GPS properties, previous size = 0
D/GpsLocationProvider( 1317): GpsParamsResource: SUPL_HOST=supl.google.com
D/GpsLocationProvider( 1317): GpsParamsResource: SUPL_PORT=7275
D/GpsLocationProvider( 1317): GpsParamsResource: NTP_SERVER=north-america.pool.ntp.org
D/GpsLocationProvider( 1317): GpsParamsResource: SUPL_VER=0x20000
D/GpsLocationProvider( 1317): GpsParamsResource: SUPL_MODE=1
D/GpsLocationProvider( 1317): GPS properties reloaded, size = 8
E/GpsLocationProvider( 1317): no AGPS interface in set_agps_server
E/GpsLocationProvider( 1317): no GPS configuration interface in configuraiton_update
D/GpsLocationProvider( 1317): final config = #Sun Apr 10 08:18:05 GMT+00:00 2016
D/GpsLocationProvider( 1317): SUPL_VER=0x20000
D/GpsLocationProvider( 1317): SUPL_HOST=supl.google.com
D/GpsLocationProvider( 1317): XTRA_SERVER_3=http\://xtra3.gpsonextra.net/xtra.bin
D/GpsLocationProvider( 1317): XTRA_SERVER_1=http\://xtra1.gpsonextra.net/xtra.bin
D/GpsLocationProvider( 1317): SUPL_PORT=7275
D/GpsLocationProvider( 1317): XTRA_SERVER_2=http\://xtra2.gpsonextra.net/xtra.bin
D/GpsLocationProvider( 1317): NTP_SERVER=north-america.pool.ntp.org
D/GpsLocationProvider( 1317): SUPL_MODE=1
W/ResourcesManager( 1317): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
E/FlpHardwareProvider( 1317): Error hw_get_module 'flp': -2
E/LocationManagerService( 1317): FLP HAL not supported
E/ActivityRecognitionHardware( 1317): Error hw_get_module: -2
E/LocationManagerService( 1317): Hardware Activity-Recognition not supported.
D/gps_serial( 1317): serial_gps_init
D/gps_serial( 1317): gps_state_init
D/gps_serial( 1317): no kernel-provided gps device name
W/GpsLocationProvider( 1317): Failed to enable location provider
D/NuPlayerDriver( 1105): reset(0xb5d3a100)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5d3a100)
I/CommonTimeManagementService( 1317): No common time service detected on this platform.  Common time services will be unavailable.
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000020
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
I/FusedLocation( 1317): engine started (com.android.location.fused)
I/MmsServiceBroker( 1317): Delay connecting to MmsService until an API is called
W/VoiceInteractionManagerService( 1317): no available voice interaction services found for user 0
W/VoiceInteractionManagerService( 1317): no available voice recognition services found for user 0
V/WiredAccessoryManager( 1317): notifyWiredAccessoryChanged: when=0 bits= mask=54
V/WiredAccessoryManager( 1317): newName=h2w newState=0 headsetState=0 prev headsetState=0
E/WiredAccessoryManager( 1317): No state change.
V/WiredAccessoryManager( 1317): init()
I/ActivityManager( 1317): Start proc 1910:com.android.phone/1001 for added application com.android.phone
I/ActivityManager( 1317): START u0 {act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000000 cmp=org.zeroxlab.util.tscal/.TSCalibrationStartup} from uid 0 on display 0
V/WindowManager( 1317): addAppToken: AppWindowToken{9024644 token=Token{2001cb57 ActivityRecord{16b4bcd6 u0 org.zeroxlab.util.tscal/.TSCalibrationStartup t1}}} to stack=0 task=1 at 0
D/NuPlayerDriver( 1105): start(0xb5c4ef40)
I/GenericSource( 1105): start
D/NuPlayerDriver( 1105): reset(0xb5c4ef40)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5c4ef40)
I/ActivityManager( 1317): Start proc 1932:org.zeroxlab.util.tscal/1000 for activity org.zeroxlab.util.tscal/.TSCalibrationStartup
D/NuPlayerDriver( 1105): start(0xb5c4eca0)
I/GenericSource( 1105): start
I/ActivityManager( 1317): Start proc 1952:com.google.android.music:main/u0a47 for broadcast com.google.android.music/.homewidgets.IFLWidgetProvider$IFLWidgetExtraActionsReceiver
D/GpsNetInitiatedHandler( 1317): location enabled :true
D/Tethering( 1317): MasterInitialState.processMessage what=3
I/ActivityThread( 1898): Switching default density from 160 to 130
W/ResourcesManager( 1317): Asset path '/system/framework/com.google.android.media.effects.jar' does not exist or contains no resources.
I/ActivityThread( 1910): Switching default density from 160 to 130
W/AppWidgetServiceImpl( 1317): Failed to read state: java.io.FileNotFoundException: /data/system/users/0/appwidgets.xml: open failed: ENOENT (No such file or directory)
V/AppWidgetServiceImpl( 1317): Upgrading widget database from 0 to 1
D/BluetoothManagerService( 1317): Message: 300
D/BluetoothManagerService( 1317): MESSAGE_USER_SWITCHED
D/PermissionCache( 1099): checking android.permission.HARDWARE_TEST for uid=1000 => granted (22 us)
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:audio_set_mic_mute() 
I/art     ( 1757): Background partial concurrent mark sweep GC freed 6907(317KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 3MB/5MB, paused 7.086ms total 24.595ms
D/NuPlayerDriver( 1105): reset(0xb5c4eca0)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5c4eca0)
I/LatinIME( 1898): Hardware accelerated drawing: false
I/ActivityManager( 1317): Start proc 1971:com.android.printspooler/u0a53 for service com.android.printspooler/.model.PrintSpoolerService
I/ActivityThread( 1932): Switching default density from 160 to 130
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
I/ActivityManager( 1317): Force stopping org.zeroxlab.util.tscal appid=1000 user=0: pkg changed
I/ActivityManager( 1317): Killing 1932:org.zeroxlab.util.tscal/1000 (adj 0): stop org.zeroxlab.util.tscal
D/NuPlayerDriver( 1105): start(0xb5c4ef40)
I/GenericSource( 1105): start
I/ActivityManager( 1317):   Force finishing activity 3 ActivityRecord{16b4bcd6 u0 org.zeroxlab.util.tscal/.TSCalibrationStartup t1}
I/ActivityManager( 1317): START u0 {act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000000 cmp=com.android.settings/.CryptKeeper} from uid 0 on display 0
V/WindowManager( 1317): addAppToken: AppWindowToken{14735e36 token=Token{3e7d63d1 ActivityRecord{2e99e2f8 u0 com.android.settings/.CryptKeeper t2}}} to stack=0 task=2 at 0
W/ActivityManager( 1317): Spurious death for ProcessRecord{280636a4 1932:org.zeroxlab.util.tscal/1000}, curProc for 1932: null
W/InputAttributes( 1898): No editor info for this field. Bug?
D/NuPlayerDriver( 1105): reset(0xb5c4ef40)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5c4ef40)
I/ActivityManager( 1317): Start proc 1992:com.android.settings/1000 for activity com.android.settings/.CryptKeeper
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:org.zeroxlab.util.tscal flg=0x4000010 (has extras) }
I/ActivityThread( 1952): Switching default density from 160 to 130
I/MultiDex( 1952): VM with version 2.1.0 has multidex support
I/MultiDex( 1952): install
I/MultiDex( 1952): VM has multidex support, MultiDex support library is disabled.
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = ContextualDictionary.en_US ; version = 1460276285 ; date = ?
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = contacts.en_US ; version = 1460276285 ; date = ?
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = userunigram.en_US ; version = 1460276285 ; date = ?
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = PersonalizationDictionary.en_US ; version = 1460276285 ; date = ?
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = PersonalizationDictionary.en_US ; version = 1460276285 ; date = ?
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = PersonalizationDictionary.en_US ; version = 1460276285 ; date = ?
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = UserHistoryDictionary.en_US ; version = 1460276285 ; date = ?
D/WifiService( 1317): New client listening to asynchronous messages
I/ActivityThread( 1971): Switching default density from 160 to 130
I/PrintSpoolerService( 1971): No existing print spooler state.
D/TelephonyManager( 1317): getDataEnabled: retVal=false
D/BluetoothManagerService( 1317): Message: 20
D/BluetoothManagerService( 1317): Added callback: android.bluetooth.IBluetoothManagerCallback$Stub$Proxy@19fbd300:true
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/BluetoothManagerService( 1317): Message: 30
D/BluetoothManagerService( 1317): Message: 30
E/BluetoothA2dpSink( 1757): Could not bind to Bluetooth A2DP Service with Intent { act=android.bluetooth.IBluetoothA2dpSink }
D/BluetoothManagerService( 1317): Message: 30
E/BluetoothAvrcpController( 1757): Could not bind to Bluetooth AVRCP Controller Service with Intent { act=android.bluetooth.IBluetoothAvrcpController }
D/BluetoothManagerService( 1317): Message: 30
D/BluetoothManagerService( 1317): Trying to bind to profile: 1, while Bluetooth was disabled
D/BluetoothManagerService( 1317): Message: 30
E/BluetoothHeadsetClient( 1757): Could not bind to Bluetooth Headset Client Service with Intent { act=android.bluetooth.IBluetoothHeadsetClient }
D/BluetoothManagerService( 1317): Message: 30
D/BluetoothMap( 1757): Create BluetoothMap proxy object
D/BluetoothManagerService( 1317): Message: 30
D/BluetoothManagerService( 1317): Message: 30
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/NuPlayerDriver( 1105): start(0xb5d3a100)
I/GenericSource( 1105): start
I/ActivityThread( 1992): Switching default density from 160 to 130
D/NuPlayerDriver( 1105): reset(0xb5d3a100)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5d3a100)
D/ConnectivityService( 1317): listenForNetwork for NetworkRequest [ id=2, legacyType=-1, [] ]
D/ConnectivityService( 1317): handleRegisterNetworkRequest checking NetworkAgentInfo [Ethernet () - 100]
D/ConnectivityService( 1317): apparently satisfied.  currentScore=30
D/ConnectivityManager.CallbackHandler( 1757): CM callback handler got msg 524290
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:de ; version = 44 ; date = 1393228134
I/CameraManagerGlobal( 1757): getCameraService: Reconnecting to camera service
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:fr ; version = 45 ; date = 1400639634
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:es ; version = 49 ; date = 1404131686
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:it ; version = 44 ; date = 1393228135
W/ActivityManager( 1317): getRunningAppProcesses: caller 10047 does not hold REAL_GET_TASKS; limiting output
I/MusicStore( 1952): Database version: 121
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:ru ; version = 50 ; date = 1406597821
D/AlarmManagerService( 1317): Setting time of day to sec=1460276285
I/ActivityManager( 1317): START u0 {act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000000 cmp=com.google.android.setupwizard/.SetupWizardActivity} from uid 0 on display 0
V/WindowManager( 1317): addAppToken: AppWindowToken{3c2f99db token=Token{36be62ea ActivityRecord{217b7ad5 u0 com.google.android.setupwizard/.SetupWizardActivity t3}}} to stack=0 task=3 at 0
I/ActivityManager( 1317): Start proc 2039:com.google.android.setupwizard/u0a16 for activity com.google.android.setupwizard/.SetupWizardActivity
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
D/NuPlayerDriver( 1105): start(0xb5c4eca0)
I/GenericSource( 1105): start
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/cache/
W/ContextImpl( 1952): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
I/MusicStore( 1952): Migrating cache files took 10 ms
D/NuPlayerDriver( 1105): reset(0xb5c4eca0)
D/NuPlayerDriver( 1105): notifyResetComplete(0xb5c4eca0)
I/ActivityManager( 1317): Start proc 2062:com.google.process.gapps/u0a7 for content provider com.google.android.gsf/.gservices.GservicesProvider
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/PhoneStatusBar( 1757): disable: < EXPAND* icons alerts system_info BACK* HOME* RECENT* clock SEARCH* >
I/ActivityThread( 2039): Switching default density from 160 to 130
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/BluetoothAdapter( 1757): 19455983: getState() :  mService = null. Returning STATE_OFF
D/PhoneStatusBar( 1757): heads up is enabled
D/StatusBar( 1757): user hasn't seen notification about hidden notifications
D/StatusBar( 1757): insecure lockscreen, skipping notification
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
W/BackupManagerService( 1317): dataChanged but no participant pkg='com.android.providers.settings' uid=10018
I/Choreographer( 1757): Skipped 45 frames!  The application may be doing too much work on its main thread.
D/ViewRootImpl( 1757): changeCanvasOpacity: opaque=true
D/TelephonyProvider( 1910): dbh.onCreate:+ db=SQLiteDatabase: /data/data/com.android.providers.telephony/databases/telephony.db
D/TelephonyProvider( 1910): dbh.createSimInfoTable:+
D/TelephonyProvider( 1910): dbh.createSimInfoTable:-
D/TelephonyProvider( 1910): dbh.createCarriersTable:+
D/TelephonyProvider( 1910): dbh.createCarriersTable:-
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
I/ActivityThread( 2062): Switching default density from 160 to 130
I/GservicesProvider( 2062): Gservices pushing to system: true; secure/global: true
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
I/LatinIME:LogUtils( 1898): Dictionary info: dictionary = main:en ; version = 47 ; date = 1402373178
D/TelephonyProvider( 1910): No APNs in OEM image = /oem/telephony/apns-conf.xml Load APNs from system image
D/TelephonyProvider( 1910): confFile = /system/etc/apns-conf.xml
D/WifiService( 1317): New client listening to asynchronous messages
I/ActivityManager( 1317): Start proc 2098:com.google.android.gms/u0a7 for broadcast com.google.android.gms/.checkin.CheckinService$TriggerReceiver
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
I/ContactLocale( 1777): AddressBook Labels [en-US]: [, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, Α, Β, Γ, Δ, Ε, Ζ, Η, Θ, Ι, Κ, Λ, Μ, Ν, Ξ, Ο, Π, Ρ, Σ, Τ, Υ, Φ, Χ, Ψ, Ω, , А, Б, В, Г, Д, Ђ, Е, Є, Ж, З, И, І, Ї, Й, Ј, К, Л, Љ, М, Н, Њ, О, П, Р, С, Т, Ћ, У, Ф, Х, Ц, Ч, Џ, Ш, Щ, Ю, Я, , א, ב, ג, ד, ה, ו, ז, ח, ט, י, כ, ל, מ, נ, ס, ע, פ, צ, ק, ר, ש, ת, , ا, ب, ت, ث, ج, ح, خ, د, ذ, ر, ز, س, ش, ص, ض, ط, ظ, ع, غ, ف, ق, ك, ل, م, ن, ه, و, ي, , ก, ข, ฃ, ค, ฅ, ฆ, ง, จ, ฉ, ช, ซ, ฌ, ญ, ฎ, ฏ, ฐ, ฑ, ฒ, ณ, ด, ต, ถ, ท, ธ, น, บ, ป, ผ, ฝ, พ, ฟ, ภ, ม, ย, ร, ฤ, ล, ฦ, ว, ศ, ษ, ส, ห, ฬ, อ, ฮ, , ㄱ, ㄴ, ㄷ, ㄹ, ㅁ, ㅂ, ㅅ, ㅇ, ㅈ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ, , あ, か, さ, た, な, は, ま, や, ら, わ, #, ]
I/SetupWizard.SetupWizardActivity( 2039): DEVICE_PROVISIONED=false USER_SETUP_COMPLETE=false
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
W/ResourcesManager( 2062): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 2062): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
I/art     ( 2062): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/art     ( 2062): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
I/ActivityManager( 1317): START u0 {act=com.android.wizard.LOAD cmp=com.google.android.setupwizard/.WizardManager (has extras)} from uid 10016 on display 0
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
V/WindowManager( 1317): addAppToken: AppWindowToken{31b2706a token=Token{2da94e55 ActivityRecord{c98950c u0 com.google.android.setupwizard/.WizardManager t3}}} to stack=0 task=3 at 1
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 1952): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
D/MusicLifecycle( 1952): com.google.android.music.MusicApplication generated event: Application created
I/ActivityManager( 1317): START u0 {act=com.android.setupwizard.EDU_PRE_SETUP flg=0x4000000 cmp=com.google.android.setupwizard/.EduInitializeWrapper (has extras)} from uid 10016 on display 0
V/WindowManager( 1317): addAppToken: AppWindowToken{177f2936 token=Token{387d7ad1 ActivityRecord{4bff5f8 u0 com.google.android.setupwizard/.EduInitializeWrapper t3}}} to stack=0 task=3 at 2
W/ResourcesManager( 1952): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
I/ActivityManager( 1317): START u0 {act=com.android.wizard.NEXT cmp=com.google.android.setupwizard/.WizardManager (has extras)} from uid 10016 on display 0
V/WindowManager( 1317): addAppToken: AppWindowToken{58df30d token=Token{35fa79a4 ActivityRecord{15773037 u0 com.google.android.setupwizard/.WizardManager t3}}} to stack=0 task=3 at 3
W/ResourcesManager( 1952): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
I/ActivityThread( 2098): Switching default density from 160 to 130
W/ResourcesManager( 2098): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 2098): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
I/art     ( 1317): Explicit concurrent mark sweep GC freed 36282(2MB) AllocSpace objects, 13(202KB) LOS objects, 33% free, 9MB/14MB, paused 6.478ms total 100.649ms
W/FileUtils( 1952): Failed to chmod(/data/data/com.google.android.gms/app_extracted_libs): android.system.ErrnoException: chmod failed: ENOENT (No such file or directory)
W/FileUtils( 1952): Failed to chmod(/data/data/com.google.android.gms/app_extracted_libs): android.system.ErrnoException: chmod failed: ENOENT (No such file or directory)
I/MultiDex( 2062): VM with version 2.1.0 has multidex support
I/MultiDex( 2062): install
I/MultiDex( 2062): VM has multidex support, MultiDex support library is disabled.
W/art     ( 1757): Suspending all threads took: 10.035ms
I/art     ( 1757): Background sticky concurrent mark sweep GC freed 25066(1196KB) AllocSpace objects, 0(0B) LOS objects, 19% free, 4MB/5MB, paused 10.221ms total 17.496ms
W/art     ( 2098): Suspending all threads took: 8.424ms
I/art     ( 2098): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/art     ( 2098): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/MultiDex( 2098): VM with version 2.1.0 has multidex support
I/MultiDex( 2098): install
I/MultiDex( 2098): VM has multidex support, MultiDex support library is disabled.
V/JNIHelp ( 2062): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
V/JNIHelp ( 1952): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
I/ProviderInstaller( 1952): Installed default security provider GmsCore_OpenSSL
D/AndroidMusic( 1952): GMSCore installation verified
I/ProviderInstaller( 2062): Installed default security provider GmsCore_OpenSSL
W/OpenGLRenderer( 1757): can't set property, no Caches instance
W/OpenGLRenderer( 1757): can't set property, no Caches instance
I/SetupWizard.WizardManager( 2039): onNext actionId=edu_pre_setup resultCode=-1
I/ActivityManager( 1317): START u0 {act=com.android.setupwizard.WELCOME flg=0x4000000 cmp=com.google.android.setupwizard/.Welcome (has extras)} from uid 10016 on display 0
V/WindowManager( 1317): addAppToken: AppWindowToken{3cf5ef2f token=Token{1706290e ActivityRecord{28b3b309 u0 com.google.android.setupwizard/.Welcome t3}}} to stack=0 task=3 at 4
I/SetupWizard.WelcomeWrapper( 2039): launching subactivity Intent { flg=0x2000000 cmp=com.google.android.setupwizard/.user.WelcomeActivity }
I/ConfigStore( 1952): Config Database version: 1
I/ActivityManager( 1317): START u0 {flg=0x2000000 cmp=com.google.android.setupwizard/.user.WelcomeActivity (has extras)} from uid 10016 on display 0
V/WindowManager( 1317): addAppToken: AppWindowToken{317c4f4b token=Token{267fc81a ActivityRecord{5b76c5 u0 com.google.android.setupwizard/.user.WelcomeActivity t3}}} to stack=0 task=3 at 5
V/JNIHelp ( 2098): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
I/MediaRouter( 1952): Found default route: MediaRouter.RouteInfo{ uniqueId=android/.support.v7.media.SystemMediaRouteProvider:DEFAULT_ROUTE, name=Tablet, description=null, iconUri=null, enabled=true, connecting=false, connectionState=0, canDisconnect=false, playbackType=0, playbackStream=3, volumeHandling=1, volume=11, volumeMax=15, presentationDisplayId=-1, extras=null, settingsIntent=null, providerPackageName=android }
W/FactoryReset( 2062): [FactoryResetProtectionManager] Factory reset protection is not supported!
D/MusicLifecycle( 1952): com.google.android.music.net.NetworkMonitor generated event: Service created
I/NetworkMonitor( 1952): type=Ethernet subType= reason=null isConnected=true
I/ActivityManager( 1317): Start proc 2126:android.process.media/u0a5 for broadcast com.android.providers.downloads/.DownloadReceiver
I/art     ( 1108): Explicit concurrent mark sweep GC freed 703(30KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 38us total 14.192ms
I/art     ( 2062): Background sticky concurrent mark sweep GC freed 2032(99KB) AllocSpace objects, 0(0B) LOS objects, 3% free, 4MB/5MB, paused 5.246ms total 11.082ms
I/ProviderInstaller( 2098): Installed default security provider GmsCore_OpenSSL
D/NativeLibraryUtils( 2062): Install completed successfully. count=0 extracted=0
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 35us total 14.715ms
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 34us total 7.003ms
I/ActivityManager( 1317): Start proc 2142:com.svox.pico/u0a52 for service com.svox.pico/.PicoService
I/TextToSpeech( 2039): Sucessfully bound to com.svox.pico
D/MusicLifecycle( 1952): com.google.android.music.preferences.MusicPreferenceService$MusicPreferenceServiceBinder generated event: Service created
D/Ringtone( 2039): Problem opening; delegating to remote player
D/Ringtone( 2039): Problem opening; delegating to remote player
I/ActivityThread( 2126): Switching default density from 160 to 130
I/MediaProvider( 2126): Upgrading media database from version 0 to 800, which will destroy all old data
D/MusicLifecycle( 1952): com.google.android.music.download.cache.StorageMigrationService generated event: Service created
D/MusicLifecycle( 1952): com.google.android.music.download.artwork.ArtDownloadService generated event: Service created
I/CheckinService( 2098): Disabling old GoogleServicesFramework version
D/MusicLifecycle( 1952): com.google.android.music.net.NetworkMonitor$2 generated event: Broadcast received with context com.google.android.music.net.NetworkMonitor@2de9648e and intent Intent { act=android.net.conn.CONNECTIVITY_CHANGE flg=0x4000010 (has extras) }
I/NetworkMonitor( 1952): type=Ethernet subType= reason=null isConnected=true
D/MusicLifecycle( 1952): com.google.android.music.download.ArtDownloadQueueService generated event: Service created
I/GHttpClientFactory( 1952): Using our fixed implementation of GMSCore's GoogleHttpClient
I/GoogleURLConnFactory( 1952): Using platform SSLCertificateSocketFactory
I/ActivityThread( 2142): Switching default density from 160 to 130
V/SynthProxy( 2142): About to load libttspico.so, applyFilter=true
D/MusicLifecycle( 1952): com.google.android.music.download.cache.ArtCacheService generated event: Service created
D/MusicLifecycle( 1952): com.google.android.music.download.cache.StorageMigrationService generated event: Service destroyed
W/art     ( 2098): Suspending all threads took: 10.197ms
D/NativeLibraryUtils( 2098): Install completed successfully. count=0 extracted=0
D/MediaProvider( 2126): Adjusting external storage paths to: /storage/emulated/0
E/JavaBinder( 2098): *** Uncaught remote exception!  (Exceptions are not yet supported across processes.)
E/JavaBinder( 2098): java.lang.RuntimeException: android.os.RemoteException
E/JavaBinder( 2098): 	at android.os.Parcel.writeException(Parcel.java:1446)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:452)
E/JavaBinder( 2098): Caused by: android.os.RemoteException
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.service.b.a(SourceFile:77)
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.a.e.onTransact(SourceFile:63)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:446)
E/SQLiteLog( 2126): (1) no such table: album_info
I/ActivityManager( 1317): Config changes=2004 {1.0 ?mcc?mnc en_US ldltr sw738dp w984dp h665dp 130dpi lrg land -touch qwerty/v/v -nav/h s.6}
D/ActivityManager( 1317): Storing locale en-US for decryption UI
V/WindowManager( 1317): Based on layer: Adding window Window{2b47f085 u0 com.google.android.setupwizard/com.google.android.setupwizard.user.WelcomeActivity} at 1 of 6
I/TextToSpeech( 2039): Connected to ComponentInfo{com.svox.pico/com.svox.pico.PicoService}
I/SetupWizard.WelcomeActivity( 2039): WelcomeActivity.mLocaleReceiver.onReceive() locale=en_US
I/SetupWizard.FrpHelper( 2039): FRP status: supported: false, challengeRequired: false
I/ActivityManager( 1317): Start proc 2180:com.android.vending/u0a14 for broadcast com.android.vending/com.google.android.finsky.receivers.ClearCacheReceiver
E/ChimeraCfgMgr( 2098): Failed to read current config: /data/data/com.google.android.gms/app_chimera/current_config.pb: open failed: ENOENT (No such file or directory)
E/ChimeraCfgMgr( 2098): Failed to read current config: /data/data/com.google.android.gms/app_chimera/current_config.pb: open failed: ENOENT (No such file or directory)
D/GmsModuleFndr( 2098): Beginning GMS chimera module scan
D/GmsModuleFndr( 2098): Module pkg com.google.android.play.games not installed, skipping
I/ActivityThread( 2180): Switching default density from 160 to 130
D/ChimeraCfgMgr( 2098): Beginning module configuration check
E/ChimeraCfgMgr( 2098): Failed to read current config: /data/data/com.google.android.gms/app_chimera/current_config.pb: open failed: ENOENT (No such file or directory)
D/ChimeraModuleApk( 2098): Loading chimera manifest from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(built-in,v0) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.games,v1) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.kids,v3) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.vision,v1) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.youtube,v1) from ContainerApk(com.google.android.gms)
D/ChimeraCfgRslvr( 2098): Beginning module config resolution
D/ChimeraCfgRslvr( 2098): module(built-in,v0) has no external dependencies, accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.youtube,v1) has no external dependencies, accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.games,v1) accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.kids,v3) accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.vision,v1) accepted
D/ChimeraCfgRslvr( 2098): Module config resolution complete
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.games from APK com.google.android.gms
I/SystemUpdateService( 2098): receiver: Intent { act=android.net.conn.CONNECTIVITY_CHANGE flg=0x4000010 cmp=com.google.android.gms/.update.SystemUpdateService$ActiveReceiver (has extras) }
I/CheckinService( 2098): Checking schedule, now: 1460276286746 next: 30000
I/CheckinService( 2098): active receiver: enabled
D/SystemUpdateService( 2098): onCreate
I/DownloadManager( 2126): Upgrading downloads database from version 0 to version 109, which will destroy all old data
I/CheckinService( 2098): Preparing to send checkin request
I/CheckinService( 2098): Overwrite current checkin reason type from: 8 to: 5
I/ActivityManager( 1317): Displayed com.google.android.setupwizard/.user.WelcomeActivity: +476ms (total +1s115ms)
I/PeopleDatabaseHelper( 2098): cleanUpNonGplusAccounts done.
I/PeopleSearchIndexManage( 2098): ICU version changed from unknown to 53.1.0.1
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
D/SystemUpdateService( 2098): onStartCommand: intent: Intent { cmp=com.google.android.gms/.update.SystemUpdateService (has extras) }
D/Finsky  ( 2180): [1] FinskyApp.onCreate: Initializing network with DFE https://android.clients.google.com/fdfe/
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
I/PeopleSearchIndexManage( 2098): Rebuilding index...
V/KeyguardServiceDelegate( 1317): *** Keyguard started
W/KeyguardServiceDelegate( 1317): onScreenTurnedOn(): no keyguard service!
D/KbdSensor( 1317): poll_activate: dev=0xb3c51a80 handle=0 enabled=1
D/KbdSensor( 1317): poll_setDelay: dev=0xb3c51a80 delay-ns=66667000
I/EventLogService( 2098): Accumulating logs since 0
D/GCM     ( 2062): COMPAT: Multi user ser=0 current=0
I/PeopleASM( 2098): Rebuilding autocomplete index...
I/PeopleSearchIndexManage( 2098): Rebuilding index done.
I/Icing   ( 2098): Storage manager: low false usage 0 Bytes avail 0.97GB capacity 1.26GB
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
D/Finsky  ( 2180): [1] DailyHygiene.goMakeHygieneIfDirty: Dirty, need more hygiene.
I/iu.SyncManager( 2098): SYNC; picasa accounts
D/NetworkLogImpl( 2098): Loaded NetworkSpeedPredictor
I/iu.Environment( 2098): update connectivity state; isNetworkMetered? false, isRoaming? false, isBackgroundDataAllowed? true*
W/InstanceID/Rpc( 2098): Found 10007
W/Settings( 2180): Setting download_manager_max_bytes_over_mobile has moved from android.provider.Settings.Secure to android.provider.Settings.Global.
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.kids from APK com.google.android.gms
W/Settings( 2180): Setting download_manager_recommended_max_bytes_over_mobile has moved from android.provider.Settings.Secure to android.provider.Settings.Global.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2180): [1] FinskyApp.getDfeApi: No account configured on this device.
D/Finsky  ( 2180): [1] ClearCacheReceiver.onReceive: Received android.intent.action.LOCALE_CHANGED. Clearing cache and exiting.
D/Volley  ( 2180): [127] DiskBasedCache.clear: Cache cleared.
D/Volley  ( 2180): [135] DiskBasedCache.clear: Cache cleared.
D/GCM     ( 2098): COMPAT: Multi user ser=0 current=0
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.kids from APK com.google.android.gms
I/ActivityManager( 1317): Start proc 2233:com.android.mms/u0a12 for broadcast com.android.mms/.transaction.MmsSystemEventReceiver
I/ActivityManager( 1317): Start proc 2248:com.android.calendar/u0a27 for broadcast com.android.calendar/.alerts.AlertReceiver
I/SystemUpdateService( 2098): cancelUpdate (empty URL)
I/SystemUpdateService( 2098): active receiver: disabled
I/art     ( 2180): System.exit called, status: 0
I/AndroidRuntime( 2180): VM exiting with result code 0, cleanup skipped.
I/ActivityThread( 2233): Switching default density from 160 to 130
D/CountryDetector( 1317): The first listener is added
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
I/UploadsDatabaseHelper( 2098): Creating database tables at version 33
I/ActivityThread( 2248): Switching default density from 160 to 130
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.c2dm.intent.REGISTER pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService (has extras) } com.google.android.c2dm.intent.REGISTER
V/Mms     ( 2233): mnc/mcc: 
V/Mms     ( 2233): tag: bool value: enabledMMS - true
V/Mms     ( 2233): tag: int value: maxMessageSize - 307200
V/Mms     ( 2233): tag: int value: maxImageHeight - 480
V/Mms     ( 2233): tag: int value: maxImageWidth - 640
V/Mms     ( 2233): tag: int value: defaultSMSMessagesPerThread - 10000
V/Mms     ( 2233): tag: int value: defaultMMSMessagesPerThread - 1000
V/Mms     ( 2233): tag: int value: minMessageCountPerThread - 10
V/Mms     ( 2233): tag: int value: maxMessageCountPerThread - 5000
V/Mms     ( 2233): tag: string value: uaProfUrl - http://www.google.com/oha/rdf/ua-profile-kila.xml
V/Mms     ( 2233): tag: int value: recipientLimit - -1
V/Mms     ( 2233): tag: bool value: enableMultipartSMS - true
V/Mms     ( 2233): tag: int value: smsToMmsTextThreshold - -1
V/Mms     ( 2233): tag: bool value: enableSlideDuration - true
V/Mms     ( 2233): tag: int value: maxMessageTextSize - -1
D/ExtensionsFactory( 2248): No custom extensions.
D/AlertReceiver( 2248): onReceive: a=android.intent.action.LOCALE_CHANGED Intent { act=android.intent.action.LOCALE_CHANGED flg=0x10000010 cmp=com.android.calendar/.alerts.AlertReceiver }
I/art     ( 1317): Explicit concurrent mark sweep GC freed 19867(1318KB) AllocSpace objects, 14(224KB) LOS objects, 33% free, 8MB/13MB, paused 795us total 25.876ms
D/ConnectivityManager( 2233): getMobileDataEnabled()- remote exception retVal=false
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
I/ActivityManager( 1317): Start proc 2300:com.google.android.gms.persistent/u0a7 for broadcast com.google.android.gms/com.google.android.location.internal.NlpNetworkProviderSettingsUpdateReceiver
D/AlertUtils( 2248): Flushing old alerts from shared prefs table
D/AlertService( 2248): 0 Action = android.intent.action.LOCALE_CHANGED
I/GlobalDismissManager( 2248): no sender configured
D/AlertService( 2248): Beginning updateAlertNotification
I/ActivityManager( 1317): Process com.android.vending (pid 2180) has died
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.kids from APK com.google.android.gms
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.games from APK com.google.android.gms
D/Mms     ( 2233): TransactionService: is not the default sms app
E/GCM     ( 2098): Failed registration AUTHENTICATION_FAILED alarm=300000
I/iu.UploadsManager( 2098): num queued entries: 0
I/iu.UploadsManager( 2098): num updated entries: 0
I/iu.SyncManager( 2098): NEXT; no task
I/ActivityManager( 1317): Start proc 2317:com.android.deskclock/u0a32 for broadcast com.android.deskclock/.AlarmInitReceiver
D/SystemUpdateService( 2098): onDestroy
I/ActivityManager( 1317): Start proc 2337:com.android.providers.calendar/u0a1 for content provider com.android.providers.calendar/.CalendarProvider2
D/PhoneStatusBar( 1757): disable: < EXPAND icons ALERTS* system_info BACK HOME RECENT CLOCK* SEARCH >
D/PhoneStatusBar( 1757): heads up is disabled
D/PhoneStatusBar( 1757): dismissing any existing heads up notification on disable event
I/ActivityThread( 2317): Switching default density from 160 to 130
I/ActivityThread( 2300): Switching default density from 160 to 130
I/Choreographer( 1757): Skipped 76 frames!  The application may be doing too much work on its main thread.
W/ResourcesManager( 2300): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 2300): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
I/Icing   ( 2098): Version not set, assuming clear data.
I/Icing   ( 2098): Clearing storage
D/ContactDirectoryManager( 1777): Found com.google.contacts.gal.provider
D/ContactDirectoryManager( 1777): Found com.android.exchange.directory.provider
V/AlarmClock( 2317): AlarmInitReceiver android.intent.action.LOCALE_CHANGED
I/art     ( 2300): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/art     ( 2300): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/MultiDex( 2300): VM with version 2.1.0 has multidex support
I/MultiDex( 2300): install
I/MultiDex( 2300): VM has multidex support, MultiDex support library is disabled.
I/ActivityManager( 1317): Start proc 2352:com.android.exchange/u0a36 for content provider com.android.exchange/.provider.ExchangeDirectoryProvider
I/AlarmClock( 2317): Alarms Table created
I/AlarmClock( 2317): Instance table created
I/AlarmClock( 2317): Cities table created
I/AlarmClock( 2317): Inserting default alarms
E/Icing   ( 2098): Loading extension /data/data/com.google.android.gms/files/libAppDataSearchExt_x86.so failed
I/ActivityThread( 2337): Switching default density from 160 to 130
W/ResourcesManager( 2337): Asset path '/system/framework/android.test.runner.jar' does not exist or contains no resources.
I/CalendarDatabaseHelper( 2337): Bootstrapping database
V/AlarmClock( 2317): AlarmInitReceiver finished
I/ActivityManager( 1317): Start proc 2371:com.android.email/u0a35 for broadcast com.android.email/.service.EmailBroadcastReceiver
V/JNIHelp ( 2300): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
I/ActivityThread( 2352): Switching default density from 160 to 130
I/CalendarProvider2( 2337): Created com.android.providers.calendar.CalendarAlarmManager@329fec6e(com.android.providers.calendar.CalendarProvider2@13355f0f)
I/ContactDirectoryManager( 1777): deleted 0 stale rows which don't have any relevant directory
I/ContactDirectoryManager( 1777): Discovered 0 contact directories in 186ms
I/ProviderInstaller( 2300): Installed default security provider GmsCore_OpenSSL
I/ValidateNoPeople( 1317): mEvictionCount: 0
I/ActivityThread( 2371): Switching default density from 160 to 130
I/ContactsProvider( 1777): Upgrading aggregation algorithm
V/BackupManagerService( 1317): Connected to transport ComponentInfo{com.google.android.gms/com.google.android.gms.backup.BackupTransportService}
V/BackupManagerService( 1317): Registering transport com.google.android.gms/.backup.BackupTransportService::com.google.android.gms/.backup.BackupTransportService = com.android.internal.backup.IBackupTransport$Stub$Proxy@3a466c43
I/Backup  ( 2062): [BackupTransportMigratorService] Starting migration...
I/CheckinRequestBuilder( 2098): Checkin reason type: 5 attempt count: 1
W/Backup  ( 2062): [LegacyBackupAccountManager] No google accounts found!
D/ActivityThread( 2371): Loading provider com.android.email.provider;com.android.email.notifier: com.android.email.provider.EmailProvider
I/ContactAggregator( 1777): Marked all visible contacts for aggregation: 0 raw contacts, 0 ms
I/ContactsProvider( 1777): Aggregation algorithm upgraded for 0 raw contacts in 35ms
I/GCoreNlp( 2300): shouldConfirmNlp, NLP off. Ensuring opt-in disabled
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
D/NativeLibraryUtils( 2300): Install completed successfully. count=0 extracted=0
D/ActivityThread( 2371): Loading provider com.android.email.provider;com.android.email.notifier: com.android.email.provider.EmailProvider
D/AlertService( 2248): No fired or scheduled alerts
D/AlertService( 2248): Scheduling next alarm with AlarmScheduler. sEventReminderReceived: null
W/GmsBackupAccountManager( 2300): Backup account not found in gmscore.
W/GmsBackupAccountManager( 2300): Backup account not found in gmscore.
I/Backup  ( 2062): [BackupTransportMigratorService] Switch enabled status of com.google.android.backuptransport/com.google.android.backup.BackupTransportService to false
I/Backup  ( 2062): [BackupTransportMigratorService] Successfully migrated to use GMS BackupTransportService!
I/GCoreNlp( 2300): shouldConfirmNlp, NLP off. Ensuring opt-in disabled
I/GCoreUlr( 2300): Starting service, intent=Intent { act=com.google.android.location.reporting.ACTION_UPDATE_WORLD cmp=com.google.android.gms/com.google.android.location.reporting.service.DispatchingService (has extras) }, extras=Bundle[{receiverAction=android.location.PROVIDERS_CHANGED}]
I/ActivityManager( 1317): Start proc 2417:com.android.vending/u0a14 for broadcast com.android.vending/com.google.android.finsky.widget.consumption.NowPlayingWidgetProvider
I/ActivityThread( 2417): Switching default density from 160 to 130
D/WifiService( 1317): New client listening to asynchronous messages
E/ActivityThread( 2098): Failed to find provider info for com.google.android.wearable.settings
E/Icing   ( 2098): Loading extension /data/data/com.google.android.gms/files/libAppDataSearchExt_x86.so failed
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=org.zeroxlab.util.tscal
I/ActivityManager( 1317): Start proc 2434:com.google.android.gms.wearable/u0a7 for service com.google.android.gms/.wearable.service.WearableControlService
I/PeopleContactsSync( 2098): CP2 sync disabled
E/SQLiteLog( 2062): (1) no such table: log_source_qos_tier
I/ActivityThread( 2434): Switching default density from 160 to 130
W/ResourcesManager( 2434): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 2434): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
I/art     ( 1108): Explicit concurrent mark sweep GC freed 707(30KB) AllocSpace objects, 0(0B) LOS objects, 40% free, 1918KB/3MB, paused 37us total 15.562ms
I/GCoreUlr( 2300): DispatchingService.onCreate()
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.android.email } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.android.email } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.android.email } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.android.email } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.android.email } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.android.email } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.android.email } U=0: not found
I/Exchange( 2352): EasService.onCreate
I/art     ( 1108): Explicit concurrent mark sweep GC freed 7(240B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 34us total 22.197ms
I/art     ( 2434): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/art     ( 2434): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 35us total 14.559ms
I/MultiDex( 2434): VM with version 2.1.0 has multidex support
I/MultiDex( 2434): install
I/MultiDex( 2434): VM has multidex support, MultiDex support library is disabled.
I/Icing   ( 2098): updateResources: need to parse f{com.google.android.gms}
I/ActivityManager( 1317): Start proc 2462:com.google.android.gm/u0a39 for broadcast com.google.android.gm/.MailIntentReceiver
W/ActivityManager( 1317): Unable to start service Intent { cmp=com.android.email/.service.AttachmentService } U=0: not found
V/KeyguardServiceDelegate( 1317): *** Keyguard connected (yay!)
V/KeyguardServiceDelegate( 1317): **** SHOWN CALLED ****
I/SurfaceFlinger( 1099): Boot is finished (41776 ms)
E/installd( 1106): Unable to unlink boot marker at /data/dalvik-cache/x86/.booting, error=No such file or directory
E/ActivityManager( 1317): Unable to mark boot complete for abi: x86
E/installd( 1106): Unable to unlink boot marker at /data/dalvik-cache/arm/.booting, error=No such file or directory
E/ActivityManager( 1317): Unable to mark boot complete for abi: armeabi-v7a
I/SystemServiceManager( 1317): Starting phase 1000
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
I/Exchange( 2352): RestartPingTask
I/NotifUtils( 2371): resendNotifications cancelExisting: true, account: null, folder: null
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
I/art     ( 2062): Explicit concurrent mark sweep GC freed 30535(1833KB) AllocSpace objects, 1(16KB) LOS objects, 39% free, 5MB/8MB, paused 79us total 46.604ms
I/ActivityManager( 1317): Start proc 2479:com.google.process.location/u0a7 for on-hold
I/sh      ( 2485): /system/etc/init.sh[390]: cat: /sys/class/dmi/id/board_name: No such file or directory
I/Email   ( 2371): Observing account changes for notifications
I/ContactsFTS( 1777): Rebuild contact search index in 240ms, 0 contacts
D/TelephonyProvider( 1910): dbh.onCreate:- db=SQLiteDatabase: /data/data/com.android.providers.telephony/databases/telephony.db
D/TelephonyProvider( 1910): dbh.onOpen: ok, queried table=siminfo
D/TelephonyProvider( 1910): dbh.onOpen: ok, queried table=carriers
W/art     ( 1910): Long monitor contention event with owner method=boolean android.os.BinderProxy.transactNative(int, android.os.Parcel, android.os.Parcel, int) from Binder.java:4294967294 waiters=0 for 1.665s
W/art     ( 1317): Long monitor contention event with owner method=void com.android.server.am.ActivityManagerService.finishBooting() from ActivityManagerService.java:6199 waiters=2 for 278ms
W/art     ( 1317): Long monitor contention event with owner method=void com.android.server.am.ActivityManagerService.finishBooting() from ActivityManagerService.java:6199 waiters=3 for 277ms
W/art     ( 1317): Long monitor contention event with owner method=void com.android.server.am.ActivityManagerService.finishBooting() from ActivityManagerService.java:6199 waiters=6 for 259ms
W/art     ( 1317): Long monitor contention event with owner method=void com.android.server.am.ActivityManagerService.finishBooting() from ActivityManagerService.java:6199 waiters=10 for 256ms
W/art     ( 1317): Long monitor contention event with owner method=void com.android.server.am.ActivityManagerService.finishBooting() from ActivityManagerService.java:6199 waiters=11 for 253ms
W/art     ( 1317): Long monitor contention event with owner method=void com.android.server.am.ActivityManagerService.finishBooting() from ActivityManagerService.java:6199 waiters=12 for 246ms
I/Scheduler( 2062): Use legacy PeriodicScheduler
W/art     ( 1317): Long monitor contention event with owner method=void com.android.server.am.ActivityManagerService.finishBooting() from ActivityManagerService.java:6199 waiters=15 for 219ms
W/ActivityManager( 1317): Unable to start service Intent { cmp=com.android.email/.service.AttachmentService } U=0: not found
I/ActivityThread( 2462): Switching default density from 160 to 130
I/ActivityThread( 2479): Switching default density from 160 to 130
E/GpsLocationProvider( 1317): No APN found to select.
V/JNIHelp ( 2434): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
D/AlarmScheduler( 2248): No events found starting within 1 week.
W/InstanceID/Rpc( 2062): Found 10007
D/Finsky  ( 2417): [1] FinskyApp.onCreate: Initializing network with DFE https://android.clients.google.com/fdfe/
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
V/BackupManagerService( 1317): Connected to transport ComponentInfo{com.google.android.backuptransport/com.google.android.backup.BackupTransportService}
V/BackupManagerService( 1317): Registering transport com.google.android.backuptransport/com.google.android.backup.BackupTransportService::com.google.android.backup/.BackupTransportService = com.android.internal.backup.IBackupTransport$Stub$Proxy@7d552d6
I/Icing   ( 2098): Internal init done: storage state 0
I/ProviderInstaller( 2434): Installed default security provider GmsCore_OpenSSL
D/GeofencerStateMachine( 2300): Creating GeofencerStateMachine
D/WifiService( 1317): New client listening to asynchronous messages
D/ActivityThread( 2462): Loading provider com.google.android.gmail.provider;com.android.mail.notifier;com.google.android.gm.email.provider;com.google.android.gm.email.notifier: com.android.email.provider.EmailProvider
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
D/Finsky  ( 2417): [1] DailyHygiene.goMakeHygieneIfDirty: Dirty, need more hygiene.
I/Icing   ( 2098): Post-init done
I/Icing   ( 2098): Indexing 56A5D645C1B41503D17CD9754288E02FDBE992B6 from com.google.android.gms
I/art     ( 2300): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.util.bl>
I/art     ( 2300): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.util.bl>
W/art     ( 2434): Suspending all threads took: 6.316ms
W/Settings( 2417): Setting download_manager_max_bytes_over_mobile has moved from android.provider.Settings.Secure to android.provider.Settings.Global.
W/Settings( 2417): Setting download_manager_recommended_max_bytes_over_mobile has moved from android.provider.Settings.Secure to android.provider.Settings.Global.
I/art     ( 1317): Explicit concurrent mark sweep GC freed 13341(720KB) AllocSpace objects, 7(112KB) LOS objects, 33% free, 9MB/13MB, paused 142us total 115.331ms
W/art     ( 1317): Long monitor contention event with owner method=void java.lang.Runtime.gc() from Runtime.java:4294967294 waiters=3 for 109ms
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/ActivityManager( 1317): Unable to start service Intent { cmp=com.android.email/.service.AttachmentService } U=0: not found
I/Exchange( 2352): RestartPingsTask did not start any pings.
I/Exchange( 2352): PSS stopIfIdle
I/Exchange( 2352): PSS has no active accounts; stopping service.
I/Exchange( 2352): onDestroy
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
W/Finsky  ( 2417): [1] FinskyApp.getDfeApi: No account configured on this device.
I/ActivityManager( 1317): Start proc 2554:com.android.gallery3d/u0a38 for broadcast com.android.gallery3d/.app.PackagesMonitor
W/GeofencerStateMachine( 2300): Received SM_HARDWARE_GEOFENCE_CHANGED_CMD in NotInitializedState
D/WearableService( 2434): callingUid 10007, callindPid: 2434
W/GAV2    ( 2462): Thread[main,5,main]: Need to call initialize() and be in fallback mode to start dispatch.
I/ActivityThread( 2554): Switching default density from 160 to 130
W/ResourcesManager( 2554): Asset path '/system/framework/com.google.android.media.effects.jar' does not exist or contains no resources.
D/NativeLibraryUtils( 2434): Install completed successfully. count=0 extracted=0
D/GpsLocationProvider( 1317): NTP server returned: 1460276285925 (Sun Apr 10 08:18:05 GMT+00:00 2016) reference: 42531 certainty: 130 system time offset: -2092
V/GeofencerHelper( 2300): Initializing geofence's system cache.
E/GeofenceStateCache( 2300): Unable to load state, all registered geofences are lost.
I/GeofencerStateMachine( 2300): Network location disabled.
I/ActivityManager( 1317): Start proc 2583:com.android.launcher3/u0a44 for broadcast com.android.launcher3/.PackageChangedReceiver
V/KeyguardUpdateMonitor( 1757): action android.intent.action.SIM_STATE_CHANGED state: NOT_READY slotId: 0 subid: -2
D/KeyguardUpdateMonitor( 1757): handleSimStateChange(subId=-2, slotId=0, state=UNKNOWN)
W/KeyguardUpdateMonitor( 1757): invalid subId in handleSimStateChange()
D/GpsLocationProvider( 1317): received SIM realted action: 
E/DcSwitchStateMachine-0( 1910): DctController is not ready
I/GCoreUlr( 2300): WorldUpdater received intent Intent { act=com.google.android.location.reporting.ACTION_UPDATE_WORLD cmp=com.google.android.gms/com.google.android.location.reporting.service.DispatchingService (has extras) } with receiverAction android.location.PROVIDERS_CHANGED
D/BluetoothManagerService( 1317): Message: 20
D/BluetoothManagerService( 1317): Added callback: android.bluetooth.IBluetoothManagerCallback$Stub$Proxy@3c36fc3c:true
I/art     ( 2300): Background partial concurrent mark sweep GC freed 2095(110KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 6MB/10MB, paused 9.265ms total 88.550ms
I/SystemBroadcastReceiver( 1898): System locale changed
E/ConnectivityService( 1317): Failed to find Messenger in unregisterNetworkFactory
D/ConnectivityService( 1317): Got NetworkFactory Messenger for Telephony
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
W/BackupManagerService( 1317): dataChanged but no participant pkg='com.android.providers.settings' uid=1001
I/PackageManager( 1317): Replacing preferred activity com.android.mms/.ui.ComposeMessageActivity for user 0:
I/PackageManager( 1317):   Action: "android.intent.action.SENDTO"
I/PackageManager( 1317):   Category: "android.intent.category.DEFAULT"
I/PackageManager( 1317):   Scheme: "sms"
I/PackageManager( 1317): Replacing preferred activity com.android.mms/.ui.ComposeMessageActivity for user 0:
I/PackageManager( 1317):   Action: "android.intent.action.SENDTO"
I/PackageManager( 1317):   Category: "android.intent.category.DEFAULT"
I/PackageManager( 1317):   Scheme: "smsto"
I/PackageManager( 1317): Replacing preferred activity com.android.mms/.ui.ComposeMessageActivity for user 0:
I/PackageManager( 1317):   Action: "android.intent.action.SENDTO"
I/PackageManager( 1317):   Category: "android.intent.category.DEFAULT"
I/PackageManager( 1317):   Scheme: "mms"
I/PackageManager( 1317): Replacing preferred activity com.android.mms/.ui.ComposeMessageActivity for user 0:
I/PackageManager( 1317):   Action: "android.intent.action.SENDTO"
I/PackageManager( 1317):   Category: "android.intent.category.DEFAULT"
I/PackageManager( 1317):   Scheme: "mmsto"
I/ActivityManager( 1317): Start proc 2613:com.google.android.youtube/u0a59 for broadcast com.google.android.youtube/com.google.android.apps.youtube.app.system.LocaleUpdatedReceiver
D/BluetoothManagerService( 1317): Message: 20
D/BluetoothManagerService( 1317): Added callback: android.bluetooth.IBluetoothManagerCallback$Stub$Proxy@2598c235:true
D/BluetoothManagerService( 1317): Message: 30
D/BluetoothManagerService( 1317): Trying to bind to profile: 1, while Bluetooth was disabled
I/ActivityThread( 2583): Switching default density from 160 to 130
I/Telephony( 1910): TtyManager: updateUiTtyMode -1 -> 0
D/GpsLocationProvider( 1317): received SIM realted action: 
V/KeyguardUpdateMonitor( 1757): onSubscriptionInfoChanged()
D/GpsLocationProvider( 1317): SIM MCC/MNC is still not available
V/KeyguardUpdateMonitor( 1757): onSubscriptionInfoChanged: list is null
D/GpsLocationProvider( 1317): SIM MCC/MNC is still not available
I/Icing   ( 2098): Indexing done 56A5D645C1B41503D17CD9754288E02FDBE992B6
I/Icing   ( 2098): Indexing 1F335F402E2A59080DB906CEC4C02D57FB41F0EF from com.google.android.gms
E/GmsWearableLS( 2300): GoogleApiClient connection failed: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
D/TelephonyDebugService( 1910): TelephonyDebugService()
I/ActivityThread( 2613): Switching default density from 160 to 130
V/Launcher( 2583): LauncherAppState inited
W/ActivityManager( 1317): getRunningAppProcesses: caller 10059 does not hold REAL_GET_TASKS; limiting output
D/Launcher.Model( 2583): Old launcher provider: content://com.android.launcher2.settings/favorites?notify=true
D/Launcher.Model( 2583): Old launcher provider does not exist.
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
I/SystemUpdateService( 2098): receiver: Intent { act=android.os.UpdateLock.UPDATE_LOCK_CHANGED flg=0x4000010 cmp=com.google.android.gms/.update.SystemUpdateService$ActiveReceiver (has extras) }
D/WifiService( 1317): New client listening to asynchronous messages
I/Telephony( 1910): PstnIncomingCallNotifier: Registering: Handler (com.android.internal.telephony.gsm.GSMPhone) {3a6832cf}
W/ResourcesManager( 2613): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 2613): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
I/art     ( 1317): Explicit concurrent mark sweep GC freed 9665(469KB) AllocSpace objects, 1(16KB) LOS objects, 33% free, 9MB/13MB, paused 208us total 48.634ms
V/AlarmClock( 2317): AlarmInitReceiver android.intent.action.TIME_SET
V/AlarmClock( 2317): AlarmInitReceiver finished
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService } com.google.android.gms.INITIALIZE
V/JNIHelp ( 2613): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
I/SubscribedFeeds( 2098): Setting ComponentInfo{com.google.android.gms/com.google.android.gms.subscribedfeeds.SyncService} to enum: 1
D/AuthorizationBluetoothService( 2062): Received GmsCore event: Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.auth.be.proximity.authorization.bt.AuthorizationBluetoothService$AutoStarter }.
E/AuthorizationBluetoothService( 2062): Proximity feature is not enabled.
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GmsCoreStatsServiceLauncher( 2098): Received broadcast intent Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.common.stats.GmsCoreStatsServiceLauncher }
E/GmsWearableLS( 2300): GoogleApiClient connection failed: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
E/MDM     ( 2300): [166] b.run: Couldn't connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
I/EventLogService( 2098): Aggregate from 1460276287196 (log), 0 (data)
D/Finsky  ( 2417): [1] GmsCoreHelper.cleanupNlp: result=false type=4
D/Finsky  ( 2417): [1] RestoreTracker.stopServiceIfDone: Restore complete with 0 success and 0 failed.
I/art     ( 2062): Explicit concurrent mark sweep GC freed 6618(352KB) AllocSpace objects, 1(16KB) LOS objects, 39% free, 5MB/8MB, paused 82us total 5.926ms
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService } com.google.android.gms.INITIALIZE
D/AuthorizationBluetoothService( 2062): Received GmsCore event: Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.auth.be.proximity.authorization.bt.AuthorizationBluetoothService$AutoStarter }.
E/AuthorizationBluetoothService( 2062): Proximity feature is not enabled.
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GmsCoreStatsServiceLauncher( 2098): Received broadcast intent Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.common.stats.GmsCoreStatsServiceLauncher }
I/ProviderInstaller( 2613): Installed default security provider GmsCore_OpenSSL
D/AuthorizationBluetoothService( 2062): Received GmsCore event: Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.auth.be.proximity.authorization.bt.AuthorizationBluetoothService$AutoStarter }.
E/AuthorizationBluetoothService( 2062): Proximity feature is not enabled.
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService } com.google.android.gms.INITIALIZE
V/GmsCoreStatsServiceLauncher( 2098): Received broadcast intent Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.common.stats.GmsCoreStatsServiceLauncher }
I/Gmail   ( 2462): getAccountsCursor
I/NotifUtils( 2462): resendNotifications cancelExisting: true, account: null, folder: null
W/art     ( 2462): Long monitor contention event with owner method=java.lang.String libcore.icu.ICU.getBestDateTimePattern(java.lang.String, java.util.Locale) from ICU.java:279 waiters=2 for 163ms
E/Gmail   ( 2462): Error finding the version of the Email provider.....
E/Gmail   ( 2462): android.content.pm.PackageManager$NameNotFoundException: com.google.android.email
E/Gmail   ( 2462): 	at android.app.ApplicationPackageManager.getPackageInfo(ApplicationPackageManager.java:114)
E/Gmail   ( 2462): 	at com.google.android.gm.EmailMigrationService.a(SourceFile:1280)
E/Gmail   ( 2462): 	at com.google.android.gm.EmailMigrationService.onHandleIntent(SourceFile:219)
E/Gmail   ( 2462): 	at android.app.IntentService$ServiceHandler.handleMessage(IntentService.java:65)
E/Gmail   ( 2462): 	at android.os.Handler.dispatchMessage(Handler.java:102)
E/Gmail   ( 2462): 	at android.os.Looper.loop(Looper.java:135)
E/Gmail   ( 2462): 	at android.os.HandlerThread.run(HandlerThread.java:61)
W/EmailMigration( 2462): We do not support migrating this version of the Email provider.
I/NotifUtils( 2462): resendNotifications cancelExisting: true, account: null, folder: null
I/CalendarProvider2( 2337): Sending notification intent: Intent { act=android.intent.action.PROVIDER_CHANGED dat=content://com.android.calendar }
W/ContentResolver( 2337): Failed to get type for: content://com.android.calendar (Unknown URL content://com.android.calendar)
E/YouTube MDX( 2613): Bogus value in shared preferences for key MdxServerSelection value , returning default value.
I/Scheduler( 2098): Use legacy PeriodicScheduler
D/GmsModuleFndr( 2098): Beginning GMS chimera module scan
D/GmsModuleFndr( 2098): Module pkg com.google.android.play.games not installed, skipping
D/ChimeraCfgMgr( 2098): Beginning module configuration check
D/ChimeraCfgMgr( 2098): Module APKs unchanged, check complete
I/PeopleSync( 2098): First sync
I/PeopleSync( 2098): requestAllFullSyncForDbUpgrade
I/LocationInitializer( 2098): Initializing location.
V/Mms     ( 2233): onStart: #1 mResultCode: -1 = Activity.RESULT_OK
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.google.android.gm } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.google.android.gm } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.google.android.gm } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.google.android.gm } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.google.android.gm } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.google.android.gm } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.android.mail.action.BACKUP_DATA_CHANGED pkg=com.google.android.gm } U=0: not found
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
W/Auth    ( 2062): [Change,LoginAccountsChangedIntentService] LoginAccountsChangedIntentService received unknown action: com.google.android.gms.auth.change.REFRESH
W/BaseAppContext( 2098): Using Auth Proxy for data requests.
D/Ads     ( 2417): Skipping gmscore version check
D/MmsSmsDatabaseHelper( 1910): [MmsSmsDb] tableName: threads hasAutoIncrement: CREATE TABLE threads (_id INTEGER PRIMARY KEY AUTOINCREMENT,date INTEGER DEFAULT 0,message_count INTEGER DEFAULT 0,recipient_ids TEXT,snippet TEXT,snippet_cs INTEGER DEFAULT 0,read INTEGER DEFAULT 1,archived INTEGER DEFAULT 0,type INTEGER DEFAULT 0,error INTEGER DEFAULT 0,has_attachment INTEGER DEFAULT 0) result: true
D/MmsSmsDatabaseHelper( 1910): [MmsSmsDb] tableName: canonical_addresses hasAutoIncrement: CREATE TABLE canonical_addresses (_id INTEGER PRIMARY KEY AUTOINCREMENT,address TEXT) result: true
D/MmsSmsDatabaseHelper( 1910): [MmsSmsDb] tableName: part hasAutoIncrement: CREATE TABLE part (_id INTEGER PRIMARY KEY AUTOINCREMENT,mid INTEGER,seq INTEGER DEFAULT 0,ct TEXT,name TEXT,chset INTEGER,cd TEXT,fn TEXT,cid TEXT,cl TEXT,ctt_s INTEGER,ctt_t TEXT,_data TEXT,text TEXT) result: true
D/MmsSmsDatabaseHelper( 1910): [MmsSmsDb] tableName: pdu hasAutoIncrement: CREATE TABLE pdu (_id INTEGER PRIMARY KEY AUTOINCREMENT,thread_id INTEGER,date INTEGER,date_sent INTEGER DEFAULT 0,msg_box INTEGER,read INTEGER DEFAULT 0,m_id TEXT,sub TEXT,sub_cs INTEGER,ct_t TEXT,ct_l TEXT,exp INTEGER,m_cls TEXT,m_type INTEGER,v INTEGER,m_size INTEGER,pri INTEGER,rr INTEGER,rpt_a INTEGER,resp_st INTEGER,st INTEGER,tr_id TEXT,retr_st INTEGER,retr_txt TEXT,retr_txt_cs INTEGER,read_status INTEGER,ct_cls INTEGER,resp_txt TEXT,d_tm INTEGER,d_rpt INTEGER,locked INTEGER DEFAULT 0,sub_id INTEGER DEFAULT -1, seen INTEGER DEFAULT 0,creator TEXT,text_only INTEGER DEFAULT 0) result: true
D/MmsSmsDatabaseHelper( 1910): [getWritableDatabase] hasAutoIncrementThreads: true hasAutoIncrementAddresses: true hasAutoIncrementPart: true hasAutoIncrementPdu: true
I/GCoreUlr( 2300): WorldUpdater:android.location.PROVIDERS_CHANGED: Ensuring that reporting is stopped because of reasons: (no Google accounts)
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
D/GLMSImpl( 2300): onGmsCoreInit
D/BluetoothManagerService( 1317): Retrieving Bluetooth Adapter name and address...
D/BluetoothManagerService( 1317): getNameAndAddress(): mBluetooth = null mBinding = false
D/BluetoothManagerService( 1317): Message: 200
D/BluetoothManagerService( 1317): MESSAGE_GET_NAME_AND_ADDRESS
D/BluetoothManagerService( 1317): Binding to service to get name and address
I/ActivityManager( 1317): Start proc 2694:com.android.bluetooth/1002 for service com.android.bluetooth/.btservice.AdapterService
E/MDM     ( 2300): [168] b.run: Couldn't connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
I/RecoverySystem( 1317): No recovery log file
I/BootReceiver( 1317): Copying audit failures to DropBox
I/BootReceiver( 1317): Checking for fsck errors
D/WifiService( 1317): New client listening to asynchronous messages
I/ActivityManager( 1317): Start proc 2716:com.android.dialer/u0a4 for broadcast com.android.dialer/.calllog.CallLogReceiver
E/MDM     ( 2300): [168] b.run: Couldn't connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.youtube/cache
I/ActivityThread( 2694): Switching default density from 160 to 130
W/ResourcesManager( 2694): Asset path '/system/framework/javax.obex.jar' does not exist or contains no resources.
I/ActivityManager( 1317): Start proc 2733:com.android.keychain/1000 for service com.android.keychain/.KeyChainService
I/GCoreUlr( 2300): Unbound from all location providers
I/ActivityThread( 2716): Switching default density from 160 to 130
D/ExtensionsFactory( 2716): No custom extensions.
D/WIFI    ( 1317): Registering NetworkFactory
D/WIFI_UT ( 1317): Registering NetworkFactory
D/ConnectivityService( 1317): Got NetworkFactory Messenger for WIFI
D/ConnectivityService( 1317): Got NetworkFactory Messenger for WIFI_UT
D/WIFI    ( 1317): got request NetworkRequest [ id=1, legacyType=-1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 30
D/WIFI_UT ( 1317): got request NetworkRequest [ id=1, legacyType=-1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 30
D/AdapterServiceConfig( 2694): Adding HeadsetService
D/AdapterServiceConfig( 2694): Adding A2dpService
D/AdapterServiceConfig( 2694): Adding HidService
D/AdapterServiceConfig( 2694): Adding HealthService
D/AdapterServiceConfig( 2694): Adding PanService
D/AdapterServiceConfig( 2694): Adding GattService
D/AdapterServiceConfig( 2694): Adding BluetoothMapService
D/BlueZ   ( 2694): external/bluetooth/bluez/android/hal-bluetooth.c:open_bluetooth() 
D/BlueZ   ( 2694): external/bluetooth/bluez/android/hal-bluetooth.c:get_bluetooth_interface() 
D/BluetoothManagerService( 1317): Message: 20
D/BluetoothManagerService( 1317): Added callback: android.bluetooth.IBluetoothManagerCallback$Stub$Proxy@4e7cebf:true
D/BluetoothAdapterState( 2694): make
D/BlueZ   ( 2694): external/bluetooth/bluez/android/hal-bluetooth.c:init() 
I/BluetoothAdapterState( 2694): Entering OffState
I/sh      ( 2748): /system/etc/init.sh[390]: cat: /sys/class/dmi/id/board_name: No such file or directory
I/GCoreUlr( 2300): DispatchingService.onDestroy()
I/GCoreUlr( 2300): Stopping handler for UlrDispSvcFast
I/GCoreUlr( 2300): Unbound from all location providers
D/DownloadManager( 2126): [1] Starting
I/ActivityThread( 2733): Switching default density from 160 to 130
I/bluetoothd( 2747): Bluetooth daemon 5.35
I/bluetoothd( 2747): Starting SDP server
I/bluetoothd( 2747): Bluetooth management interface 1.8 initialized
I/bluetoothd( 2747): Kernel connection control will be used
W/ActivityManager( 1317): Unable to start service Intent { act=com.google.android.gm.email.EXCHANGE_INTENT pkg=com.google.android.gm.exchange } U=0: not found
W/Settings( 2300): Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
I/Gmail   ( 2462): getAccountsCursor
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
W/ActivityThread( 2126): ClassLoader.loadClass: The class loader returned by Thread.getContextClassLoader() may fail for processes that host multiple applications. You should explicitly specify a context class loader. For example: Thread.setContextClassLoader(getClass().getClassLoader());
I/bluetoothd( 2769): running () 
W/Settings( 2300): Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
I/ActivityManager( 1317): Start proc 2775:com.google.android.gms.unstable/u0a7 for service com.google.android.gms/.droidguard.DroidGuardService
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.youtube/cache/
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.youtube/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.youtube/files/
W/ContextImpl( 2613): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.youtube/files
I/ActivityThread( 2775): Switching default density from 160 to 130
W/ResourcesManager( 2775): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 2775): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
W/InstanceID/Rpc( 2613): Found 10007
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.youtube/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.youtube/cache/
W/ContextImpl( 2613): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.youtube/cache
I/art     ( 2775): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/art     ( 2775): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/MultiDex( 2775): VM with version 2.1.0 has multidex support
I/MultiDex( 2775): install
I/MultiDex( 2775): VM has multidex support, MultiDex support library is disabled.
I/art     ( 1317): Explicit concurrent mark sweep GC freed 24922(1480KB) AllocSpace objects, 7(112KB) LOS objects, 33% free, 9MB/14MB, paused 142us total 12.535ms
V/JNIHelp ( 2775): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
I/Gmail   ( 2462): getAccountsCursor
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
W/art     ( 2462): Long monitor contention event with owner method=void android.database.sqlite.SQLiteConnection.nativeExecute(long, long) from SQLiteConnection.java:4294967294 waiters=0 for 820ms
W/art     ( 2062): Verification of void com.google.android.location.copresence.d.n.<init>(android.content.Context, android.os.Handler, com.google.android.gms.common.util.y) took 128.256ms
I/GLSUser ( 2098): [ChannelManager] Attempting to channel bind connection HttpClient.
W/art     ( 2098): Long monitor contention event with owner method=boolean android.content.res.AssetManager.isUpToDate() from AssetManager.java:4294967294 waiters=0 for 399ms
I/ProviderInstaller( 2775): Installed default security provider GmsCore_OpenSSL
W/ActivityManager( 1317): Unable to start service Intent { cmp=com.google.android.gm/com.android.email.service.AttachmentService } U=0: not found
E/JavaBinder( 2098): *** Uncaught remote exception!  (Exceptions are not yet supported across processes.)
E/JavaBinder( 2098): java.lang.RuntimeException: android.os.RemoteException
E/JavaBinder( 2098): 	at android.os.Parcel.writeException(Parcel.java:1446)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:452)
E/JavaBinder( 2098): Caused by: android.os.RemoteException
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.service.b.a(SourceFile:77)
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.a.e.onTransact(SourceFile:63)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:446)
E/JavaBinder( 2098): *** Uncaught remote exception!  (Exceptions are not yet supported across processes.)
E/JavaBinder( 2098): java.lang.RuntimeException: android.os.RemoteException
E/JavaBinder( 2098): 	at android.os.Parcel.writeException(Parcel.java:1446)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:452)
E/JavaBinder( 2098): Caused by: android.os.RemoteException
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.service.b.a(SourceFile:77)
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.a.e.onTransact(SourceFile:63)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:446)
I/GLSUser ( 2098): [ChannelManager] Checking whether channelId is enabled. isEnabledGmsCore? false, isEnabledSdk? true, isAtLeastKitKat? true
D/KbdSensor( 1317): poll_setDelay: dev=0xb3c51a80 delay-ns=20000000
E/JavaBinder( 2098): *** Uncaught remote exception!  (Exceptions are not yet supported across processes.)
E/JavaBinder( 2098): java.lang.RuntimeException: android.os.RemoteException
E/JavaBinder( 2098): 	at android.os.Parcel.writeException(Parcel.java:1446)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:452)
E/JavaBinder( 2098): Caused by: android.os.RemoteException
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.service.b.a(SourceFile:77)
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.a.e.onTransact(SourceFile:63)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:446)
W/Finsky  ( 2417): [1] FinskyApp.getCurrentAccount: No account configured on this device.
D/BluetoothManagerService( 1317): Message: 20
D/BluetoothManagerService( 1317): Added callback: android.bluetooth.IBluetoothManagerCallback$Stub$Proxy@e747738:true
W/ActivityManager( 1317): Unable to start service Intent { act=com.google.android.gm.email.EXCHANGE_INTENT pkg=com.google.android.gm.exchange } U=0: not found
D/FileApkUtils( 2098): Spent 44ms computing apk sha1.
V/GMPM-SVC( 2098): Update service enabled state to: 2
D/Finsky  ( 2417): [1] DailyHygiene.onStartCommand: DailyHygiene holdoff continue
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.c2dm.intent.REGISTER pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService (has extras) } com.google.android.c2dm.intent.REGISTER
I/Auth    ( 2062): [Change,AccountsChange] First snapshot
I/Gmail   ( 2462): Observing account changes for notifications
E/MDM     ( 2098): [161] SitrepService.a: No Google accounts; deferring server state update.
D/FileApkUtils( 2098): Spent 31ms copying apk.
D/FileApkUtils( 2098): Copied dynamite bytes to /data/data/com.google.android.gms/app_chimera/chimera-module-root/scratch-module-dir/MapsModule.apk
D/DexOptUtils( 2098): Module /data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/MapsModule.apk appears to be unoptimized.
D/DexOptUtils( 2098): Lollipop platform, using <isa> directory.
I/PerfProfileCollectorService( 2098): Scheduling Perf Profile Collection every 86400 seconds
D/DexOptUtils( 2098): Creating odex directory: /data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/x86
D/DexOptUtils( 2098): Instantiating DexClassLoader to force creation of odex.
D/DexOptUtils( 2098): Primary ABI of odexing process is x86
W/ActivityManager( 1317): Unable to start service Intent { act=INITIALIZE_SUBSCRIPTIONS cmp=com.google.android.gms/.nearby.sharing.NearbySharingIntentService } U=0: not found
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
W/YouTube ( 2613): (unknown) Could not register with GCM: 
W/YouTube ( 2613): java.io.IOException: AUTHENTICATION_FAILED
W/YouTube ( 2613): 	at eom.a(Unknown Source)
W/YouTube ( 2613): 	at kek.run(SourceFile:2038)
W/YouTube ( 2613): 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:422)
W/YouTube ( 2613): 	at java.util.concurrent.FutureTask.run(FutureTask.java:237)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:152)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:265)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
W/YouTube ( 2613): 	at gzp.run(SourceFile:40)
W/YouTube ( 2613): 	at java.lang.Thread.run(Thread.java:818)
I/dex2oat ( 2851): /system/bin/dex2oat --runtime-arg -classpath --runtime-arg  --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xrelocate --boot-image=/system/framework/boot.art --dex-file=/data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/MapsModule.apk --oat-fd=84 --oat-location=/data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/x86/MapsModule.dex --runtime-arg -Xms64m --runtime-arg -Xmx512m
I/art     ( 2062): Explicit concurrent mark sweep GC freed 7918(449KB) AllocSpace objects, 2(32KB) LOS objects, 39% free, 5MB/9MB, paused 520us total 16.457ms
I/dex2oat ( 2770): /system/bin/dex2oat --runtime-arg -classpath --runtime-arg  --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xrelocate --boot-image=/system/framework/boot.art --dex-file=/data/data/com.google.android.youtube/cache/ads976499314.jar --oat-fd=37 --oat-location=/data/data/com.google.android.youtube/cache/ads976499314.dex --runtime-arg -Xms64m --runtime-arg -Xmx512m
W/art     ( 2775): Suspending all threads took: 13.279ms
I/art     ( 2775): Background sticky concurrent mark sweep GC freed 18558(918KB) AllocSpace objects, 2(32KB) LOS objects, 14% free, 4MB/5MB, paused 13.605ms total 20.560ms
D/NativeLibraryUtils( 2775): Install completed successfully. count=0 extracted=0
I/art     ( 2098): Explicit concurrent mark sweep GC freed 45176(2MB) AllocSpace objects, 15(240KB) LOS objects, 39% free, 6MB/10MB, paused 135us total 28.319ms
V/GmsCoreStatsServiceLauncher( 2098): Received broadcast intent Intent { act=android.intent.action.BOOT_COMPLETED flg=0x8000010 cmp=com.google.android.gms/.common.stats.GmsCoreStatsServiceLauncher (has extras) }
W/dex2oat ( 2770): Skipping non-existent dex file '/data/data/com.google.android.youtube/cache/ads976499314.jar'
I/dex2oat ( 2770): dex2oat took 49.057ms (threads: 1) arena alloc=0B java alloc=576B native alloc=196KB free=3MB
I/GoogleURLConnFactory( 2775): Using platform SSLCertificateSocketFactory
V/AuthZen ( 2098): Handling intent: com.google.android.gms.GMS_UPDATED
D/AuthZenEventHandler( 2098): Handling event: com.google.android.gms.GMS_UPDATED
D/PersistentNotificationBroadcastReceiver( 2062): Received intent: Intent { act=android.intent.action.BOOT_COMPLETED flg=0x8000010 cmp=com.google.android.gms/.common.notification.PersistentNotificationBroadcastReceiver (has extras) }
E/JavaBinder( 2098): *** Uncaught remote exception!  (Exceptions are not yet supported across processes.)
E/JavaBinder( 2098): java.lang.RuntimeException: android.os.RemoteException
E/JavaBinder( 2098): 	at android.os.Parcel.writeException(Parcel.java:1446)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:452)
E/JavaBinder( 2098): Caused by: android.os.RemoteException
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.service.b.a(SourceFile:77)
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.a.e.onTransact(SourceFile:63)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:446)
I/art     ( 2062): Explicit concurrent mark sweep GC freed 3248(152KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 5MB/9MB, paused 99us total 35.996ms
W/BaseAppContext( 2098): Using Auth Proxy for data requests.
D/WearInitializer( 2098): Running WearInitializer
D/WearInitializer( 2098): enabled .WearableService
D/LocationInitializer( 2098): Restart initialization of location
D/LocationInitializer( 2098): Restart initialization of location
D/LocationInitializer( 2098): Restart initialization of location
E/JavaBinder( 2098): *** Uncaught remote exception!  (Exceptions are not yet supported across processes.)
E/JavaBinder( 2098): java.lang.RuntimeException: android.os.RemoteException
E/JavaBinder( 2098): 	at android.os.Parcel.writeException(Parcel.java:1446)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:452)
E/JavaBinder( 2098): Caused by: android.os.RemoteException
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.service.b.a(SourceFile:77)
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.a.e.onTransact(SourceFile:63)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:446)
I/PhenotypeConfigurator( 2098): Scheduling Phenotype for one-off execution 3894 seconds from now (1460276289256)
W/GCoreFlp( 2300): No location to return for getLastLocation()
W/FusedLocationProvider( 2062): location=null
W/GCoreFlp( 2300): No location to return for getLastLocation()
W/FusedLocationProvider( 2062): location=null
W/GCoreFlp( 2300): No location to return for getLastLocation()
W/FusedLocationProvider( 2062): location=null
D/GCM     ( 2062): GcmService start Intent { act=android.intent.action.BOOT_COMPLETED flg=0x8000010 cmp=com.google.android.gms/.gcm.GcmService (has extras) } android.intent.action.BOOT_COMPLETED
D/SystemUpdateService( 2098): onCreate
D/SystemUpdateService( 2098): onStartCommand: intent: Intent { cmp=com.google.android.gms/.update.SystemUpdateService (has extras) }
I/ConfigFetchService( 2098): onStartCommand Intent { cmp=com.google.android.gms/.config.ConfigFetchService (has extras) }
E/copresGcore( 2062): ObfuscatedGaiaIdLookup: Could not load ObfuscatedGaiaIds: /data/data/com.google.android.gms/files/copresence_gaia_id: open failed: ENOENT (No such file or directory)
I/ConfigService( 2062): onCreate
V/AuthZen ( 2098): Handling intent: android.intent.action.BOOT_COMPLETED
D/AuthZenEventHandler( 2098): Handling event: android.intent.action.BOOT_COMPLETED
D/AuthZenTransactionCache( 2098): Initialized cache in: /data/data/com.google.android.gms/files
D/AuthZenTransactionCache( 2098): Clearing transaction cache
I/GCoreUlr( 2098): Starting service, intent=Intent { act=com.google.android.location.reporting.ACTION_UPDATE_WORLD cmp=com.google.android.gms/com.google.android.location.reporting.service.DispatchingService (has extras) }, extras=Bundle[{receiverAction=android.intent.action.BOOT_COMPLETED}]
I/GCoreUlr( 2300): DispatchingService.onCreate()
I/SystemUpdateService( 2098): cancelUpdate (empty URL)
I/SystemUpdateService( 2098): active receiver: disabled
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.kids from APK com.google.android.gms
I/ConfigFetchService( 2098): service connected
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.kids from APK com.google.android.gms
D/ConfigFetchService( 2098): ConfigApi connection successful.
D/SystemUpdateService( 2098): onDestroy
I/ActivityManager( 1317): Start proc 2897:com.google.android.onetimeinitializer/u0a9 for broadcast com.google.android.onetimeinitializer/.OneTimeInitializerReceiver
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
W/Kids    ( 2098): [AbstractKidsOperation] Invalid device state 3
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
I/GCoreUlr( 2300): WorldUpdater received intent Intent { act=com.google.android.location.reporting.ACTION_UPDATE_WORLD cmp=com.google.android.gms/com.google.android.location.reporting.service.DispatchingService (has extras) } with receiverAction android.intent.action.BOOT_COMPLETED
I/ActivityThread( 2897): Switching default density from 160 to 130
V/OneTimeInitializerReceiver( 2897): OneTimeInitializerReceiver.onReceive
I/art     ( 1108): Explicit concurrent mark sweep GC freed 703(30KB) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 41us total 4.555ms
I/ActivityManager( 1317): Start proc 2914:com.google.android.partnersetup/u0a10 for broadcast com.google.android.partnersetup/.GooglePartnerSetup
V/OneTimeService( 2897): OneTimeService.onHandleIntent
V/OneTimeService( 2897): Updating shortcuts
V/OneTimeService( 2897): updateShortcut: uri=content://com.android.launcher2.settings/favorites?notify=true
E/ActivityThread( 2897): Failed to find provider info for com.android.launcher2.settings
V/OneTimeService( 2897): updateShortcut: uri=content://com.google.android.launcher.settings/favorites
E/ActivityThread( 2897): Failed to find provider info for com.google.android.launcher.settings
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 36us total 2.976ms
I/ActivityThread( 2914): Switching default density from 160 to 130
I/art     ( 1108): Explicit concurrent mark sweep GC freed 5(160B) AllocSpace objects, 0(0B) LOS objects, 39% free, 1918KB/3MB, paused 36us total 2.589ms
I/GCoreUlr( 2300): WorldUpdater:android.intent.action.BOOT_COMPLETED: Ensuring that reporting is stopped because of reasons: (no Google accounts)
I/ActivityManager( 1317): Start proc 2938:com.android.managedprovisioning/u0a11 for broadcast com.android.managedprovisioning/.BootReminder
I/art     ( 1317): Explicit concurrent mark sweep GC freed 19395(1591KB) AllocSpace objects, 31(496KB) LOS objects, 33% free, 9MB/14MB, paused 143us total 40.844ms
I/RlzPingService( 2914): Setting next ping for 1460881089468
I/ActivityManager( 1317): Killing 1952:com.google.android.music:main/u0a47 (adj 15): empty #17
I/ActivityThread( 2938): Switching default density from 160 to 130
I/GCoreUlr( 2300): Unbound from all location providers
I/GCoreUlr( 2300): DispatchingService.onDestroy()
I/GCoreUlr( 2300): Stopping handler for UlrDispSvcFast
I/GCoreUlr( 2300): Unbound from all location providers
I/ActivityManager( 1317): Killing 1992:com.android.settings/1000 (adj 15): empty #17
D/ConnectivityManager( 2233): getMobileDataEnabled()+ subId=-1
D/PhoneInterfaceManager( 1910): [PhoneIntfMgr] getDataEnabled: subId=-1 phoneId=-1
E/PhoneInterfaceManager( 1910): [PhoneIntfMgr] getDataEnabled: no phone subId=-1 retVal=false
D/ConnectivityManager( 2233): getMobileDataEnabled()- subId=-1 retVal=false
I/ActivityManager( 1317): Start proc 2963:com.android.settings/1000 for broadcast com.android.settings/.sim.SimBootReceiver
D/Mms     ( 2233): cancelNotification
I/ActivityThread( 2963): Switching default density from 160 to 130
D/AlertReceiver( 2248): onReceive: a=android.intent.action.BOOT_COMPLETED Intent { act=android.intent.action.BOOT_COMPLETED flg=0x8000010 cmp=com.android.calendar/.alerts.AlertReceiver (has extras) }
D/AlertService( 2248): 0 Action = android.intent.action.BOOT_COMPLETED
I/ActivityManager( 1317): Start proc 2979:com.android.camera2/u0a28 for broadcast com.android.camera2/com.android.camera.DisableCameraReceiver
D/Mms     ( 2233): cancelNotification
D/AlertService( 2248): Scheduling next alarm with AlarmScheduler. sEventReminderReceived: null
I/MediaProvider( 2126): Upgrading media database from version 0 to 800, which will destroy all old data
D/AlarmScheduler( 2248): No events found starting within 1 week.
I/ActivityThread( 2979): Switching default density from 160 to 130
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.android.camera2/cache/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb0/Android/data/com.android.camera2/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.android.camera2/cache/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb1/Android/data/com.android.camera2/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.android.camera2/cache/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb2/Android/data/com.android.camera2/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.android.camera2/cache/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb3/Android/data/com.android.camera2/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.android.camera2/cache/
W/ContextImpl( 2979): Failed to ensure directory: /storage/sdcard1/Android/data/com.android.camera2/cache
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.android.camera2/files/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb0/Android/data/com.android.camera2/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.android.camera2/files/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb1/Android/data/com.android.camera2/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.android.camera2/files/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb2/Android/data/com.android.camera2/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.android.camera2/files/
W/ContextImpl( 2979): Failed to ensure directory: /storage/usb3/Android/data/com.android.camera2/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.android.camera2/files/
W/ContextImpl( 2979): Failed to ensure directory: /storage/sdcard1/Android/data/com.android.camera2/files
D/CAM_MemoryManagerImpl( 2979): Max native memory: 358 MB
I/CAM_DisableCamRcver( 2979): no back camera
I/CAM_DisableCamRcver( 2979): disable all camera activities
I/ActivityManager( 1317): Start proc 2996:com.google.android.configupdater/u0a31 for broadcast com.google.android.configupdater/.CertPin.CertPinUpdateRequestReceiver
I/ActivityManager( 1317): Killing 2352:com.android.exchange/u0a36 (adj 15): empty #17
I/ActivityThread( 2996): Switching default density from 160 to 130
E/UpdateRequestReceiver( 2996): ignoring update request
E/UpdateRequestReceiver( 2996): ignoring update request
E/UpdateRequestReceiver( 2996): ignoring update request
E/UpdateRequestReceiver( 2996): ignoring update request
E/UpdateRequestReceiver( 2996): ignoring update request
E/UpdateRequestReceiver( 2996): ignoring update request
V/AlarmClock( 2317): AlarmInitReceiver android.intent.action.BOOT_COMPLETED
V/AlarmClock( 2317): AlarmInitReceiver - Reset timers and clear stopwatch data
V/AlarmClock( 2317): AlarmInitReceiver - resetting volume button default
V/AlarmClock( 2317): AlarmInitReceiver finished
I/G:DisableCameraReceiver( 2554): no back camera
I/G:DisableCameraReceiver( 2554): disable all camera activities
I/Email   ( 2371): Onetime initialization: 1
I/Email   ( 2371): Onetime initialization: 2
I/Email   ( 2371): Onetime initialization: completed.
I/ActivityManager( 1317): Start proc 3027:com.android.exchange/u0a36 for service com.android.exchange/.service.EasService
E/ActivityThread( 2371): Service com.android.email.service.EmailBroadcastProcessorService has leaked ServiceConnection com.android.emailcommon.service.ServiceProxy$ProxyConnection@2f8292cd that was originally bound here
E/ActivityThread( 2371): android.app.ServiceConnectionLeaked: Service com.android.email.service.EmailBroadcastProcessorService has leaked ServiceConnection com.android.emailcommon.service.ServiceProxy$ProxyConnection@2f8292cd that was originally bound here
E/ActivityThread( 2371): 	at android.app.LoadedApk$ServiceDispatcher.<init>(LoadedApk.java:1077)
E/ActivityThread( 2371): 	at android.app.LoadedApk.getServiceDispatcher(LoadedApk.java:971)
E/ActivityThread( 2371): 	at android.app.ContextImpl.bindServiceCommon(ContextImpl.java:1774)
E/ActivityThread( 2371): 	at android.app.ContextImpl.bindService(ContextImpl.java:1757)
E/ActivityThread( 2371): 	at android.content.ContextWrapper.bindService(ContextWrapper.java:539)
E/ActivityThread( 2371): 	at com.android.emailcommon.service.ServiceProxy.setTask(ServiceProxy.java:181)
E/ActivityThread( 2371): 	at com.android.emailcommon.service.ServiceProxy.test(ServiceProxy.java:224)
E/ActivityThread( 2371): 	at com.android.email.service.EmailServiceUtils.isServiceAvailable(EmailServiceUtils.java:160)
E/ActivityThread( 2371): 	at com.android.email.provider.AccountReconciler.reconcileAccountsInternal(AccountReconciler.java:171)
E/ActivityThread( 2371): 	at com.android.email.provider.AccountReconciler.reconcileAccounts(AccountReconciler.java:115)
E/ActivityThread( 2371): 	at com.android.email.service.EmailBroadcastProcessorService.reconcileAndStartServices(EmailBroadcastProcessorService.java:305)
E/ActivityThread( 2371): 	at com.android.email.service.EmailBroadcastProcessorService.onBootCompleted(EmailBroadcastProcessorService.java:295)
E/ActivityThread( 2371): 	at com.android.email.service.EmailBroadcastProcessorService.onHandleIntent(EmailBroadcastProcessorService.java:130)
E/ActivityThread( 2371): 	at android.app.IntentService$ServiceHandler.handleMessage(IntentService.java:65)
E/ActivityThread( 2371): 	at android.os.Handler.dispatchMessage(Handler.java:102)
E/ActivityThread( 2371): 	at android.os.Looper.loop(Looper.java:135)
E/ActivityThread( 2371): 	at android.os.HandlerThread.run(HandlerThread.java:61)
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
I/Gmail   ( 2462): getAccountsCursor
I/SystemBroadcastReceiver( 1898): Boot has been completed
I/LauncherIconVisibilityManager( 1898): Disable activity: ComponentInfo{com.android.inputmethod.latin/com.android.inputmethod.latin.setup.SetupActivity}
I/Gmail   ( 2462): Onetime initialization: 1
I/Gmail   ( 2462): Onetime initialization: 2
I/Gmail   ( 2462): Onetime initialization: completed.
W/ActivityManager( 1317): Unable to start service Intent { act=com.google.android.gm.email.EXCHANGE_INTENT pkg=com.google.android.gm.exchange } U=0: not found
W/ActivityManager( 1317): Unable to start service Intent { act=com.google.android.gm.email.EXCHANGE_INTENT pkg=com.google.android.gm.exchange } U=0: not found
E/ActivityThread( 2462): Service com.android.email.service.EmailBroadcastProcessorService has leaked ServiceConnection com.android.emailcommon.service.am@2d0c93df that was originally bound here
E/ActivityThread( 2462): android.app.ServiceConnectionLeaked: Service com.android.email.service.EmailBroadcastProcessorService has leaked ServiceConnection com.android.emailcommon.service.am@2d0c93df that was originally bound here
E/ActivityThread( 2462): 	at android.app.LoadedApk$ServiceDispatcher.<init>(LoadedApk.java:1077)
E/ActivityThread( 2462): 	at android.app.LoadedApk.getServiceDispatcher(LoadedApk.java:971)
E/ActivityThread( 2462): 	at android.app.ContextImpl.bindServiceCommon(ContextImpl.java:1774)
E/ActivityThread( 2462): 	at android.app.ContextImpl.bindService(ContextImpl.java:1757)
E/ActivityThread( 2462): 	at android.content.ContextWrapper.bindService(ContextWrapper.java:539)
E/ActivityThread( 2462): 	at com.android.emailcommon.service.ak.a(SourceFile:181)
E/ActivityThread( 2462): 	at com.android.emailcommon.service.ak.e(SourceFile:222)
E/ActivityThread( 2462): 	at com.android.email.service.m.c(SourceFile:158)
E/ActivityThread( 2462): 	at com.android.email.provider.b.a(SourceFile:201)
E/ActivityThread( 2462): 	at com.android.email.provider.b.a(SourceFile:145)
E/ActivityThread( 2462): 	at com.android.email.service.EmailBroadcastProcessorService.c(SourceFile:349)
E/ActivityThread( 2462): 	at com.android.email.service.EmailBroadcastProcessorService.onHandleIntent(SourceFile:1334)
E/ActivityThread( 2462): 	at android.app.IntentService$ServiceHandler.handleMessage(IntentService.java:65)
E/ActivityThread( 2462): 	at android.os.Handler.dispatchMessage(Handler.java:102)
E/ActivityThread( 2462): 	at android.os.Looper.loop(Looper.java:135)
E/ActivityThread( 2462): 	at android.os.HandlerThread.run(HandlerThread.java:61)
W/ActivityManager( 1317): Unbind failed: could not find connection for android.os.BinderProxy@e9c6b9c
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService } com.google.android.gms.INITIALIZE
D/AuthorizationBluetoothService( 2062): Received GmsCore event: Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.auth.be.proximity.authorization.bt.AuthorizationBluetoothService$AutoStarter }.
E/AuthorizationBluetoothService( 2062): Proximity feature is not enabled.
I/ActivityThread( 3027): Switching default density from 160 to 130
I/Exchange( 3027): EasService.onCreate
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GmsCoreStatsServiceLauncher( 2098): Received broadcast intent Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.common.stats.GmsCoreStatsServiceLauncher }
E/MDM     ( 2300): [166] b.run: Couldn't connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
D/AlertReceiver( 2248): onReceive: a=android.intent.action.PROVIDER_CHANGED Intent { act=android.intent.action.PROVIDER_CHANGED dat=content://com.android.calendar flg=0x10 cmp=com.android.calendar/.alerts.AlertReceiver }
I/Exchange( 3027): RestartPingTask
D/LocationInitializer( 2098): Restart initialization of location
D/AlertService( 2248): 0 Action = android.intent.action.PROVIDER_CHANGED
D/SIP     ( 1910): [SipSharedPreferences] isReceivingCallsEnabled, option not set; use default value, exception: android.provider.Settings$SettingNotFoundException: sip_receive_calls
W/GCoreFlp( 2300): No location to return for getLastLocation()
W/FusedLocationProvider( 2062): location=null
I/Exchange( 3027): RestartPingsTask did not start any pings.
I/Exchange( 3027): PSS stopIfIdle
I/Exchange( 3027): PSS has no active accounts; stopping service.
I/Exchange( 3027): onDestroy
I/ActivityManager( 1317): Killing 2716:com.android.dialer/u0a4 (adj 15): empty #17
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService } com.google.android.gms.INITIALIZE
D/AuthorizationBluetoothService( 2062): Received GmsCore event: Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.auth.be.proximity.authorization.bt.AuthorizationBluetoothService$AutoStarter }.
E/AuthorizationBluetoothService( 2062): Proximity feature is not enabled.
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GmsCoreStatsServiceLauncher( 2098): Received broadcast intent Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.common.stats.GmsCoreStatsServiceLauncher }
E/MDM     ( 2300): [168] b.run: Couldn't connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
W/ProcessCpuTracker( 1317): Skipping unknown process pid 2716
D/LocationInitializer( 2098): Restart initialization of location
W/MplexGcmListener( 2613): GCM error: AUTHENTICATION_FAILED
W/GCoreFlp( 2300): No location to return for getLastLocation()
W/FusedLocationProvider( 2062): location=null
W/Settings( 2098): Setting device_provisioned has moved from android.provider.Settings.Secure to android.provider.Settings.Global.
I/ActivityManager( 1317): Start proc 3069:com.google.android.music:main/u0a47 for broadcast com.google.android.music/.store.MediaStoreImportService$Receiver
W/GCoreFlp( 2300): No location to return for getLastLocation()
W/FusedLocationProvider( 2062): location=null
W/Icing   ( 2098): PackageManager.queryIntentActivities threw an exception Invalid index 0, size is 0 for intent Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] pkg=com.android.inputmethod.latin }
I/ActivityThread( 3069): Switching default density from 160 to 130
I/MultiDex( 3069): VM with version 2.1.0 has multidex support
I/MultiDex( 3069): install
I/MultiDex( 3069): VM has multidex support, MultiDex support library is disabled.
W/ActivityManager( 1317): getRunningAppProcesses: caller 10047 does not hold REAL_GET_TASKS; limiting output
I/MusicStore( 3069): Database version: 121
I/art     ( 1317): Explicit concurrent mark sweep GC freed 21723(1635KB) AllocSpace objects, 20(320KB) LOS objects, 33% free, 9MB/14MB, paused 143us total 22.004ms
I/art     ( 2062): Explicit concurrent mark sweep GC freed 17921(864KB) AllocSpace objects, 1(16KB) LOS objects, 39% free, 5MB/9MB, paused 95us total 9.752ms
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
D/MusicLifecycle( 3069): com.google.android.music.MusicApplication generated event: Application created
W/ResourcesManager( 3069): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 3069): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
V/JNIHelp ( 3069): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
I/Icing   ( 2098): Indexing done 1F335F402E2A59080DB906CEC4C02D57FB41F0EF
I/ProviderInstaller( 3069): Installed default security provider GmsCore_OpenSSL
D/AndroidMusic( 3069): GMSCore installation verified
I/ConfigStore( 3069): Config Database version: 1
I/MediaRouter( 3069): Found default route: MediaRouter.RouteInfo{ uniqueId=android/.support.v7.media.SystemMediaRouteProvider:DEFAULT_ROUTE, name=Tablet, description=null, iconUri=null, enabled=true, connecting=false, connectionState=0, canDisconnect=false, playbackType=0, playbackStream=3, volumeHandling=1, volume=11, volumeMax=15, presentationDisplayId=-1, extras=null, settingsIntent=null, providerPackageName=android }
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService$Receiver generated event: Broadcast received with context android.app.ReceiverRestrictedContext@778ac89 and intent Intent { act=android.intent.action.MEDIA_SCANNER_STARTED dat=file:///system/media flg=0x10 cmp=com.google.android.music/.store.MediaStoreImportService$Receiver }
D/MusicLifecycle( 3069): com.google.android.music.net.NetworkMonitor generated event: Service created
I/NetworkMonitor( 3069): type=Ethernet subType= reason=null isConnected=true
I/ActivityManager( 1317): Start proc 3096:com.google.android.gms.ui/u0a7 for broadcast com.google.android.gms/.mdm.receivers.MdmDeviceAdminReceiver
D/MusicLifecycle( 3069): com.google.android.music.preferences.MusicPreferenceService$MusicPreferenceServiceBinder generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.download.cache.StorageMigrationService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.download.artwork.ArtDownloadService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.net.NetworkMonitor$2 generated event: Broadcast received with context com.google.android.music.net.NetworkMonitor@3cd744af and intent Intent { act=android.net.conn.CONNECTIVITY_CHANGE flg=0x4000010 (has extras) }
I/NetworkMonitor( 3069): type=Ethernet subType= reason=null isConnected=true
D/MusicLifecycle( 3069): com.google.android.music.download.ArtDownloadQueueService generated event: Service created
I/GHttpClientFactory( 3069): Using our fixed implementation of GMSCore's GoogleHttpClient
I/GoogleURLConnFactory( 3069): Using platform SSLCertificateSocketFactory
I/ActivityThread( 3096): Switching default density from 160 to 130
W/ResourcesManager( 3096): Asset path '/system/framework/com.android.media.remotedisplay.jar' does not exist or contains no resources.
W/ResourcesManager( 3096): Asset path '/system/framework/com.android.location.provider.jar' does not exist or contains no resources.
D/MusicLifecycle( 3069): com.google.android.music.download.cache.ArtCacheService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.download.cache.StorageMigrationService generated event: Service destroyed
I/art     ( 3096): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/art     ( 3096): Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.common.h.c>
I/ActivityManager( 1317): Killing 2733:com.android.keychain/1000 (adj 15): empty #17
E/JavaBinder( 2098): *** Uncaught remote exception!  (Exceptions are not yet supported across processes.)
E/JavaBinder( 2098): java.lang.RuntimeException: android.os.RemoteException
E/JavaBinder( 2098): 	at android.os.Parcel.writeException(Parcel.java:1446)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:452)
E/JavaBinder( 2098): Caused by: android.os.RemoteException
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.service.b.a(SourceFile:77)
E/JavaBinder( 2098): 	at com.google.android.gms.ads.identifier.a.e.onTransact(SourceFile:63)
E/JavaBinder( 2098): 	at android.os.Binder.execTransact(Binder.java:446)
I/MultiDex( 3096): VM with version 2.1.0 has multidex support
I/MultiDex( 3096): install
I/MultiDex( 3096): VM has multidex support, MultiDex support library is disabled.
V/JNIHelp ( 3096): Registering com/google/android/gms/org/conscrypt/NativeCrypto's 240 native methods...
I/ProviderInstaller( 3096): Installed default security provider GmsCore_OpenSSL
E/MDM     ( 3096): [1] SitrepService.a: No Google accounts; deferring server state update.
I/ActivityManager( 1317): Killing 2897:com.google.android.onetimeinitializer/u0a9 (adj 15): empty #17
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService } com.google.android.gms.INITIALIZE
D/AuthorizationBluetoothService( 2062): Received GmsCore event: Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.auth.be.proximity.authorization.bt.AuthorizationBluetoothService$AutoStarter }.
E/AuthorizationBluetoothService( 2062): Proximity feature is not enabled.
D/NativeLibraryUtils( 3096): Install completed successfully. count=0 extracted=0
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GLSActivity( 2062): AuthDelegateWrapperCreated with selected intent: Intent { cmp=com.google.android.gms/.auth.DefaultAuthDelegateService }
V/GmsCoreStatsServiceLauncher( 2098): Received broadcast intent Intent { act=com.google.android.gms.INITIALIZE flg=0x10 pkg=com.google.android.gms cmp=com.google.android.gms/.common.stats.GmsCoreStatsServiceLauncher }
E/MDM     ( 2300): [166] b.run: Couldn't connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null, message=null}
D/LocationInitializer( 2098): Restart initialization of location
W/GCoreFlp( 2300): No location to return for getLastLocation()
W/FusedLocationProvider( 2062): location=null
D/MediaProvider( 2126): Adjusting external storage paths to: /storage/emulated/0
D/KbdSensor( 1317): poll_setDelay: dev=0xb3c51a80 delay-ns=66667000
E/SQLiteLog( 2126): (1) no such table: files
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.c2dm.intent.REGISTER pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService (has extras) } com.google.android.c2dm.intent.REGISTER
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
W/YouTube ( 2613): (unknown) Could not register with GCM: 
W/YouTube ( 2613): java.io.IOException: AUTHENTICATION_FAILED
W/YouTube ( 2613): 	at eom.a(Unknown Source)
W/YouTube ( 2613): 	at kek.run(SourceFile:2038)
W/YouTube ( 2613): 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:422)
W/YouTube ( 2613): 	at java.util.concurrent.FutureTask.run(FutureTask.java:237)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:152)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:265)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
W/YouTube ( 2613): 	at gzp.run(SourceFile:40)
W/YouTube ( 2613): 	at java.lang.Thread.run(Thread.java:818)
W/MplexGcmListener( 2613): GCM error: AUTHENTICATION_FAILED
I/ActivityManager( 1317): Killing 2938:com.android.managedprovisioning/u0a11 (adj 15): empty #17
I/dex2oat ( 2851): dex2oat took 1.991s (threads: 1) arena alloc=407KB java alloc=2MB native alloc=7MB free=4MB
D/DexOptUtils( 2098): Odex created at:/data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/x86/MapsModule.dex
D/DexOptUtils( 2098): Set odex to world readable.
D/DexOptUtils( 2098): Renamed odex to /data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/x86/MapsModule.odex
D/FileApkUtils( 2098): Keeping up-to-date module: module-13de3980f029dc34d7f6bdadf7b693ead0480f20
D/GmsModuleFndr( 2098): Beginning GMS chimera module scan
D/GmsModuleFndr( 2098): Module pkg com.google.android.play.games not installed, skipping
D/ChimeraCfgMgr( 2098): Beginning module configuration check
D/ChimeraFileApk( 2098): Loading chimera manifest from FileApk(/data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/MapsModule.apk)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.maps,v8118000) from FileApk(/data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/MapsModule.apk)
D/ChimeraModuleApk( 2098): Loading chimera manifest from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(built-in,v0) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.games,v1) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.kids,v3) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.vision,v1) from ContainerApk(com.google.android.gms)
D/ChimeraCfgMgr( 2098): Considering module(com.google.android.gms.youtube,v1) from ContainerApk(com.google.android.gms)
D/ChimeraCfgRslvr( 2098): Beginning module config resolution
D/ChimeraCfgRslvr( 2098): module(built-in,v0) has no external dependencies, accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.youtube,v1) has no external dependencies, accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.games,v1) accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.kids,v3) accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.maps,v8118000) accepted
D/ChimeraCfgRslvr( 2098): module(com.google.android.gms.vision,v1) accepted
D/ChimeraCfgRslvr( 2098): Module config resolution complete
D/FileApkUtils( 2098): Module already staged or being staged:chimera-modules/MapsModule.apk
D/DexOptUtils( 2098): Module /data/data/com.google.android.gms/app_chimera/chimera-module-root/module-13de3980f029dc34d7f6bdadf7b693ead0480f20/MapsModule.apk is already optimized. Bailing.
D/FileApkUtils( 2098): Keeping up-to-date module: module-13de3980f029dc34d7f6bdadf7b693ead0480f20
D/GmsModuleFndr( 2098): Beginning GMS chimera module scan
D/GmsModuleFndr( 2098): Module pkg com.google.android.play.games not installed, skipping
D/ChimeraCfgMgr( 2098): Beginning module configuration check
D/ChimeraCfgMgr( 2098): Module APKs unchanged, check complete
I/Icing   ( 2098): Indexing 1F335F402E2A59080DB906CEC4C02D57FB41F0EF from com.google.android.gms
I/Icing   ( 2098): Indexing done 1F335F402E2A59080DB906CEC4C02D57FB41F0EF
E/MetadataRetrieverClient( 1105): failed to extract an album art
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
W/BackupManagerService( 1317): dataChanged but no participant pkg='com.android.providers.settings' uid=10005
E/MetadataRetrieverClient( 1105): failed to extract an album art
E/MetadataRetrieverClient( 1105): failed to extract an album art
W/MediaScanner( 2126): Error opening directory '/oem/media/', skipping: No such file or directory.
E/MetadataRetrieverClient( 1105): failed to extract an album art
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService$Receiver generated event: Broadcast received with context android.app.ReceiverRestrictedContext@778ac89 and intent Intent { act=android.intent.action.MEDIA_SCANNER_FINISHED dat=file:///system/media flg=0x10 cmp=com.google.android.music/.store.MediaStoreImportService$Receiver }
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService$Receiver generated event: Broadcast received with context android.app.ReceiverRestrictedContext@778ac89 and intent Intent { act=android.intent.action.MEDIA_SCANNER_STARTED dat=file:///storage/emulated/0 flg=0x10 cmp=com.google.android.music/.store.MediaStoreImportService$Receiver }
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService generated event: Service destroyed
I/iu.UploadsManager( 2098): #reloadSettings(); account: -1; IU: disabled; IS: disabled; IS account: -1; photoWiFi: true; videoWiFi: true; roam: false; battery: true; size: FULL; maxMobile: 157286400
I/iu.UploadsManager( 2098): End new media; added: 0, uploading: 0, time: 4 ms
W/MediaScanner( 2126): Error opening directory '/storage/sdcard1/', skipping: Permission denied.
W/MediaScanner( 2126): Error opening directory '/storage/usb0/', skipping: Permission denied.
W/MediaScanner( 2126): Error opening directory '/storage/usb1/', skipping: Permission denied.
W/MediaScanner( 2126): Error opening directory '/storage/usb2/', skipping: Permission denied.
W/MediaScanner( 2126): Error opening directory '/storage/usb3/', skipping: Permission denied.
V/MediaScanner( 2126): pruneDeadThumbnailFiles... android.database.sqlite.SQLiteCursor@543b7fc
V/MediaScanner( 2126): /pruneDeadThumbnailFiles... android.database.sqlite.SQLiteCursor@543b7fc
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService$Receiver generated event: Broadcast received with context android.app.ReceiverRestrictedContext@778ac89 and intent Intent { act=android.intent.action.MEDIA_SCANNER_FINISHED dat=file:///storage/emulated/0 flg=0x10 cmp=com.google.android.music/.store.MediaStoreImportService$Receiver }
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService generated event: Service created
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb0/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb0/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb1/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb2/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb2/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/usb3/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/usb3/Android/data/com.google.android.music/files
E/Vold    ( 1098): Failed to find mounted volume for /storage/sdcard1/Android/data/com.google.android.music/files/
W/ContextImpl( 3069): Failed to ensure directory: /storage/sdcard1/Android/data/com.google.android.music/files
I/AppDataSearchHelper( 3069): Upgrade from -1 to 121 took 29 ms
I/MediaStoreImporter( 3069): Update: full Added music: 0 Updated music: 0 Deleted music: 0 Created playlists: 0 Updated playlists: 0 Deleted playlists: 0 Inserted playlist items: 0 Deleted playlist items: 0 Removed orphaned playlist items: 0
D/MusicLifecycle( 3069): com.google.android.music.wear.WearBroadcastReceiver generated event: Broadcast received with context android.app.ReceiverRestrictedContext@778ac89 and intent Intent { act=com.google.android.music.IMPORT_COMPLETE flg=0x10 cmp=com.google.android.music/.wear.WearBroadcastReceiver }
D/MusicLifecycle( 3069): com.google.android.music.wear.WearMetadataSyncService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.wear.WearMetadataSyncService generated event: Service started with intent Intent { cmp=com.google.android.music/.wear.WearMetadataSyncService }
D/MusicLifecycle( 3069): com.google.android.music.store.MediaStoreImportService generated event: Service destroyed
E/GmsUtils( 3069): Failed to connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null}
E/GmsUtils( 3069): Failed to connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null}
D/MusicLifecycle( 3069): com.google.android.music.wear.WearMetadataSyncService generated event: Service destroyed
D/BluetoothManagerService( 1317): Message: 100
E/BluetoothManagerService( 1317): MESSAGE_TIMEOUT_BIND
W/ActivityManager( 1317): Unable to start service Intent { act=com.google.android.gms.analytics.service.START cmp=com.google.android.gms/.analytics.service.AnalyticsService (has extras) } U=0: not found
W/GAV2    ( 2462): Thread[GAThread,5,main]: Service unavailable (code=1), will retry.
I/GAV2    ( 2462): Thread[GAThread,5,main]: No campaign data found.
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.c2dm.intent.REGISTER pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService (has extras) } com.google.android.c2dm.intent.REGISTER
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
W/YouTube ( 2613): (unknown) Could not register with GCM: 
W/YouTube ( 2613): java.io.IOException: AUTHENTICATION_FAILED
W/YouTube ( 2613): 	at eom.a(Unknown Source)
W/YouTube ( 2613): 	at kek.run(SourceFile:2038)
W/YouTube ( 2613): 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:422)
W/YouTube ( 2613): 	at java.util.concurrent.FutureTask.run(FutureTask.java:237)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:152)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:265)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
W/YouTube ( 2613): 	at gzp.run(SourceFile:40)
W/YouTube ( 2613): 	at java.lang.Thread.run(Thread.java:818)
W/MplexGcmListener( 2613): GCM error: AUTHENTICATION_FAILED
I/bluetoothd( 2747): Stopping SDP server
I/bluetoothd( 2747): Exit
I/sh      ( 3140): /system/etc/init.sh[390]: cat: /sys/class/dmi/id/board_name: No such file or directory
I/bluetoothd( 3149): stopped () 
E/SQLiteLog( 2337): (284) automatic index on view_events(_id)
I/GlobalDismissManager( 2248): no sender configured
D/AlertService( 2248): Beginning updateAlertNotification
D/AlertService( 2248): No fired or scheduled alerts
D/AlertService( 2248): Scheduling next alarm with AlarmScheduler. sEventReminderReceived: null
D/AlarmScheduler( 2248): No events found starting within 1 week.
D/MusicLifecycle( 3069): com.google.android.music.leanback.AutoCacheSchedulingService$EnablingReceiver generated event: Broadcast received with context android.app.ReceiverRestrictedContext@778ac89 and intent Intent { act=com.google.android.music.START_DOWNLOAD_SCHEDULING flg=0x10 cmp=com.google.android.music/.leanback.AutoCacheSchedulingService$EnablingReceiver }
D/MusicLifecycle( 3069): com.google.android.music.leanback.AutoCacheSchedulingService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.leanback.AutoCacheSchedulingService generated event: Service started with intent Intent { act=com.google.android.music.leanback.APP_IN_USE cmp=com.google.android.music/.leanback.AutoCacheSchedulingService (has extras) }
D/MusicLifecycle( 3069): com.google.android.music.wear.WearBroadcastReceiver generated event: Broadcast received with context android.app.ReceiverRestrictedContext@778ac89 and intent Intent { act=com.google.android.music.START_DOWNLOAD_SCHEDULING flg=0x10 cmp=com.google.android.music/.wear.WearBroadcastReceiver }
D/MusicLifecycle( 3069): com.google.android.music.download.TrackDownloadQueueService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.download.cache.TrackCacheService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.wear.WearMetadataSyncService generated event: Service created
D/MusicLifecycle( 3069): com.google.android.music.wear.WearMetadataSyncService generated event: Service started with intent Intent { cmp=com.google.android.music/.wear.WearMetadataSyncService }
E/GmsUtils( 3069): Failed to connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null}
E/GmsUtils( 3069): Failed to connect to Google API client: ConnectionResult{statusCode=API_UNAVAILABLE, resolution=null}
D/MusicLifecycle( 3069): com.google.android.music.wear.WearMetadataSyncService generated event: Service destroyed
I/MusicLeanback( 3069): Conditions not met for autocaching. okToAttempt=false
I/MusicLeanback( 3069): Stop autocaching.
D/MusicLifecycle( 3069): com.google.android.music.download.cache.TrackCacheService generated event: Service destroyed
D/MusicLifecycle( 3069): com.google.android.music.download.TrackDownloadQueueService generated event: Service destroyed
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.youtube flg=0x4000010 (has extras) }
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.android.vending flg=0x4000010 (has extras) }
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.android.camera2 flg=0x4000010 (has extras) }
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.gm flg=0x4000010 (has extras) }
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.youtube
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.android.vending
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.android.camera2
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.gm
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.android.calendar
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.setupwizard
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.music
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.android.gallery3d
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.android.calendar flg=0x4000010 (has extras) }
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.setupwizard flg=0x4000010 (has extras) }
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.music flg=0x4000010 (has extras) }
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.gms
I/PackageBroadcastService( 2098): Null package name or gms related package.  Ignoreing.
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.gsf
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.partnersetup
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.android.inputmethod.latin
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.backuptransport
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.android.settings
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.android.email
W/ResourcesManager( 1317): Asset path '/system/framework/com.google.android.media.effects.jar' does not exist or contains no resources.
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.android.gallery3d flg=0x4000010 (has extras) }
I/Icing   ( 2098): updateResources: need to parse f{com.google.android.gm}
I/PeopleContactsSync( 2098): CP2 sync disabled
I/ActivityManager( 1317): Killing 2233:com.android.mms/u0a12 (adj 15): empty #17
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.gms flg=0x4000010 (has extras) }
I/BackupManagerService( 1317): Unbinding ComponentInfo{com.google.android.gms/com.google.android.gms.backup.BackupTransportService}
I/Icing   ( 2098): updateResources: need to parse f{com.google.android.music}
I/Icing   ( 2098): Not sending global search app notification. Search app not installed or not signed properly.
I/Icing   ( 2098): updateResources: need to parse f{com.google.android.gms}
D/CountryDetector( 1317): No listener is left
I/Icing   ( 2098): Not indexing corpus from package com.google.android.music as it has never connected
E/Icing   ( 2098): Aborting indexing of corpus 7D422BE213D57A310643EC5F88CE6C50CCD6E30E
I/Icing   ( 2098): Not indexing corpus from package com.google.android.music as it has never connected
E/Icing   ( 2098): Aborting indexing of corpus E80E6C8240C8F3C441A2168D3BC80C639DC11135
I/Icing   ( 2098): Not indexing corpus from package com.google.android.music as it has never connected
E/Icing   ( 2098): Aborting indexing of corpus 41909DFE77E62B51C187E190703B2951DB1C5A6C
I/Icing   ( 2098): Not indexing corpus from package com.google.android.music as it has never connected
E/Icing   ( 2098): Aborting indexing of corpus 334E2CCDF51C3FC5DF2C69F17B28CDAB5C16F78F
I/BackupManagerService( 1317): Binding to transport host ComponentInfo{com.google.android.gms/com.google.android.gms.backup.BackupTransportService}
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.gsf flg=0x4000010 (has extras) }
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.partnersetup flg=0x4000010 (has extras) }
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.android.inputmethod.latin flg=0x4000010 (has extras) }
W/GmsBackupAccountManager( 2300): Backup account not found in gmscore.
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.backuptransport flg=0x4000010 (has extras) }
I/BackupManagerService( 1317): Unbinding ComponentInfo{com.google.android.backuptransport/com.google.android.backup.BackupTransportService}
I/ActivityManager( 1317): Killing 2963:com.android.settings/1000 (adj 15): empty #17
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.android.settings flg=0x4000010 (has extras) }
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.android.email flg=0x4000010 (has extras) }
V/BackupManagerService( 1317): Connected to transport ComponentInfo{com.google.android.gms/com.google.android.gms.backup.BackupTransportService}
V/BackupManagerService( 1317): Registering transport com.google.android.gms/.backup.BackupTransportService::com.google.android.gms/.backup.BackupTransportService = com.android.internal.backup.IBackupTransport$Stub$Proxy@62527f7
I/FusedLocation( 1317): engine stopped (com.android.location.fused)
I/Backup  ( 2062): [BackupTransportMigratorService] Starting migration...
W/Backup  ( 2062): [LegacyBackupAccountManager] No google accounts found!
I/art     ( 2300): Explicit concurrent mark sweep GC freed 37318(2MB) AllocSpace objects, 8(128KB) LOS objects, 40% free, 5MB/9MB, paused 80us total 20.544ms
W/GmsBackupAccountManager( 2300): Backup account not found in gmscore.
I/Backup  ( 2062): [BackupTransportMigratorService] Successfully migrated to use GMS BackupTransportService!
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
V/GmsNetworkLocationProvi( 2300): DISABLE
I/GCoreNlp( 2300): shouldConfirmNlp, NLP off. Ensuring opt-in disabled
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
I/art     ( 1317): Explicit concurrent mark sweep GC freed 53446(2MB) AllocSpace objects, 10(160KB) LOS objects, 33% free, 10MB/15MB, paused 214us total 18.505ms
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): Probably not a portal: exception java.net.ConnectException: failed to connect to connectivitycheck.android.com/2404:6800:4005:800::200e (port 80) after 10000ms: connect failed: ENETUNREACH (Network is unreachable)
W/ActivityManager( 1317): Unable to start service Intent { act=com.google.android.gms.analytics.service.START cmp=com.google.android.gms/.analytics.service.AnalyticsService (has extras) } U=0: not found
W/GAV2    ( 2462): Thread[Service Reconnect,5,main]: Service unavailable (code=1), using local store.
E/BlueZ   ( 2694): bluetoothd connect timeout
E/BluetoothServiceJni( 2694): Error while setting the callbacks: 1
D/BluetoothManagerService( 1317): BluetoothServiceConnection: com.android.bluetooth.btservice.AdapterService
D/BluetoothManagerService( 1317): Message: 40
D/BluetoothManagerService( 1317): MESSAGE_BLUETOOTH_SERVICE_CONNECTED: 1
E/BluetoothManagerService( 1317): IBluetooth.configHciSnoopLog return false
D/BluetoothManagerService( 1317): Message: 200
D/BluetoothManagerService( 1317): MESSAGE_GET_NAME_AND_ADDRESS
D/BluetoothManagerService( 1317): Message: 201
D/BluetoothManagerService( 1317): MESSAGE_SAVE_NAME_AND_ADDRESS
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_ON
D/BluetoothAdapterProperties( 2694): Setting state to 11
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 10-> 11
D/BluetoothBondStateMachine( 2694): make
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
I/BluetoothAdapterState( 2694): Entering PendingCommandState State: isTurningOn()=true, isTurningOff()=false
D/HeadsetService( 2694): Received start request. Starting profile...
I/BluetoothHeadsetServiceJni( 2694): classInitNative: succeeds
D/HeadsetStateMachine( 2694): make
I/BluetoothBondStateMachine( 2694): StableState(): Entering Off State
D/HeadsetStateMachine( 2694): max_hf_connections = 1
E/BluetoothHeadsetServiceJni( 2694): Bluetooth module is not loaded
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
D/BluetoothA2dp( 1757): Proxy object connected
D/BluetoothA2dp( 1317): Proxy object connected
D/BluetoothAdapter( 1317): 496867986: getState() :  mService = null. Returning STATE_OFF
D/A2dpService( 2694): Received start request. Starting profile...
I/BluetoothAvrcpServiceJni( 2694): classInitNative: succeeds
E/BluetoothAvrcpServiceJni( 2694): Bluetooth module is not loaded
D/HeadsetStateMachine( 2694): Enter Disconnected: -2, size: 0
E/RemoteController( 2694): Cannot set synchronization mode on an unregistered RemoteController
I/BluetoothA2dpServiceJni( 2694): classInitNative: succeeds
D/A2dpStateMachine( 2694): make
E/BluetoothA2dpServiceJni( 2694): Bluetooth module is not loaded
I/BluetoothHidServiceJni( 2694): classInitNative: succeeds
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
D/BluetoothInputDevice( 1757): Proxy object connected
D/HidService( 2694): Received start request. Starting profile...
E/BluetoothHidServiceJni( 2694): Bluetooth module is not loaded
I/BluetoothHealthServiceJni( 2694): classInitNative: succeeds
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
D/HealthService( 2694): Received start request. Starting profile...
D/A2dpStateMachine( 2694): Enter Disconnected: -2
E/BluetoothHealthServiceJni( 2694): Bluetooth module is not loaded
I/BluetoothPanServiceJni( 2694): classInitNative(L105): succeeds
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
D/BluetoothPan( 1757): BluetoothPAN Proxy object connected
D/PanService( 2694): Received start request. Starting profile...
D/BluetoothPanServiceJni( 2694): initializeNative(L110): pan
E/BluetoothPanServiceJni( 2694): ## ERROR : initializeNative(L115): Bluetooth module is not loaded##
I/BtGatt.JNI( 2694): classInitNative(L873): classInitNative: Success!
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
D/BtGatt.DebugUtils( 2694): handleDebugAction() action=null
D/BtGatt.GattService( 2694): Received start request. Starting profile...
D/BtGatt.GattService( 2694): start()
E/BtGatt.JNI( 2694): ERROR: initializeNative(L883): Bluetooth module is not loaded##
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
D/BtGatt.AdvertiseManager( 2694): advertise manager created
D/BluetoothAdapterService( 2694): getAdapterService() - returning com.android.bluetooth.btservice.AdapterService@54a3b9c
D/BluetoothMap( 1757): Proxy object connected
D/BluetoothMapService( 2694): Received start request. Starting profile...
D/BluetoothMapService( 2694): start()
D/BluetoothMapEmailSettingsLoader( 2694): Found 0 applications
D/BluetoothMapEmailAppObserver( 2694): createReceiver()
D/BluetoothMapEmailAppObserver( 2694): initObservers()
D/BluetoothMapEmailAppObserver( 2694): getEnabledAccountItems()
D/HeadsetStateMachine( 2694): Proxy object connected
D/HeadsetStateMachine( 2694): Disconnected process message: 10, size: 0
D/BluetoothAdapterState( 2694): CURRENT_STATE=PENDING, MESSAGE = STARTED, isTurningOn=true, isTurningOff=false
E/BluetoothAdapterState( 2694): Error while turning Bluetooth On
D/BluetoothAdapterProperties( 2694): Setting state to 10
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 11-> 10
I/BluetoothAdapterState( 2694): Entering OffState
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.c2dm.intent.REGISTER pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService (has extras) } com.google.android.c2dm.intent.REGISTER
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
W/YouTube ( 2613): (unknown) Could not register with GCM: 
W/YouTube ( 2613): java.io.IOException: AUTHENTICATION_FAILED
W/YouTube ( 2613): 	at eom.a(Unknown Source)
W/YouTube ( 2613): 	at kek.run(SourceFile:2038)
W/YouTube ( 2613): 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:422)
W/YouTube ( 2613): 	at java.util.concurrent.FutureTask.run(FutureTask.java:237)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:152)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:265)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
W/YouTube ( 2613): 	at gzp.run(SourceFile:40)
W/YouTube ( 2613): 	at java.lang.Thread.run(Thread.java:818)
W/MplexGcmListener( 2613): GCM error: AUTHENTICATION_FAILED
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): EvaluatingState{ when=-5ms what=532486 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): Checking http://connectivitycheck.android.com/generate_204 on 52:54:00:12:34:56
I/iu.UploadsManager( 2098): End new media; added: 0, uploading: 0, time: 13 ms
E/BluetoothManagerService( 1317): waitForOnOff time out
D/BluetoothManagerService( 1317): Retrying name/address remote retrieval and save.....Retry count =1
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_OFF
D/BluetoothManagerService( 1317): Message: 201
D/BluetoothManagerService( 1317): MESSAGE_SAVE_NAME_AND_ADDRESS
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_ON
D/BluetoothAdapterProperties( 2694): Setting state to 11
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 10-> 11
D/BluetoothBondStateMachine( 2694): make
I/BluetoothAdapterState( 2694): Entering PendingCommandState State: isTurningOn()=true, isTurningOff()=false
D/BluetoothAdapterState( 2694): CURRENT_STATE=PENDING, MESSAGE = STARTED, isTurningOn=true, isTurningOff=false
E/BluetoothAdapterState( 2694): Error while turning Bluetooth On
D/BluetoothAdapterProperties( 2694): Setting state to 10
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 11-> 10
I/BluetoothAdapterState( 2694): Entering OffState
I/BluetoothBondStateMachine( 2694): StableState(): Entering Off State
I/ActivityManager( 1317): Waited long enough for: ServiceRecord{8eec7be u0 com.android.calendar/.alerts.InitAlarmsService}
E/BluetoothManagerService( 1317): waitForOnOff time out
D/BluetoothManagerService( 1317): Retrying name/address remote retrieval and save.....Retry count =2
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_OFF
D/DownloadManager( 2126): [1] Finished with status SUCCESS
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.vision from APK com.google.android.gms
I/Vision  ( 2098): Supported ABIS: [x86, armeabi-v7a, armeabi]
I/ActivityManager( 1317): Killing 2979:com.android.camera2/u0a28 (adj 15): empty #17
D/ChimeraCfgMgr( 2098): Loading module com.google.android.gms.vision from APK com.google.android.gms
D/BluetoothManagerService( 1317): Message: 201
D/BluetoothManagerService( 1317): MESSAGE_SAVE_NAME_AND_ADDRESS
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_ON
D/BluetoothAdapterProperties( 2694): Setting state to 11
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 10-> 11
D/BluetoothBondStateMachine( 2694): make
I/BluetoothAdapterState( 2694): Entering PendingCommandState State: isTurningOn()=true, isTurningOff()=false
D/BluetoothAdapterState( 2694): CURRENT_STATE=PENDING, MESSAGE = STARTED, isTurningOn=true, isTurningOff=false
E/BluetoothAdapterState( 2694): Error while turning Bluetooth On
D/BluetoothAdapterProperties( 2694): Setting state to 10
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 11-> 10
I/BluetoothAdapterState( 2694): Entering OffState
I/BluetoothBondStateMachine( 2694): StableState(): Entering Off State
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
I/CheckinService( 2098): Done disabling old GoogleServicesFramework version
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.gsf
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.gsf flg=0x4000010 (has extras) }
I/PeopleContactsSync( 2098): CP2 sync disabled
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
E/BluetoothManagerService( 1317): waitForOnOff time out
D/BluetoothManagerService( 1317): Retrying name/address remote retrieval and save.....Retry count =3
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_OFF
D/BluetoothManagerService( 1317): Message: 201
D/BluetoothManagerService( 1317): MESSAGE_SAVE_NAME_AND_ADDRESS
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_ON
D/BluetoothAdapterProperties( 2694): Setting state to 11
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 10-> 11
D/BluetoothBondStateMachine( 2694): make
I/BluetoothAdapterState( 2694): Entering PendingCommandState State: isTurningOn()=true, isTurningOff()=false
D/BluetoothAdapterState( 2694): CURRENT_STATE=PENDING, MESSAGE = STARTED, isTurningOn=true, isTurningOff=false
E/BluetoothAdapterState( 2694): Error while turning Bluetooth On
D/BluetoothAdapterProperties( 2694): Setting state to 10
I/BluetoothAdapterState( 2694): Bluetooth adapter state changed: 11-> 10
I/BluetoothAdapterState( 2694): Entering OffState
I/BluetoothBondStateMachine( 2694): StableState(): Entering Off State
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): Probably not a portal: exception java.net.SocketTimeoutException: failed to connect to connectivitycheck.android.com/216.58.221.238 (port 80) after 10000ms
E/BluetoothManagerService( 1317): waitForOnOff time out
W/BluetoothManagerService( 1317): Maximum name/address remote retrieval retry exceeded
D/BluetoothAdapterState( 2694): CURRENT_STATE=OFF, MESSAGE = USER_TURN_OFF
D/BluetoothManagerService( 1317): unbindAndFinish(): android.bluetooth.IBluetooth$Stub$Proxy@1e44f4fa mBinding = false
D/BluetoothManagerService( 1317): Sending unbind request.
I/art     ( 2694): System.exit called, status: 0
I/AndroidRuntime( 2694): VM exiting with result code 0, cleanup skipped.
D/BluetoothMap( 1757): Proxy object disconnected
D/BluetoothA2dp( 1757): Proxy object disconnected
D/BluetoothInputDevice( 1757): Proxy object disconnected
D/BluetoothPan( 1757): BluetoothPAN Proxy object disconnected
D/BluetoothA2dp( 1317): Proxy object disconnected
I/ActivityManager( 1317): Process com.android.bluetooth (pid 2694) has died
W/ActivityManager( 1317): Scheduling restart of crashed service com.android.bluetooth/.map.BluetoothMapService in 1000ms
W/ActivityManager( 1317): Scheduling restart of crashed service com.android.bluetooth/.hdp.HealthService in 1000ms
W/ActivityManager( 1317): Scheduling restart of crashed service com.android.bluetooth/.pan.PanService in 1000ms
W/ActivityManager( 1317): Scheduling restart of crashed service com.android.bluetooth/.gatt.GattService in 1000ms
W/ActivityManager( 1317): Scheduling restart of crashed service com.android.bluetooth/.a2dp.A2dpService in 1000ms
W/ActivityManager( 1317): Scheduling restart of crashed service com.android.bluetooth/.hid.HidService in 1000ms
W/ActivityManager( 1317): Scheduling restart of crashed service com.android.bluetooth/.hfp.HeadsetService in 1000ms
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.c2dm.intent.REGISTER pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService (has extras) } com.google.android.c2dm.intent.REGISTER
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
W/YouTube ( 2613): (unknown) Could not register with GCM: 
W/YouTube ( 2613): java.io.IOException: AUTHENTICATION_FAILED
W/YouTube ( 2613): 	at eom.a(Unknown Source)
W/YouTube ( 2613): 	at kek.run(SourceFile:2038)
W/YouTube ( 2613): 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:422)
W/YouTube ( 2613): 	at java.util.concurrent.FutureTask.run(FutureTask.java:237)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:152)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:265)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
W/YouTube ( 2613): 	at gzp.run(SourceFile:40)
W/YouTube ( 2613): 	at java.lang.Thread.run(Thread.java:818)
W/MplexGcmListener( 2613): GCM error: AUTHENTICATION_FAILED
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): EvaluatingState{ when=-5ms what=532486 arg1=3 target=com.android.internal.util.StateMachine$SmHandler }
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): Checking http://connectivitycheck.android.com/generate_204 on 52:54:00:12:34:56
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
D/SettingsProvider( 1317): User 0 external modification to /data/data/com.android.providers.settings/databases/settings.db; event=2
D/SettingsProvider( 1317): User 0 updating our caches for /data/data/com.android.providers.settings/databases/settings.db
I/InputReader( 1317): Reconfiguring input devices.  changes=0x00000010
W/Launcher( 2583): setApplicationContext called twice! old=com.android.launcher3.LauncherApplication@13355f0f new=com.android.launcher3.LauncherApplication@13355f0f
D/BackupManagerService( 1317): Received broadcast Intent { act=android.intent.action.PACKAGE_CHANGED dat=package:com.google.android.gsf flg=0x4000010 (has extras) }
D/PackageBroadcastService( 2098): Received broadcast action=android.intent.action.PACKAGE_CHANGED and uri=com.google.android.gsf
W/Launcher.Model( 2583): Nobody to tell about the new app.  Launcher is probably loading.
I/PeopleContactsSync( 2098): CP2 sync disabled
I/dex2oat ( 3211): /system/bin/dex2oat --runtime-arg -classpath --runtime-arg  --instruction-set=x86 --instruction-set-features=default --runtime-arg -Xrelocate --boot-image=/system/framework/boot.art --dex-file=/data/data/com.google.android.gms/app_fb/f.apk --oat-fd=22 --oat-location=/data/data/com.google.android.gms/app_fb/f.dex --runtime-arg -Xms64m --runtime-arg -Xmx512m
I/dex2oat ( 3211): dex2oat took 7.424ms (threads: 1) arena alloc=25KB java alloc=18KB native alloc=537KB free=3MB
I/CheckinRequestBuilder( 2098): Classify the device as Tablet.
D/InitAlarmsService( 2248): Clearing and rescheduling alarms.
I/ActivityManager( 1317): Killing 2996:com.google.android.configupdater/u0a31 (adj 15): empty #17
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
I/ActivityManager( 1317): Killing 2317:com.android.deskclock/u0a32 (adj 15): empty #17
D/NetworkMonitor/NetworkAgentInfo [Ethernet () - 100]( 1317): Probably not a portal: exception java.net.SocketTimeoutException: failed to connect to connectivitycheck.android.com/216.58.221.238 (port 80) after 10000ms
D/ConnectivityService( 1317): setProvNotificationVisibleIntent: E visible=false networkType=0 extraInfo=null
D/GCM     ( 2062): GcmService start Intent { act=com.google.android.c2dm.intent.REGISTER pkg=com.google.android.gms cmp=com.google.android.gms/.gcm.GcmService (has extras) } com.google.android.c2dm.intent.REGISTER
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
W/YouTube ( 2613): (unknown) Could not register with GCM: 
W/YouTube ( 2613): java.io.IOException: AUTHENTICATION_FAILED
W/YouTube ( 2613): 	at eom.a(Unknown Source)
W/YouTube ( 2613): 	at kek.run(SourceFile:2038)
W/YouTube ( 2613): 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:422)
W/YouTube ( 2613): 	at java.util.concurrent.FutureTask.run(FutureTask.java:237)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:152)
W/YouTube ( 2613): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:265)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
W/YouTube ( 2613): 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
W/YouTube ( 2613): 	at gzp.run(SourceFile:40)
W/YouTube ( 2613): 	at java.lang.Thread.run(Thread.java:818)
W/MplexGcmListener( 2613): GCM error: AUTHENTICATION_FAILED
I/ActivityManager( 1317): Waited long enough for: ServiceRecord{1338eabd u0 com.google.android.youtube/com.google.android.libraries.youtube.common.gcore.gcoreclient.gcm.impl.GcmTaskServiceDelegator}
E/YouTube ( 2613): (unknown) Could not do device auth handshake: ExecutionException - org.apache.http.conn.ConnectTimeoutException: Connect to /216.58.221.106:443 timed out
I/TextToSpeech( 2039): Set up connection to ComponentInfo{com.svox.pico/com.svox.pico.PicoService}
D/Finsky  ( 2417): [1] DailyHygiene.onStartCommand: DailyHygiene holdoff continue
D/Volley  ( 2098): [1] Request.finish: 60394 ms: [ ] https://www.google.com/ads/preferences/mobile_view?sig=TXhJ669ce6y8ETrFAg4hrDMiU3HcOJbONbLbuTQzIIyH7AE6aAZ_-HM7dyFA6zfJOI5lqyz6k94nYclvrc7BAsdJLE-1XQm1lu1GnJRAfYYgk-AJcQyVrY9PtKIlEop0yt4jcQ_ylDN_oM_nKgJqN4BCOjrYPiTuhRCAld-sC7Vgdq4fLOP9EI1KLffg20rWAw4rNFU4mEXkgOXvP9-mmQvoHoNoTAzUI3CZdPv2E04KvHMszuEH-i6RB0THP8mYSvCh8CLd4LekrHH1OtEDiDgtPn0yPnqfLK2xg8d2G4FEAajyIndeLf1gn_qY7vSdLcI__rhuHkUzx0agck6D3g&vv=2 0xd61ac103 NORMAL 2
D/Volley  ( 2098): [1] Request.finish: 60425 ms: [ ] https://www.google.com/ads/preferences/mobile_view?sig=oSVBivwkqdlL74atAzRum5FY1htbAgvA1EpT03p6nnVU9zfYL1g0r1m2M4UcqaoBCPzipR9-psNtTN5HDvZKwR6vqw_sx_d9uVR0Ki4aQig5bx8wipgv33mP0sCVYGbpqwMWYw5VQSBU88AZHu1-StYHFymEojsSxY3b1U_DpaLuZzLtFLcshmTnROJUFuLUAfu6V6uWgk1iR7vFeADSHGJ4da4eZWr9sNwOv_dYLXndtAmpdEZap2ZiT2DFC0RROKhccu8ifaV3ePk9Htb-LCcBYcolXmNBCQlfptBLCfq8IAnUk4FNHD9RrdovndXmy8yv7xdaQ2XaL7ThcGLgww&vv=2 0xd61ac103 NORMAL 1
D/Volley  ( 2098): [1] Request.finish: 60102 ms: [ ] https://www.google.com/ads/preferences/mobile_view?sig=mwZxq5x6au-UGAW2dE0dR6lrqDPJDWPiE99-tCKYWdzec7ZKHAz5qCp7fN-6UjfewmV6_jso2as4oFVDAoo7L-oo6-qzHpoqVqguZ1WhOSZFVIdtoFTL0B-gRFyC1oXV0lYvlz8JWAlEDZLF--s0-fqTpc29_3f1PnmZMUsyoN2H4u1loHnk7L7HbEF_tK5y-nrwJSlX3OYIurDCdFsJFglHzd5YFDfPX1BfZ-cMM1BZstJ8ZmLBah3pZGQGY9A_oy_ahqZHNfs_XTmJDjT_GKnB_fg6sfB6rLIKBPTye-Yt9jnUEAbr5up34HFFB3_TnEl6cpKSMuFbDFesp3db-Q&vv=2 0xd61ac103 NORMAL 4
D/Volley  ( 2098): [1] Request.finish: 60107 ms: [ ] https://www.google.com/ads/preferences/mobile_view?sig=1HgmEuof6BMVNBl1sKuFobVjgdwxI_hG9B8UEHpjGuvqJu9bC8adqj0YD4An6L4Zgbnuzof6GYuVmHyUDL6qQk3_5cLdtxZiHVhKc8UPGH4j9PMNDib1JssuUGr606-tL2TjqynW7B8ETBg8sqhp8JUn3-gdwXw9NdZ-iBsbKT9Rkvzuwz7xuCz-a7IbKhEU5LoVmDACnH-0NEVxTaLMzZK0Rr-69jqilCFzQSeeCXynZWjsXrtGkhgeie2sYMWObx3DyFgVGeRfn6_AV-c6RD0R9cKHRnS61TeBoob6BGDGP0ZoHcHdijeCVw-jAsyWmGRxsbOe8Ly1lSmPl3wO3Q&vv=2 0xd61ac103 NORMAL 3
E/YouTube ( 2613): (unknown) Could not do device auth handshake: ExecutionException - org.apache.http.conn.ConnectTimeoutException: Connect to /216.58.221.234:443 timed out
E/GCM     ( 2062): Missing checkin config file
W/GCM     ( 2062): GCM FAILED TO INITIALIZE - missing checkin
D/GetConfigurationSnapshotOperation( 2062): no corresponding serverToken: com.google.android.gms.playlog.uploader, 1, 
I/PhenotypeFlagCommitter( 2062): Experiment Configs successfully retrieved for com.google.android.gms.playlog.uploader
I/GoogleURLConnFactory( 2062): Using platform SSLCertificateSocketFactory
D/GetCommittedConfigurationOperation( 2062): no corresponding serverToken: com.google.android.gms.playlog.uploader
I/ActivityManager( 1317): Waited long enough for: ServiceRecord{111334b0 u0 com.google.android.gms/.playlog.uploader.UploaderService}
E/YouTube ( 2613): (unknown) Could not do device auth handshake: ExecutionException - org.apache.http.conn.ConnectTimeoutException: Connect to /216.58.221.234:443 timed out
E/YouTube ( 2613): (unknown) Could not do device auth handshake: ExecutionException - org.apache.http.conn.ConnectTimeoutException: Connect to /216.58.221.234:443 timed out
I/PowerManagerService( 1317): Going to sleep due to screen timeout (uid 1000)...
D/KbdSensor( 1317): poll_activate: dev=0xb3c51a80 handle=0 enabled=0
I/WifiNative-HAL( 1317): startHal
E/wifi    ( 1317): getStaticLongField sWifiHalHandle 0xa051d88c
D/wifi    ( 1317): halHandle = 0x0, mVM = 0xb3c4d280, mCls = 0x184a
I/WifiNative-HAL( 1317): Could not start hal
E/WifiStateMachine( 1317): cancelDelayedScan -> 1
D/BlueZ   ( 1105): external/bluetooth/bluez/android/hal-audio.c:audio_set_parameters() 
```
I/PowerManagerService( 1317): Sleeping (uid 1000)...
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
