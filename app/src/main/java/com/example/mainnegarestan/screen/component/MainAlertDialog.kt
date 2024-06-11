package com.example.mainnegarestan.screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.mainnegarestan.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAlertDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onConfirm: (String) -> Unit) {
    if (showDialog) {
        var title by remember { mutableStateOf("") }

        AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text(text = "عنوان محصول",
                style = TextStyle(fontFamily = FontFamily(Font(R.font.sade))
            )
                ) },
            text = {
                Column {
                    OutlinedTextField(
                        value = title,
                        onValueChange = { title = it },
                        label = { Text("عنوان",  style = TextStyle(fontFamily = FontFamily(Font(R.font.sade))
                        )) }
                    )
                }
            },
            confirmButton = {
                Button(onClick = { onConfirm(title) }) {
                    Text("تایید")
                }
            },
            dismissButton = {
                Button(onClick = onDismiss) {
                    Text("لغو")
                }
            }
        )
    }
}