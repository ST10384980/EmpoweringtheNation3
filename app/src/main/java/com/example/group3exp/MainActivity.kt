package com.example.group3exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, SPLASHSCREEN11::class.java))
            finish()
        },4000)




    }
}