package com.example.android.jetpackfirstui

import androidx.compose.ui.graphics.Color
import com.example.android.jetpackfirstui.ui.theme.ColorBlue

data class OnBoardingData(
    val image: Int, val title: String,
    val desc: String,
    val backgroundColor:Color,
    val mainColor:Color = ColorBlue
)