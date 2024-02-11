package com.example.mainnegarestan.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mainnegarestan.R

@Composable
fun AddAdvertiseScreen(navController: NavController) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Column(modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp)) {
            Spacer(modifier = Modifier.height(70.dp))
            Row() {
                TextButton(
                    onClick = {
                              navController.navigate("caradv")
                    },
//                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        text = "فرش",
                        style = TextStyle(fontSize = 20.sp), color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    modifier = Modifier.size(40.dp).padding(top = 10.dp, bottom = 10.dp),
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
                    contentDescription = null,
                    tint = Color.Gray
                )
            }
            Divider(modifier = Modifier.height(1.dp))
            Row() {
                TextButton(
                    onClick = {
                              navController.navigate("carpanadv")
                    },
//                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        text = "تابلو فرش",
                        style = TextStyle(fontSize = 20.sp), color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    modifier = Modifier.size(40.dp).padding(top = 10.dp, bottom = 10.dp),
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
                    contentDescription = null,
                    tint = Color.Gray
                )
            }

            Divider(modifier = Modifier.height(1.dp))
            Row() {
                TextButton(
                    onClick = {navController.navigate("coladv")},
//                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        text = "کلاژ و فرش رنگ شده",
                        style = TextStyle(fontSize = 20.sp),
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    modifier = Modifier.size(40.dp).padding(top = 10.dp, bottom = 10.dp)
                        .align(Alignment.Bottom),
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
                    contentDescription = null,
                    tint = Color.Gray

                )
            }
            Divider(modifier = Modifier.height(1.dp))
            Row() {
                TextButton(
                    onClick = {
                              navController.navigate("moqadv")
                    },
//                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        text = "موکت",
                        style = TextStyle(fontSize = 20.sp),
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    modifier = Modifier.size(40.dp).padding(top = 10.dp, bottom = 10.dp)
                        .align(Alignment.Bottom),
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
                    contentDescription = null,
                    tint = Color.Gray

                )
            }
            Divider(modifier = Modifier.height(1.dp))
            Row() {
                TextButton(
                    onClick = {
                              navController.navigate("rugadv")
                    },
//                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        text = "گلیم",
                        style = TextStyle(fontSize = 20.sp),
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    modifier = Modifier.size(40.dp).padding(top = 10.dp, bottom = 10.dp)
                        .align(Alignment.Bottom),
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
                    contentDescription = null,
                    tint = Color.Gray
                )
            }
            Divider(modifier = Modifier.height(1.dp))

            Row() {
                TextButton(
                    onClick = {
                              navController.navigate("accadv")
                    },
//                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                        text = "لوازم جانبی فرش",
                        style = TextStyle(fontSize = 20.sp),
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    modifier = Modifier.size(40.dp).padding(top = 10.dp, bottom = 10.dp)
                        .align(Alignment.Bottom),
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
                    contentDescription = null,
                    tint = Color.Gray
                )
            }

        }
    }
}