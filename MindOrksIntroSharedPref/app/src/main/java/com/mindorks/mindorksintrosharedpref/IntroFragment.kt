package com.mindorks.mindorksintrosharedpref

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_intro_screen.*

/**
 * Created by akshaynandwana on
 * 26, December, 2018
 **/
class IntroFragment : Fragment() {

    companion object {
        fun newInstance(title: String): Fragment {
            val fragment = IntroFragment()
            val args = Bundle()
            args.putString("title", title)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.fragment_intro_screen, container, false)!!

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tvTitle.text = arguments!!.getString("title")
    }
}