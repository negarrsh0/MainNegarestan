package com.example.mainnegarestan.screen.insert_advertise.insert_carpet

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mainnegarestan.screen.component.MainAlertDialog
import com.example.mainnegarestan.ui.theme.MainNegarestanTheme
import kotlin.math.log


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun InsertCarpet(navController: NavHostController) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        MainNegarestanTheme {
            var pCode by remember { mutableStateOf(TextFieldValue()) }
            var pDimn by remember { mutableStateOf(TextFieldValue()) }
            var pSize by remember { mutableStateOf(TextFieldValue()) }
            var pColor by remember { mutableStateOf(TextFieldValue()) }
            var pDesign by remember { mutableStateOf(TextFieldValue()) }
            var pPrice by remember { mutableStateOf(TextFieldValue()) }
            var showDialog by remember { mutableStateOf(false) }
            var title by remember { mutableStateOf("") }


            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.White
            ) {
                Scaffold(
                    topBar = { TopAppBar(title = { Text("افزودن آگهی", fontWeight = FontWeight.Bold, fontSize = 20.sp) },backgroundColor = Color.Transparent) }
                ) {
                    Column (modifier = Modifier.fillMaxSize().padding(start = 10.dp, end =  10.dp ).verticalScroll(
                        rememberScrollState()
                    )){
                        Spacer(modifier = Modifier.height(10.dp))
                        Row (modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)){
                            Text(text = "دسته بندی", style = TextStyle(fontSize = 20.sp), modifier = Modifier.padding(start=15.dp))
                            Spacer(modifier = Modifier.weight(1f))
                            Text(text = "فرش", style = TextStyle(fontSize = 20.sp), modifier = Modifier.padding(end = 15.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp))
                        Text(text = "مشخصات کلی",
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(modifier = Modifier.height(50.dp).fillMaxWidth()) {
                            TextButton(onClick = { showDialog = true }) {
                                Row {
                                    Text(
                                        "عنوان محصول", modifier = Modifier.weight(1f),
                                        style = TextStyle(fontSize = 20.sp, color = Color.Black),
                                    )
                                    Text(
                                        "انتخاب",
                                        style = TextStyle(fontSize = 20.sp, color = Color.Black),
                                    )

                                }

                            }

                            MainAlertDialog(
                                showDialog = showDialog,
                                onDismiss = { showDialog = false },
                                onConfirm = {
                                    title = it
                                    showDialog = false
                                }
                            )                        }
                        Divider(modifier = Modifier.fillMaxWidth().padding(end = 10.dp, start = 10.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = " کد محصول", style = TextStyle(fontSize = 20.sp))
                            Spacer(modifier = Modifier.weight(1f))
                        OutlinedTextField(
                            value = pCode,
                            onValueChange = { pCode = it },
                            shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text
                                ),

                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                            singleLine = true,
                            modifier = Modifier.width(200.dp),
                            textStyle = TextStyle(
                                textAlign = TextAlign.Right,
                                textDirection = TextDirection.Rtl
                            )
                            )
                        }
                        Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                        Text(text = "ویژگی ها",
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "ابعاد محصول", style = TextStyle(fontSize = 20.sp))
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = pDimn,
                                onValueChange = { pDimn= it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp))
                        }
                        Text(modifier = Modifier,text = pDimn.text, style = TextStyle(fontSize = 20.sp))

                        Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "سایز محصول", style = TextStyle(fontSize = 20.sp))
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = pSize,
                                onValueChange = { pSize = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = " رنگ زمینه  ", style = TextStyle(fontSize = 20.sp))
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = pColor,
                                onValueChange = { pColor = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = " طرح محصول", style = TextStyle(fontSize = 20.sp))
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = pDesign,
                                onValueChange = { pDesign = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                            Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "قیمت", style = TextStyle(fontSize = 20.sp))
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedTextField(
                                value = pPrice,
                                onValueChange = { pPrice = it },
                                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Text
                                ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                ),
                                singleLine = true,
                                modifier = Modifier.width(200.dp))
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(end = 10.dp)) {
                            Spacer(modifier = Modifier.weight(1f).padding(top = 30.dp))
                            Button(colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                                shape = RoundedCornerShape(20.dp),
                                modifier = Modifier.height(50.dp).width(100.dp),
                                onClick = {
                                    Log.d("TAG", "InsertCarpet: $title/${pCode.text}/${pDimn.text}/${pSize.text}/${pColor.text}/${pDesign.text}")
                                    navController.navigate("insertcarpet2/$title/${pCode.text}/${pDimn.text}/${pSize.text}/${pColor.text}/${pDesign.text}")
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