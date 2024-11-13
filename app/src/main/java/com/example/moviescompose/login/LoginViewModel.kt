package com.example.moviescompose.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class LoginViewModel: ViewModel() {

    val isLoggedFlow = MutableStateFlow(false)

    fun login(username: String, password: String) {
        if(username == "kotlin" && password == "rocks") {
            isLoggedFlow.value = true
        } else {
            isLoggedFlow.value = false
        }
    }
}