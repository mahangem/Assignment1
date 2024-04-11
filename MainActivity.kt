package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ageNumber = findViewById<EditText>(R.id.txtAge)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..24 -> "Siyabonga Zubane"
                    in 25..29 -> "Dj Dimples"
                    in 30..34 -> "Riky Rick"
                    in 35..49 -> "Zahara"
                    in 40..44 -> "Tebello Motsoane"
                    in 45..49 -> "Kuli Roborts"
                    in 50..54 -> "Fatima Sydow"
                    in 55..59 -> "Jamie Barlett"
                    in 70..80 -> "Darek Watts"
                    in 82..95 -> "Nelson Mandela"
                    else -> "Senior"
                }
                txtResult.text = "Age : $age\n${
                    when (result) {
                        "Siyabonga Zubane" -> "Siyabonga Zubane died at the age of 23."
                        "Dj Dimples" -> "Dj Dimples died at the age of 29."
                        "Riky Rick" -> "Riky Rick died at the age of 34."
                        "Zahara" -> "Zahara died at the age of 36."
                        "Tebello Motsoane" -> "Tebello Motsoane died at the age of 41."
                        "Kuli Roborts" -> "Kuli Roborts died at the age of 49."
                        "Fatima Sydow" -> "Fatima Sydow died at the age of 50."
                        "Jamie Barlett" -> "Jamie Barlett died at the age of 55."
                        "Darek Watts" -> "Darek Watts died at the age of 74."
                        "Nelson Mandela" -> "Nelson Mandela died at the age of 95."
                        else -> "Senior."
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }

        }
        btnClear.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}








