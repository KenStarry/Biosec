package com.kenstarry.biosec.navigation.screens

import com.kenstarry.biosec.navigation.NavConstants

sealed class Screens(
    val route: String
) {

    //  main screen
    object Main : Screens(route = NavConstants.MAIN_SCREEN_ROUTE)

    //  authentication screen
    object Auth : Screens(route = NavConstants.AUTH_SCREEN_ROUTE)
}
