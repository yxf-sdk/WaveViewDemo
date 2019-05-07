package com.yxf.waveviewdemo.utils;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by yuxiongfeng.
 * Date: 2019/5/7
 */
public class ScreenUtil {
    public static void getScreenSize(Context context){
        WindowManager systemService = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display defaultDisplay = systemService.getDefaultDisplay();
        Point point=new Point();
        defaultDisplay.getSize(point);
        int width = point.x;
        int height = point.y;
    }

    /**
     * dialog 获取宽高
     */
    public static void getScreenFromDialog(Dialog dialog){
        Window window = dialog.getWindow();
        WindowManager windowManager = window.getWindowManager();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point=new Point();
        defaultDisplay.getSize(point);
        int width = point.x;
        int height = point.y;
    }

}
