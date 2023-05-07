package com.kenstarry.biosec.feature_authentication.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kenstarry.biosec.ui.custom.spacing

@Composable
fun AuthenticationScreen(
    mainNavHostController: NavHostController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary)
            .padding(MaterialTheme.spacing.medium)
    ) {

        Text(text = "Authentication screen")

    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun AuthenticationScreenPrev() {
    AuthenticationScreen(rememberNavController())
}



































