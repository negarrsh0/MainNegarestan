package com.example.mainnegarestan.screen.second_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReportScreen(navController: NavHostController) {

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Scaffold(
            topBar = {
                TopAppBar(modifier = Modifier.shadow(elevation = 100.dp,
                    spotColor = Color.DarkGray,
                    shape = RoundedCornerShape(10.dp)
                ),
                    title = {
                        Text(modifier = Modifier.padding(top = 10.dp), text ="ثبت تخلف", style = TextStyle(fontSize = 30.sp), fontFamily = FontFamily(
                            Font(R.font.khat)
                        )
                        )
                    })
            },
        ) {
            Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 70.dp)) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {  },
                    shape = RoundedCornerShape(topEnd =12.dp, bottomStart =12.dp),
                    label = {
                        Text("عنوان تخلف",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan)))
                        ) },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),

                    modifier = Modifier.fillMaxWidth(0.8f),
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {  },
                    shape = RoundedCornerShape(topEnd =12.dp, bottomStart =12.dp),
                    label = {
                        Text("متن تخلف",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan)))
                        ) },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),

                    modifier = Modifier.fillMaxWidth(0.8f),
                )
            }
        }

    }
}