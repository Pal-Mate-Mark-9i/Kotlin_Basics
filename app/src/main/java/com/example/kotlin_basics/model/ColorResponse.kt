package com.example.kotlin_basics.model

data class ColorResponse(
    val data:List<Color>
)

data class Color(
    val id:Integer,
    val name:String,
    val year:Integer,
    val color:String,
    val pantone_value:String
)

