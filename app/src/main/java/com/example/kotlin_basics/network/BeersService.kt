package com.example.kotlin_basics.network

import com.example.kotlin_basics.model.BeerResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BeersService {
    @GET("/beers?page=1")
    fun getBeers(
        @Query("Beer") Beers: Int,
    ): Call<BeerResponse>;
}