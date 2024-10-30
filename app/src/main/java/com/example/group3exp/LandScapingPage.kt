package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandScapingPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land_scaping_page)

        val BackLB = findViewById<Button>(R.id.LandBack)


        BackLB.setOnClickListener {
            val intent = Intent(this, EXP22::class.java)
            startActivity(intent)
        }

    }
}