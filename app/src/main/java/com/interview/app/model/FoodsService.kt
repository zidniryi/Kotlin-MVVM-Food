package com.interview.app.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class FoodsService {
    private val BASE_URL = "http://34.101.86.157:7000"
    private val api: FoodApi

    init {
        api =
            Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build().create(FoodApi::class.java)
    }

    fun getFoods(): Single<List<Food>> {
        return api.getCountries()
    }
}