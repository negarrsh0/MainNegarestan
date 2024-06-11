package com.example.mainnegarestan.screen.showscreens


import android.annotation.SuppressLint
import android.os.Bundle
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R
import com.example.mainnegarestan.screen.component.Loading
import com.example.mainnegarestan.viewmodel.product.ProductViewModel
import com.skydoves.landscapist.glide.GlideImage

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ShowCollage(
    productId:Long,
    navController: NavController,
    viewModel: ProductViewModel = hiltViewModel()
) {
    var data by remember { mutableStateOf(viewModel.data) }
    var isLoading by remember { mutableStateOf(true) }

    viewModel.getProductById(productId) { response ->
        isLoading = false
        if (response.status == "ok") {
            viewModel.data.value = response.data!![0]
        }
    }
    if (isLoading) {
        Loading(width = 100.dp)
    } else {

        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 70.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Box(modifier = Modifier.fillMaxWidth()) {
                GlideImage(
                    imageModel = data.value?.image!!,
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
                text = data.value?.title!!,
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
                    text = data.value!!.quality!!,
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
                    text = data.value!!.shape!!,
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
                    text = data.value!!.code!!,
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
                    text = data.value!!.color!!,
                    fontSize = 22.sp,
                    fontFamily = FontFamily(Font(R.font.dip))
                )
            }
            Spacer(modifier = Modifier.height(10.dp))

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
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                    modifier = Modifier.width(180.dp).height(70.dp),
                    onClick = {

                    },
                    shape = RoundedCornerShape(20),
                ) {
                    Text(text = "افزودن به علاقه مندی ها", color = Color.White)
                }
                Spacer(modifier = Modifier.weight(1f))
                data.value?.price?.let {
                    Text(
                        it!!,
                        modifier = Modifier.align(alignment = Alignment.CenterVertically)
                    )
                }
            }
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}