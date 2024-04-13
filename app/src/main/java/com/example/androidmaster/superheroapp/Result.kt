package com.example.androidmaster.superheroapp

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("id") val superheroeId: String,
    @SerializedName("name") val name: String,
    /*val appearance: Appearance,
    val biography: Biography,
    val connections: Connections,
    val image: Image,
    val powerstats: Powerstats,
    val work: Work*/
)