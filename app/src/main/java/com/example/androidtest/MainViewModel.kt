package com.example.androidtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainViewModel constructor(private val repository: SeafoodRepository,private val repositorydetail: LookUpRepository)  : ViewModel() {

    val mealList = MutableLiveData<List<Meal>>()
    val errorMessage = MutableLiveData<String>()
    val detailList = MutableLiveData<List<MealX>>()

    fun Seafood() {
        val response = repository.getSeafood()
        response.enqueue(object : Callback<List<Meal>> {
            fun onResponse(call: Call<List<Meal>>, response: Response<List<Meal>>) {
                mealList.postValue(response.body())
            }
            fun onFailure(call: Call<List<Meal>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }

    fun Detail() {
        val response = repositorydetail.getDetail()
        response.enqueue(object : Callback<List<MealX>> {
            fun onResponse(call: Call<List<MealX>>, response: Response<List<MealX>>) {
                detailList.postValue(response.body())
            }
            fun onFailure(call: Call<List<Meal>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
}