package com.example.zhu.setting_01;

import android.util.Log;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by zhu on 2016/4/21.
 */
public class LinuxTools {
    private static final int OUTPUT_BUFFER_SIZE = 1024;
    public static String TAG = "############# exrc linux命令运行函数：";
    /**
     11
     * 应用程序运行命令获取 Root权限，设备必须已破解(获得ROOT权限)
     12
     * @param command 命令：String apkRoot="chmod 777 "+getPackageCodePath(); RootCommand(apkRoot);
    13
     * @return 应用程序是/否获取Root权限
    14
     */
    public static boolean RootCommand(String command)
    {
        Process process = null;
        DataOutputStream os = null;
        try
        {
            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            os.writeBytes(command + "\n");
            os.writeBytes("exit\n");
            os.flush();
            process.waitFor();
        } catch (Exception e)
        {
            Log.d("*** DEBUG ***", "ROOT REE" + e.getMessage());
            return false;
        } finally
        {
            try
            {
                if (os != null)
                {
                    os.close();
                }
                process.destroy();
            } catch (Exception e)
            {}
        }
        Log.d("*** DEBUG ***", "Root SUC ");
        return true;
    }



    public static String exec(String cmd) {
        try {
            if (cmd != null)
            {
                Runtime rt = Runtime.getRuntime();
                Log.e(TAG,"su前.......");
                // Process process = rt.exec("su");//Root权限
                Log.e(TAG,"su后.......01");
                Process process = rt.exec("sh");//模拟器测试权限
                DataOutputStream dos = new DataOutputStream(process.getOutputStream());
                dos.writeBytes(cmd + "\n");
                dos.flush();
                dos.writeBytes("exit\n");
                dos.flush();
                Log.e(TAG, "su后.......02");
                InputStream myin = process.getInputStream();
                InputStreamReader is = new InputStreamReader(myin);
                Log.e(TAG,"su后.......03");
                char[] buffer = new char[OUTPUT_BUFFER_SIZE];
                int bytes_read = is.read(buffer);
                StringBuffer aOutputBuffer = new StringBuffer();
                while (bytes_read > 0) {
                    //info.setText(aOutputBuffer.toString());
                    aOutputBuffer.append(buffer, 0, bytes_read);
                    Log.e(TAG, "su后.......1111111111");
                    bytes_read = is.read(buffer);
                }
                Log.e(TAG,"su后.......04");
                Log.e(TAG,aOutputBuffer.toString());
                Log.e(TAG,"su后.......05  "+aOutputBuffer.toString());
                return aOutputBuffer.toString();
            } else {
                System.out.println("退出");
                return "请输入正确的命令";
            }
        } catch (IOException e) {
            Log.e(TAG, "su后.......出错了");
            e.printStackTrace();

            return "操作异常";
        }
    }

  /*  public static String do_exec(String cmd) {
        String s = "/n";
        try {
            Log.e("####################","0001");
            Process p = Runtime.getRuntime().exec(cmd);
            Log.e("####################","0002");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            Log.e("####################","0003");
            String line = null;
            while ((line = in.readLine()) != null) {
                s += line + "/n";
            }
        } catch (IOException e) {
            Log.e("####################","000eee");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Log.e("####################:s:",s);
        return s;
    }*/
}
