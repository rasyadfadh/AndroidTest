package com.example.androidtest

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiLookUp{
    @GET("meals")
    fun getLookUp(): Response<MealX>

    companion object{
        operator fun invoke(): ApiLookUp {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://www.themealdb.com/api/json/v1/1/lookup.php?i=52772")
                .build()
                .create(ApiLookUp::class.java)

        }
    }

}