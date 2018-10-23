package com.rommelrico.currencyconverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    fun convertCurrency(view: View) {
        val editText = findViewById<EditText>(R.id.currencyText)
        val amountInDlls: String = editText.text.toString()
        val conversionAmount = 18
        val convertedAmount = amountInDlls.toDouble() * conversionAmount
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
