package com.example.kotlin_basics

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_basics.model.WeatherResponse
import com.example.kotlin_basics.network.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherActivity : AppCompatActivity() {

    private lateinit var TextViewtemp: TextView;
    private lateinit var TextView_wind_speed: TextView;
    private lateinit var TextView_humidity: TextView;
    private lateinit var cityNameInput: EditText;
    private lateinit var fetchDataButton: Button;
    private val APIKEY = "a6f5d257af75203ecbac087c152364d2";

    private fun fetchWeatherData() {
        val retrofit = Retrofit.Builder().baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create()).build();

        val weatherService = retrofit.create(WeatherService::class.java);

        val call = weatherService.getWeather(cityNameInput.text.toString(),"metric",APIKEY);

        call.enqueue(object : Callback<WeatherResponse> {
            @Override
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                if (response.isSuccessful){
                    val weatherresponse = response.body();
                    if (weatherresponse != null){
                        val weatherInfo = weatherresponse.main.temp;
                        val humidity = weatherresponse.main.humidity;
                        val windSpeed = weatherresponse.wind.speed;
                        TextViewtemp.text = cityNameInput.text.toString() + " jelenlegi hőmérséklete: " + weatherInfo.toString() + " C°";
                        TextView_wind_speed.text = cityNameInput.text.toString() + " jelenlegi szél sebessége: " + windSpeed.toString() + " csomó";
                        TextView_humidity.text = cityNameInput.text.toString() + " jelenlegi páratartalma: " + humidity.toString();
                    }
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                Log.e("Hiba: ","Az api kérés során!")
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
        fetchDataButton.setOnClickListener(){fetchWeatherData()};

    }

}
