package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SewingPAGE : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing_page)

        val BackSW = findViewById<Button>(R.id.SewingBack)


        BackSW.setOnClickListener {
            val intent = Intent(this, EXP22::class.java)
            startActivity(intent)
        }
    }
}