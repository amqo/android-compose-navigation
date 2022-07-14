package com.amqo.composenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route,
        ) {
            HomeScreen(navController = navHostController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(DETAIL_ARGUMENT_ID) {
                type = NavType.IntType
            })
        ) {
            val idArgument = it.arguments?.getInt(DETAIL_ARGUMENT_ID) ?: 0
            val nameArgument = it.arguments?.getString(DETAIL_ARGUMENT_NAME) ?: "nadie"
            DetailScreen(navController = navHostController, id = idArgument, name = nameArgument)
        }
    }
}