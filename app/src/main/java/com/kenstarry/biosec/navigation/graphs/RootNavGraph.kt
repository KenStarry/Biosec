package com.kenstarry.biosec.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kenstarry.biosec.navigation.NavConstants

@Composable
fun RootNavGraph(mainNavHostController: NavHostController
) {

    NavHost(
        navController = mainNavHostController,
        startDestination = NavConstants.AUTH_ROUTE
    ) {

        //  other routes
        authNavGraph(mainNavHostController)
        homeNavGraph(mainNavHostController)
    }

}