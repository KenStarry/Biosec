package com.kenstarry.biosec.feature_authentication.domain.model

sealed class AuthEvents {

    data class PasswordOptionClicked(
        val option: String
    ) : AuthEvents()
}
