package com.example.group3exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GardenInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_info)

        val BackG = findViewById<Button>(R.id.GBtn)

        BackG.setOnClickListener {
            val intent = Intent(this, EXP2::class.java)
            startActivity(intent)
        }
    }
}