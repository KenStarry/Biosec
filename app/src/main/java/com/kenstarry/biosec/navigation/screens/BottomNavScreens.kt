package com.kenstarry.biosec.navigation.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BubbleChart
import androidx.compose.material.icons.outlined.GeneratingTokens
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.kenstarry.biosec.navigation.NavConstants as nav

sealed class BottomNavScreens(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {

    //  Home screen
    object Home : BottomNavScreens(
        route = nav.BOTTOM_HOME_ROUTE,
        title = "Home",
        icon = Icons.Outlined.Home
    )

    //  Generator screen
    object Generator : BottomNavScreens(
        route = nav.BOTTOM_GENERATOR_ROUTE,
        title = "Generator",
        icon = Icons.Outlined.GeneratingTokens
    )

    //  Home screen
    object Stats : BottomNavScreens(
        route = nav.BOTTOM_STATS_ROUTE,
        title = "Stats",
        icon = Icons.Outlined.BubbleChart
    )

    //  Home screen
    object Settings : BottomNavScreens(
        route = nav.BOTTOM_SETTINGS_ROUTE,
        title = "Settings",
        icon = Icons.Outlined.Settings
    )

}
