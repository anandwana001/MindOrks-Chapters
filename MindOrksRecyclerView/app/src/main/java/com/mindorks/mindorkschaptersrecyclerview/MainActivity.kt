package com.mindorks.mindorkschaptersrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val chaptersList: ArrayList<String> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chaptersList.add("Android MVP Introduction")
        chaptersList.add("Learn RxJava")
        chaptersList.add("Advance Kotlin")

        layoutManager = LinearLayoutManager(this)
        rvChapterList.layoutManager = layoutManager
        rvChapterList.adapter = ChapterAdapter(this, chaptersList)
    }
}
