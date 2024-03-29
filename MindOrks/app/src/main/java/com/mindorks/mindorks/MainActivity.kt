package com.mindorks.mindorks

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMindorks.setOnClickListener {
            var mindorksIntent = Intent(this, MindorksActivity::class.java)
            startActivity(mindorksIntent)
        }

        btnGetmeanapp.setOnClickListener {
            var getmeanappIntent = Intent(this, GetmeanappActivity::class.java)
            startActivity(getmeanappIntent)
        }
    }
}