package com.amqo.composenavigation.navigation.graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.amqo.composenavigation.navigation.*
import com.amqo.composenavigation.screens.DetailScreen
import com.amqo.composenavigation.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.Home.route,
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_ID) {
                    type = NavType.IntType
                },
                navArgument(DETAIL_ARGUMENT_NAME) {
                    type = NavType.StringType
                    nullable
                },
                navArgument(DETAIL_ARGUMENT_SURNAME) {
                    type = NavType.StringType
                    nullable
                }
            )
        ) {
            val idArgument = it.arguments?.getInt(DETAIL_ARGUMENT_ID) ?: 0
            val nameArgument = it.arguments?.getString(DETAIL_ARGUMENT_NAME)
            val surnameArgument = it.arguments?.getString(DETAIL_ARGUMENT_SURNAME)
            DetailScreen(
                navController = navController,
                id = idArgument,
                name = "$nameArgument $surnameArgument"
            )
        }
    }
}