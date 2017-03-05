package com.lsw.demo;

import android.util.Log;

/**
 * Created by Administrator on 2017/3/5 0005.
 */

public class LogUtil {

    private static int LEVEL = 0;//设置打印日志的级别

    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;

    public static void v(String tag, String msg) {
        if (LEVEL < VERBOSE) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LEVEL < DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LEVEL < INFO) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LEVEL < WARN) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LEVEL < ERROR) {
            Log.e(tag, msg);
        }
    }
}
