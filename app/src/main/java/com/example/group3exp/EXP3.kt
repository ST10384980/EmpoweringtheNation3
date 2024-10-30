package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class EXP3 : AppCompatActivity() {

    private val selectedCourses = mutableListOf<Pair<String, Int>>() // List of course names and prices

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exp3)



        // Map buttons to courses and their prices
        val courseButtons = mapOf(
            R.id.addFirstAid to Pair("First Aid", 1500),
            R.id.addSewing to Pair("Sewing", 1500),
            R.id.addLandscaping to Pair("Landscaping", 1500),
            R.id.addLifeSkills to Pair("Life Skills", 1500),
            R.id.addCooking to Pair("Cooking", 750),
            R.id.addChildMinding to Pair("Child Minding", 750),
            R.id.addGardenMaintenance to Pair("Garden Maintenance", 750)
        )

        // Set click listeners for course buttons
        courseButtons.forEach { (buttonId, courseInfo) ->
            val (courseName, coursePrice) = courseInfo
            findViewById<Button>(buttonId).setOnClickListener {
                addCourseToCart(courseName, coursePrice)
            }
        }

        findViewById<Button>(R.id.EXP3btn).setOnClickListener {
            val intent = Intent(this, EXP22::class.java)
            startActivity(intent)
        }

        // Go to Cart button functionality
        findViewById<Button>(R.id.goToCartButton).setOnClickListener {
            val intent = Intent(this, Credentials::class.java)

            // Pass course names and prices as lists
            val courseNames = selectedCourses.map { it.first }
            val coursePrices = selectedCourses.map { it.second }
            intent.putStringArrayListExtra("selectedCourses", ArrayList(courseNames))
            intent.putIntegerArrayListExtra("coursePrices", ArrayList(coursePrices))

            startActivity(intent)
        }
    }

    private fun addCourseToCart(course: String, price: Int) {
        selectedCourses.add(course to price)
        Toast.makeText(this, "$course added to cart", Toast.LENGTH_SHORT).show()
    }
}