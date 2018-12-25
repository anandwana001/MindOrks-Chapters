package com.mindorks.mindorkswebview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_localhtml.*

/**
 * Created by akshaynandwana on
 * 25, December, 2018
 **/
class LocalHtmlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localhtml)
        wvLocalhtml.loadUrl("file:///android_asset/localhtml.html")
    }
}