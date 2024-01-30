package com.example.mainnegarestan.screen.component

import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection
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
        BottomAppBar() {
            items.forEach {
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painter = painterResource(id = it.icon),
                            contentDescription = ""
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