package com.laksana.beritaku.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.laksana.beritaku.models.Result

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(news: Result): Long

    @Query("SELECT * FROM result")
    fun getAllNews(): LiveData<List<Result>>

    @Delete
    suspend fun deleteNews(news: Result)
}