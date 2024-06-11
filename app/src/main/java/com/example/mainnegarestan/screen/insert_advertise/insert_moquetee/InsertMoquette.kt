package com.example.mainnegarestan.screen.insert_advertise.insert_moquetee

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mainnegarestan.R
import com.example.mainnegarestan.screen.component.TitleAlertDialog
import com.example.mainnegarestan.ui.theme.MainNegarestanTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun InsertMoquette(navController: NavHostController) {

    var mTitle by remember { mutableStateOf("") }
    var mCategory by remember { mutableStateOf(TextFieldValue()) }
    var mCode by remember { mutableStateOf(TextFieldValue()) }
    var mDimn by remember { mutableStateOf(TextFieldValue()) }
    var mSize by remember { mutableStateOf(TextFieldValue()) }
    var mColor by remember { mutableStateOf(TextFieldValue()) }
    var mDesign by remember { mutableStateOf(TextFieldValue()) }
    var showDialog by remember { mutableStateOf(false) }
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        com.example.mainnegarestan.ui.theme.MainNegarestanTheme {
            var pCode by rememberSaveable { mutableStateOf("") }

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.White
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(title = {
                            Text(
                                "افزودن آگهی",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                        }, backgroundColor = Color.Transparent,
                            actions = {
                                IconButton(onClick = {
                                    navController.popBackStack()
                                }){
                                    Icon(painterResource(R.drawable.baseline_arrow_forward_24),"")
                                }
                            }
                        )
                    }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(start = 10.dp, end = 10.dp)
                            .verticalScroll(
                                rememberScrollState()
                            )
                    ) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)) {
                            Text(
                                text = "دسته بندی",
                                style = TextStyle(fontSize = 20.sp),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            Text(
                                text = "موکت",
                                style = TextStyle(fontSize = 20.sp),
                                modifier = Modifier.padding(end = 15.dp)
                            )
                        }
                        Divider(
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp)
                        )
                        Text(
                            text = "مشخصات کلی",
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(modifier = Modifier.height(50.dp).fillMaxWidth()) {
                            TitleAlertDialog()
                        }
                        Divider(
                            modifier = Modifier.fillMaxWidth().padding(end = 10.dp, start = 10.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = " کد محصول",
                                style = TextStyle(fontSize = 20.sp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = mCode,
                                onValueChange = { mCode = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp)
                            )
                        }
                        Divider(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, end = 10.dp, start = 10.dp)
                        )
                        Text(
                            text = "ویژگی ها",
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = "ابعاد محصول",
                                style = TextStyle(fontSize = 20.sp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = mDimn,
                                onValueChange = { mDimn = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp)
                            )
                        }
                        Divider(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, end = 10.dp, start = 10.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = "سایز محصول",
                                style = TextStyle(fontSize = 20.sp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = mSize,
                                onValueChange = { mSize = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp)
                            )
                        }
                        Divider(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, end = 10.dp, start = 10.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = " رنگ زمینه  ",
                                style = TextStyle(fontSize = 20.sp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = mColor,
                                onValueChange = { mColor= it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp)
                            )
                        }
                        Divider(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, end = 10.dp, start = 10.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = " طرح محصول",
                                style = TextStyle(fontSize = 20.sp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = mDesign,
                                onValueChange = { mDesign = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp)
                            )

                        }
                        Divider(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, end = 10.dp, start = 10.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                text = "قیمت",
                                style = TextStyle(fontSize = 20.sp)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = mDesign,
                                onValueChange = { mDesign = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp)
                            )

                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(end = 10.dp)) {
                            Spacer(modifier = Modifier.weight(1f).padding(top = 30.dp))
                            Button(colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                                shape = RoundedCornerShape(20.dp),
                                modifier = Modifier.height(50.dp).width(100.dp),
                                onClick = {
                                    navController.navigate("insertmoq2/{${mTitle}}/{${mCode.text}}/{${mDimn.text}}/{${mColor.text}}/{${mDesign.text}}")
                                }){
                                Text("بعدی", style = TextStyle(Color.White, fontSize = 20.sp))
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }
            }
        }
    }

}