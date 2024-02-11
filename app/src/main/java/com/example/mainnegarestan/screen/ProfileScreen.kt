package com.example.mainnegarestan.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mainnegarestan.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(70.dp))

        Row(modifier = Modifier.fillMaxWidth().height(120.dp)) {
            Spacer(modifier = Modifier.width(10.dp))
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(100.dp)
                    .background(
                        Color(android.graphics.Color.parseColor("#ddc5a1"))
                    )
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_person_24),
                    "",
                    modifier = Modifier.fillMaxWidth().fillMaxHeight()
                )
            }
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Spacer(modifier = Modifier.height(30.dp))
                Text("شماره موبایل", style = TextStyle(fontSize = 20.sp), textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth().padding( start =20.dp , end = 20.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            TextButton(onClick = {
            }) {
                Text(text = "آگهی های من", style = TextStyle(fontSize = 20.sp))
            }
        }
        Divider(modifier = Modifier.fillMaxWidth().padding( start = 20.dp, end = 20.dp))
        TextButton(onClick = {
            navController.navigate("login")
        }){
            Text(text ="ثبت آگهی جدید", style = TextStyle(fontSize = 20.sp))
        }
        Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
        TextButton(onClick = {
            navController.navigate("newadtwo")
        }){
            Text(text ="گزارش کلاهبرداری", style = TextStyle(fontSize = 20.sp))
        }
        Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
        TextButton(onClick = {
            navController.navigate("newadtwo")
        }){
            Text(text ="قوانین نگارستان", style = TextStyle(fontSize = 20.sp))
        }
        Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
        TextButton(onClick = {
            navController.navigate("newadtwo")
        }){
            Text(text ="درباره ی نگارستان", style = TextStyle(fontSize = 20.sp))
        }
        Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
        Spacer(modifier = Modifier.height(80.dp))
    }
}