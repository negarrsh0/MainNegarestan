package com.example.mainnegarestan.screen.insert_advertise.insert_accessories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InsertAccessories2(navController: NavHostController) {
    var pCode by rememberSaveable { mutableStateOf("") }
    Column {
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
