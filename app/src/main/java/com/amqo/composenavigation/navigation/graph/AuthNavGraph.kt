package com.amqo.composenavigation.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.amqo.composenavigation.navigation.Screen
import com.amqo.composenavigation.screens.auth.LoginScreen
import com.amqo.composenavigation.screens.auth.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = Graph.AUTHENTICATION
    ) {
        composable(
            route = Screen.Login.route,
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route,
        ) {
            SignUpScreen(navController = navController)
        }
    }
}