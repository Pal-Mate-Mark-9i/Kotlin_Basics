package com.example.kotlin_basics

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_basics.model.BeerResponse
import com.example.kotlin_basics.network.BeersService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BeersListActivity : AppCompatActivity() {

    fun fetchBeersData() {
        val retrofit = Retrofit.Builder().baseUrl("https://punkapi.online/v3")
            .addConverterFactory(GsonConverterFactory.create()).build();

        val BeersService = retrofit.create(BeersService::class.java);

        val call = BeersService.getBeers(1);
        call.enqueue(object : Callback<BeerResponse> {
            override fun onResponse(call: Call<BeerResponse>, response: Response<BeerResponse>) {
                if (response.isSuccessful) {
                    val BeerResponse = response.body();
                    if (BeerResponse != null) {
                        Log.e("Eredmény: ", BeerResponse.Beers.toString())
                    }
                }
            }

            override fun onFailure(call: Call<BeerResponse>, t: Throwable) {
                Log.e("Hiba: ", "Az api kérés során!")
            }
        });
    };

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beers);

        fetchBeersData();
    };

};//fun vége