package com.example.day26projectapi

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getProductData() : Call<MyData>

}