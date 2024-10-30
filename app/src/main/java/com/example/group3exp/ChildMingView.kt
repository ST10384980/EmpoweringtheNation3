package com.example.group3exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class ChildMingView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_ming_view)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ChildInfo::class.java))
            finish()
        },4000)
    }
}