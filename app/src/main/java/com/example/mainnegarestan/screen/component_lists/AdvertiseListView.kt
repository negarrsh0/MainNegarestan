package com.example.mainnegarestan.screen.component_lists

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.screen.component.Loading
import com.example.mainnegarestan.viewmodel.product.ProductViewModel
import com.google.gson.Gson
import com.skydoves.landscapist.glide.GlideImage

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AdvertiseListView(
    product: Product,
    navController:NavController) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Box(
                modifier = Modifier.fillMaxWidth().padding(start = 5.dp, end = 5.dp, top = 5.dp)
                    .clickable {
                        if (product.category == "فرش") {
                            navController.navigate("showcarpet/${product.id}")
                        } else if (product.category  == "تابلوفرش") {
                            navController.navigate("showcarpetpanel/${product.id}")
                        } else if (product.category  == "کلاژ") {
                            navController.navigate("showcollage/${product.id}")
                        } else if (product.category  == "موکت") {
                            navController.navigate("showmoquette/${product.id}")
                        } else if (product.category  == "گلیم") {
                            navController.navigate("showrug/${product.id}")
                        } else {
                            navController.navigate("showaccessorie/${product.id}}")
                        }
                    }) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp, start = 10.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            modifier = Modifier.width(200.dp),
                            text = product.title!!,
                            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold),
                            maxLines = 2
                        )
                        Column(modifier = Modifier.padding(top = 40.dp)) {
                            Text(
                                modifier = Modifier.padding(start = 5.dp),
                                text = product.price!!,
                                style = TextStyle(fontSize = 15.sp)
                            )
                            Text(
                                modifier = Modifier.padding(start = 5.dp),
                                text = product.price!!,
                                style = TextStyle(fontSize = 15.sp),
                            )
                        }
                    }
                    Row {
                        Card(
                            modifier = Modifier.height(150.dp).width(150.dp),
                            shape = RoundedCornerShape(30.dp),
                            onClick = {
                                navController.navigate("showcarpet/${product.id}")
                            }
                        ) {
                            GlideImage(
                                imageModel = product.image!!,
                                modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                                contentDescription = "",
                                loading = {
                                    CircularProgressIndicator()
                                },
                                contentScale = ContentScale.Crop,
                                failure = {
                                    Text(text = "image request failed")
                                }
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
            Divider(modifier = Modifier.height(1.dp).padding(end = 15.dp, start = 15.dp))
        }
    }