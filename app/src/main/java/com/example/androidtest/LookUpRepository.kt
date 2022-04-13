package com.example.androidtest

class LookUpRepository (
    private val api: ApiLookUp
) : ApiRequest() {

    suspend fun getDetail() = apirequest { api.getLookUp() }
}