package com.rommelrico.currencyconverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    fun convertCurrency(view: View) {
        val editText = findViewById<EditText>(R.id.currencyText)

        val amountInDlls: String = editText.text.toString()
        val conversionAmount = 18
        val convertedAmount = amountInDlls.toDouble() * conversionAmount

        val format = NumberFormat.getCurrencyInstance(Locale.US)
        val formattedAmount = format.format(amountInDlls.toDouble())
        val formattedConverted = format.format(convertedAmount)

        Toast.makeText(this, "$formattedAmount U.S. is $formattedConverted MXN", Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
