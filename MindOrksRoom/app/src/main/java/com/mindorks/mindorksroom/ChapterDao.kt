package com.mindorks.mindorksroom

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
    fun insert(chapter: Chapter)

    @Query("SELECT * FROM MindOrksDb ORDER BY chapterName ASC")
    fun getAllChapter(): List<Chapter>
}