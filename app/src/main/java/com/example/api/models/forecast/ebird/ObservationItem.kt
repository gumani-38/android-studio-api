package com.example.api.models.forecast.ebird

data class ObservationItem(
    val comName: String,
    val howMany: Int,
    val lat: Double,
    val lng: Double,
    val locId: String,
    val locName: String,
    val locationPrivate: Boolean,
    val obsDt: String,
    val obsReviewed: Boolean,
    val obsValid: Boolean,
    val sciName: String,
    val speciesCode: String,
    val subId: String
)