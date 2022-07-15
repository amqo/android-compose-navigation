package com.amqo.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.amqo.composenavigation.screens.AuthScreen
import com.amqo.composenavigation.screens.home.HomeScreenContent

@Composable
fun RootNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Graph.HOME,
        route = Graph.ROOT
    ) {
        navigation(
            startDestination = HomeScreenContent.Home.route,
            route = Graph.HOME
        ) {
            homeNavGraph(navController = navController)
        }
        composable(route = Graph.AUTHENTICATION) {
            AuthScreen {
                navController.navigate(Graph.HOME) {
                    popUpTo(Graph.HOME)
                }
            }
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "authentication_graph"
    const val HOME = "home_graph"
}