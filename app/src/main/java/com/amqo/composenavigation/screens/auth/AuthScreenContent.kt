package com.amqo.composenavigation.screens.auth

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AuthScreenContent(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Login: AuthScreenContent(
        route = "login",
        title = "Login",
        icon = Icons.Default.Person
    )
    object SigUp: AuthScreenContent(
        route = "signup",
        title = "Sign Up",
        icon = Icons.Default.Settings
    )
}
