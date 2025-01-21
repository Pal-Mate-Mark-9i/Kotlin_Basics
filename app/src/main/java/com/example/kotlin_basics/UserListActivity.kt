package com.example.kotlin_basics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_basics.adapter.UserAdapter
import com.example.kotlin_basics.model.User

class UserListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);


        val users = listOf(
            User("Gipsz Jakab","g@mail.hu",R.drawable.user),
            User("Gipsz Jakab","g@mail.hu",R.drawable.user),
            User("Gipsz Jakab","g@mail.hu",R.drawable.user),
            User("Gipsz Jakab","g@mail.hu",R.drawable.user),
            User("Gipsz Jakab","g@mail.hu",R.drawable.user),
            User("Gipsz Jakab","g@mail.hu",R.drawable.user),
        )

        val recyclerView: RecyclerView = findViewById(R.id.userRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(users);

    }
}