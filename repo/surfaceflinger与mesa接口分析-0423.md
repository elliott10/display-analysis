## 一、启动总体过程：

>内核->init --> ServiceManager->Zygote进程->System进程->SurfaceFlinger::函数instantiate->启动SurfaceFlinger服务
->创建一个SurfaceFlinger实例->调用SurfaceFlinger::init()初始化->注册到Service Manager中-> SurfaceFlinger::run()调用过程中启动第三个开机画面。

## 二、surfaceflinger启动
在android4.4以后systemserver进程由init直接根据init.rc配置启动了surfaceflinger进程。
```sh
init.rc
	service surfaceflinger /system/bin/surfaceflinger  
	    class main  
	    user system  
	    group graphics drmrpc  
	    onrestart restart zygote  
```
>surfaceflinger进程的main函数，new一个SurfaceFlinger实例，跟着调用SurfaceFlinger类的init()函数完成后面工作，然后向service manager注册服务

frameworks/native/services/surfaceflinger/main_surfaceflinger.cpp
```sh
	int main(int argc, char** argv) {  
	....  
	  
	    // instantiate surfaceflinger  
	    sp<SurfaceFlinger> flinger = new SurfaceFlinger();//新实例  
	  
	...  
	  
	    // initialize before clients can connect  
	    flinger->init();//调用surfaceflinger的初始化函数  
	  
	    // publish surface flinger  
	    sp<IServiceManager> sm(defaultServiceManager());  
	    sm->addService(String16(SurfaceFlinger::getServiceName()), flinger, false);//向service manager注册服务  
	  
	    // run in this thread  
	    flinger->run();//开跑  
	  
	    return 0;  
	}
	
	```  
这个init()函数分成三个部分，第一硬件初始化，第二建立消息线程，第三启动开机动画。

```sh
	void SurfaceFlinger::init() {  
	    ALOGI(  "SurfaceFlinger's main thread ready to run. "  
	            "Initializing graphics H/W...");  
	  
	      
	.....  
	  
	    // initialize our non-virtual displays  
	    for (size_t i=0 ; i<DisplayDevice::NUM_BUILTIN_DISPLAY_TYPES ; i++) {  
	        DisplayDevice::DisplayType type((DisplayDevice::DisplayType)i);  
	        // set-up the displays that are already connected  
	        if (mHwc->isConnected(i) || type==DisplayDevice::DISPLAY_PRIMARY) {  
	            // All non-virtual displays are currently considered secure.  
	            bool isSecure = true;  
	            createBuiltinDisplayLocked(type);  
	            wp<IBinder> token = mBuiltinDisplays[i];  
	  
	            sp<BufferQueue> bq = new BufferQueue(new GraphicBufferAlloc());  
	            sp<FramebufferSurface> fbs = new FramebufferSurface(*mHwc, i, bq);  
	            sp<DisplayDevice> hw = new DisplayDevice(this,  
	                    type, allocateHwcDisplayId(type), isSecure, token,  
	                    fbs, bq,  
	                    mEGLConfig);  
	            if (i > DisplayDevice::DISPLAY_PRIMARY) {  
	                // FIXME: currently we don't get blank/unblank requests  
	                // for displays other than the main display, so we always  
	                // assume a connected display is unblanked.  
	                ALOGD("marking display %d as acquired/unblanked", i);  
	                hw->acquireScreen();  
	            }  
	            mDisplays.add(token, hw);  
	        }  
	    }  
	  
	...  
	    // start the EventThread  
	    ...  
	    mSFEventThread = new EventThread(sfVsyncSrc);  
	    mEventQueue.setEventThread(mSFEventThread);  
	  
	    mEventControlThread = new EventControlThread(this);  
	    mEventControlThread->run("EventControl", PRIORITY_URGENT_DISPLAY);  
	  
	...  
	  
	    // set initial conditions (e.g. unblank default device)  
	    initializeDisplays();  
	  
	    // start boot animation  
	    startBootAnim();  
	} 
	
``` 
最后调用run()函数，

	```sh
	void SurfaceFlinger::run() {  
	    do {  
	        waitForEvent();  
	    } while (true);  
	}  
    ```


## 三、surfaceflinger 与mesa接口分析
surfaceflinger启动后，
其中waitForEvent()是SurfaceFlinger中的成员函数，它进一步调用mEventQueue.waitMessage()

```sh
void SurfaceFlinger::waitForEvent() {
    mEventQueue.waitMessage();
}
```

```sh
void MessageQueue::waitMessage() {
    do {
       IPCThreadState::self()->flushCommands();
        int32_t ret =mLooper->pollOnce(-1);
        switch (ret) {
            caseALOOPER_POLL_WAKE:
            caseALOOPER_POLL_CALLBACK:
                continue;
            caseALOOPER_POLL_ERROR:
               ALOGE("ALOOPER_POLL_ERROR");
            caseALOOPER_POLL_TIMEOUT:
                // timeout(should not happen)
                continue;
            default:
                // should nothappen
               ALOGE("Looper::pollOnce() returned unknown status %d", ret);
                continue;
        }
    } while (true);
}

```

下面这句将在内部调用MessageQueue::mHandler来处理消息：
mLooper->pollOnce(-1);pollOnce函数使用了一个死循环，它不断地取消息进行处理，

```sh
/*frameworks/native/services/surfaceflinger/MessageQueue.cpp*/
void MessageQueue::Handler::handleMessage(const Message&message) {
    switch (message.what) {
        case INVALIDATE:
           android_atomic_and(~eventMaskInvalidate, &mEventMask);
           mQueue.mFlinger->onMessageReceived(message.what);
            break;
        case REFRESH:
           android_atomic_and(~eventMaskRefresh, &mEventMask);
           mQueue.mFlinger->onMessageReceived(message.what);
            break;
    }
}

```
如上述代码，mHandler当收到INVALIDATE和REFRESH请求时，进一步回调了SurfaceFlinger中的onMessageReceived。
```sh
void SurfaceFlinger::onMessageReceived(int32_t what) {
    ATRACE_CALL();
    switch (what) {
        case MessageQueue::TRANSACTION: {
            handleMessageTransaction();
            break;
        }
        case MessageQueue::INVALIDATE: {
            bool refreshNeeded = handleMessageTransaction();
            refreshNeeded |= handleMessageInvalidate();
            refreshNeeded |= mRepaintEverything;
            if (refreshNeeded) {
                // Signal a refresh if a transaction modified the window state,
                // a new buffer was latched, or if HWC has requested a full
                // repaint
                signalRefresh();
            }
            break;
        }
        case MessageQueue::REFRESH: {
            handleMessageRefresh();
            break;
        }
    }

```
根据情况调用

handleMessageRefresh()
```sh
void SurfaceFlinger::handleMessageRefresh() {
    ATRACE_CALL();
    preComposition();
    rebuildLayerStacks();
    setUpHWComposer();
    doDebugFlashRegions();
    doComposition();
    postComposition();
}

```



