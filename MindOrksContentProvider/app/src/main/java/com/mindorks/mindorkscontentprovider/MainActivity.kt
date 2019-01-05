package com.mindorks.mindorkscontentprovider

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickDisplayEntries(view: View) {
        tvDisplayDataHere.text = ""
        var queryUri = Contract.CONTENT_URI.toString()
        var projection = arrayOf(Contract.CONTENT_PATH)
        var selectionClause: String?
        var selectionArgs: Array<String>? = null
        var sortOrder: String? = null

        when (view.id) {
            R.id.tvDisplayAll -> {
                selectionClause = null
                selectionArgs = null
            }
            R.id.tvDisplayFirst -> {
                selectionClause = Contract.WORD_ID + " = ?"
                selectionArgs = arrayOf("0")
            }
            else -> {
                selectionClause = null
                selectionArgs = null
            }
        }

        val cursor = contentResolver.query(Uri.parse(queryUri), projection, selectionClause,
                selectionArgs, sortOrder)

        if (cursor != null) {
            if (cursor.count > 0) {
                cursor.moveToFirst()
                val columnIndex = cursor.getColumnIndex(projection[0])
                do {
                    val word = cursor.getString(columnIndex)
                    tvDisplayDataHere.append(word + "\n")
                } while (cursor.moveToNext())
            } else {
                tvDisplayDataHere.append("No data returned." + "\n")
            }
            cursor.close()
        } else {
            tvDisplayDataHere.append("Cursor is null." + "\n")
        }
    }
}
