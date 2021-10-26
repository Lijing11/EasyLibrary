package com.lijing.easyutil

import android.app.Application
import android.content.Context
import android.widget.Toast

object EasyUtil {
private lateinit var mContext:Context

fun init(context: Context){
    mContext = context
}
    fun toast(text:String){
       Toast.makeText(mContext,text,Toast.LENGTH_SHORT).show()
    }
}