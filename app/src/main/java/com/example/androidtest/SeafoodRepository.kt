package com.example.androidtest

class SeafoodRepository(
    private val api: ApiSeafood
) : ApiRequest() {

    suspend fun getSeafood() = apirequest { api.getseaFood() }
}