package com.laksana.beritaku.models


import com.google.gson.annotations.SerializedName

data class NewsResponse(
    val copyright: String,
    @SerializedName("num_results")
    val numResults: Int,
    val results: List<Result>,
    val status: String
)