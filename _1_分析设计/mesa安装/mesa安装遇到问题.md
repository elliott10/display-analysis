##Mesa安装

###遇到问题

- **问题一 mesasdk无法被识别**
	- 由于起初mesasdk解压到系统盘、mesa源代码放在用户盘。install mesa就必须要root，不然就会报没有权限错误。
	- 尝试将mesasdk移动到用户盘，强制chmod仍然报错，好像是因为改动权限影响编译。
	- 建议直接解压mesasdk、mesa到home目录或者下级目录下。
- **问题二 配置出错，nse模块无法编译通过**
	- 安装期间 虚拟机为由单核改成双核，而OMP_NUM_THREADS依然设置为1，编译到nse直接失败停止。没有有意义弹出错误提示，最后发现配置出了问题。
```sh
		###mesa 配置，添加到 ~/.bashrc or ~/.profile
	export MESA_DIR=/home/umicx/mesa-r8118 //mesa目录
	export OMP_NUM_THREADS=2 //电脑或虚拟机cpu数量
	export MESASDK_ROOT=~/mesasdk // sdk目录
	source $MESASDK_ROOT/bin/mesasdk_init.sh
```
- **问题三 mesasdk 忘记添加依赖包**
	-  建议执行install 执行
```sh 
	sudo apt-get install binutils make perl libx11-dev zlib1g tcsh
```