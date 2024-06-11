package com.example.mainnegarestan.screen.list_items_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.mainnegarestan.R

@Composable
fun MostOfferListItem() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl){
    Box (
        modifier = Modifier.background(
            color = Color.Red
        )
            ){
        Card(
            modifier = Modifier.width(170.dp).height(220.dp).padding(5.dp)
        ) {
            Column (
                modifier = Modifier.fillMaxWidth()){
                Image(
                    contentScale = ContentScale.FillBounds,
                    alignment = Alignment.TopCenter,
                    painter = painterResource(R.drawable.slide3),
                    modifier = Modifier.height(120.dp).fillMaxWidth().padding(start = 5.dp, end = 5.dp),
                    contentDescription = ""
                )
                Text(text = "عنوان")
                Text(text = "قیمت")
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "قیمت با تخفیف")
            }
        }
    }
}}