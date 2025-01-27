package com.example.kotlin_basics.network

import com.example.kotlin_basics.model.User
import com.example.kotlin_basics.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface randomUserService {

    @GET("https://randomuser.me/api")
    fun getRandomUserResponse(
        @Query("results") results: String,
        @Query("name") name: String,
        @Query("email") email: String,
        @Query("profileImg") profileImg: Int,
        @Query("country") country: String,
    ): Call<User>

}