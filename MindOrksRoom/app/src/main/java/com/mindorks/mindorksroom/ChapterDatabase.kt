package com.mindorks.mindorksroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by akshaynandwana on
 * 07, January, 2019
 **/
@Database(entities = arrayOf(Chapter::class), version = 1)
abstract class ChapterDatabase : RoomDatabase() {

    abstract fun chapterDao(): ChapterDao

    companion object {
        private var INSTANCE: ChapterDatabase? = null

        fun getDatabase(context: Context): ChapterDatabase? {
            if (INSTANCE == null) {
                synchronized(ChapterDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        ChapterDatabase::class.java, "chapter.db"
                    ).build()
                }
            }
            return INSTANCE
        }
    }
}