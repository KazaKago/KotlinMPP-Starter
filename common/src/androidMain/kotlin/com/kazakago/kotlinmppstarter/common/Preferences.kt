package com.kazakago.kotlinmppstarter.common

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

actual class Preferences(context: Context) {

    private val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    actual var name: String
        get() = sharedPreferences.getString("name", "")!!
        set(value) = sharedPreferences.edit().putString("name", value).apply()

}