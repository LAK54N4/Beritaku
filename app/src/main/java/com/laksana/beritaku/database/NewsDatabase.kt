package com.laksana.beritaku.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.laksana.beritaku.models.Result

@Database(
    entities = [Result::class],
    version = 1
)
abstract class NewsDatabase: RoomDatabase() {

    abstract fun getNewsDao() : NewsDao

    companion object {
        @Volatile
        private var instance: NewsDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                NewsDatabase::class.java,
                "news_db.db"
        ).build()
    }
}