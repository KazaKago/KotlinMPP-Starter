package com.kazakago.kotlinmppstarter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kazakago.kotlinmppstarter.common.Preferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadButton.setOnClickListener {
            load()
        }
        saveButton.setOnClickListener {
            save()
        }

        load()
    }

    private fun load() {
        val preferences = Preferences(this)
        editText.setText(preferences.name)
    }

    private fun save() {
        val preferences = Preferences(this)
        preferences.name = editText.text.toString()
    }

}
