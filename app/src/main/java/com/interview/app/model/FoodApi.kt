package com.interview.app.model

import io.reactivex.Single
import retrofit2.http.GET
//Tod
interface FoodApi {
    //Todo for get the api
    @GET("foods")
    fun  getCountries(): Single<List<Food>>

}