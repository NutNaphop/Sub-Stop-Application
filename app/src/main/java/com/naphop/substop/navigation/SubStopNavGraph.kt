package com.naphop.substop.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.naphop.substop.feature.home.presentation.HomeScreen
import com.naphop.substop.feature.subscription.presentation.SubscriptionScreen

@Composable
fun SubStopNavGraph(
    navController: NavHostController,
    modifier: Modifier
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ){
        composable(route = Screen.Home.route){
            HomeScreen()
        }
        composable(route = Screen.Subscription.route){
            SubscriptionScreen()
        }
        composable(route = Screen.Dashboard.route){
            Text("Hello World")
        }
    }
}