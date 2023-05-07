package com.kenstarry.biosec.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kenstarry.biosec.feature_generator.presentation.GeneratorScreen
import com.kenstarry.biosec.feature_home.presentation.HomeScreen
import com.kenstarry.biosec.feature_settings.presentation.SettingsScreen
import com.kenstarry.biosec.feature_stats.presentation.StatsScreen
import com.kenstarry.biosec.navigation.NavConstants
import com.kenstarry.biosec.navigation.screens.BottomNavScreens

@Composable
fun HomeBottomNavGraph(
    mainNavHostController: NavHostController,
    innerNavHostController: NavHostController
) {

    NavHost(
        navController = mainNavHostController,
        startDestination = BottomNavScreens.Home.route
    ) {

        composable(route = BottomNavScreens.Home.route) {
            HomeScreen(innerNavHostController = innerNavHostController)
        }

        composable(route = BottomNavScreens.Generator.route) {
            GeneratorScreen(innerNavHostController = innerNavHostController)
        }

        composable(route = BottomNavScreens.Stats.route) {
            StatsScreen(innerNavHostController = innerNavHostController)
        }

        composable(route = BottomNavScreens.Settings.route) {
            SettingsScreen(innerNavHostController = innerNavHostController)
        }

    }

}