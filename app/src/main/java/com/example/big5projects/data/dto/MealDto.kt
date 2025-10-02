package com.example.big5projects.data.dto


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class MealDto(
    @SerializedName("meals")
    val meals: List<Meal?>?
) {
    @Keep
    data class Meal(
        @SerializedName("idMeal")
        val idMeal: String?,
        @SerializedName("strMeal")
        val strMeal: String?,
        @SerializedName("strMealThumb")
        val strMealThumb: String?
    )
}