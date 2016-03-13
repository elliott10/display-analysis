# Mesa 安装教程
由于之前的mesa安装的教程安装后的mesa是发行版的，没有源码可以看，跟我们的研究有冲突，所以重新编译源码进行安装
Mesa 安装可以到这个网址查看[http://www.mesa3d.org/],以下是mesa安装的前期工作和简单步骤

## 首先需要安装和配置好安装和运行mesa需要的环境
- 运行下面命令来安装mesa必要的一些库
```
sudo apt-get install libdrm2 libgles1-mesa libudev1 libxft-dev x11proto-dri2-dev xutils-dev libdrm-dev xcb libx11-xcb-dev libxcb-glx0 libxcb-glx0-dev xorg-dev libxcb-dri2-0-dev x11proto-dri3-dev flex bison libegl1-mesa-dev libgles1-mesa-dev libgles2-mesa-dev libudev-dev libdrm-dev libxcb-xfixes0 libxcb-xfixes0-dev llvm g++ libva-dev libglewmx1.6-dev
```
- libdrm相关的依赖库，很多都是2.4.64版本的，但是最新的mesa需要2.4.66版本的，但是很多Linux机中由于安装源的原因无法更新到最新版本，所以这个要自己下载最新版
- 下载最新的glew 和 glu包来编译安装，如果没有安装glew是无法编译安装glu的，glu在官网的ftp中可以下载
- 安装GLUT
'''
sudo apt-get install libglut-dev
注意在这一步的时候，可能会出现以下情况：
shell提示：正在读取软件包列表... 完成
    　正在分析软件包的依赖关系树       
    　正在读取状态信息... 完成       
    　E: 未发现软件包 libglut-dev
如果出现上述情况，请输入将上述　sudo apt-get install libglut-dev
　　　　　　　　　命令改成sudo apt-get install freeglut3-dev就行拉，
设定编译参数与编译
'''

## 安装Mesa

# 编译自己的例子
```
gcc 1.c -o mydemo `pkg-config --cflags --libs freeglut` -L/usr/local/lib/ -lm -lX11 -lXrandr -lXi -lXxf86vm -lGL -lGLEW
```

