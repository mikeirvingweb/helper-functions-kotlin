package com.mycompany.myapp

import android.app.Application
import android.content.Context
import android.content.pm.PackageManager
import android.view.View
import android.content.SharedPreferences
import android.os.Bundle
import android.app.Activity

class MyApp : Application() {
    companion object {
        lateinit var instance: Context private set

        /* Decare references to the Function files */
		lateinit var dateFunctions : DateFunctions
        lateinit var keyboardFunctions : KeyboardFunctions
        lateinit var stringFunctions : StringFunctions
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        /* Set references to the Function files */
		MyApp.dateFunctions = DateFunctions()
        MyApp.keyboardFunctions = KeyboardFunctions()
        MyApp.stringFunctions = StringFunctions()
    }
}