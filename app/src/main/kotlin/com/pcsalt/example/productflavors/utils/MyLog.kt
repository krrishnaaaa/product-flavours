package com.pcsalt.example.productflavors.utils

import android.util.Log

object MyLog {

  fun i(tag: String, message: String) {
    if (FConsts.ENABLE_LOG) Log.i(tag, message)
  }

  fun d(tag: String, message: String) {
    if (FConsts.ENABLE_LOG) Log.d(tag, message)
  }

  fun w(tag: String, message: String) {
    if (FConsts.ENABLE_LOG) Log.w(tag, message)
  }

  fun e(tag: String, message: String) {
    if (FConsts.ENABLE_LOG) Log.e(tag, message)
  }

  fun e(tag: String, message: String, throwable: Throwable) {
    if (FConsts.ENABLE_LOG) Log.e(tag, message, throwable)
  }
}
