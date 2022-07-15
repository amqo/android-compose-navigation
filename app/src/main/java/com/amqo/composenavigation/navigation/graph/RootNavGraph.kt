package com.amqo.composenavigation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetupRootNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Graph.HOME,
        route = Graph.ROOT
    ) {
        homeNavGraph(navController = navHostController)
        authNavGraph(navController = navHostController)
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "authentication_graph"
    const val HOME = "home_graph"
}