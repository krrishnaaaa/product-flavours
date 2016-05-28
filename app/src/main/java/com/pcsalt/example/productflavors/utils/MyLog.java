package com.pcsalt.example.productflavors.utils;

import android.util.Log;

/**
 * Created by pcsalt on 27/05/16.
 */
public final class MyLog {

    private MyLog() {
    }

    public static void i(String tag, String message) {
        if (FConsts.ENABLE_LOG) {
            Log.i(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if (FConsts.ENABLE_LOG) {
            Log.d(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if (FConsts.ENABLE_LOG) {
            Log.w(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if (FConsts.ENABLE_LOG) {
            Log.e(tag, message);
        }
    }

    public static void e(String tag, String message, Throwable throwable) {
        if (FConsts.ENABLE_LOG) {
            Log.e(tag, message, throwable);
        }
    }
}
