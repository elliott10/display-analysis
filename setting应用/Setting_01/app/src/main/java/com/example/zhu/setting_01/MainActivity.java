package com.example.zhu.setting_01;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    //获取分辨率
    Display display;

    private static final String[] pixels={"1920 × 1080","1600 × 900","1376 × 768","1280 × 1024","800 × 600"};
    private static final String[] muti_screens={"仅在 1 上显示","仅在 2 上显示","扩展屏幕","复制屏幕"};
    private static final String[] screen_orient={"自动","横屏","竖屏","翻转横屏","翻转竖屏"};

    private Spinner muti_spinner=null;
    private Spinner orient_spinner=null;
    private Spinner pixel_spinner=null;
    //亮度进度条
    private SeekBar light_seekbar = null;
    //自动按钮
    private ToggleButton auto_toggle=null;
    private SetLight setLight = null;

    //属性按钮
    private TextView attribution_text=null;
    //显示器对话框构造器
    AlertDialog.Builder builder;
    //显卡型号
    private String gpu_info = null;

    private ArrayAdapter<String> muti_adapter;
    private ArrayAdapter<String> pixel_adapter;
    private ArrayAdapter<String> orient_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (pixel_spinner==null)
            setPixelFun();
        if (muti_spinner==null)
            setMutiScreenFun();
        if (orient_spinner ==null)
            setOrientSpinnerFun();
        if (light_seekbar==null)
            setLightFun();
        if(gpu_info==null)
            startGLForGPUInfo();
        //申请root权限
        String apkRoot="chmod 777 "+getPackageCodePath();
        LinuxTools.RootCommand(apkRoot);



        //属性按钮
        if (attribution_text==null){
            attribution_text = (TextView)findViewById(R.id.attribution_text);
            attribution_text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                String section_cmd = "ls /proc/";
//                String info = LinuxTools.exec(section_cmd);
//                Toast toast = Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT);
//                toast.show();

                    //颜色深度
                    //int depth = display.getPixelFormat();


////                Toast toast = Toast.makeText(getApplicationContext(), depth, Toast.LENGTH_SHORT);
////                toast.show();
//                Log.e("!!!!!!!!!!!!!!!!!!!!!","widthPixels"+screenWidth);
//                Log.e("!!!!!!!!!!!!!!!!!!!!!","heightPixels"+screenHeight);
//                Log.e("!!!!!!!!!!!!!!!!!!!!!","density"+density);
//                Log.e("!!!!!!!!!!!!!!!!!!!!!","xdpi"+xdpi);
//                Log.e("!!!!!!!!!!!!!!!!!!!!!","ydpi"+ydpi);
                    if(builder==null)
                        screen_info_dialog();
                    builder.show();
                }
            });
        }
    }
    //设置亮度功能函数
    private void setLightFun(){
        //亮度进度条
        light_seekbar = (SeekBar)findViewById(R.id.light_seekBar);
        light_seekbar.setOnSeekBarChangeListener(new SeekBarListener());
        //亮度自动按钮
        auto_toggle = (ToggleButton)findViewById(R.id.auto_toggle);
        setLight = new SetLight();
        //获取当前亮度,并且设置进度条的值
        light_seekbar.setProgress(setLight.getScreenBrightness());
        //1 为自动调节屏幕亮度,检查当前屏幕亮度调节的模式
        if (setLight.getScreenMode()==1){
            auto_toggle.setChecked(true);
            light_seekbar.setEnabled(false);
        }else {
            auto_toggle.setChecked(false);
            light_seekbar.setEnabled(true);
        }

        auto_toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //已开启
                    setLight.setScreenMode(1);
                    light_seekbar.setEnabled(false);
                } else {
                    //已关闭
                    setLight.setScreenMode(0);
                    light_seekbar.setEnabled(true);
                }
            }
        });
    }
    //设置分辨率的函数
    private void setPixelFun(){
//        //获取分辨率
//        display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
//        //display  = getWindowManager().getDefaultDisplay(); //Activity#getWindowManager()
//        Point size = new Point();
//        display.getSize(size);
//        String current_pixel=size.y +" × "+size.x;
//        int i;
//        for ( i=0; i<pixels.length-1;i++){
//            if(current_pixel.equals(pixels[i]))
//                break;
//        }
//        if(i==pixels.length-1){
//            pixels[pixels.length-1] = pixels[0];
//            pixels[0] = current_pixel;
//        }

        //分辨率
        pixel_spinner=(Spinner)findViewById(R.id.pixel_spinner);
        pixel_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pixels);
        pixel_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pixel_spinner.setAdapter(pixel_adapter);
        pixel_spinner.setOnItemSelectedListener(new PixelSpinnerSelectedListener());
        pixel_spinner.setVisibility(View.VISIBLE);
    }
    //设置多屏显示函数
    private void setMutiScreenFun(){
        //多显示器
        muti_spinner=(Spinner)findViewById(R.id.muti_spinner);
        muti_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,muti_screens);
        muti_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        muti_spinner.setAdapter(muti_adapter);
        muti_spinner.setOnItemSelectedListener(new MutiSpinnerSelectedListener());
        muti_spinner.setVisibility(View.VISIBLE);
    }
    //设置屏幕方向功能函数
    private void setOrientSpinnerFun(){
        //方向
        orient_spinner=(Spinner)findViewById(R.id.orient_spinner);
        orient_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,screen_orient);
        orient_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        orient_spinner.setAdapter(orient_adapter);
        int orientation = ChangeOrientationService.getOrientation();
        Log.e(LinuxTools.TAG,"orientation "+orientation);
        Log.e(LinuxTools.TAG,"自动"+ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Log.e(LinuxTools.TAG,"SCREEN_ORIENTATION_PORTRAIT  "+ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Log.e(LinuxTools.TAG,"SCREEN_ORIENTATION_SENSOR "+ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        if (orientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            orient_spinner.setSelection(1,true);
        }
        else if (orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT){
            orient_spinner.setSelection(2,true);
        }
        else if (orientation == ActivityInfo.SCREEN_ORIENTATION_SENSOR){
            orient_spinner.setSelection(0,true);
        }else if (orientation == ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE){
            orient_spinner.setSelection(3,true);
        }else if (orientation == ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT){
            orient_spinner.setSelection(4,true);
        }

        orient_spinner.setOnItemSelectedListener(new OrientSpinnerSelectedListener());
        orient_spinner.setVisibility(View.VISIBLE);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //使用数组形式操作  显示器
    class MutiSpinnerSelectedListener implements AdapterView.OnItemSelectedListener{

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//            Toast toast=Toast.makeText(getApplicationContext(), muti_screens[arg2], Toast.LENGTH_SHORT);
//            toast.show();
        }
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    //分辨率
    class PixelSpinnerSelectedListener implements AdapterView.OnItemSelectedListener{
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//            Toast toast=Toast.makeText(getApplicationContext(), pixels[arg2], Toast.LENGTH_SHORT);
//            toast.show();
        }
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    //方向
    class OrientSpinnerSelectedListener implements AdapterView.OnItemSelectedListener{

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            if(screen_orient[arg2].equals("自动")){
                Log.e(LinuxTools.TAG,"onItemSelected 自动");
                ChangeOrientationHelper.setOrientation(ChangeOrientationHelper.Orientation.SENSOR,MainActivity.this);
            }else if(screen_orient[arg2].equals("横屏")){
                Log.e(LinuxTools.TAG,"onItemSelected横屏");
                ChangeOrientationHelper.setOrientation(ChangeOrientationHelper.Orientation.LANDSCAPE,MainActivity.this);
            }else if(screen_orient[arg2].equals("竖屏")){
                Log.e(LinuxTools.TAG,"onItemSelected竖屏");
                ChangeOrientationHelper.setOrientation(ChangeOrientationHelper.Orientation.PORTRAIT,MainActivity.this);
            }else if(screen_orient[arg2].equals("翻转横屏")){
                ChangeOrientationHelper.setOrientation(ChangeOrientationHelper.Orientation.REVERSE_LANDSCAPE,MainActivity.this);
               // LinuxTools.exec("xrandr -o inverted");
            }else if(screen_orient[arg2].equals("翻转竖屏")){
                Log.e(LinuxTools.TAG,"翻转竖屏");
                ChangeOrientationHelper.setOrientation(ChangeOrientationHelper.Orientation.REVERSE_PORTRAIT,MainActivity.this);
            }
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    //亮度进度条的监控
    public class SeekBarListener implements SeekBar.OnSeekBarChangeListener{
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {}
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
//            Toast toast=Toast.makeText(getApplicationContext(),"停止："+ light_seekbar.getProgress(), Toast.LENGTH_SHORT);
//            toast.show();

            setLight.setScreenBrightness(light_seekbar.getProgress());
            setLight.saveScreenBrightness(light_seekbar.getProgress());
        }
    }

    /**
    *
     * 设置当前系统的亮度类
     */
    public class SetLight {
        /**
         * 获得当前屏幕亮度的模式
         * SCREEN_BRIGHTNESS_MODE_AUTOMATIC=1 为自动调节屏幕亮度
         * SCREEN_BRIGHTNESS_MODE_MANUAL=0  为手动调节屏幕亮度
         */
        private int getScreenMode(){
            int screenMode=0;
            try{
                screenMode = Settings.System.getInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS_MODE);
            }
            catch (Exception localException){

            }
            return screenMode;
        }

        /**
         * 获得当前屏幕亮度值  0--255
         */
        private int getScreenBrightness(){
            int screenBrightness=255;
            try{
                screenBrightness = Settings.System.getInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS);
            }
            catch (Exception localException){

            }
            return screenBrightness;
        }
        /**
         * 设置当前屏幕亮度的模式
         * SCREEN_BRIGHTNESS_MODE_AUTOMATIC=1 为自动调节屏幕亮度
         * SCREEN_BRIGHTNESS_MODE_MANUAL=0  为手动调节屏幕亮度
         */
        private void setScreenMode(int paramInt){
            try{
                Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS_MODE, paramInt);
            }catch (Exception localException){
                localException.printStackTrace();
            }
        }
        /**
         * 设置系统亮度值  0--255
         */
        private void saveScreenBrightness(int paramInt){
            try{
                Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, paramInt);
            }
            catch (Exception localException){
                Log.e("###################","设置系统亮度有问题");
                localException.printStackTrace();
            }
        }
        /**
         * 设置当前的屏幕亮度值 0--1.0之间
         */
        private void setScreenBrightness(int paramInt){
            Window localWindow = getWindow();
            WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
            float f = paramInt / 255.0F;
            localLayoutParams.screenBrightness = f;
            localWindow.setAttributes(localLayoutParams);
        }
    }

    //显示器信息对话框
    private void screen_info_dialog() {
        final String items[]={"CPU             "+getCpuName()+" "+getNumCores()+"核","CPU频率      "+getMinCpuFreq()+"GHZ","RAM             "
                +getRamMemory(this)+"GB","GPU               "+gpu_info,"分辨率          "+getScreenResolution()};


        //dialog参数设置
        builder=new AlertDialog.Builder(this);  //先得到构造器
        builder.setTitle("提示"); //设置标题
        //builder.setMessage("是否确认退出?"); //设置内容
        builder.setIcon(R.mipmap.ic_launcher);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create();
    }
    //获取显卡的辅助函数
    private void startGLForGPUInfo()
    {
        Intent localIntent = new Intent(this, GpuInfo.class);
        localIntent.setFlags(65536);
        startActivityForResult(localIntent, 1001);
        overridePendingTransition(0, 0);
    }
    protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        if ((paramInt1 == 1001) && (paramInt2 == -1))
        {
            gpu_info = paramIntent.getStringExtra("GLInfo");
        }
    }
    //获取CPU型号
    private static String getCpuName(){
        try{
            FileReader fr = new FileReader("/proc/cpuinfo");
            BufferedReader br = new BufferedReader(fr);
            String text = br.readLine();
            String[] array = text.split(":\\s+",2);
            for(int i = 0; i < array.length; i++){
            }
            return array[1];
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    //获取CPU核心数
    private int getNumCores() {
        //Private Class to display only CPU devices in the directory listing
        class CpuFilter implements FileFilter {
            @Override
            public boolean accept(File pathname) {
                //Check if filename is "cpu", followed by a single digit number
                if(Pattern.matches("cpu[0-9]", pathname.getName())) {
                    return true;
                }
                return false;
            }
        }
        try {
            //Get directory containing CPU info
            File dir = new File("/sys/devices/system/cpu/");
            //Filter to only list the devices we care about
            File[] files = dir.listFiles(new CpuFilter());
            Log.d("@@@@@@@@@@@@", "CPU Count: "+files.length);
            //Return the number of cores (virtual CPU devices)
            return files.length;
        } catch(Exception e) {
            //Print exception
            Log.d("@@@@@@@@@@@@", "CPU Count: Failed.");
            e.printStackTrace();
            //Default to return 1 core
            return 1;
        }
    }
    //获取CPU最大频率
    public static String getMinCpuFreq() {
        String result = "";
        ProcessBuilder cmd;
        try {
            String[] args = { "/system/bin/cat",
                    "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq" };
            cmd = new ProcessBuilder(args);
            Process process = cmd.start();
            InputStream in = process.getInputStream();
            byte[] re = new byte[24];
            while (in.read(re) != -1) {
                result = result + new String(re);
            }
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            result = "N/A";
        }
        float temp = (float) (Integer.parseInt(result.trim())/1000000.0);
        return format(temp);
    }
    //RAM内存大小
    private String getRamMemory(Context context){
        String str1 = "/proc/meminfo";// 系统内存信息文件
        String str2;
        String[] arrayOfString;
        long initial_memory = 0;

        try
        {
            FileReader localFileReader = new FileReader(str1);
            BufferedReader localBufferedReader = new BufferedReader(
                    localFileReader, 8192);
            str2 = localBufferedReader.readLine();// 读取meminfo第一行，系统总内存大小

            arrayOfString = str2.split("\\s+");
            for (String num : arrayOfString) {
                Log.i(str2, num + "\t");
            }

            initial_memory = Integer.valueOf(arrayOfString[1]).intValue() * 1024;// 获得系统总内存，单位是KB，乘以1024转换为Byte
            localBufferedReader.close();

        } catch (IOException e) {
        }
        //return Formatter.formatFileSize(context, initial_memory);// Byte转换为KB或者MB，内存大小规格化
        System.out.println("总运存--->>>"+initial_memory/(1024*1024));
        return format((initial_memory/(1000*1000*1000.0)));
    }
    //获取屏幕分辨率
    private String getScreenResolution(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        String strOpt = dm.heightPixels + " x " + dm.widthPixels;
        return strOpt;
    }

    public static String format(double d){
        DecimalFormat df=new DecimalFormat(".#");
        String st=df.format(d);
        return  st;
    }
}
