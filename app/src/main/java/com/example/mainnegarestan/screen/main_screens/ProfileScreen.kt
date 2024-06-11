package com.example.mainnegarestan.screen.main_screens

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Colors
import androidx.compose.material.LocalAbsoluteElevation
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mainnegarestan.R
import com.example.mainnegarestan.sharedp.UserPreferences
import dagger.hilt.android.qualifiers.ApplicationContext

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {

    val context = LocalContext.current
    var userPreferences: UserPreferences = UserPreferences(context)


    Scaffold(
        topBar = {
            TopAppBar(modifier = Modifier.shadow(
                elevation = 100.dp,
                spotColor = Color.DarkGray,
                shape = RoundedCornerShape(10.dp)
            ),
                title = {
                    Text(
                        modifier = Modifier.padding(top = 10.dp),
                        text = "نگارستان",
                        style = TextStyle(fontSize = 30.sp),
                        fontFamily = FontFamily(
                            Font(R.font.khat)
                        )
                    )
                })
        },
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            val gradientColor = listOf(Color(0xFF484BF1), Color(0xFF673AB7))

            Spacer(modifier = Modifier.height(70.dp))

            Row(modifier = Modifier.fillMaxWidth().height(150.dp)) {

                Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp,top= 10.dp)) {

                    Text(
                        if (userPreferences.isLoggedIn()){
                            userPreferences.getUsername().toString()
                        }else{
                             "برای استفاده از تمام امکانات نگارستان، وارد حساب کاربری خود شوید."
                             }
                        ,
                        style = TextStyle(fontSize = 18.sp),
                        textAlign = TextAlign.Start
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    androidx.compose.material3.Button(modifier = Modifier.align(Alignment.End)
                        .width(150.dp),
                        contentPadding = PaddingValues(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent

                        ),
                        onClick = {
                                     navController.navigate("login")
                    },){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    brush = Brush.horizontalGradient(colors = gradientColor),
                                    shape = RoundedCornerShape(topStart = 30.dp, bottomEnd = 30.dp))
                                .clip(RoundedCornerShape(topStart = 30.dp, bottomEnd = 30.dp))
                                .padding(horizontal = 16.dp, vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            androidx.compose.material3.Text(
                                text = "ورود به حساب",
                                fontSize = 18.sp,
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp)) {
                Icon(
                    painter = painterResource(R.drawable.user), "", tint = Color.Gray,
                    modifier = Modifier.size(28.dp).align(alignment = Alignment.CenterVertically)
                )
                TextButton(onClick = {
                    navController.navigate("myadvertise")
                }) {
                    Text(
                        text = "آگهی های من",
                        style = TextStyle(fontSize = 20.sp, color = Color.Black)
                    )
                }
            }
            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp)) {
                Icon(
                    painter = painterResource(R.drawable.add), "", tint = Color.Gray,
                    modifier = Modifier.size(28.dp).align(alignment = Alignment.CenterVertically)
                )

                TextButton(onClick = {
                    if (userPreferences.isLoggedIn()) {
                        navController.navigate("categoryinsertadv")
                    } else {
                        navController.navigate("login")
                    }
                }) {
                    Text(
                        text = "ثبت آگهی جدید",
                        style = TextStyle(fontSize = 20.sp, color = Color.Black)
                    )
                }
            }
            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp)) {
                Icon(
                    painter = painterResource(R.drawable.report), "", tint = Color.Gray,
                    modifier = Modifier.size(28.dp).align(alignment = Alignment.CenterVertically)
                )
                TextButton(onClick = {
                    navController.navigate("report")
                }) {
                    Text(
                        text = "گزارش تخلف",
                        style = TextStyle(fontSize = 20.sp, color = Color.Black)
                    )
                }

            }

            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp)) {
                Icon(
                    painter = painterResource(R.drawable.rules), "", tint = Color.Gray,
                    modifier = Modifier.size(28.dp).align(alignment = Alignment.CenterVertically)
                )
                TextButton(onClick = {
                    navController.navigate("term")
                }) {
                    Text(
                        text = "قوانین نگارستان",
                        style = TextStyle(fontSize = 20.sp, color = Color.Black)
                    )
                }
            }
            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp)) {
                Icon(
                    painter = painterResource(R.drawable.info), "", tint = Color.Gray,
                    modifier = Modifier.size(28.dp).align(alignment = Alignment.CenterVertically)
                )
                TextButton(onClick = {
                    navController.navigate("aboutng")
                }) {
                    Text(
                        text = "درباره ی نگارستان",
                        style = TextStyle(fontSize = 20.sp, color = Color.Black)
                    )
                }
            }
            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp)) {
                Icon(
                    painter = painterResource(R.drawable.logout), "", tint = Color.Gray,
                    modifier = Modifier.size(28.dp).align(alignment = Alignment.CenterVertically)
                )
//                if (isLoggedIn) {
                TextButton(onClick = {

                    userPreferences.logout()
                    navController.navigate("login")
                }) {
                    Text(
                        text = "خروج از حساب کاربری",
                        style = TextStyle(fontSize = 20.sp, color = Color.Black)
                    )
                }
            }
            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
//            Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp)) {
//            Text(modifier = Modifier.weight(1f),
//                text = "نسخه",
//                style = TextStyle(fontSize = 20.sp, color = Color.Gray)
//            )
//            Text(
//                text = "1.1",
//                style = TextStyle(fontSize = 20.sp, color = Color.Black)
//            )
//            }
            Divider(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp))
            Spacer(modifier = Modifier.height(80.dp))
            }
        }

}