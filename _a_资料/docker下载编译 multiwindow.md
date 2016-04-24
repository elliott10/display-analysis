# 配置环境下载multiwindow
- 请看 [android-x86 代码托管服务器] 这个文档
# 编译multiwindow
- 运行以下命令
```
source build/envsetup.sh
lunch android_x86_64-eng
make -j10 iso_img
```
就会在out目录中生成iso文件
# 运行
## 真机运行
- 一种方式可以直接使用dd命令写入到U盘中运行，但是要在docker中添加一个库，这个后期补充
- 另一种方式使用uefi的模式运行，使用工具 rufus
## 虚拟机运行
安装qemu运行以下命令
```
qemu-system-x86_64 --enable-kvm -m 1024 -cdrom ./android_x86_64.iso -redir tcp:5555::5555 &
```
