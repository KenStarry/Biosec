package com.kenstarry.biosec.feature_authentication.presentation.utils

import androidx.compose.ui.unit.dp
import com.kenstarry.biosec.R
import com.kenstarry.biosec.feature_authentication.presentation.model.AuthOption

object AuthConstants {

    val auth_options = mutableListOf(
        AuthOption("Fingerprint", "Some description", R.raw.fingerprint_loop, 100.dp),
        AuthOption("Pin", "Some description", R.raw.padlock, 100.dp),
        AuthOption("Password", "Some description", R.raw.animation_lock, 100.dp),
        AuthOption("Pattern", "Some description", R.raw.media_grid, 100.dp)
    )
}