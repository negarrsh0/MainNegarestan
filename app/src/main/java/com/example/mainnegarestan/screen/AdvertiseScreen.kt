package com.example.mainnegarestan.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.mainnegarestan.screen.componet_items.AdvertiseListItem

@Composable
fun AdvertiseScreen() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
    Spacer(modifier = Modifier.height(200.dp))
    LazyColumn (modifier = Modifier.fillMaxWidth()){
        items(count = 5) {
            AdvertiseListItem()
        }
      }
    }
}