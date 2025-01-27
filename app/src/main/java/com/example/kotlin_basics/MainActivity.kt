package com.example.kotlin_basics

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_basics.ui.theme.Kotlin_BasicsTheme
import kotlin.jvm.internal.Intrinsics.Kotlin

class MainActivity : ComponentActivity() {

    private lateinit var greetingsButton: Button;
    private lateinit var calculatorButton: Button;
    private lateinit var weatherButton: Button;
    private lateinit var userListButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        greetingsButton = findViewById(R.id.greetingButton);
        calculatorButton = findViewById(R.id.calculatorButton);
        weatherButton = findViewById(R.id.weatherButton);
        userListButton = findViewById(R.id.userListButton);

        greetingsButton.setOnClickListener(){
            val intent1 = Intent(this,GreetingsActivity::class.java);
            startActivity(intent1);
        }

        calculatorButton.setOnClickListener(){
            val intent2 = Intent(this,CalculatorActivity::class.java);
            startActivity(intent2);
        }

        weatherButton.setOnClickListener(){
            val intent3 = Intent(this,WeatherActivity::class.java);
            startActivity(intent3);
        }

        userListButton.setOnClickListener(){
            val intent4 = Intent(this,UserListActivity::class.java);
            startActivity(intent4);
        }

        userListButton.setOnClickListener(){
            val intent5 = Intent(this,RandomUserListActivity::class.java);
            startActivity(intent5);
        }

        //UI elemek inicialiozállása

    }//oncreate
}//class
