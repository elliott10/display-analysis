package com.example.zhu.setting_01;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

/**
 * Created by zhu on 2016/4/24.
 */
public class ChangeOrientationHelper {
    public static  class Orientation{
        final public static int LANDSCAPE = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        final public static int PORTRAIT = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        final public static int SENSOR = ActivityInfo.SCREEN_ORIENTATION_SENSOR;
        final public static  int REVERSE_LANDSCAPE = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
        final public static  int REVERSE_PORTRAIT =  ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT;

    }
    public  static void setOrientation(int orientation, Context context){
        Intent mintent=new Intent(context,ChangeOrientationService.class);
        mintent.putExtra("orientation",orientation);
        context.startService(mintent);
        //((Activity)context).finish();
    }
}
