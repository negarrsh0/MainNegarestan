package com.example.mainnegarestan.screen.componet_items

import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.mainnegarestan.model.site.Slider
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun SliderItemView (slider: Slider){
    Card(
    modifier = Modifier
    .width(350.dp)
    .height(200.dp)
    .padding(end = 5.dp, start = 5.dp)
    .shadow(elevation = 8.dp, shape = RoundedCornerShape(16.dp), clip = true)
    ) {
        GlideImage(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            imageModel = slider.image!!,
            contentDescription = "",
            loading = {
                CircularProgressIndicator()
            },
            contentScale = ContentScale.Crop,
            failure = {
                Text(text = "image request failed")
            }
        )
    }
}