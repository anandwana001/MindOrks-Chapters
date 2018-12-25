package com.mindorks.mindorkswebview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_getmeanapp.*

/**
 * Created by akshaynandwana on
 * 24, December, 2018
 **/
class GetmeanappActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getmeanapp)
        wvGetmeanapp.loadUrl("https://getmeanapp.com/")
    }
}