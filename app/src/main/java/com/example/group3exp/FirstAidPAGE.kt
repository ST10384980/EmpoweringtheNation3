package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstAidPAGE : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid_page)

        val BackFB = findViewById<Button>(R.id.FirstBack)


        BackFB.setOnClickListener {
            val intent = Intent(this, EXP22::class.java)
            startActivity(intent)
        }
    }
}