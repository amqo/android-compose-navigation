package com.amqo.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.amqo.composenavigation.screens.AuthScreen

@Composable
fun RootNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Graph.HOME,
        route = Graph.ROOT
    ) {
        homeNavGraph(navController = navController)
        composable(route = Graph.AUTHENTICATION) {
            AuthScreen(onNavigateBack = {
                navController.navigate(Graph.HOME) {
                    popUpTo(Graph.HOME)
                }
            })
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "authentication_graph"
    const val HOME = "home_graph"
}