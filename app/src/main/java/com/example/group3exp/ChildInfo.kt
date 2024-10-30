package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChildInfo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_info)

        val BackC = findViewById<Button>(R.id.CBtn)

        BackC.setOnClickListener {
            val intent = Intent(this, EXP2::class.java)
            startActivity(intent)
        }
    }
}