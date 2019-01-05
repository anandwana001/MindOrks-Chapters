package com.mindorks.mindorkscontentprovider

import android.net.Uri

/**
 * Created by akshaynandwana on
 * 05, January, 2019
 **/
class Contract  {

    companion object {
        val AUTHORITY = "com.mindorks.mindorkscontentprovider.provider"
        val CONTENT_PATH = "sentence"
        val CONTENT_URI = Uri.parse("content://$AUTHORITY/$CONTENT_PATH")

        val ALL_ITEMS = -2
        val WORD_ID = "id"
    }
}