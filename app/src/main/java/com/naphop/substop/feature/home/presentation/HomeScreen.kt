package com.naphop.substop.feature.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.naphop.substop.ui.components.CustomText
import com.naphop.substop.ui.theme.SubstopTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
    ) {
        CustomText(
            displayText = "Hello World",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            fontColor = Color.Red
        )
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