package com.example.mainnegarestan.screen.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun BottomNavigationView(navController: NavController) {
    val items = listOf(
        NavigationItem.home,
        NavigationItem.adv,
        NavigationItem.cate,
        NavigationItem.prof,
    )
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        BottomAppBar(modifier = Modifier.height(65.dp).shadow(elevation = 5.dp), Color.White) {
            items.forEach {
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painter = painterResource(id = it.icon),
                            contentDescription = "",
                            modifier = Modifier.padding(bottom = 8.dp).size(24.dp)
                        )
                    },
                    selected = true,
                    label = { Text(text = it.title) },
                    onClick = {
                        navController.navigate(it.route)
                    }
                )
            }
        }
    }
}