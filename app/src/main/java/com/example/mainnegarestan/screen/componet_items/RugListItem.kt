package com.example.mainnegarestan.screen.componet_items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mainnegarestan.R
import com.example.mainnegarestan.model.product.Rug
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun RugListItem(rug: Rug) {
    Card(modifier = Modifier.height(250.dp).width(150.dp).padding(5.dp)) {
        Column(
            modifier = Modifier.background(
                Color(android.graphics.Color.parseColor("#e9e0c9"))
            ).fillMaxWidth().fillMaxHeight()
            ) {

            GlideImage(
                imageModel = rug.image!!,
                modifier = Modifier.height(120.dp).fillMaxWidth().padding(top = 3.dp, end = 3.dp, start = 3.dp),
                contentDescription = "",
                loading = {
                    CircularProgressIndicator()
                },
                contentScale = ContentScale.FillBounds,
                failure = {
                    Text(text = "image request failed")
                }
            )
            Text(text = rug.title!!, modifier = Modifier.padding(3.dp))
            Text(text = rug.prductId.toString(), modifier = Modifier.padding(3.dp))
            Text(text = "قیمت", modifier = Modifier.padding(3.dp))
        }
    }
}