package com.example.kotlin_basics.network;

import com.example.kotlin_basics.model.ColorResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface ColorService {

    fun getColor(
        @Query()
    ): Call<ColorResponse>;

}
