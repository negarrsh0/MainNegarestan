package com.example.mainnegarestan.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainnegarestan.R

@Composable
fun RugLearn() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(
                    android.graphics.Color.parseColor("#ddc5a1")
                )
            )
    ){
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .padding(top = 70.dp, bottom = 20.dp)) {
            Text(
                modifier = Modifier.padding(start = 5.dp, top = 20.dp, bottom = 20.dp),
                text = "گلیم چیست؟",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
            )
            Card(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(200.dp),
                shape = RoundedCornerShape(10.dp)            ) {
                Image(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    painter = painterResource(id = R.drawable.rug), contentDescription = "")
            }
            Text(
                stringResource(id = R.string.whatrug), style = TextStyle(fontSize = 17.sp) ,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top = 15.dp, end = 5.dp, start = 5.dp))
            Text(text = "توضیحات تکمیلی گلیم",
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp, end = 5.dp, start = 5.dp),
                textAlign = TextAlign.Justify,
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                stringResource(id = R.string.prerug),
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(5.dp),
                style = TextStyle(fontSize = 17.sp)
            )
            Spacer(modifier = Modifier.height(70.dp))
        }
    }
}