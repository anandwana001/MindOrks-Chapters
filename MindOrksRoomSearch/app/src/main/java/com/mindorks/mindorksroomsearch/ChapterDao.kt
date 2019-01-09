package com.mindorks.mindorksroomsearch

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


/**
 * Created by akshaynandwana on
 * 07, January, 2019
 **/
@Dao
interface ChapterDao {
    @Insert
    fun insert(chapter: Array<Chapter>)

    @Query("SELECT * FROM MindOrksDb  WHERE chapterName LIKE :query")
    fun getChapterName(query: String): LiveData<List<Chapter>>
}