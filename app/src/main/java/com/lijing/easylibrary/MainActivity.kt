package com.lijing.easylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lijing.easyutil.EasyUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EasyUtil.toast("init success")
    }
}