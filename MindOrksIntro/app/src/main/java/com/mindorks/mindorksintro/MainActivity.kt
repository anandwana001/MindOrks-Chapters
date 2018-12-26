package com.mindorks.mindorksintro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var introViewPagerAdapter = IntroViewPagerAdapter(supportFragmentManager)
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
