package com.example.mainnegarestan.screen.second_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutUsScreen(navController: NavHostController) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Scaffold(
            topBar = {
                TopAppBar(modifier = Modifier.shadow(elevation = 100.dp,
                    spotColor = Color.DarkGray,
                    shape = RoundedCornerShape(10.dp)
                ),
                    title = {
                        Text(modifier = Modifier.padding(top = 10.dp), text = "درباره ما", style = TextStyle(fontSize = 30.sp), fontFamily = FontFamily(
                            Font(R.font.khat)
                             )
                        )
                    })
            },
            ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(modifier = Modifier.padding(top = 200.dp).align(alignment = Alignment.CenterHorizontally), text = "درباره نگارستان", style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily(Font(R.font.khat))))
                Divider(modifier = Modifier.height(1.dp).padding(start = 30.dp, end = 30.dp).align(alignment = Alignment.CenterHorizontally))
                Text(stringResource(R.string.aboutus), style = TextStyle(fontSize = 18.sp, textAlign = TextAlign.Justify), modifier = Modifier.padding(top = 15.dp, start = 30.dp, end = 30.dp))
                Text("Negarestan@gmail.com", style = TextStyle(fontSize = 18.sp, textAlign = TextAlign.Justify), modifier = Modifier.padding(top = 5.dp, start = 30.dp, end = 30.dp).align(alignment = Alignment.CenterHorizontally).fillMaxWidth())

            }
            }
     }
}