package com.example.mainnegarestan.screen.componet_items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.mainnegarestan.R

@Composable
fun AdvertiseListItem() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {


        Card(modifier = Modifier.fillMaxWidth()) {
        Divider(
            Modifier
                .fillMaxWidth()
                .padding(end = 30.dp, start = 30.dp))
        Spacer(modifier = Modifier.height(140.dp))
        Row (modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth()){
            Text(text = "عنوان")
            Spacer(modifier = Modifier.width(150.dp))
            Image(

                painter = painterResource(R.drawable.slide3),
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp), contentDescription = ""
            )
          }
       }
    }
}