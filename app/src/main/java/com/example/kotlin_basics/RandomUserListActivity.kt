package com.example.kotlin_basics

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_basics.adapter.UserAdapter
import com.example.kotlin_basics.model.RandomUserResponse
import com.example.kotlin_basics.network.randomUserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RandomUserListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_users);

        fetchRandomUserData();
    }

    fun fetchRandomUserData() {
        val retrofit = Retrofit.Builder().baseUrl("https://randomuser.me/api/")
            .addConverterFactory(GsonConverterFactory.create()).build();

        val randomUserService = retrofit.create(randomUserService::class.java);

        val call = randomUserService.getRandomUsers(10);
        call.enqueue(object : Callback<RandomUserResponse> {
            override fun onResponse(
                call: Call<RandomUserResponse>,
                response: Response<RandomUserResponse>
            ) {
                if (response.isSuccessful) {
                    val RandomUserResponse = response.body();
                    if (RandomUserResponse != null) { Log.e("Eredmény: ", RandomUserResponse.results.toString())
                    }
                }
            }

            override fun onFailure(call: Call<RandomUserResponse>, t: Throwable) {
                Log.e("Hiba: ", "Az api kérés során!")
            }
        });

    };//fun vége

}