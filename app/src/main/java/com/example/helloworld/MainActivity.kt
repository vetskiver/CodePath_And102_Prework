package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton = findViewById<Button>(R.id.helloButton)
        helloButton.setBackgroundResource(R.drawable.button_rounded_yellow)
        helloButton.setOnClickListener {
            Log.v("Hello world", "Hello Button clicked!")
            Toast.makeText(this, getString(R.string.greet_response), Toast.LENGTH_SHORT).show()
        }

        val goodbyeButton = findViewById<Button>(R.id.goodbyeButton)
        goodbyeButton.setBackgroundResource(R.drawable.button_rounded_yellow)
        goodbyeButton.setOnClickListener {
            Log.v("Goodbye world", "Goodbye Button clicked!")
            Toast.makeText(this, getString(R.string.goodbye_response), Toast.LENGTH_SHORT).show()
        }
    }
}