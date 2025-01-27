package com.example.kotlin_basics

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

        private fun fetchRandomUserData() {
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
                        if (RandomUserResponse != null) {
                           Log.e("Eredmény: " , RandomUserResponse.results.toString())
                        }
                    }
                }

                override fun onFailure(call: Call<RandomUserResponse>, t: Throwable) {
                    Log.e("Hiba: ", "Az api kérés során!")
                }
            });

        };//fun vége

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_weather)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

            TextViewtemp = findViewById(R.id.TextView_temp);
            TextView_wind_speed = findViewById(R.id.TextView_wind_speed);
            TextView_humidity = findViewById(R.id.TextView_humidity);
            cityNameInput = findViewById(R.id.cityNameInput);
            fetchDataButton = findViewById(R.id.fetcDataButon)
            fetchDataButton.setOnClickListener() { fetchWeatherData() };

        }

//        val recyclerView: RecyclerView = findViewById(R.id.userRecycleView)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = UserAdapter(users);

    }
}