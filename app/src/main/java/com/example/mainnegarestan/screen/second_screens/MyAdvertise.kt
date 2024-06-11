package com.example.mainnegarestan.screen.second_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyAdvertise(navController: NavHostController) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        com.example.mainnegarestan.ui.theme.MainNegarestanTheme {
            var pCode by rememberSaveable { mutableStateOf("") }

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.White
            ) {
                androidx.compose.material.Scaffold(
                    topBar = {
                        androidx.compose.material.TopAppBar(title = {
                            Text(
                                "آگهی های من",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                        }, backgroundColor = Color.Transparent,
                            actions = {
                                IconButton(onClick = {
                                    navController.popBackStack()
                                }) {
                                    Icon(painterResource(R.drawable.baseline_arrow_forward_24), "")
                                }
                            }
                        )
                    }
                ) {
                    Column() {}
                }
            }
        }
    }
}