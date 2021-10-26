package com.lijing.easylibrary

import android.app.Application
import com.lijing.easyutil.EasyUtil

class EasyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        EasyUtil.init(this)
    }
}