package com.example.api

import android.util.DisplayMetrics
import com.example.api.models.forecast.WeatherForecast
import com.example.api.models.forecast.ebird.Observation
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Iweather {
    @GET("/forecasts/v1/daily/5day/305449")
    suspend fun get5DayData(@Query("apikey") apiKey:String,@Query("metric") metrics: String):Response<WeatherForecast>
    @GET("/v2/data/obs/geo/recent")
    suspend fun getBirdData(@Query("lat") lat:String,@Query("lng") lng:String,@Query("key") key:String):Response<Observation>
}