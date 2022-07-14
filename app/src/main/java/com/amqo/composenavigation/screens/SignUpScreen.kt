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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.amqo.composenavigation.navigation.Screen

@Composable
fun SignUpScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.popBackStack()
            },
            text = "Sign Up",
            color = Color.Red,
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true, heightDp = 320)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen(
        navController = rememberNavController()
    )
}