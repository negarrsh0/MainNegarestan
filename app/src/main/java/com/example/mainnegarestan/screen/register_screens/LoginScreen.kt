package com.example.mainnegarestan.screen.register_screens

import android.widget.Toast
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.mainnegarestan.R
import com.example.mainnegarestan.model.user.User
import com.example.mainnegarestan.sharedp.UserPreferences
import com.example.mainnegarestan.viewmodel.user.UserViewModel

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    navController: NavController,
    userViewModel: UserViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    var userPreferences:UserPreferences= UserPreferences(context)
    var user=userPreferences.getUsername()
    var pass = userPreferences.getPassword()
    var pre = userPreferences.isLoggedIn()



    var phone by remember { mutableStateOf(TextFieldValue()) }
//    var usernameError by remember { mutableStateOf(false) }
    var password by remember { mutableStateOf(TextFieldValue()) }
//    var passwordError by remember { mutableStateOf(false) }
    var isLoading by remember { mutableStateOf(false) }
    var loggedIn by remember { mutableStateOf(userPreferences.isLoggedIn()) }

//    var passwordHidden by rememberSaveable { mutableStateOf(true) }

    val keyboardController = LocalSoftwareKeyboardController.current


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                color = Color.Transparent,
            )
    ) {
        Box(
            modifier = Modifier

                .align(Alignment.Center),
        ) {
            Image(
                painter = painterResource(id = R.drawable.user_sign_in),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
            )
            Column(
                modifier = Modifier.padding(16.dp)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState()),

                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                //.........................Spacer
                Spacer(modifier = Modifier.height(50.dp))

                //.........................Text: title
                androidx.compose.material3.Text(
                    text = "ورود",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.yekan))
                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 130.dp)
                        .fillMaxWidth(),
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = phone,
                    onValueChange = { phone = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    label = {
                        Text(
                            "شماره همراه",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan))
                            )
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = androidx.compose.ui.text.input.ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(0.8f),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        }
                    )
                )

                Spacer(modifier = Modifier.padding(3.dp))

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp),
                    label = {
                        Text(
                            "رمز عبور",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.yekan))
                            )
                        )
                    },

                    keyboardOptions = KeyboardOptions(
                        imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                    ),
                    trailingIcon = {

                    },
                    modifier = Modifier.fillMaxWidth(0.8f),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        }
                    )
                )
                val gradientColor = listOf(Color(0xFF484BF1), Color(0xFF673AB7))
                val cornerRadius = 16.dp

                Spacer(modifier = Modifier.padding(10.dp))
                androidx.compose.material3.Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp),
                    onClick = {
                        if (phone.text.isNotEmpty() && password.text.isNotEmpty()) {
                            var request = User(
                                phone = phone.text,
                                password = password.text
                            )
                            userViewModel.login(
                                request
                            ) { response ->

                                if (response.status == "SUCCESS") {
                                    Toast.makeText(context, "jale", Toast.LENGTH_SHORT).show()
                                    userPreferences.login(phone.text, password.text)
                                    loggedIn = false
                                    navController.navigate("categoryinsertadv")
                                } else if (response.status == "FAILED") {
                                    Toast.makeText(
                                        context,
                                        "کاربر موجود نیست لطفا ثبت نام کنید",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    },
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(cornerRadius)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                brush = Brush.horizontalGradient(colors = gradientColor),
                                shape = RoundedCornerShape(topStart = 30.dp, bottomEnd = 30.dp))
                            .clip(RoundedCornerShape(topStart = 30.dp, bottomEnd = 30.dp))
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                                contentAlignment = Alignment.Center
                    ) {
                        androidx.compose.material3.Text(
                            text = "ورود",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(10.dp))
                androidx.compose.material3.TextButton(onClick = {

                    navController.navigate("register") {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                }) {
                    androidx.compose.material3.Text(
                        text = "هنوز ثبت نام نکردم",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.yekan))
                        ),
                        letterSpacing = 1.sp,
                    )
                }
                Spacer(modifier = Modifier.padding(5.dp))
                androidx.compose.material3.TextButton(onClick = {
                    navController.navigate("reset_page") {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                }) {
                    androidx.compose.material3.Text(
                        text = "فراموشی رمز عبور",
                        letterSpacing = 1.sp,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.yekan))
                        )
                    )
                }
                Spacer(modifier = Modifier.padding(20.dp))
            }
        }
    }
}
//...........................................................................