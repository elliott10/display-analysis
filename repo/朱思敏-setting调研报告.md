#屏幕旋转调研报告

##屏幕方向部分
    功能：横向，纵向，横向(翻转)，纵向(翻转)
### 调研结果：<br>
####安卓自带的方面
    安卓自带的屏幕旋转效果只是针对软件，系统屏幕没有转变。但是可以给我们实现系统旋转时参考 
    旋转函数：  void setRequestedOrientation(int requestedOrientation); 
    参数取值： 
     1.landscape：横屏(风景照) ，显示时宽度大于高度；  

     2.portrait：竖屏 (肖像照) ， 显示时 高 度大于 宽 度 ；  

     3.user：用户当前的首选方向；  

     4.behind：继承Activity堆栈中当前Activity下面的那个Activity的方向；  

     5.sensor：由物理感应器决定显示方向，它取决于用户如何持有设备，当 设备 被旋转时方向会随之变化——在横屏与竖屏之间；  

     6.nosensor：忽略物理感应器——即显示方向与物理感应器无关，不管用户如何旋转设备显示方向都不会随着改变("unspecified"设置除外)；  

     7.unspecified ：未指定，此为默认值，由Android系统自己选择适当的方向，选择策略视具体设备的配置情况而定，因此不同的设备会有不同的方向选择；





####论坛看见的一个方法(没有实验过，不知道是否正确)
直接修改源码的一个文件的数据即可！（方法如下：）
修改\frameworks\base\policy\src\com\android\internal\policy\impl\PhoneWindowManager.java 

        if (preferredRotation >= 0 && sensorChanged) {
            return preferredRotation;
        }
        if(SystemProperties.getInt("ro.sf.hwrotation",0)==270)
        {
            return  Surface.ROTATION_90;
        }
        else
        {
        //return  Surface.ROTATION_0;
            return  Surface.ROTATION_270;---->此处表示竖屏
        }
         


#屏幕分辨率调研
    功能：用户可以查看当前系统爆发力，并且可以通过点击来改变屏幕分辨率
###调研结果：
####Android自带的方面
android自带有获取屏幕分辨率的函数，没有直接设置屏幕分辨率的函数。不过存在
通过工具改变分辨率的方法：修改ystem目录下的build.prop文件，然后通过adb工具修改。
####windows API 设置屏幕分辨率

   调用windows API步骤：<br>
1.定义DEVMODE结构体变量

	DEVMODE NewDevMode; //DEVMODE是个结构体

2.调用EnumDisplaySettings 获取DEVMODE成员的值

       //EnumDisplaySettings函数得到显示设备的一个图形模式设备，
       //通过对该函数一系列的调用可以得到显示设备所有的图形模式信息。
	    EnumDisplaySettings(0, ENUM_CURRENT_SETTINGS, &NewDevMode); 													
	此时就获取到了当前屏幕的分辨率：
		cout <<"当前系统刷新率"<< NewDevMode.dmDisplayFrequency<<"HZ"<<endl;
		cout << "当前屏幕分辨率" << NewDevMode.dmPelsWidth<<" "<<NewDevMode.dmPelsHeight<<endl;

3.修改DEVMODE的成员变量,用ChangeDisplaySettings设置新的分辨率

	NewDevMode.dmFields = DM_PELSWIDTH | DM_PELSHEIGHT;
	NewDevMode.dmPelsWidth = 800;
	NewDevMode.dmPelsHeight = 600;
	调用ChangeDisplaySettings：
	ChangeDisplaySettings(&NewDevMode, 0));

函数原型：

    LONG ChangeDisplaySettings (LPDEVMODE lpDevMode, DWORD dwflags)；
    
	参数：lpDevMode：指向一个描述转变图表的DEVMODE的指针。dwflags：表明了图形模式如何改变。


#屏幕扩展部分
参考如下博客：
http://bernoulli.iteye.com/blog/2047632
