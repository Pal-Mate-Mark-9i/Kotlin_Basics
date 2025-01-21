package com.example.kotlin_basics

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val users = listOf(
            User("Gipsz Jakab","g@mail.hu",R.drawable.user)
        )

    }
}