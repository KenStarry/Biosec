package com.kenstarry.biosec.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kenstarry.biosec.MainScreen
import com.kenstarry.biosec.navigation.NavConstants
import com.kenstarry.biosec.navigation.screens.Screens

fun NavGraphBuilder.homeNavGraph(
    mainNavHostController: NavHostController
) {

    navigation(
        startDestination = Screens.Main.route,
        route = NavConstants.HOME_ROUTE
    ) {

        composable(route = Screens.Main.route) {
            MainScreen(mainNavHostController)
        }

    }

}