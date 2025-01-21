package com.example.kotlin_basics.network

import com.example.kotlin_basics.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {

    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") cityname: String,
        @Query("units") units: String,
        @Query("appid") apiKey: String,
    ): Call<WeatherResponse>
};
