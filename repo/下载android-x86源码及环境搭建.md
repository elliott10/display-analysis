# 下载android-x86源码及环境搭建

- 1、	Xshell连接对方服务器 192.168.0.180

  进入docker：

  使用 ssh xie@192.168.0.180  输入密码：xiejun 进入服务之后 自己的工作目录为自己的名字全称：
 
 使用sudo docker start -ai yukang-5.1进入docker环境之后，docker中的虚拟目录var/yukang 为对应外面宿主机的以自己名字命名的目录；再此目录下进行代码下载以及相关的编译操作，其他目录不要操作.
 


 一切操作都是在该目录下：/var/yukang/

- 2、在该目录下更新系统

 ```sh
 
  root@bcac7c6441b0:/var/yukang/android/# apt-get update；
 
 ```


- 3.更新结束后：

 1、  安装软件包（两条命令一起执行）：

 ```sh

 sudo apt-get install -y git-core gnupg flex bison gperf build-essential zip curl libc6-dev libncurses5-dev x11proto-core-dev libx11-dev libreadline6-dev libgl1-mesa-dev g++-multilib mingw32 schedtool tofrodos python-markdown pngquant libxml2-utils xsltproc zlib1g-dev libxext-dev openjdk-7-jdk gettext bc mtools lib32z1 lib32ncurses5 lib32bz2-1.0 python-pip libyaml-dev python-dev squashfs-tools
 
  ```
 
 ```sh

       sudo pip install prettytable Mako pyaml dateutils --upgrade；
  
 ```


- 4、安装repo

 var/yukang下建立目录bin  
下载 repo 工具:


 ```sh  
 mkdir ./bin
PATH=./bin:$PATH
$ curl http://192.168.0.185/git-repo-downloads/repo > ./bin/repo
$ chmod a+x ./bin/repo    
 ```



- 5、获取Android-x86源码：

  ```sh
$ mkdir android-x86
$ cd android-x86
$ repo init -u git://192.168.0.185/lollipop-x86/manifest.git -b lollipop-x86
```

 ##注意 ：
 修改 .repo/manifest.xml 中网址将gitscm.sf.net/gitroot/android-x86/替换成/192.168.0.185/lollipop-x86/
 
 然后执行

 ```sh
     $ repo sync
  ```

 
- 6、搭建环境
 
 ```sh
Source build/envsetup.sh   //$ . build/envsetup.sh
```

 
 ```sh
$ lunch  //选择10  
```
## 	按提示选择相应数字（只实现了7-10）

 输入：7(开发版本)、8（可调试的用户版）、9（用户版）权限逐渐降低。
4、Then you can build by “make“ command:
```sh
$ make –j20 efi_img  OUT_DIR=/var/yoko
```
开启20线程，  保存路径/var/yoko，所需镜像路径：/home/lh/aosp/yoko/target/product/x86_64
