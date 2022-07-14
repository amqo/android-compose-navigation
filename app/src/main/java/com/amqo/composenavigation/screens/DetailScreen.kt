package com.amqo.composenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.amqo.composenavigation.navigation.Screen

@Composable
fun DetailScreen(
    navController: NavController,
    id: Int,
    name: String
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier
            .clickable {
                navController.navigate(route = Screen.Home.route) {
                    popUpTo(Screen.Home.route) {
                        inclusive = true
                    }
                }
            },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Detail $id",
                color = Color.Red,
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.Bold
            )
            if (name.isNotBlank()) {
                Text(
                    text = name,
                    color = Color.Red,
                    style = MaterialTheme.typography.h3
                )
            }
        }
    }
}

@Preview(showBackground = true, heightDp = 320)
@Composable
fun DetailScreenPreview() {
    DetailScreen(
        navController = rememberNavController(), 1, "preview"
    )
}