package com.laksana.beritaku.repository

import com.laksana.beritaku.api.RetrofitInstance
import com.laksana.beritaku.database.NewsDatabase

class NewsRepository(
    val db: NewsDatabase
) {
    suspend fun getNews() =
        RetrofitInstance.api.getNews()
}