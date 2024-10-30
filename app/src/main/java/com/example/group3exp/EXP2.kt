package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EXP2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exp2)


        val Cart2 = findViewById<Button>(R.id.CartBtn)
        Cart2.setOnClickListener {
            val intent = Intent(this, EXP3::class.java)
            startActivity(intent)
        }


        val Back2 = findViewById<Button>(R.id.EXP2Back)
         Back2.setOnClickListener {
        val intent = Intent(this, SPLASHSCREEN11::class.java)
           startActivity(intent)
        }



        val Childbutton = findViewById<Button>(R.id.Childtn)
        Childbutton.setOnClickListener {
            val intent = Intent(this, ChildMingView::class.java)
            startActivity(intent)
        }
        val GardenBtnn = findViewById<Button>(R.id.GardenBtn)
        GardenBtnn.setOnClickListener {
            val intent = Intent(this, GardenMaintence::class.java)
            startActivity(intent)
        }
        val Cookie = findViewById<Button>(R.id.CookingBtn)
        Cookie.setOnClickListener {
            val intent = Intent(this, CookingView::class.java)
            startActivity(intent)
        }


    }
}