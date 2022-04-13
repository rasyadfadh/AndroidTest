package com.example.androidtest


import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiSeafood {
    @GET("meals")
    fun getseaFood(): Response<Meal>

    companion object{
        operator fun invoke(): ApiSeafood {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood")
                .build()
                .create(ApiSeafood::class.java)
        }
    }
}