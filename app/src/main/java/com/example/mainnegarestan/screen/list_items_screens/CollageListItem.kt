package com.example.mainnegarestan.screen.list_items_screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.mainnegarestan.R
import com.example.mainnegarestan.model.product.Product
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun CollageListItem(product: Product) {

    Card(modifier = Modifier.height(250.dp).width(150.dp).padding(5.dp),shape = RoundedCornerShape(20.dp), border = BorderStroke(0.5.dp,
        Color.LightGray
    )) {
        Column(
            modifier = Modifier.background(
                Color(android.graphics.Color.parseColor("#ffffff"))
            )
            ) {

            GlideImage(
                imageModel = product.image!!,
                modifier = Modifier.height(120.dp).fillMaxWidth().padding(top = 5.dp, end = 5.dp, start = 5.dp),
                contentDescription = "",
                loading = {
                    CircularProgressIndicator()
                },
                contentScale = ContentScale.FillBounds,
                failure = {
                    Text(text = "image request failed")
                }
            )
            Text(text = product.title.toString(), fontFamily = FontFamily(Font(R.font.rezvan)), modifier = Modifier.padding(start = 5.dp, top = 5.dp), maxLines = 1)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = product.price.toString(), fontFamily = FontFamily(Font(R.font.rezvan)), modifier = Modifier.padding(start = 5.dp, bottom = 5.dp))
            Text(text = "قیمت", fontFamily = FontFamily(Font(R.font.rezvan)), modifier = Modifier.padding(start = 5.dp, bottom = 5.dp))
        }
    }
}