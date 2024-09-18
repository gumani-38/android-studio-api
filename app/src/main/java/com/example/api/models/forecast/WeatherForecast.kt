package com.example.api.models.forecast

data class WeatherForecast(
    val DailyForecasts: List<DailyForecast>,
    val Headline: Headline
)