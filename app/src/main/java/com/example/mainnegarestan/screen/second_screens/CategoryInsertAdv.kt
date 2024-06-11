package com.example.mainnegarestan.screen.second_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R
import com.example.mainnegarestan.sharedp.UserPreferences

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryInsertAdv(navController: NavHostController) {
    val context = LocalContext.current
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

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
                            text = "افزودن آگهی",
                            style = TextStyle(fontSize = 30.sp),
                            fontFamily = FontFamily(
                                Font(R.font.khat)
                            )
                        )
                    })
            },
        ) {
            Column(modifier = Modifier.padding(top = 70.dp, bottom = 70.dp)
            ) {
                TextButton(onClick = {
                    navController.navigate("insertcarpet")
                }){
                 Text(text = "فرش", style = TextStyle(fontSize =22.sp, color = Color.Black), modifier = Modifier.padding(bottom = 7.dp, top = 5.dp, start = 12.dp)) }
                Divider(modifier = Modifier.height(1.dp).padding(start = 10.dp, end = 12.dp))
                TextButton(onClick = {
                    navController.navigate("insertcp")
                }){
                    Text(text = "تابلو فرش", style = TextStyle(fontSize =22.sp, color = Color.Black), modifier = Modifier.padding(bottom = 7.dp, top = 5.dp, start = 12.dp))
                }
                Divider(modifier = Modifier.height(1.dp).padding(start = 10.dp, end = 12.dp))
                TextButton(onClick = {
                    navController.navigate("insertrug")
                }){
                    Text(text = "گلیم", style = TextStyle(fontSize =22.sp, color = Color.Black), modifier = Modifier.padding(bottom = 7.dp, top = 5.dp, start = 12.dp))
                }
                Divider(modifier = Modifier.height(1.dp).padding(start = 10.dp, end = 12.dp))
                TextButton(onClick = {
                    navController.navigate("insertcol")
                }){
                    Text(text = "کلاژ", style = TextStyle(fontSize =22.sp, color = Color.Black), modifier = Modifier.padding(bottom = 7.dp, top = 5.dp, start = 12.dp))
                }
                Divider(modifier = Modifier.height(1.dp).padding(start = 10.dp, end = 12.dp))
                TextButton(onClick = {
                    navController.navigate("insertmoq")
                }){
                    Text(text = "موکت", style = TextStyle(fontSize =22.sp, color = Color.Black), modifier = Modifier.padding(bottom = 7.dp, top = 5.dp, start = 12.dp))

                }
                Divider(modifier = Modifier.height(1.dp).padding(start = 10.dp, end = 12.dp))
                TextButton(onClick = {
                    navController.navigate("insertacc")
                }){
                    Text(text = "لوازم جانبی", style = TextStyle(fontSize =22.sp, color = Color.Black), modifier = Modifier.padding(bottom = 7.dp, top = 5.dp, start = 12.dp))

                }
                Divider(modifier = Modifier.height(1.dp).padding(start = 10.dp, end = 12.dp))

            }
        }
    }
}