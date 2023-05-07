package com.kenstarry.biosec.feature_authentication.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kenstarry.biosec.feature_authentication.presentation.utils.AuthConstants
import com.kenstarry.biosec.ui.custom.spacing

@Composable
fun AuthOptions() {

    val listGridState = rememberLazyGridState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        state = listGridState,
        content = {
            items(AuthConstants.auth_options) {
                AuthOptionCard(title = it.title, rawFile = it.lottie)
            }
        },
        modifier = Modifier
            .wrapContentHeight(),
        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium),
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
    )
}

































