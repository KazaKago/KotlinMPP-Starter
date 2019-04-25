package com.kazakago.kotlinmppstarter.common

import platform.Foundation.NSUserDefaults

actual class Preferences {

    private val userDefaults = NSUserDefaults.standardUserDefaults

    actual var name: String
        get() = userDefaults.stringForKey("name") ?: ""
        set(value) = userDefaults.setObject(value, "name")

}