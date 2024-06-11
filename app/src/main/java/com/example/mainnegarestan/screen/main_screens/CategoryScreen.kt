package com.example.mainnegarestan.screen.main_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mainnegarestan.R
import com.example.mainnegarestan.screen.component_lists.CarpetPanelCategoryListView
import com.example.mainnegarestan.screen.component_lists.CarpetCategoryListView
import com.example.mainnegarestan.screen.component_lists.CollageCategoryListView
import com.example.mainnegarestan.screen.component_lists.MoquetteCategoryListView
import com.example.mainnegarestan.screen.component_lists.RugCategoryListView


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(
    navController: NavController
) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Scaffold (
            topBar = {
                TopAppBar(modifier = Modifier.shadow(elevation = 100.dp,
                    spotColor = Color.DarkGray,
                    shape = RoundedCornerShape(10.dp)
                ),
                    title = {
                        Text(modifier = Modifier.padding(top = 10.dp), text = "دسته بندی ها", style = TextStyle(fontSize = 30.sp), fontFamily = FontFamily(
                            Font(R.font.khat)
                        ))
                    })},
                ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp,bottom = 5.dp, start = 5.dp, end = 5.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(70.dp))

                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "فرش",
                        modifier = Modifier.align(alignment = Alignment.CenterVertically).padding(start = 10.dp),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.yekan))
                    )
                Spacer(modifier = Modifier.weight(1F))
                Row(modifier = Modifier.align(alignment = Alignment.CenterVertically)) {
                    TextButton(onClick = {
                        navController.navigate("carpetlist")
                    }){
                        Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),
                            text = "مشاهده بیشتر", fontSize = 15.sp,
                            style = TextStyle(fontFamily = FontFamily(Font(R.font.yekan))))
                    }

                        Spacer(modifier = Modifier.width(5.dp))
                Box(modifier = Modifier.size(12.dp).align(alignment = Alignment.CenterVertically)){
                    Icon(painter = painterResource(R.drawable.baseline_arrow_back_ios_new_24),"")
                       }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                CarpetCategoryListView()
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "تابلو فرش",
                            modifier = Modifier.align(alignment = Alignment.CenterVertically).padding(start = 10.dp),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily(Font(R.font.yekan))
                        )

                    Spacer(modifier = Modifier.weight(1F))
                    Row(modifier = Modifier.align(alignment = Alignment.CenterVertically)) {
                        TextButton(onClick = {
                            navController.navigate("carpetpanelList")
                        }){
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = "مشاهده بیشتر", fontSize = 15.sp,
                                style = TextStyle(fontFamily = FontFamily(Font(R.font.yekan))))
                        }
                        Spacer(modifier = Modifier. width(5.dp))
                        Box(modifier = Modifier.size(12.dp).align(alignment = Alignment.CenterVertically)){
                            Icon(painter = painterResource(R.drawable.baseline_arrow_back_ios_new_24),"")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Spacer(modifier = Modifier.height(5.dp))
                CarpetPanelCategoryListView()
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                            text = "کلاژ و فرش رنگ شده",
                            modifier = Modifier.align(alignment = Alignment.CenterVertically).padding(start = 10.dp),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily(Font(R.font.yekan)))
                    Spacer(modifier = Modifier.weight(1F))
                    Row(modifier = Modifier.align(alignment = Alignment.CenterVertically)) {
                        TextButton(onClick = {
                            navController.navigate("colagelist")
                        }){
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = "مشاهده بیشتر", fontSize = 15.sp,
                                style = TextStyle(fontFamily = FontFamily(Font(R.font.yekan))))
                        }

                        Spacer(modifier = Modifier.width(5.dp))
                        Box(modifier = Modifier.size(12.dp).align(alignment = Alignment.CenterVertically)){
                            Icon(painter = painterResource(R.drawable.baseline_arrow_back_ios_new_24),"")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                CollageCategoryListView()
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "موکت",
                        modifier = Modifier.align(alignment = Alignment.CenterVertically).padding(start = 10.dp),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                        fontFamily = FontFamily(Font(R.font.yekan))
                    )
                    Spacer(modifier = Modifier.weight(1F))
                    Row(modifier = Modifier.align(alignment = Alignment.CenterVertically)) {
                        TextButton(onClick = {
                            navController.navigate("moquetelist")
                        }){
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = "مشاهده بیشتر", fontSize = 15.sp,
                                style = TextStyle(fontFamily = FontFamily(Font(R.font.yekan))))
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                        Box(modifier = Modifier.size(12.dp).align(alignment = Alignment.CenterVertically)){
                            Icon(painter = painterResource(R.drawable.baseline_arrow_back_ios_new_24),"")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                MoquetteCategoryListView()
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "گلیم و گبه",
                        modifier = Modifier.align(alignment = Alignment.CenterVertically).padding(start = 10.dp),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                        fontFamily = FontFamily(Font(R.font.yekan))
                    )
                    Spacer(modifier = Modifier.weight(1F))
                    Row(modifier = Modifier.align(alignment = Alignment.CenterVertically)) {
                        TextButton(onClick = {
                            navController.navigate("ruglist")
                        }){
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = "مشاهده بیشتر", fontSize = 15.sp,
                                style = TextStyle(fontFamily = FontFamily(Font(R.font.yekan))))
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                        Box(modifier = Modifier.size(12.dp).align(alignment = Alignment.CenterVertically)){
                            Icon(painter = painterResource(R.drawable.baseline_arrow_back_ios_new_24),"")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Spacer(modifier = Modifier.height(5.dp))
                RugCategoryListView()
                Spacer(modifier = Modifier.height(120.dp))
            }
        }
    }
}