package com.example.androidmaster.superheroapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDetailResponse(
    @SerializedName("name") val name: String,
    @SerializedName("powerstats") val powerstats: Powerstats,
    @SerializedName("image") val image: Image
)
