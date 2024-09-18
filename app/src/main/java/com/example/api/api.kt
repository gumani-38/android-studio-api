package com.example.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const  val BASE_URL = "https://dataservice.accuweather.com"
const val EBIRD_URL = "https://api.ebird.org"
object api {
    val accuRetrofit =  Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(Iweather::class.java)
    val eBirdRetrofit =  Retrofit.Builder().baseUrl(EBIRD_URL).addConverterFactory(GsonConverterFactory.create()).build().create(Iweather::class.java)
}