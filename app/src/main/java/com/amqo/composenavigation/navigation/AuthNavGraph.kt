package com.amqo.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.amqo.composenavigation.screens.auth.AuthScreenContent
import com.amqo.composenavigation.screens.auth.LoginScreen
import com.amqo.composenavigation.screens.auth.SignUpScreen

@Composable
fun AuthNavGraph(
    onNavigateBack: () -> Unit,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AuthScreenContent.Login.route,
        route = Graph.AUTHENTICATION
    ) {
        composable(
            route = AuthScreenContent.Login.route,
        ) {
            LoginScreen(
                onNavigateBack = onNavigateBack,
                navController = navController
            )
        }
        composable(
            route = AuthScreenContent.SigUp.route,
        ) {
            SignUpScreen(navController = navController)
        }
    }
}