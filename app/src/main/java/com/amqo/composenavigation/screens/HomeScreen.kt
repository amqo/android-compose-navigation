package com.amqo.composenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.amqo.composenavigation.navigation.AUTHENTICATION_ROUTE
import com.amqo.composenavigation.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(
                        route = Screen.Detail.passArgs(id = 10, name = "John", surname = "Perez")
                    )
                },
                text = "Home",
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .padding(top = 150.dp)
                    .clickable {
                        navController.navigate(AUTHENTICATION_ROUTE)
                    },
                text = "Login / Sign Up",
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Preview(showBackground = true, heightDp = 720)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navController = rememberNavController()
    )
}