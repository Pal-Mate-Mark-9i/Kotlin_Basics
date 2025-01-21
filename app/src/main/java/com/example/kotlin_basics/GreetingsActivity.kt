package com.example.kotlin_basics

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//AppCompatActivity()
class GreetingsActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var greetingButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_greetings)
        nameEditText = findViewById(R.id.nameEditText)
        greetingButton = findViewById(R.id.greetingButton)
        resultTextView = findViewById(R.id.resultTextView)

        greetingButton.setOnClickListener(){
            val name = nameEditText.text
            if (name.isNotEmpty()){
                val greetinText = when {
                    name.length <= 3 -> "Hello $name! De rövid neved van!"
                    name.length >= 10 -> "Hello $name! De hosszú neved van!"
                    else -> "Hello $name!"
                }
                //eredemyn megjelenítése
                resultTextView.text = greetinText
            } else{
                //üresen hagyás esetén:
                Toast.makeText(
                    this,
                    "Kérlek add meg a neved!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

    }
}