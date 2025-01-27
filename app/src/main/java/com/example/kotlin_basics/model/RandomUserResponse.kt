package com.example.kotlin_basics.model

data class RandomUserResponse(
    val results: List<RUser>,
)

data class RUser(
    val name: Name,
    val email: String,
    val picture: Picture,
    val location: Location,
)

data class Name(
    val title: String,
    val first: String,
    val last: String,
)

data class Picture(
    val large: String,
    val medium: String,
    val thumbnail: String,
)

data class Location(
    val country: String,
)
