package com.example.androidmaster.superheroapp

import com.google.gson.annotations.SerializedName

data class Biography(
    @SerializedName("full-name") val fullName: String,
    @SerializedName("publisher") val publisher: String,
)