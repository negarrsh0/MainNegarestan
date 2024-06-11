package com.example.mainnegarestan.sharedp

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.navArgument

class UserPreferences(context: Context) {
//    private val PREF_NAME = "user_pref"
//    private val IS_LOGIN = "is_login"
//    private val KEY_PHONE_NUMBER = "phone_number"
//    private val KEY_PASSWORD = "password_key"

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("login_prefs", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_USERNAME = "username"
        private const val KEY_PASSWORD = "password"
        private const val KEY_LOGGED_IN = "logged_in"
    }

    fun isLoggedIn(): Boolean {
        return sharedPreferences.getBoolean(KEY_LOGGED_IN, false)
    }

    fun login(username: String, password: String) {
        sharedPreferences.edit().apply {
            putString(KEY_USERNAME, username)
            putString(KEY_PASSWORD, password)
            putBoolean(KEY_LOGGED_IN, true)
            apply()
        }
    }

    fun logout() {
        sharedPreferences.edit().apply {
            remove(KEY_USERNAME)
            remove(KEY_PASSWORD)
            putBoolean(KEY_LOGGED_IN, false)
            apply()
        }
    }

    fun getUsername(): String? {
        return sharedPreferences.getString(KEY_USERNAME, null)
    }

    fun getPassword(): String? {
        return sharedPreferences.getString(KEY_PASSWORD, null)
    }
}
