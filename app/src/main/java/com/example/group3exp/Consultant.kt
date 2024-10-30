package com.example.group3exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Consultant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultant)

        val ZBACK = findViewById<Button>(R.id.button3)


        ZBACK.setOnClickListener {
            val intent = Intent(this, SPLASHSCREEN11::class.java)
            startActivity(intent)
        }

    }
}