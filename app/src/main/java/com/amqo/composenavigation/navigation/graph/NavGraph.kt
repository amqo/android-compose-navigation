package com.amqo.composenavigation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.amqo.composenavigation.navigation.HOME_ROUTE
import com.amqo.composenavigation.navigation.ROOT_ROUTE

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navHostController)
        authNavGraph(navController = navHostController)
    }
}