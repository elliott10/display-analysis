
###问题一，缺包
```sh
#!/bin/bash
#编译mesalib需要包
sudo apt-get install libudev1 libxft-dev x11proto-dri2-dev xutils-dev libdrm-dev xcb libx11-xcb-dev libxcb-glx0 libxcb-glx0-dev xorg-dev libxcb-dri2-0-dev x11proto-dri3-dev flex bison  libudev-dev libdrm-dev libxcb-xfixes0 libxcb-xfixes0-dev llvm g++ libva-dev
```

	mesa 安装完后安装 freeglut3 libglew-dev

###问题二，编译 .c 文件
	gcc *.c -L{包位置} -l{所需包} -L{包位置} -l{所需包}
	gcc bounce.c -L/usr/local/lib -lGLU -lGL  -lm -lglut 
	or
	gcc bounce.c `pkg-config --cflags --libs freeglut glew gl glu`-L/usr/local/lib -lm
###问题三 error while loading shared libraries: libglut.so.3: cannot open shared object file: No such file or directory. 无法打开该动态链接库。
在libglut的目录下执行
```sh
/usr/local/lib$ export LD_LIBRARY_PATH=${pwd}
/usr/local/lib$ export LD_DRIVERS_PATH=${pwd}
sudo ldconfig 
```
###问题四 glew （apt-get安装）删不干净，无法编译安装glew
```sh
	sudo apt-get remove libglew-dev
	sudo apt-get autoremove
```