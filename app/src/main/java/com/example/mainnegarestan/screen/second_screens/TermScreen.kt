package com.example.mainnegarestan.screen.second_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TermScreen(navController: NavHostController) {

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Scaffold(
                topBar = {
                TopAppBar(modifier = Modifier.shadow(elevation = 100.dp,
                    spotColor = Color.DarkGray,
                    shape = RoundedCornerShape(10.dp)
                ),
                    title = {
                        Text(modifier = Modifier.padding(top = 10.dp), text = "شرایط و قوانین", style = TextStyle(fontSize = 30.sp), fontFamily = FontFamily(
                            Font(R.font.khat)
                        )
                        )
                    })
            },

        ) {
            Column(modifier = Modifier.padding(top = 70.dp, start = 20.dp, end = 20.dp).fillMaxWidth()) {
                Text(stringResource(id = R.string.title_for_term),
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                )
                Text(stringResource(id = R.string.title2_for_term),
                    style = TextStyle(fontSize = 18.sp), modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
                Text(stringResource(id = R.string.term1),
                    style = TextStyle(fontSize = 18.sp), modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
                Text(stringResource(id = R.string.term2),
                    style = TextStyle(fontSize = 18.sp), modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
                Text(stringResource(id = R.string.term3),
                    style = TextStyle(fontSize = 18.sp), modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
                Text(stringResource(id = R.string.term4),
                    style = TextStyle(fontSize = 18.sp), modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
                Text(stringResource(id = R.string.term5),
                    style = TextStyle(fontSize = 18.sp), modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
            }
        }
    }
}