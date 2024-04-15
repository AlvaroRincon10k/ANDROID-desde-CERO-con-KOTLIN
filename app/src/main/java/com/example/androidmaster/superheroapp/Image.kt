package com.example.androidmaster.superheroapp

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("url") val url: String
)