package com.christiangalera.motivation.infra

import android.content.Context

class SecurityPreferences(context: Context) {

    private val mSharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String? {
        return mSharedPreferences.getString(key, "")
    }
}