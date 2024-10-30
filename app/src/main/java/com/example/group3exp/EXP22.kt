package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EXP22 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exp22)

        val Back22 = findViewById<Button>(R.id.EXP22Back)
        Back22.setOnClickListener {
            val intent = Intent(this, SPLASHSCREEN11::class.java)
            startActivity(intent)
        }

        val Cart22 = findViewById<Button>(R.id.Cart22Btn)
        Cart22.setOnClickListener {
            val intent = Intent(this, EXP3::class.java)
            startActivity(intent)
        }


        val FirstSBtn = findViewById<Button>(R.id.FSbtn)
        val SewingSbtn = findViewById<Button>(R.id.SSbtn)
        val LandSBtn = findViewById<Button>(R.id.LSbtn)
        val LeftBtn = findViewById<Button>(R.id.LeftyBtn)
        LeftBtn.setOnClickListener {
            val intent = Intent(this, LifeSkillSplash::class.java)
            startActivity(intent)
        }

        FirstSBtn.setOnClickListener {
            val intent = Intent(this, FirstAidSplash::class.java)
            startActivity(intent)
        }

        SewingSbtn.setOnClickListener {
            val intent = Intent(this, SewingSplash::class.java)
            startActivity(intent)
        }

        LandSBtn.setOnClickListener {
            val intent = Intent(this, LandscapingSplash::class.java)
            startActivity(intent)


        }
    }
}
