package com.naphop.substop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.naphop.substop.feature.home.presentation.HomeScreen
import com.naphop.substop.core.theme.SubstopTheme
import com.naphop.substop.feature.subscription.presentation.SubscriptionScreen
import com.naphop.substop.navigation.Screen
import com.naphop.substop.navigation.SubStopNavGraph
import com.naphop.substop.navigation.components.SubStopNavigationBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SubstopTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { SubStopNavigationBar(navController) }
    ){ innerPadding ->
        SubStopNavGraph(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}
