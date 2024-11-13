package com.example.moviescompose.login

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.moviescompose.ui.theme.MoviesTheme

private const val s = "LoginActivity"

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var username: String? = "jamesbond"
        Log.i(
            "LoginActivity",
            "onCreate: ")

        enableEdgeToEdge()
        setContent {
            MoviesTheme {
                LoginScreen()
            }
        }

    }
}
