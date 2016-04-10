# 调研报告：Ubuntu显示子系统初始化过程及设置
## 1. Ubuntu显示子系统的初始化流程
&emsp;&emsp;当先的Linux发行版以及Mac系统都使用的是X Window System，X Windwow System是Unix/Linux下面的窗口系统，它是基于Server/Client架构的一种规范，有多不同的实现，在Linux系统下最流行的是Xorg和XFree86。本次所调研的Ubuntu系统所使用的就是Xorg。<br>
&emsp;&emsp;Ubuntu下的X Window System为Xorg，其显示系统的初始化过程主要由X server来完成，大体流程为：Ubuntu系统首先启动init进程，init进程调用显示管理器，Ubuntu系统下的显示管理器之前为xdm，现在已经改为了lightdm，之后由显示管理器lightdm来启动X server，最后由X server来完成显示系统的初始化，包括屏幕的分辨率设置、界面显示的方位设置等等。

## 2. X server完成显示系统初始化的过程
&emsp;&emsp;在之前的Ubuntu系统版本中，X server首先是要读配置文件xorg.conf来进行显示系统的初始化，该文件的位置为/etc/X11/xorg.conf。但大概在Ubuntu 8.0版本之后，该文件就被取消，X server会在启动的时候**自动检测硬件**，然后生成一个内置的配置，借此来完成显示系统的初始化。尽管如此，我们仍然可以自己创建一个配置文件xorg.conf，使系统按照配置文件里面的参数来完成初始化。<br>
&emsp;&emsp;下面进行实验，通过创建xorg.conf配置文件来修改系统的显示设置。


## 3. 通过创建xorg.conf文件来修改系统显示设置
① 查看当前系统的屏幕分辨率等相关信息，在终端中输入如下命令：
<pre><code>xrandr</code></pre>
显示如下：
<pre><code>Screen 0: minimum 1 x 1, current 1440 x 900, maximum 8192 x 8192
Virtual1 connected primary 1440x900+0+0 (normal left inverted right x axis y axis) 0mm x 0mm
   1440x900      60.00*+  59.89  
   2560x1600     59.99  
   1920x1440     60.00  
   1856x1392     60.00  
   1792x1344     60.00  
   1920x1200     59.88  
   1600x1200     60.00  
   1680x1050     59.95  
   1400x1050     59.98  
   1280x1024     60.02  
   1280x960      60.00  
   1360x768      60.02  
   1280x800      59.81  
   1152x864      75.00  
   1280x768      59.87  
   1024x768      60.00  
   800x600       60.32  
   640x480       59.94  
</code></pre>
这表示当前分辨率和默认分辨率都是1440x900。<br>
② 在/etc/X11/目录下创建配置文件xorg.conf
<pre><code> sudo touch xorg.conf</code></pre>
更改其内容：
<pre><code>Section "Device"
    Identifier    "Configured Video Device"
EndSection

Section "Monitor"
    Identifier    "Configured Monitor"
EndSection

Section "Screen"
    Identifier    "Default Screen"
    Monitor        "Configured Monitor"
    Device        "Configured Video Device"
    SubSection "Display"
    Modes "800x600"
    EndSubSection
EndSection</code></pre>
通过修改配置文件，将系统的默认分辨率变为800x600。<br>
③ 重新启动系统，查看实验结果，其显示信息为：
<pre><code>Screen 0: minimum 1 x 1, current 800 x 600, maximum 8192 x 8192
Virtual1 connected primary 800x600+0+0 (normal left inverted right x axis y axis) 0mm x 0mm
   800x600       60.00*+  60.32  
   2560x1600     59.99  
   1920x1440     60.00  
   1856x1392     60.00  
   1792x1344     60.00  
   1920x1200     59.88  
   1600x1200     60.00  
   1680x1050     59.95  
   1400x1050     59.98  
   1280x1024     60.02  
   1440x900      59.89  
   1280x960      60.00  
   1360x768      60.02  
   1280x800      59.81  
   1152x864      75.00  
   1280x768      59.87  
   1024x768      60.00  
   640x480       59.94  </code></pre>
   可以看到，当前的屏幕分辨率和默认分辨率都已经更改为800x600。<br>
   ④ 删除配置文件xorg.conf之后，系统恢复到之前的默认分辨率。

## 4. 总结
&emsp;&emsp;Linux发行版的显示系统的初始化以及显示设置的改变都要通过X server来进行。<br>
&emsp;&emsp;在之前的各个版本的Linux发行版中，都有一个X server的配置文件xorg.conf，当系统启动时，X server根据该配置文件进行初始化，但现在的版本中已经逐渐淘汰了这种方式。<br>
&emsp;&emsp;在现在的版本中，当系统启动时，若没有发现配置文件，X server将在启动的时候自动检测硬件，生成一个内置的配置，里面包含当前自动检测出的配置。我们可以通过手动编写xorg.conf的方式来设置显示系统的配置。
