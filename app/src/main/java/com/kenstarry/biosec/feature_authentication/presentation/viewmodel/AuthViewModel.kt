package com.kenstarry.biosec.feature_authentication.presentation.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.kenstarry.biosec.feature_authentication.domain.model.AuthEvents

class AuthViewModel : ViewModel() {

    private val _passwordOptionClicked = mutableStateOf<String>("Pin")
    val passwordOptionClicked: State<String> = _passwordOptionClicked

    fun onEvent(event: AuthEvents) {
        when (event) {

            is AuthEvents.PasswordOptionClicked -> {
                _passwordOptionClicked.value = event.option
            }
        }
    }
}





























