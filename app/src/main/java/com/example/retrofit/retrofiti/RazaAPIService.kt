package com.example.retrofit.retrofiti

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface RazaAPIService {

    @GET
    suspend fun getRecurso(@Url url: String): Response<Raza>


}