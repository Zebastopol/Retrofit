package com.example.retrofit.retrofiti

import com.google.gson.annotations.SerializedName

class Raza {

    @SerializedName("status")
    var status: String,
    @SerializedName("message")
    var imagenes: List<String>

}