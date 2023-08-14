package com.example.librarytest

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.mylibrary.BruceLeeQuotes

class MainActivity : ComponentActivity() {
    private lateinit var quoteTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quoteTextView = findViewById(R.id.quoteTextView)
    }

    fun generateQuote(view: android.view.View) {
        val bruceLeeQuote = BruceLeeQuotes().getRandomBruceLeeQuote()
        quoteTextView.text = bruceLeeQuote
    }
}