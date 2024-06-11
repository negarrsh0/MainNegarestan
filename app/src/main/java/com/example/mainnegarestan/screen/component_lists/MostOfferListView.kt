package com.example.mainnegarestan.screen.component_lists

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainnegarestan.R
import com.example.mainnegarestan.screen.list_items_screens.MostOfferListItem

@Composable
fun MostOfferListView() {
    Row(
        modifier = Modifier.background(color = Color.Red)
    ) {
        Column(modifier = Modifier
            .align(alignment = Alignment.CenterVertically)
            .padding(5.dp)) {
            Text(
                modifier = Modifier.padding(start = 20.dp,5.dp),
                text = "پر تخفیف های", fontSize = 20.sp ,
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.yekan),)
            ))
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                modifier = Modifier.padding(start = 30.dp,10.dp),
                text = "نگارستان", fontSize = 30.sp ,
            style = TextStyle(fontFamily = FontFamily(Font(R.font.khat)))
            )
            Image(painter = painterResource(id = R.drawable.dis), contentDescription = "",
            modifier = Modifier
                .width(150.dp)
                .height(80.dp))
        }
        LazyRow {
            items(count = 6) {
                MostOfferListItem()
            }
        }
    }
}