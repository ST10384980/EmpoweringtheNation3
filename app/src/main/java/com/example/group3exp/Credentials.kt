package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Credentials : AppCompatActivity() {

    private lateinit var selectedCourses: List<String>
    private lateinit var coursePrices: List<Int>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credentials)

        // Retrieve selected courses and prices from EXP3
        selectedCourses = intent.getStringArrayListExtra("selectedCourses") ?: listOf()
        coursePrices = intent.getIntegerArrayListExtra("coursePrices") ?: listOf()



        val initiadButton = findViewById<Button>(R.id.CNEXT)

        initiadButton.setOnClickListener {

            val StudentNum = findViewById<EditText>(R.id.etName)
            val StudentNam = findViewById<EditText>(R.id.etEmail)
            val StudentPo = findViewById<EditText>(R.id.etPhone)



            val page2Name = StudentNum.text.toString()
            val page2Num = StudentNam.text.toString()
            val page2Po = StudentPo.text.toString()

           /// if (page2Name.isEmpty() || page2Num.isEmpty()) {
               /// Toast.makeText(this, "Please enter your details", Toast.LENGTH_SHORT).show()
           /// } else {
                // Passing data to CARTPAGE
                val intent = Intent(this, CARTPAGE::class.java)
                intent.putExtra("name", page2Name)
                intent.putExtra("studentNumber", page2Num)
                intent.putExtra("studentPo", page2Po)
                intent.putStringArrayListExtra("selectedCourses", ArrayList(selectedCourses))
                intent.putIntegerArrayListExtra("coursePrices", ArrayList(coursePrices))

                Toast.makeText(this, "Details added to cart", Toast.LENGTH_SHORT).show()
                startActivity(intent)
                finish()
           // }
        }
    }
}
