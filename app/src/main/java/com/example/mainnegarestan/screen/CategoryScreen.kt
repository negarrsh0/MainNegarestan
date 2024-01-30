package com.example.mainnegarestan.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainnegarestan.screen.component_lists.CarpetPanelCategoryListView
import com.example.mainnegarestan.screen.component_lists.CarpetCategoryListView
import com.example.mainnegarestan.screen.component_lists.CollageCategoryListView
import com.example.mainnegarestan.screen.component_lists.MoquetteCategoryListView
import com.example.mainnegarestan.screen.component_lists.RugCategoryListView
import com.example.mainnegarestan.screen.util.CollageCategory
import com.example.mainnegarestan.screen.util.MoquetteCategory
import com.example.mainnegarestan.screen.util.RugCategory

@Composable
fun CategoryScreen() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .verticalScroll(rememberScrollState())) {
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "فرش", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Divider(Modifier.width(300.dp).background(color = Color.Gray).align(
            Alignment.CenterHorizontally
        ))
        Spacer(modifier = Modifier.height(5.dp))
        CarpetCategoryListView()
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "تابلو فرش",fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Divider(Modifier.width(300.dp).background(color = Color.Gray).align(
            Alignment.CenterHorizontally
        ))
        Spacer(modifier = Modifier.height(5.dp))
        CarpetPanelCategoryListView()
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "کلاژ و فرش رنگ شده",fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Divider(Modifier.width(300.dp).background(color = Color.Gray).align(
            Alignment.CenterHorizontally
        ))
        Spacer(modifier = Modifier.height(5.dp))
        CollageCategoryListView()
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "موکت",fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Divider(Modifier.width(300.dp).background(color = Color.Gray).align(
            Alignment.CenterHorizontally
        ))
        Spacer(modifier = Modifier.height(5.dp))
        MoquetteCategoryListView()
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "گلیم و گبه",fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Divider(Modifier.width(300.dp).background(color = Color.Gray).align(
            Alignment.CenterHorizontally
        ))
        Spacer(modifier = Modifier.height(5.dp))
        RugCategoryListView()
        Spacer(modifier = Modifier.height(120.dp))
        }
    }
}