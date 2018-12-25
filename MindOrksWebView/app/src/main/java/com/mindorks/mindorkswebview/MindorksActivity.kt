package com.mindorks.mindorkswebview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mindorks.*


/**
 * Created by akshaynandwana on
 * 24, December, 2018
 **/
class MindorksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mindorks)
        wvMindorks.loadUrl("https://mindorks.com/")
    }
}