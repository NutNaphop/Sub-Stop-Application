package com.naphop.substop.feature.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.createGraph
import com.naphop.substop.core.components.CustomText
import com.naphop.substop.core.theme.SubstopTheme
import com.naphop.substop.navigation.Screen
import com.naphop.substop.navigation.components.SubStopNavigationBar

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Home Screen")
    }
}

@Preview
@Composable
fun PreviewHomeScreen(){
    SubstopTheme() {
    Column(
        modifier = Modifier.padding(20.dp).fillMaxHeight()
    ) {
        HomeScreen()
    }
    }
}