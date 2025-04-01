package com.example.kotlin_basics.model

data class BeerResponse(
    val Beers: List<Beer>,
)

data class Beer(
    val name:String,
    val description: String,
    val contributed_by:String,
);