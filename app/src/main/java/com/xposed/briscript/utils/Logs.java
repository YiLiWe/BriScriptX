package com.xposed.briscript.utils;

import android.util.Log;

public class Logs {
    private final static String tag = "控件信息";

    public static void logI(String msg) {
        Log.d(tag, msg);
    }
}
