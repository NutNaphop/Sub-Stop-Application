package com.naphop.substop.core.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.naphop.substop.core.theme.robotoFamily

@Composable
fun CustomText(
    displayText: String,
    fontColor: Color,
    fontSize: TextUnit,
    fontWeight: FontWeight,
    modifier: Modifier = Modifier.Companion
){
    Text(
        modifier = modifier,
        text = displayText,
        style = TextStyle(
            fontFamily = robotoFamily,
            fontWeight = fontWeight,
            color = fontColor,
            fontSize = fontSize
        )
    )
}