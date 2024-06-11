package com.example.mainnegarestan.screen.main_screens.lists

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.mainnegarestan.R
import com.example.mainnegarestan.screen.component_lists.AdvertiseListView
import com.example.mainnegarestan.viewmodel.product.CarpetViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarpetList(
    navController: NavHostController,
    viewModel: CarpetViewModel = hiltViewModel()) {


    var dataList by remember { mutableStateOf(viewModel.dataList) }
    var isLoading by remember { mutableStateOf(viewModel.isLoading) }


    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Scaffold(
            topBar = {
                TopAppBar(modifier = Modifier.shadow(elevation = 100.dp,
                    spotColor = Color.DarkGray,
                    shape = RoundedCornerShape(10.dp)
                ),
                    title = {
                        Text(modifier = Modifier.padding(top = 10.dp), text = "فرش ها", style = TextStyle(fontSize = 30.sp), fontFamily = FontFamily(
                            Font(R.font.khat)
                        )
                        )
                    })
            },        ) {
            Spacer(modifier = Modifier.height(70.dp))

            LazyColumn(modifier = Modifier.padding(top = 70.dp)) {
                items(dataList.value.size) {index->
                    AdvertiseListView(dataList.value[index], navController)
                }
            }
        }
    }
}