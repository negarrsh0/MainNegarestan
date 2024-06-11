package com.example.mainnegarestan.screen.showscreens


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mainnegarestan.R
import com.skydoves.landscapist.glide.GlideImage

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ShowTechnicalSpecifications (navController: NavController) {

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Scaffold(
            topBar = {
                TopAppBar(modifier = Modifier.shadow(
                    elevation = 100.dp,
                    shape = RoundedCornerShape(10.dp)
                ),
                    title = {
                        Text(
                            modifier = Modifier.padding(top = 10.dp),
                            text = "عنوان",
                            style = TextStyle(fontSize = 30.sp),
                            fontFamily = FontFamily(
                                Font(R.font.khat)
                            )
                        )
                    })
            },
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 70.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    GlideImage(
                        imageModel = Image(painter = painterResource(R.drawable.slide3), ""),
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
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "عنوان",
                    fontSize = 25.sp,
                    fontFamily = FontFamily(Font(R.font.yekan)),
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "تاریخ",
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.yekan)),
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))

                Divider(modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().height(30.dp)
                        .padding(start = 15.dp, end = 15.dp)
                ) {
                    Text(
                        text = "ویژگی های عمومی",
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.yekan))
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().height(30.dp)
                        .padding(start = 15.dp, end = 15.dp)
                ) {
                    Text(
                        text = "کیفیت",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip)),
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "کیفیت",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip))
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().height(30.dp)
                        .padding(start = 15.dp, end = 15.dp)
                ) {
                    Text(
                        text = "شکل",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip)),
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "شکل",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip))
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth().height(30.dp)
                        .padding(start = 15.dp, end = 15.dp)
                ) {
                    Text(
                        text = "کد محصول",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip)),
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "کد محصول",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip))
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth().height(30.dp)
                        .padding(start = 15.dp, end = 15.dp)
                ) {
                    Text(
                        text = "رنگ محصول",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip)),
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "رنگ محصول",
                        fontSize = 22.sp,
                        fontFamily = FontFamily(Font(R.font.dip))
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

//                Text(
//                    text = "محل بافت",
//                    fontSize = 18.sp,
//                    fontFamily = FontFamily(Font(R.font.yekan)),
//                    modifier = Modifier.padding(start = 15.dp, end = 15.dp)
//                )
                Divider(modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().height(60.dp)
                        .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
                ) {
                    Text(
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),
                        text = "مشخصات فنی",
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.yekan))
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        painter = painterResource(R.drawable.baseline_arrow_back_ios_new_24),
                        "",
                        modifier = Modifier.size(14.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )
                }
                Divider(modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().height(60.dp)
                        .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
                ) {
                    Text(
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),
                        text = "معرفی اجمالی",
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.yekan))
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        painter = painterResource(R.drawable.baseline_arrow_back_ios_new_24),
                        "",
                        modifier = Modifier.size(14.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )
                }
                Divider(modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().height(60.dp)
                        .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
                ) {
                    Button(
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)

                        ,modifier = Modifier.width(180.dp).height(70.dp), onClick = {

                        }, shape = RoundedCornerShape(20),){
                        Text(text = "افزودن به علاقه مندی ها", color = Color.White)
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Text("تومان 10000 ", modifier = Modifier.align(alignment = Alignment.CenterVertically))
                }
                Spacer(modifier = Modifier.height(100.dp))
            }
        }
    }

}