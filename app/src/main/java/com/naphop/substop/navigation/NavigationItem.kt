package com.naphop.substop.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val icon: ImageVector,
    val route: String
)

sealed class Screen(val route: String) {
    object Home: Screen("home_screen")
    object Subscription: Screen("subscription_screen")
    object Dashboard: Screen("dashboard_screen")
}

val navigationItems = listOf<NavigationItem>(
    NavigationItem(
        title = "Home",
        icon = Icons.Default.Home,
        route = Screen.Home.route
    ),
    NavigationItem(
        title = "Subscription",
        icon = Icons.Default.PlayArrow,
        route = Screen.Subscription.route
    ),
    NavigationItem(
        title = "Dashboard",
        icon = Icons.Default.DateRange,
        route = Screen.Dashboard.route
    )
)