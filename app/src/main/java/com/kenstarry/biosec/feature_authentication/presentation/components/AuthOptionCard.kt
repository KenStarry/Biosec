package com.kenstarry.biosec.feature_authentication.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kenstarry.biosec.R
import com.kenstarry.biosec.core.presentation.components.MyLottie
import com.kenstarry.biosec.ui.custom.spacing

@Composable
fun AuthOptionCard(
    title: String,
    rawFile: Int,
    lottieSize: Dp,
    onCardClicked: () -> Unit
) {

    Card(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .clickable { onCardClicked() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f)
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(MaterialTheme.spacing.medium),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            //  lottie file
            MyLottie(
                rawFile = rawFile,
                iterations = 1,
                isPlaying = true,
                modifier = Modifier
                    .size(lottieSize)
            )

            //  text
            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )

        }

    }

}

@Preview
@Composable
fun AuthOptionCardPrev() {
    AuthOptionCard(
        "Fingerprint",
        R.raw.padlock,
        100.dp,
        onCardClicked = {}
    )
}