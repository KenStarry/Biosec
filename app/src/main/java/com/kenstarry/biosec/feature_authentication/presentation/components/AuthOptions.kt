package com.kenstarry.biosec.feature_authentication.presentation.components

import android.util.Log
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kenstarry.biosec.feature_authentication.presentation.utils.AuthConstants
import com.kenstarry.biosec.feature_authentication.presentation.viewmodel.AuthViewModel
import com.kenstarry.biosec.ui.custom.spacing

@Composable
fun AuthOptions(
    authVM: AuthViewModel
) {

    val listGridState = rememberLazyGridState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        state = listGridState,
        content = {
            //  animate the items
            itemsIndexed(AuthConstants.auth_options) { index, option ->
                AuthOptionCard(
                    title = option.title,
                    rawFile = option.lottie,
                    lottieSize = option.lottieSize,
                    onCardClicked = {
                        //  open page specific to the password type clicked
                    }
                )
            }
        },
        modifier = Modifier
            .wrapContentHeight(),
        verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium),
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
    )
}

































