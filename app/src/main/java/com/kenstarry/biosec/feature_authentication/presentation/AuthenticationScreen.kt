package com.kenstarry.biosec.feature_authentication.presentation

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kenstarry.biosec.feature_authentication.presentation.components.AuthOptions
import com.kenstarry.biosec.ui.custom.spacing

@Composable
fun AuthenticationScreen(
    mainNavHostController: NavHostController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary)
            .padding(
                horizontal = MaterialTheme.spacing.medium,
                vertical = MaterialTheme.spacing.large
            )
    ) {

        Text(
            text = "Master Password",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSecondaryContainer
        )

        Spacer(modifier = Modifier.height(MaterialTheme.spacing.large))

        AuthOptions()

    }
}

@Preview(
    showSystemUi = true,
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun AuthenticationScreenPrev() {
    AuthenticationScreen(rememberNavController())
}



































