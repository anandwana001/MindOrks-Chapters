package com.mindorks.mindorksintrosharedpref

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var PRIVATE_MODE = 0
    private val PREF_NAME = "mindorks-welcome"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPref: SharedPreferences = getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        if (sharedPref.getBoolean(PREF_NAME, false)) {
            val homeIntent = Intent(this, HomeActivity::class.java)
            startActivity(homeIntent)
            finish()
        } else {
            setContentView(R.layout.activity_main)
            setViewPager()
            val editor = sharedPref.edit()
            editor.putBoolean(PREF_NAME, true)
            editor.apply()
        }
    }

    private fun setViewPager() {
        val introViewPagerAdapter = IntroViewPagerAdapter(supportFragmentManager)
        vpIntro.adapter = introViewPagerAdapter

        val bg_color = resources.getIntArray(R.array.bg_color)

        vpIntro.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                vpIntro.setBackgroundColor(bg_color[position])
            }
        })
    }
}
