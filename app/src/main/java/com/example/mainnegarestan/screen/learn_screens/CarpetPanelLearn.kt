package com.example.mainnegarestan.screen.learn_screens

import android.annotation.SuppressLint
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mainnegarestan.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarpetPanelLearn(navController: NavController) {

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Scaffold(
            topBar = {
                TopAppBar(modifier = Modifier.shadow(
                    elevation = 100.dp,
                    spotColor = Color.DarkGray,
                    shape = RoundedCornerShape(10.dp)
                ),
                    actions = {
                        IconButton(onClick = {
                            navController.popBackStack()
                        }){
                            Icon(painterResource(R.drawable.baseline_arrow_forward_24),"")
                        }
                    },
                    title = {
                        Text(
                            modifier = Modifier.padding(top = 10.dp),
                            text = "تابلوفرش",
                            style = TextStyle(fontSize = 30.sp),
                            fontFamily = FontFamily(
                                Font(R.font.khat)
                            )
                        )
                    })
            },
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Color(
                            android.graphics.Color.parseColor("#ffffff")
                        )
                    )
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .fillMaxWidth()
                        .padding(top = 70.dp, bottom = 20.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .height(175.dp).padding(top = 20.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Image(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            painter = painterResource(id = R.drawable.carpetpanel),
                            contentDescription = ""
                        )
                    }
                    Text(
                        stringResource(id = R.string.whatcarpetpanel),
                        style = TextStyle(fontSize = 20.sp),
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(top = 15.dp, end = 15.dp, start =15.dp)
                    )
                    Text(
                        text = "پیشینه تابلوفرش",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            bottom = 10.dp,
                            end = 5.dp,
                            start = 5.dp
                        ),
                        textAlign = TextAlign.Justify,
                        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    )
                    Text(
                        stringResource(id = R.string.precarpetpanel),
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(top = 15.dp, end = 15.dp, start =15.dp),
                        style = TextStyle(fontSize = 20.sp)
                    )
                    Spacer(modifier = Modifier.height(70.dp))
                }
            }
        }
    }
}