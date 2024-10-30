package com.example.group3exp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class SPLASHSCREEN11 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen11)

        val SixWbutton= findViewById<Button>(R.id.SixXXBTN)

        SixWbutton.setOnClickListener {
            val intent = Intent(this, EXP2::class.java)
            startActivity(intent)
        }

        val SixMbutton= findViewById<Button>(R.id.SixMBTN)

        SixMbutton.setOnClickListener {
            val intent = Intent(this, EXP22::class.java)
            startActivity(intent)
        }


                // Find the spinner in the layout
                val spinner: Spinner = findViewById(R.id.DropDown)

                // Create a list of items for the dropdown
                val items = listOf("    HOME","    6 Weeks","    6 Months","    Consultant")

                // Create an ArrayAdapter using the string array and a default spinner layout
                val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

                // Apply the adapter to the spinner
                spinner.adapter = adapter

                // Set an item selected listener
                spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                        when (position) {
                            1 -> {
                                // Navigate to Activity 1
                                val intent = Intent(this@SPLASHSCREEN11, EXP2::class.java)
                                startActivity(intent)
                            }
                            2 -> {
                                // Navigate to Activity 2
                                val intent = Intent(this@SPLASHSCREEN11, EXP22::class.java)
                                startActivity(intent)
                            }
                            3 -> {
                                // Navigate to Activity 3
                                val intent = Intent(this@SPLASHSCREEN11, Consultant::class.java)
                                startActivity(intent)
                            }
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>) {
                        // Code to execute when nothing is selected
                    }
                }


    }
        }



