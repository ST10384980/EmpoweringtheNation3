package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Invoicepage : AppCompatActivity() {

    private lateinit var selectedCourses: List<String>
    private lateinit var coursePrices: List<Int>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoicepage)

        // Retrieve selected courses and prices from EXP3
        selectedCourses = intent.getStringArrayListExtra("selectedCourses") ?: listOf()
        coursePrices = intent.getIntegerArrayListExtra("coursePrices") ?: listOf()

        // Display selected courses and prices
        displaySelectedCourses()

        val intent = intent
        val page2Name = intent.getStringExtra("name")
        val page2Num = intent.getStringExtra("studentNumber")
        val page2Po = intent.getStringExtra("studentPo")


        //Display the name and student number in a TextView
        val textView = findViewById<TextView>(R.id.ZView)
        textView.text = " $page2Name\n"

        val Texty = findViewById<TextView>(R.id.TextZZ)
        Texty.text = " $page2Num\n"

        val Boom = findViewById<TextView>(R.id.BoomView)
        Boom.text = " $page2Po\n"



        val ContactButton = findViewById<Button>(R.id.ContactBtn)

        ContactButton.setOnClickListener {
            val intent = Intent(this, ContactFINISH::class.java)
            startActivity(intent)
        }


        val BackCart = findViewById<Button>(R.id.button7)

        BackCart.setOnClickListener {
            val intent = Intent(this, CARTPAGE::class.java)
            startActivity(intent)
        }
    }
    private fun displaySelectedCourses() {
        val courseDisplay = findViewById<TextView>(R.id.UZZI)
        val totalAmountTextView = findViewById<TextView>(R.id.textView3)

        // Prepare display string and calculate total
        val displayText = selectedCourses.zip(coursePrices).joinToString("\n") { (course, price) ->
            "$course - R$price"
        }
        var total = coursePrices.sum()

        // Apply a 10% discount if there are exactly two courses
        if (selectedCourses.size == 2) {
            val discount = 0.05
            val discountAmount = (total * discount).toInt() // calculate discount as an Int
            total -= discountAmount // apply discount
        } else if (selectedCourses.size == 3) {
            val discount = 0.10
            val discountAmount = (total * discount).toInt() // calculate discount as an Int
            total -= discountAmount // apply discount
        }else if (selectedCourses.size == 4) {
            val discount = 0.15
            val discountAmount = (total * discount).toInt() // calculate discount as an Int
            total -= discountAmount // apply discount
        }

        // Set text views
        courseDisplay.text = displayText
        totalAmountTextView.text = "Total: R$total"
    }
}