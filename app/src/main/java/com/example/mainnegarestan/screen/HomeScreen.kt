@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.mainnegarestan.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R

import com.example.mainnegarestan.screen.component_lists.MostOfferListView
import com.example.mainnegarestan.screen.component_lists.SliderListView

@Composable
fun HomeScreen(navController: NavHostController) {


    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.height(70.dp))
            SliderListView()
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "فرش نامه",
                    fontSize = 40.sp,
//                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
//                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    style = TextStyle(fontFamily = FontFamily(Font(R.font.iran)))
                )
            }
            Divider(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 5.dp, start = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(110.dp)
                                .background(
                                    Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    )
                                )
                        ) {

                            Card(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .background(
                                        Color(
                                            android.graphics.Color.parseColor("#ddc5a1")
                                        )
                                    ),
                                onClick = {navController.navigate("carpetlearn")},
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    ) ,
                                    contentColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    )
                                )
                            ) {
                                Box(
                                    modifier = Modifier
                                        .width(100.dp)
                                        .align(Alignment.CenterHorizontally)
                                        .shadow(10.dp),
                                    Alignment.TopCenter
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .height(160.dp)
                                            .width(90.dp),
                                        painter = painterResource(R.drawable.carpetcat),
                                        contentDescription = null,
                                    )
                                }
                            }}
                        Text(text = "فرش",
                            modifier = Modifier
                                .padding(5.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                            , style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan)))
                        )
                    }
                    Column(modifier = Modifier.padding(10.dp)) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(110.dp)
                                .background(
                                    Color(android.graphics.Color.parseColor("#ddc5a1"))
                                )
                        ) {
                            Card(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .background(
                                        Color(
                                            android.graphics.Color.parseColor("#ddc5a1")
                                        )
                                    ),
                                onClick = {navController.navigate("carpanelearn")},
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    ) ,
                                    contentColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    )
                                )
                            ) {

                                Box(
                                    modifier = Modifier
                                        .width(100.dp)
//                                    .align(Alignment.Center)
                                        .shadow(10.dp),
                                    Alignment.TopCenter
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .height(160.dp)
                                            .width(90.dp),
                                        painter = painterResource(R.drawable.carpanelcat),
                                        contentDescription = null,
                                    )
                                }
                            }
                        }
                        Text(text = "تابلو فرش" ,
                            modifier = Modifier
                                .padding(5.dp)
                                .align(alignment = Alignment.CenterHorizontally),
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan)))
                        )
                    }
                    Column(modifier = Modifier.padding(10.dp)) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(110.dp)
                                .background(
                                    Color(android.graphics.Color.parseColor("#ddc5a1"))
                                )
                        ) {
                            Card(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .background(
                                        Color(
                                            android.graphics.Color.parseColor("#ddc5a1")
                                        )
                                    ),
                                onClick = { navController.navigate("carpetlearn") },
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    ),
                                    contentColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    )
                                )
                            ) {
                                Card(
                                    modifier = Modifier
//                                        .align(Alignment.Center)
                                        .background(
                                            Color(
                                                android.graphics.Color.parseColor("#ddc5a1")
                                            )
                                        ),
                                    onClick = { navController.navigate("ruglearn") },
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color(
                                            android.graphics.Color.parseColor("#ddc5a1")
                                        ),
                                        contentColor = Color(
                                            android.graphics.Color.parseColor("#ddc5a1")
                                        )
                                    )
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(100.dp)
//                                    .align(Alignment.Center)
                                            .shadow(10.dp),
                                        Alignment.TopCenter
                                    ) {
                                        Image(
                                            modifier = Modifier
                                                .height(160.dp)
                                                .width(90.dp),
                                            painter = painterResource(R.drawable.rugcat),
                                            contentDescription = null,
                                        )
                                    }
                                }
                            }
                        }
                        Text(text = "گلیم" ,
                            modifier = Modifier
                                .padding(5.dp)
                                .align(alignment = Alignment.CenterHorizontally),
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan)))
                        )
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp, start = 10.dp),

                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(110.dp)
                                .background(
                                    Color(android.graphics.Color.parseColor("#ddc5a1"))
                                )
                        ) {
                            Card(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .background(
                                        Color(
                                            android.graphics.Color.parseColor("#ddc5a1")
                                        )
                                    ),
                                onClick = {navController.navigate("collagelearn")},
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    ) ,
                                    contentColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    )
                                )
                            ) {
                                Box(
                                    modifier = Modifier
                                        .width(100.dp)
//                                    .align(Alignment.Center)
                                        .shadow(10.dp),
                                    Alignment.TopCenter
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .height(160.dp)
                                            .width(90.dp),
                                        painter = painterResource(R.drawable.colcat),
                                        contentDescription = null,
                                    )
                                }}
                        }
                        Text(text = "کلاژ",
                            modifier = Modifier
                                .padding(5.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                            , style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan)))
                        )

                    }
                    Column(modifier = Modifier.padding(10.dp)) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(110.dp)
                                .background(
                                    Color(android.graphics.Color.parseColor("#ddc5a1"))
                                )
                        ) {
                            Card(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .background(
                                        Color(
                                            android.graphics.Color.parseColor("#ddc5a1")
                                        )
                                    ),
                                onClick = {navController.navigate("moqlearn")},
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    ) ,
                                    contentColor = Color(
                                        android.graphics.Color.parseColor("#ddc5a1")
                                    )
                                )
                            ) {
                                Box(
                                    modifier = Modifier
                                        .width(100.dp)
//                                    .align(Alignment.Center)
                                        .shadow(10.dp),
                                    Alignment.TopCenter
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .height(160.dp)
                                            .width(90.dp),
                                        painter = painterResource(R.drawable.moqcat),
                                        contentDescription = null,
                                    )
                                }
                            }}
                        Text(text = "موکت",
                            modifier = Modifier
                                .padding(5.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                            , style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan)))
                        )
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp))
            }
            Spacer(modifier = Modifier.height(10.dp))
            MostOfferListView()
            Spacer(modifier = Modifier.height(30.dp))
            Column(verticalArrangement = Arrangement.SpaceBetween){
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Card(shape = CircleShape) {
                        Image(modifier = Modifier
                            .width(180.dp)
                            .height(180.dp), painter = painterResource(R.drawable.slide)
                            ,contentDescription ="")
                    }
                    Card(shape =  RoundedCornerShape(20.dp)) {
                        Image(modifier = Modifier
                            .width(180.dp)
                            .height(180.dp), painter = painterResource(R.drawable.slide1),contentDescription = null)
                    }}
                Spacer(modifier = Modifier.height(20.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Card(shape =  RoundedCornerShape(20.dp)) {
                        Image(
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp),
                            painter = painterResource(R.drawable.slide2),
                            contentDescription = null
                        )
                    }
                    Card(shape = CircleShape) {
                        Image(
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp),
                            painter = painterResource(R.drawable.slide3),
                            contentDescription = null)
                    }}
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "هر گونه تخلف")
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}