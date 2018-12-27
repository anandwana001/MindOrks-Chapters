package com.mindorks.mindorksintrosharedpref

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * Created by akshaynandwana on
 * 26, December, 2018
 **/
class IntroViewPagerAdapter(supportFragmentManager: FragmentManager) : FragmentStatePagerAdapter(supportFragmentManager) {

    override fun getItem(position: Int): Fragment {
        return IntroFragment.newInstance("Title" + position)
    }

    override fun getCount(): Int {
        return 4
    }
}