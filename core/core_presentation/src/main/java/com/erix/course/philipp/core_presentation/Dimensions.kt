package com.erix.course.philipp.core_presentation

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val default: Dp = 0.dp,
    val spaceExtraSmall: Dp = 4.dp,
    val spaceSmall: Dp = 8.dp,
    val spaceMedium: Dp = 16.dp,
    val spaceLarge: Dp = 32.dp,
    val spaceExtraLarge: Dp = 64.dp,
    val spaceExtraLargest: Dp = 96.dp,
    val spaceLargest: Dp = 128.dp,

    val horizontalScreenPadding: Dp = 16.dp,
    val verticalScreenPadding: Dp = 21.dp,
)

val LocalSpacing = compositionLocalOf { Dimensions() }