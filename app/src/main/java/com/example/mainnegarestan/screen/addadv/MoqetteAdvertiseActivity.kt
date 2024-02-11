package com.example.mainnegarestan.screen.addadv

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.mainnegarestan.screen.addadv.ui.theme.MainNegarestanTheme
import com.example.mainnegarestan.screen.component.TitleAlertDialog

class MoqetteAdvertiseActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

                com.example.mainnegarestan.ui.theme.MainNegarestanTheme {
                    var navController = rememberNavController()
                    var pCode by rememberSaveable { mutableStateOf("") }

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
                                    TitleAlertDialog()
                                }
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Text(text = "ویژگی ها",
                                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                                    modifier = Modifier.padding(start = 10.dp, top = 5.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "ابعاد محصول", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "سایز محصول", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = " رنگ زمینه  ", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = " طرح محصول", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Text(text = "مشخصات فنی",
                                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                                    modifier = Modifier.padding(start = 10.dp, top = 5.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "تراکم عرضی", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "تراکم طولی", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "تراکم پود", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "جنس نخ تار", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "جنس نخ پود", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.align(alignment = Alignment.CenterVertically),text = "جنس نخ خاب", style = TextStyle(fontSize = 20.sp))
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
                                        modifier = Modifier.width(200.dp))
                                }
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                                Column(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, start = 10.dp, end = 10.dp)) {
                                    Text(modifier = Modifier.padding(10.dp),
                                        text = " توضیحات و اطلاعات تماس", style = TextStyle(fontSize = 20.sp)
                                    )
                                    Spacer(modifier = Modifier.weight(1f))
                                    OutlinedTextField(
                                        value = pCode,
                                        maxLines = 5,
                                        onValueChange = { pCode = it },
                                        shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                        keyboardOptions = KeyboardOptions(
                                            keyboardType = KeyboardType.Text
                                        ),
                                        colors = TextFieldDefaults.outlinedTextFieldColors(
                                        ),
                                        singleLine = true,
                                        modifier = Modifier.fillMaxWidth().height(150.dp))
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Row(modifier = Modifier.fillMaxWidth().padding(end = 10.dp)) {
                                    Spacer(modifier = Modifier.weight(1f))
                                    Button(
                                        modifier = Modifier.height(50.dp).width(100.dp), onClick = {}){
                                        Text("بعدی")
                                    }
                                }
                                Spacer(modifier = Modifier.height(20.dp))
                                Divider(modifier = Modifier.fillMaxWidth().padding(top = 5.dp, end = 10.dp, start = 10.dp))
                            }
                        }
                    }}
            }
        }}

}