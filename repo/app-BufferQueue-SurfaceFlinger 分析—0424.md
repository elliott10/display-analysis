## 一、BufferQueue的内部原理



一块Buffer大致经历的过程就是FREE->DEQUEUED->QUEUED->ACQUIRED->FREE。

Buffer的状态迁移图![](http://i4.piimg.com/6098d2b8fd273b54.png)


- BufferQueue

   > BufferQueue是中介管理着buffer，producer通过BufferQueue获取一个buffer,consume通过BufferQueue获取一个buffer.

- Producer

  >  一般是应用程序。应用程序不断地刷新UI，从而将产生的显示数据源源不断地写到buffer中。
    
   > dequeue：当Producer需要使用buffer时，向BufferQueue发起dequeue申请，然后才能对指定的缓冲区进行操作。
    
  >  queue：Producer把一块buffer已经写入完成后，将调用BufferQueue的queue。将buffer归还到BufferQueue的队列中。


- Consumer

   > 当一块buffer已经就绪后，Consumer就可以开始工作了。
    
   > BufferQueue的类ConsumerListener:  保证Consumer可以及时的处理buffer其中的函数接口包括：
   

```sh
    struct ConsumerListener :public virtual RefBase {       
        virtual voidonFrameAvailable() = 0;/*当一块buffer可以被消费时，这个函数会被调用，特别注意此时没有共享锁的保护*/
        virtual voidonBuffersReleased() = 0;/*BufferQueue通知consumer它已经释放其slot中的一个或多个 GraphicBuffer引用*/
    };
    
 ```
 当有一帧数据准备就绪后，BufferQueue就会调用onFrameAvailable()来通知Consumer进行消费。

##二、BufferQueue中的缓冲区分配

/*frameworks/native/libs/gui/BufferQueue.cpp*/
```sh
status_t BufferQueue::dequeueBuffer(int *outBuf, uint32_t w,uint32_t h, uint32_t format, uint32_t usage) {…
status_t  returnFlags(OK);

{
...
 while (tryAgain) {/* 循环查找符合要求的slot*/
            ...                      
            found = INVALID_BUFFER_SLOT;//初始值
             ... 
            if (state ==BufferSlot::DEQUEUED) {
                    dequeuedCount++;/*统计dequeued buffer数量*/
                    
                    ...
            if (state== BufferSlot::FREE) { /*寻找符合要求的Slot*/                      
                        boolisOlder = mSlots[i].mFrameNumber <mSlots[found].mFrameNumber;
                        if(found < 0 || isOlder) {
                           foundSync = i;
                            found = i; //找到符合要求的Slot
                        }       

                }           
                ...
            
         const int buf = found;
        *outBuf = found; //返回值
       /*成功找到可用的Slot序号，接下来就开始对这个指定的Slot进行初始操作，及状态变迁等*/
       ...
       
     sp<GraphicBuffer> graphicBuffer(mGraphicBufferAlloc->createGraphicBuffer( w,h, format, usage, &error));           
           ...
     mSlots[buf].mGraphicBuffer = graphicBuffer; //这个Slot终于分配到空间了
           ...
     returnFlags |=ISurfaceTexture::BUFFER_NEEDS_REALLOCATION;
        }
             /* 分配GraphicBuffer空间*/
}
```

- 找到可用的Slot序号后，为这个Slot分配空间。
分配空间使用的是mGraphicBufferAlloc这个Allocator，
如果重新分配了空间，那么最后的返回值中需要加上BUFFER_NEEDS_REALLOCATION标志。客户端在发现这个标志后，它还应调用requestBuffer()来取得最新的buffer地址。

## 三、应用程序的绘图流程

surfaceflinger 启动过程中会启动 通过ctl.start()启动bootanimation
```sh
void SurfaceFlinger::startBootAnim() {
    // start boot animation
    property_set("service.bootanim.exit", "0");
    property_set("ctl.start", "bootanim");
}
```

使用到的函数文件：

BootAnimation.h
```sh
class BootAnimation : public Thread, public IBinder::DeathRecipient
{
public:
                BootAnimation();//生成bootanimation对象后，还会生成ISurfaceComposerClient，它是应用与SurfaceFlinger间的桥梁。
    virtual     ~BootAnimation();

    sp<SurfaceComposerClient> session() const;

private:
    virtual void        onFirstRef();
    virtual status_t    readyToRun();//介绍如何使用BufferQueue，和Opengl ES与EGL的使用流程。
    virtual bool    threadLoop();//readyToRun后使用opengl ES提供的各种API函数进行绘图
   
   
    virtual void        binderDied(const wp<IBinder>& who);


```

##### BootAnimation建立与SurfaceFlinger建立联系—ISurfaceComposerClient.

当bootanimation被启动后——>Bootanimation_main.cpp生成BootAnimation对象，并开启线程池,同时生成一个SurfaceComposerClient()——>生成ISurfaceComposerClient.

>ISurfaceComposerClient则是应用与SurfaceFlinger间的桥梁。

```sh
BootAnimation::BootAnimation() : Thread(false), mZip(NULL)
{
    mSession = new SurfaceComposerClient();
}
```
```sh
void SurfaceComposerClient::onFirstRef() {
   ...
    if (sm != 0) {
        sp<ISurfaceComposerClient> conn = sm->createConnection();
   ...
}

```
>SurfaceTexture是应用程序与BufferQueue的传输通道，它指导着UI程序的“画板申请”、“作画流程”等一系列细节。

>BufferQueue负责关注各个应用程序的“绘画过程”，ISurfaceComposerClient则是应用与SurfaceFlinger间的桥梁。

>SurfaceFlinger的职责是“Flinger”，即把系统中所有应用程序的最终的“绘图结果”进行“混合”，然后统一显示到物理屏幕上。

下面的图描述,应用程序、BufferQueue及SurfaceFlinger间的关系
![](http://i4.piimg.com/481e2f19c98fa953.png)

#### BootAnimation与BufferQueue建立连接
>因为BootAnimation继承自RefBase，当main函数中通过sp指针引用它时，会触发如下函数：

```sh
void BootAnimation::onFirstRef() {
    status_t err = mSession->linkToComposerDeath(this);//监听死亡事件
    ALOGE_IF(err, "linkToComposerDeath failed (%s) ", strerror(-err));
    if (err == NO_ERROR) {
        run("BootAnimation", PRIORITY_DISPLAY);//开启线程
    }
}
```
>当一个新的线程被run起来后，调用readyToRun()：
readyToRun()中显示应用程序是如何使用BufferQueue的，还可以看出Opengl ES与EGL的使用流程。

```sh
status_t BootAnimation::readyToRun() {
   ...

  //  第一部分，向server端获得buffer空间，从而得到EGL需要的本地窗口
    sp<SurfaceControl> control = session()->createSurface(String8("BootAnimation"),
            dinfo.w, dinfo.h, PIXEL_FORMAT_RGB_565);

    SurfaceComposerClient::openGlobalTransaction();
    control->setLayer(0x40000000);
    SurfaceComposerClient::closeGlobalTransaction();

    sp<Surface> s = control->getSurface();//得到一个Surface对象

    // 以下为第二部分，即EGL的使用流程
    const EGLint attribs[] = {
            EGL_RED_SIZE,   8,
            EGL_GREEN_SIZE, 8,
            EGL_BLUE_SIZE,  8,
            EGL_DEPTH_SIZE, 0,
            EGL_NONE
    };
    EGLint w, h, dummy;
    EGLint numConfigs;
    EGLConfig config;
    EGLSurface surface;
    EGLContext context;

    EGLDisplay display = eglGetDisplay(EGL_DEFAULT_DISPLAY);//第一步，得到默认的物理屏幕

    eglInitialize(display, 0, 0);//第二步，初始化
    eglChooseConfig(display, attribs, &config, 1, &numConfigs);//第三步，选取最佳的config
    surface = eglCreateWindowSurface(display, config, s.get(), NULL);//第四步，通过本地窗口创建Surface
    context = eglCreateContext(display, config, NULL, NULL);//第五步，创建context环境
    eglQuerySurface(display, surface, EGL_WIDTH, &w);
    eglQuerySurface(display, surface, EGL_HEIGHT, &h);

    if (eglMakeCurrent(display, surface, surface, context) == EGL_FALSE) //第六步，设置当前环境
        return NO_INIT;

    ...
    return NO_ERROR;
}
```
    
    
BootAnimation::readyToRun()中。因为本地窗口Surface已经成功创建，当EGL准备好环境后，程序可以正常使用opengl ES提供的各种API函数进行绘图了。这部分实现就集中在threadLoop()以及android()/movie()中。

>SurfaceComposerClient: 应用程序与SurfaceFlinger间的通道，在应用进程中则被封装在SurfaceComposerClient这个类中。这是一个匿名binder server，由应用程序(具体位置在SurfaceComposerClient::onFirstRef中)调用SurfaceFlinger这个实名binder的createConnection方法来获取到，服务端的实现是SurfaceFlinger::Client。

>ISurface:由应用程序调用ISurfaceComposerClient::createSurface()得到，同时在SurfaceFlinger这一进程中将会有一个Layer被创建，代表了一个“画面”。ISurface就是控制这一画面的handle。

>Surface:从逻辑关系上看，它是上述ISurface的使用者。从继承关系上看，它是一个SurfaceTextureClient，也就是本地窗口。SurfaceTextureClient内部持有ISurfaceTexture，即BufferQueue的实现接口。换个角度来思考，当EGL想通过Surface这个native window完成某些功能时，后者实际上又利用ISurface和ISurfaceTexture来取得远程服务端的对应服务，以完成EGL的请求。

横向角度考查Surface相关类的关系
![](http://i4.piimg.com/325a8e6b3a48fd9b.png)



## 四、应用程序与BufferQueue的关系-ISurfaceTexture
>ISurfaceComposerClient::createSurface()——>返回给应用程序的ISurface.
对应的变量是surfaceHandle，由layer通过getSurface()产生。

```sh

sp<ISurface>SurfaceFlinger::createSurface(ISurfaceComposerClient::surface_data_t* params,
constString8& name, const sp<Client>& client, DisplayID d,
uint32_tw, uint32_t h, PixelFormat format, uint32_t flags)
...
  if (layer != 0) {…      
        surfaceHandle = layer->getSurface();
        …
    }
   return surfaceHandle;
}
```
>ISurfaceComposerClient::createSurface()得到一个ISurface，

>ISurface使用ISurface::getSurfaceTexture()来取得可用的texture.

>通过Surface::init->setISurfaceTexture来将ISurfaceTexture赋值给
SurfaceTextureClient::mSurfaceTexture),

>最终是通过SurfaceTexture::getBufferQueue()来获得ISurfaceTexture

```sh
/*frameworks/native/libs/gui/SurfaceTexture.cpp*/
sp<BufferQueue> SurfaceTexture::getBufferQueue() const {
    Mutex::Autolocklock(mMutex);
    return mBufferQueue;
}
```

>函数直接返回了mBufferQueue，它指向一个BufferQueue对象。

总体流程![](http://i4.piimg.com/9c785d5e2fb64265.png)

