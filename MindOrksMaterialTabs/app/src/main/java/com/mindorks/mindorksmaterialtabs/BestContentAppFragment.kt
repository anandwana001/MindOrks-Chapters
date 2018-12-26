package com.mindorks.mindorksmaterialtabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_webview_getmeanapp.*

/**
 * Created by akshaynandwana on
 * 26, December, 2018
 **/
class BestContentAppFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.fragment_webview_best, container, false)!!
}