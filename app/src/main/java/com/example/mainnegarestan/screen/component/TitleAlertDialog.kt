package com.example.mainnegarestan.screen.component
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import com.example.mainnegarestan.R

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TitleAlertDialog() {
    var text by rememberSaveable { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current


    var backgroundColor by remember { mutableStateOf(Color.Blue) }
    var EnableDialog by remember { mutableStateOf(false) }
    val scaffoldState = rememberScaffoldState()
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Scaffold(
            scaffoldState = scaffoldState,
            backgroundColor = Color.Transparent,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                if (EnableDialog) {
                    AlertDialog(
                        modifier = Modifier.fillMaxWidth(),
                        onDismissRequest = {},
                        confirmButton = {

                                TextButton(
                                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                                    onClick = {
                                        EnableDialog = false
                                    }) {
                                    Text(
                                        text = "تایید",
                                        style = TextStyle(
                                            fontSize = 15.sp,
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold
                                        ),
                                    )
                                }
                        },
                        dismissButton = {
                            TextButton(
                                onClick = {
                                    EnableDialog = false
                                }) {
                                Text(
                                    text = "لغو",
                                    style = TextStyle(
                                        fontSize = 15.sp,
                                        color = Color.Black,
                                        fontWeight = FontWeight.Bold)
                                )
                            }
                        },
                        text = {
                            Column() {
                                Spacer(modifier = Modifier.height(10.dp))
                                Text("عنوان", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold))
                                Spacer(Modifier.height(20.dp))
                                OutlinedTextField(
                                    value = text,
                                    onValueChange = { text = it },
                                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                                    keyboardOptions = KeyboardOptions(
                                        imeAction = ImeAction.Default,
                                        keyboardType = KeyboardType.Text,
                                    ),
                                    colors = TextFieldDefaults.outlinedTextFieldColors(
                                        focusedBorderColor = Color.Red,
                                        unfocusedBorderColor = Color.Red
                                    ),
                                    singleLine = true,
                                    keyboardActions = KeyboardActions(
                                        onDone = {
                                            keyboardController?.hide()
                                        }
                                    )
                                )
                            }
                        },
                        properties = DialogProperties()
                    )
                }
                TextButton(onClick = {
                    EnableDialog = true
                }) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "عنوان",
                            style = TextStyle(
                                fontSize = 20.sp,
                                color = Color.Black
                            ),
//                            modifier = Modifier.padding(bottom = 10.dp)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = text, style = TextStyle(fontSize = 20.sp, color = Color.Black))
                    }
                }
            }
        }
     }
}