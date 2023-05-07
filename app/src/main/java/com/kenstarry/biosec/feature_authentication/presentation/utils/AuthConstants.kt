package com.kenstarry.biosec.feature_authentication.presentation.utils

import com.kenstarry.biosec.R
import com.kenstarry.biosec.feature_authentication.presentation.model.AuthOption

object AuthConstants {

    val auth_options = mutableListOf(
        AuthOption("Fingerprint", "Some description", R.raw.fingerprint_loop),
        AuthOption("Pin", "Some description", R.raw.padlock),
        AuthOption("Password", "Some description", R.raw.animation_lock),
        AuthOption("Pattern", "Some description", R.raw.media_grid)
    )
}