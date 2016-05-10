package com.example.zhu.setting_01;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by zhu on 2016/4/24.
 */
public class ChangeOrientationService extends Service {
    private final IBinder mbinder = new LocalBinder();
    private static CustomLayout customLayout;

    public class LocalBinder extends Binder{
        public LocalBinder(){
            super();
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mbinder;
    }

    public void onCreate(){}

    public int onStartCommand(Intent intent,int flags, int startId){
        WindowManager mwind = (WindowManager)getSystemService(WINDOW_SERVICE);
        customLayout= new CustomLayout(intent.getIntExtra("orientation",0));
        mwind.addView(new View(this), customLayout);
        stopSelf();
        return Service.START_STICKY;
    }

    public static  int getOrientation(){
        if (customLayout==null) return -1;
        else
             return customLayout.screenOrientation;
    }

    public class CustomLayout extends WindowManager.LayoutParams{
//        public CustomLayout(){
//            super();
//        }
        public CustomLayout(int paramint){
            super(0,0,TYPE_SYSTEM_OVERLAY,FLAG_FULLSCREEN|FLAG_NOT_FOCUSABLE, PixelFormat.RGB_888);
            this.gravity = Gravity.TOP;
            this.type = TYPE_TOAST;
            this.screenOrientation = paramint;
        }
    }
}
