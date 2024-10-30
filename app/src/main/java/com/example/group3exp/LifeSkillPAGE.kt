package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LifeSkillPAGE : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skill_page)

        val BackSK = findViewById<Button>(R.id.SkillBack)


        BackSK.setOnClickListener {
            val intent = Intent(this, EXP22::class.java)
            startActivity(intent)
        }

    }
}