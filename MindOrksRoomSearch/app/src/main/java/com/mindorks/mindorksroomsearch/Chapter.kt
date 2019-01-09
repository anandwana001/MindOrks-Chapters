package com.mindorks.mindorksroomsearch

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by akshaynandwana on
 * 07, January, 2019
 **/
@Entity(tableName = "MindOrksDb")
data class Chapter(
    @PrimaryKey
    @ColumnInfo(name = "chapterName") val chapterName: String
) {
    companion object {
        fun populateData(): Array<Chapter> {
            return arrayOf<Chapter>(
                Chapter("MindOrks"),
                Chapter("GetMeAnApp"),
                Chapter("BestContentApp"),
                Chapter("Hackerspace")
            )
        }
    }
}