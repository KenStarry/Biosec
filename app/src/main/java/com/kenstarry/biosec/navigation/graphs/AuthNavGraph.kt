package com.kenstarry.biosec.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kenstarry.biosec.feature_authentication.presentation.AuthenticationScreen
import com.kenstarry.biosec.navigation.NavConstants
import com.kenstarry.biosec.navigation.screens.Screens

fun NavGraphBuilder.authNavGraph(
    mainNavHostController: NavHostController
) {
    
    navigation(
        startDestination = Screens.Auth.route,
        route = NavConstants.AUTH_ROUTE
    ) {
        composable(route = Screens.Auth.route) {
            AuthenticationScreen(mainNavHostController = mainNavHostController)
        }
    }
    
}