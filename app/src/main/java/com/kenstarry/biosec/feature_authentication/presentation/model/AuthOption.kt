package com.kenstarry.biosec.feature_authentication.presentation.model

import androidx.compose.ui.unit.Dp
import com.airbnb.lottie.Lottie

data class AuthOption(
    val title: String,
    val description: String,
    val lottie: Int,
    val lottieSize: Dp
)
