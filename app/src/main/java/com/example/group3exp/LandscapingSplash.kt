package com.example.group3exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class LandscapingSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LandScapingPage::class.java))
            finish()
        },4000)

    }
}