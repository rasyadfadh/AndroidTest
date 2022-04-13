package com.example.androidtest

import retrofit2.Response
import java.io.IOException

abstract class ApiRequest{
    suspend fun <T:Any> apirequest(call: suspend () -> Response<T>): T{
        val response = call.invoke()
        if (response.isSuccessful){
            return response.body()!!
        }else{
            throw ApiExcept(response.code().toString())
        }
    }
}

class ApiExcept(message: String): IOException(message)