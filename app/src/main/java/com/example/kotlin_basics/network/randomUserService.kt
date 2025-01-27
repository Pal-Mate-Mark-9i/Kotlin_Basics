package com.example.kotlin_basics.network

import com.example.kotlin_basics.model.User
import com.example.kotlin_basics.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface randomUserService {
    @GET("/api/")
    suspend fun getRandomUserResponse(
        @Query("results") results: Int,
        /*@Query("name") name: String,
        @Query("email") email: String,
        @Query("picture") picture: String,
        @Query("country") country: String,*/
    ): RandomUserResponse;
}