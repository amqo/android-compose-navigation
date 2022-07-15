package com.amqo.composenavigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.amqo.composenavigation.screens.home.*

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    composable(
        route = HomeScreenContent.Home.route,
    ) {
        HomeScreen(navController = navController)
    }
    composable(
        route = HomeScreenContent.Detail.route,
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