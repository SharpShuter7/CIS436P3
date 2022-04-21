package com.nshute.cis436p3.ui.main

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface CatService{
    @Headers("x-api-key: d416e23e-5a60-4981-b384-00b1ba730db3")
    @GET("images/search?mime_types=gif&limit=10")
    fun getImage(): Call<List<Cat>>
}