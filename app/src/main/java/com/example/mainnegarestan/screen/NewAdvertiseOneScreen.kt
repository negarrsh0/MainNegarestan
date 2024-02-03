package com.example.mainnegarestan.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewAdvertiseOneScreen() {
    Column() {
        Spacer(modifier = Modifier.height(180.dp))
        Text(
            "برای ثبت آگهی جدید ابتدا باید وارد شوید",
            style = TextStyle(fontSize = 20.sp),
            color = Color.Black
        )
    }
}