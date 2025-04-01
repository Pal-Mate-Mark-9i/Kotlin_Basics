//package com.example.kotlin_basics
/*
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_basics.model.ColorResponse
import com.example.kotlin_basics.network.ColorService
import com.example.kotlin_basics.network.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ColorListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_color_list)

        private fun fetchColorData() {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://reqres.in/api/unknown")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val colorService = retrofit.create(ColorService::class.java)

            val call = colorService;

            call.enqueue(object : <Callback<ColorResponse::class.java> {
                override fun onResponse(
                    call: Call<ColorResponse>,
                    response: Response<ColorResponse>
                ) {
                    if (response.isSuccessful) {
                        val colorResponse = response.body()
                        if (colorResponse != null) {
                            val colorInfo =
                                colorResponse.data // Eredmény kiírása a logba Log.d("WeatherActivity", weatherInfo.toString())

// Eredmény kiírása a képernyőre textviewTemp.text = weatherInfo.toString()
                        }
                    }
                }

                override fun onFailure(call: Call<ColorResponse>, t: Throwable) {
                    Log.e("WeatherActivity", "Hiba az API lekérés során", t)
                }
            })
        }

    }
}*/