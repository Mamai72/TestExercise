package com.ib.testexercise.api

import com.ib.testexercise.data.Simpsons
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/")
    fun getApi(@Query("q") q: String, @Query("format") format: String):
            Call<Simpsons>
}