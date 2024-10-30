package com.example.group3exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class GardenMaintence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_maintence)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, GardenInfo::class.java))
            finish()
        },4000)
    }
}