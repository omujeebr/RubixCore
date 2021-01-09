package com.rubix.rubixcore.ktx

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

fun Context.showToast(message: String, duration: Int){
    Toast.makeText(this, message, duration).show()
}

fun Context.showToast(@StringRes resId: Int, duration: Int){
    Toast.makeText(this, resId, duration).show()
}