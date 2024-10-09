package com.example.csc475_cta7

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField = findViewById<EditText>(R.id.input_value)
        val convertButton = findViewById<Button>(R.id.convert_button)
        val resultField = findViewById<TextView>(R.id.result_value)
        val unitSpinner = findViewById<Spinner>(R.id.unit_spinner)

        convertButton.setOnClickListener {
            val inputValue = inputField.text.toString().toDoubleOrNull()
            if (inputValue != null) {
                val selectedUnit = unitSpinner.selectedItem.toString()
                val result = when (selectedUnit) {
                    "Meters to Feet" -> ConversionUtils.metersToFeet(inputValue)
                    "Feet to Meters" -> ConversionUtils.feetToMeters(inputValue)
                    else -> 0.0
                }
                resultField.text = result.toString()
            } else {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
