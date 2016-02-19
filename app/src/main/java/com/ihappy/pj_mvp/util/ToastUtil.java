package com.ihappy.pj_mvp.util;

import android.view.Gravity;
import android.widget.Toast;

import com.ihappy.pj_mvp.App;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public class ToastUtil {
    public static void showInCenter(int strId) {
        App context = App.newInstance();
        Toast toast =Toast.makeText(context,strId,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public static void showInCenter(String str) {
        App context = App.newInstance();
        Toast toast =Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public static void show(int strId) {
        App context = App.newInstance();
        Toast toast =Toast.makeText(context,strId,Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void show(String str) {
        App context = App.newInstance();
        Toast toast =Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.show();
    }
}
