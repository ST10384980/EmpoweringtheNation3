package com.example.group3exp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CARTPAGE : AppCompatActivity() {

    private lateinit var selectedCourses: List<String>
    private lateinit var coursePrices: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartpage)

        // Retrieve selected courses and prices from previous activity
        selectedCourses = intent.getStringArrayListExtra("selectedCourses") ?: listOf()
        coursePrices = intent.getIntegerArrayListExtra("coursePrices") ?: listOf()

        // Display courses, prices, and total with discount and VAT
        displaySelectedCourses()


        val intent = intent
        val Page2Name = intent.getStringExtra("name")
        val Page2Num = intent.getStringExtra("studentNumber")
        val Page2Poo = intent.getStringExtra("studentPo")
        // Setup Checkout Button
        val checkoutBtn = findViewById<Button>(R.id.button8)
        checkoutBtn.setOnClickListener {
            // Start checkout activity
            val intent = Intent(this, Invoicepage::class.java) // Update this to your actual checkout activity
            startActivity(intent)


            intent.putExtra("name", Page2Name)
            intent.putExtra("studentNumber", Page2Num)
            intent.putExtra("studentPo", Page2Poo)

            // Pass course names and prices as lists
            intent.putStringArrayListExtra("selectedCourses", ArrayList(selectedCourses))
            intent.putIntegerArrayListExtra("coursePrices", ArrayList(coursePrices))
            startActivity(intent)
            finish()
        }




    }

    private fun displaySelectedCourses() {
        // Display area for courses
        val courseDisplay = findViewById<TextView>(R.id.xxxaxa)
        // TextView for total amount
        val totalAmountTextView = findViewById<TextView>(R.id.textView8)
        // TextView for discount message
        val discountMessageTextView = findViewById<TextView>(R.id.textView7)
        // TextView for VAT amount
        val vatTextView = findViewById<TextView>(R.id.textView26)

        // Display each selected course with its price
        val displayText = selectedCourses.zip(coursePrices).joinToString("\n") { (course, price) ->
            "$course - R$price"
        }
        courseDisplay.text = displayText

        // Calculate the total and apply discounts
        var total = coursePrices.sum()
        val discountPercentage: Double
        val discountMessage: String

        // Determine discount based on the number of selected courses
        when (selectedCourses.size) {
            1 -> {
                discountPercentage = 0.0
                discountMessage = "No discount applied"
            }
            2 -> {
                discountPercentage = 0.05
                discountMessage = "5% discount applied"
            }
            3 -> {
                discountPercentage = 0.10
                discountMessage = "10% discount applied"
            }
            else -> {
                discountPercentage = 0.15
                discountMessage = "15% discount applied"
            }
        }

        // Calculate discount amount and apply it to the total
        val discountAmount = (total * discountPercentage).toInt()
        total -= discountAmount

        // Calculate VAT (15%) after discount
        val vatPercentage = 0.15
        val vatAmount = (total * vatPercentage).toInt()
        val totalWithVat = total + vatAmount

        // Display total amount with VAT and discount message
        totalAmountTextView.text = "R$totalWithVat"
        discountMessageTextView.text = discountMessage
        vatTextView.text = "+ 15% VAT: R$vatAmount"
    }
}

