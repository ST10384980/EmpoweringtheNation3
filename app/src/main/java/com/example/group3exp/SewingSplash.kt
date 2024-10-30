package com.example.group3exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SewingSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, SewingPAGE::class.java))
            finish()
        },4000)
    }
}