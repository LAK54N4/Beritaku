package com.laksana.beritaku.api

import com.laksana.beritaku.models.NewsResponse
import com.laksana.beritaku.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("svc/news/v3/content/all/all.json")
    suspend fun getNews(
        @Query("api-key")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
    /*
    @GET("svc/mostpopular/v2/viewed/1.json")
    suspend fun getPopular(
        @Query("api-key")
        apikey: String = API_KEY
    ): Response<PopularResponse> // belum create
    */
}