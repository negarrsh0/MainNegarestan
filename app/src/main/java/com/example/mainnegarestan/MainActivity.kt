package com.example.mainnegarestan

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mainnegarestan.screen.AdvertiseScreen
import com.example.mainnegarestan.screen.CarpetLearning
import com.example.mainnegarestan.screen.CarpetPanelLearn
import com.example.mainnegarestan.screen.CategoryScreen
import com.example.mainnegarestan.screen.CollageLearn
import com.example.mainnegarestan.screen.HomeScreen
import com.example.mainnegarestan.screen.LoginScreen
import com.example.mainnegarestan.screen.MoquetteLearn
import com.example.mainnegarestan.screen.NewAdvertiseOneScreen
import com.example.mainnegarestan.screen.NewAdvertiseTwoScreen
import com.example.mainnegarestan.screen.ProfileScreen
import com.example.mainnegarestan.screen.RegisterScreen
import com.example.mainnegarestan.screen.RugLearn
import com.example.mainnegarestan.screen.component.BottomNavigationView
import com.example.mainnegarestan.screen.util.CarpetPanelCategory
import com.example.mainnegarestan.ui.theme.MainNegarestanTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    private var dataList = ArrayList<String>()

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainNegarestanTheme {

                var navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(

                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

                        Scaffold(
                            topBar = {
                                TopAppBar(title = { Text("نگارستان") })
                            },
                            bottomBar = {
                                BottomNavigationView(navController)
                            },
                        ) {
                            NavHost(
                                navController = navController,
                                startDestination = "home"
                            ) {
                                composable("home") {
                                    HomeScreen(navController)
                                }
                                composable("advertise") {
                                    AdvertiseScreen()
                                }
                                composable("category") {
                                    CategoryScreen()
                                }
                                composable("profile") {
                                    ProfileScreen(navController)
                                }
                                composable("carpetlearn"){
                                    CarpetLearning()
                                }
                                composable("carpanelearn"){
                                    CarpetPanelLearn()
                                }
                                composable("ruglearn"){
                                    RugLearn()
                                }
                                composable("collagelearn"){
                                    CollageLearn()
                                }
                                composable("moqlearn"){
                                    MoquetteLearn()
                                }
                                composable("login"){
                                    LoginScreen(navController)
                                }
                                composable("register"){
                                    RegisterScreen(navController)
                                }
                                composable("newadone"){
                                    NewAdvertiseOneScreen()
                                }
                                composable("newadtwo"){
                                    NewAdvertiseTwoScreen()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}