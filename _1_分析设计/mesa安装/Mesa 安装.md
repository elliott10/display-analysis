# Mesa 安装教程
Mesa 安装可以到这个网址查看[http://mesa.sourceforge.net/],以下是mesa安装的前期工作和简单步骤,目前mesa只能运行在linux和Mac系统中，本教程是在Linux上安装Mesa

## 首先需要安装和配置好安装和运行mesa需要的环境
1. 到这个[http://www.astro.wisc.edu/~townsend/static.php?ref=mesasdk]网站下载mesasdk,
2. 并在~/.profile 添加内容
```sh
# you should have done this when you set up the MESA SDK
export MESASDK_ROOT=/Applications/mesasdk
source $MESASDK_ROOT/bin/mesasdk_init.sh
```
其中目录根据自己真实情况更改，配置完成后，在命令行中再次运行这个命令那么在当前系统中就配置完成了，添加到.profile文件中是为了系统以后每次登陆后都自动运行这两行命令

配置完成后运行
```sh
gfortran --version
```

若在输出的前几行出现
```
GNU Fortran (GCC) 4.9.2 20141023 (prerelease)
```
那么就代表前期的配置工作完成了

## 安装Mesa
1. 在mesa官网中下载最新的Mesa
2. 在.profile文件中添加
```sh
# set MESA_DIR to be the directory to which you downloaded MESA
export MESA_DIR=/Users/jschwab/Software/mesa-r8118

# set OMP_NUM_THREADS to be the number of cores on your machine
export OMP_NUM_THREADS=2
```
在命令行同样运行这两条命令，其中的目录根据个人目录来更改，接下来就安装了
```sh
cd $MESA_DIR
./install
```

若安装失败看看是否是缺少了一些系统库，本人在第一次安装时就出错了，就是少了一些系统库，安装一些就可以了比如：libz.so、libx11.so等库
