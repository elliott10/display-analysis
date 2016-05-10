package com.example.zhu.setting_01;

import android.app.Activity;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
//获取显卡的信息
public class GpuInfo extends Activity
{
    final Handler h = new Handler()
    {
        public void handleMessage(Message paramAnonymousMessage)
        {
            if (paramAnonymousMessage.what == 0)
                GpuInfo.this.close((String)paramAnonymousMessage.obj);
        }
    };
    GLSurfaceView mGLSurfaceView;
    Renderer renderer = new Renderer()
    {
        public void onDrawFrame(GL10 paramAnonymousGL10)
        {
        }

        public void onSurfaceChanged(GL10 paramAnonymousGL10, int paramAnonymousInt1, int paramAnonymousInt2)
        {
        }

        public void onSurfaceCreated(GL10 paramAnonymousGL10, EGLConfig paramAnonymousEGLConfig)
        {
            paramAnonymousGL10.glClearColor(8.0F, 8.0F, 8.0F, 0.0F);
            String str = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder("")
                             .append(paramAnonymousGL10.glGetString(7936)).toString()))
                             .append(" ").append(paramAnonymousGL10.glGetString(7937)).toString())).toString();
            Message.obtain(GpuInfo.this.h, 0, str).sendToTarget();
        }
    };

    public void close(String paramString)
    {
        Intent localIntent = new Intent();
        localIntent.putExtra("GLInfo", paramString);
        setResult(-1, localIntent);
        this.finish();
    }

    public void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        this.mGLSurfaceView = new GLSurfaceView(this);
        this.mGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        this.mGLSurfaceView.getHolder().setFormat(-3);
        this.mGLSurfaceView.setRenderer(this.renderer);
        setContentView(this.mGLSurfaceView);
    }
}

/* Location:           C:\Users\zhu\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.njduck.hardwareinformation.TestGL
 * JD-Core Version:    0.6.2
 */