package com.interview.app.model

import com.google.gson.annotations.SerializedName

data class Food(
    @SerializedName(value = "name")
    val foodName: String?,
    @SerializedName(value = "image")
    val image: String?,
    @SerializedName(value = "desc")
    val desc: String?

)