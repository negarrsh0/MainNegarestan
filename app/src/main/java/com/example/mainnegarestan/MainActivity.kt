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
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mainnegarestan.screen.second_screens.AboutUsScreen
import com.example.mainnegarestan.screen.main_screens.AdvertiseScreen
import com.example.mainnegarestan.screen.learn_screens.CarpetLearning
import com.example.mainnegarestan.screen.learn_screens.CarpetPanelLearn
import com.example.mainnegarestan.screen.main_screens.CategoryScreen
import com.example.mainnegarestan.screen.learn_screens.CollageLearn
import com.example.mainnegarestan.screen.main_screens.HomeScreen
import com.example.mainnegarestan.screen.register_screens.LoginScreen
import com.example.mainnegarestan.screen.learn_screens.MoquetteLearn
import com.example.mainnegarestan.screen.second_screens.MyAdvertise
import com.example.mainnegarestan.screen.main_screens.ProfileScreen
import com.example.mainnegarestan.screen.register_screens.RegisterScreen
import com.example.mainnegarestan.screen.second_screens.ReportScreen
import com.example.mainnegarestan.screen.learn_screens.RugLearn
import com.example.mainnegarestan.screen.second_screens.TermScreen
import com.example.mainnegarestan.screen.component.BottomNavigationView
import com.example.mainnegarestan.screen.insert_advertise.insert_accessories.InsertAccessories
import com.example.mainnegarestan.screen.insert_advertise.insert_accessories.InsertAccessories2
import com.example.mainnegarestan.screen.insert_advertise.insert_carpet.InsertCarpet
import com.example.mainnegarestan.screen.insert_advertise.insert_carpet.InsertCarpet2
import com.example.mainnegarestan.screen.insert_advertise.insert_carpet_panel.InsertCarpetPanel
import com.example.mainnegarestan.screen.insert_advertise.insert_carpet_panel.InsertCarpetPanel2
import com.example.mainnegarestan.screen.insert_advertise.insert_collage.InsertCollage
import com.example.mainnegarestan.screen.insert_advertise.insert_collage.InsertCollage2
import com.example.mainnegarestan.screen.insert_advertise.insert_moquetee.InsertMoquette
import com.example.mainnegarestan.screen.insert_advertise.insert_moquetee.InsertMoquette2
import com.example.mainnegarestan.screen.insert_advertise.insert_rug.InsertRug
import com.example.mainnegarestan.screen.insert_advertise.insert_rug.InsertRug2
import com.example.mainnegarestan.screen.main_screens.lists.CarpetList
import com.example.mainnegarestan.screen.main_screens.lists.CarpetPanelList
import com.example.mainnegarestan.screen.main_screens.lists.ColageList
import com.example.mainnegarestan.screen.main_screens.lists.MoqueteList
import com.example.mainnegarestan.screen.main_screens.lists.RugList
import com.example.mainnegarestan.screen.second_screens.CategoryInsertAdv
import com.example.mainnegarestan.screen.showscreens.ShowAccessories
import com.example.mainnegarestan.screen.showscreens.ShowCarpet
import com.example.mainnegarestan.screen.showscreens.ShowCarpetPanel
import com.example.mainnegarestan.screen.showscreens.ShowCollage
import com.example.mainnegarestan.screen.showscreens.ShowMoquette
import com.example.mainnegarestan.screen.showscreens.ShowRug
import com.example.mainnegarestan.screen.showscreens.ShowTechnicalSpecifications
import com.example.mainnegarestan.ui.theme.MainNegarestanTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainNegarestanTheme {

                var navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                        Scaffold(
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
                                composable("advertise"){
                                    AdvertiseScreen(navController)
                                }
                                composable("category") {
                                    CategoryScreen(navController)
                                }
                                composable("profile") {
                                    ProfileScreen(navController)
                                }
                                composable("carpetlearn") {
                                    CarpetLearning(navController)
                                }
                                composable("carpanelearn") {
                                    CarpetPanelLearn(navController)
                                }
                                composable("ruglearn") {
                                    RugLearn(navController)
                                }
                                composable("collagelearn") {
                                    CollageLearn(navController)
                                }
                                composable("moqlearn") {
                                    MoquetteLearn(navController)
                                }
                                composable("login") {
                                    LoginScreen(navController)
                                }
                                composable("register") {
                                    RegisterScreen(navController)
                                }
                                composable("myadvertise"){
                                    MyAdvertise(navController)
                                }
                                composable("report"){
                                    ReportScreen(navController)
                                }
                                composable("term"){
                                    TermScreen(navController)
                                }
                                composable("aboutng"){
                                    AboutUsScreen(navController)
                                }
                                composable("showcarpet/{id}",
                                    arguments = listOf(
                                       navArgument("id"){ type = NavType.LongType }
                                     )
                                ){backStack ->
                                    backStack.arguments?.getLong("id").let {
                                        ShowCarpet(it!!,navController)
                                    }
                                }
                                composable("showcarpetpanel/{id}", arguments = listOf(
                                    navArgument("id"){type = NavType.LongType}
                                )
                                ){backStack ->
                                    backStack.arguments?.getLong("id").let {
                                        ShowCarpetPanel(it!!,navController)
                                    }
                                }
                                composable("showcollage/{id}", arguments = listOf(
                                    navArgument("id"){ type= NavType.LongType }
                                )
                                ){backstack->
                                    backstack.arguments?.getLong("id").let {
                                        ShowCollage(it!!,navController)
                                    }
                                }
                                composable("showmoquette/{id}", arguments = listOf(
                                    navArgument("id"){type= NavType.LongType}
                                )){backstack ->
                                    backstack.arguments?.getLong("id").let {
                                        ShowMoquette(it!!,navController)

                                    }
                                }
                                composable("showrug/{id}", arguments = listOf(
                                    navArgument("id"){
                                        type = NavType.LongType
                                    }
                                )){backstack->
                                    backstack.arguments!!.getLong("id").let {
                                        ShowRug(it!!,navController)
                                    }
                                }
                                composable("showaccessorie"){
                                    ShowAccessories(navController)
                                }
                                composable("showTechnicalSpecifications"){
                                    ShowTechnicalSpecifications(navController)
                                }
                                composable("carpetpanelList"){
                                    CarpetPanelList(navController)
                                }
                                composable("carpetlist"){
                                    CarpetList(navController)
                                }
                                composable("colagelist"){
                                    ColageList(navController)
                                }
                                composable("ruglist"){
                                    RugList(navController)
                                }
                                composable("moquetelist"){
                                    MoqueteList(navController)
                                }
                                composable("insertcarpet"){
                                    InsertCarpet(navController)
                                }
                                composable("insertcarpet2/{pTitel}/{pCode}/{pDimn}/{pSize}/{pColor}/{pDesign}", arguments = listOf(
                                    navArgument("pTitel",){type = NavType.StringType},
                                    navArgument("pCode",){type = NavType.StringType},
                                    navArgument("pDimn"){type = NavType.StringType},
                                    navArgument("pSize"){type = NavType.StringType},
                                    navArgument("pColor"){type = NavType.StringType},
                                    navArgument("pDesign"){type = NavType.StringType},
                                )){backstack->
                                    val pTitel = backstack.arguments?.getString("pTitel")
                                    val pCode = backstack.arguments?.getString("pCode")
                                    val pDimn = backstack.arguments?.getString("pDimn")
                                    val pSize = backstack.arguments?.getString("pSize")
                                    val pColor = backstack.arguments?.getString("pColor")
                                    val pDesign = backstack.arguments?.getString("pDesign")
                                    InsertCarpet2(pTitel!!,pCode!!, pDimn!!,pSize,pColor,pDesign,navController)
                                }
                                composable("insertacc"){
                                    InsertAccessories(navController)
                                }
                                composable("insertacc2"){
                                    InsertAccessories2(navController)
                                }
                                composable("insertcp"){
                                    InsertCarpetPanel(navController)
                                }
                                composable("insertcp2/{cpTitle}/{cpCode}/{cpDimn}/{cpSize}/{cpColor}/{cpDesign}", arguments = listOf(
                                    navArgument("cpTitle"){type = NavType.StringType},
                                    navArgument("cpCode"){type = NavType.StringType},
                                    navArgument("cpDimn"){type = NavType.StringType},
                                    navArgument("cpSize"){type = NavType.StringType},
                                    navArgument("cpColor"){type = NavType.StringType},
                                    navArgument("cpDesign"){type = NavType.StringType},
                                )){backstack ->
                                    val cpTitle =backstack.arguments?.getString("cpTitle")
                                    val cpCode = backstack.arguments?.getString("cpCode")
                                    val cpDimn = backstack.arguments?.getString("cpDimn")
                                    val cpSize = backstack.arguments?.getString("cpSize")
                                    val cpColor = backstack.arguments?.getString("cpColor")
                                    val cpDesign = backstack.arguments?.getString("cpDesign")
                                    InsertCarpetPanel2(cpTitle!!,cpCode,cpDimn,cpSize,cpColor,cpDesign,navController)
                                }
                                composable("insertcol"){
                                    InsertCollage(navController)
                                }
                                composable("insertcol2/{coTitle}/{coCode}/{coDimn}/{coSize}/{coColor}/{coDesign}", arguments = listOf(
                                    navArgument("coTitle"){type = NavType.StringType},
                                    navArgument("coCode"){type = NavType.StringType},
                                    navArgument("coDimn"){type = NavType.StringType},
                                    navArgument("coSize"){type = NavType.StringType},
                                    navArgument("coColor"){type = NavType.StringType},
                                    navArgument("coDesign"){type = NavType.StringType},
                                )){backStack ->
                                    val coTitle = backStack.arguments?.getString("coTitle")
                                    val coCode = backStack.arguments?.getString("coCode")
                                    val coDimn = backStack.arguments?.getString("coDimn")
                                    val coSize = backStack.arguments?.getString("coSize")
                                    val coColor = backStack.arguments?.getString("coColor")
                                    val coDesign = backStack.arguments?.getString("coDesign")
                                    InsertCollage2(coTitle!!,coCode,coDimn,coSize, coColor, coDesign, navController)
                                }
                                composable("insertrug"){
                                    InsertRug(navController)
                                }
                                composable("insertyrug2/{rTitle}/{rCode}/{rDimn}/{rSize}/{rColor}/{rDesign}", arguments = listOf(
                                    navArgument("rTitle"){type = NavType.StringType},
                                    navArgument("rCode"){type = NavType.StringType},
                                    navArgument("rDimn"){type = NavType.StringType},
                                    navArgument("rSize"){type = NavType.StringType},
                                    navArgument("rColor"){type = NavType.StringType},
                                    navArgument("rDesign"){type = NavType.StringType}

                                )){backstack ->
                                    val rTitle = backstack.arguments?.getString("rTitle")
                                    val rCode = backstack.arguments?.getString("rCode")
                                    val rDimn = backstack.arguments?.getString("rDimn")
                                    val rSize = backstack.arguments?.getString("rSize")
                                    val rColor = backstack.arguments?.getString("rColor")
                                    val rDesign = backstack.arguments?.getString("rDesign")
                                    InsertRug2(rTitle!!,rCode,rDimn,rSize,rColor,rDesign,navController)}
                                composable("insertmoq"){
                                    InsertMoquette(navController)}
                                composable("insertmoq2/{mTitle}/{mCode}/{mDimn}/{mColor}/{mDesign}",arguments = listOf(
                                    navArgument("mTitle"){type = NavType.StringType},
                                    navArgument("mCode"){type = NavType.StringType},
                                    navArgument("mDimn"){type = NavType.StringType},
                                    navArgument("mColor"){type = NavType.StringType},
                                    navArgument("mDesign"){type = NavType.StringType}
                                )){backstack ->
                                    val mTitle = backstack.arguments?.getString("mTitle")
                                    val mCode = backstack.arguments?.getString("mCode")
                                    val mDimn = backstack.arguments?.getString("mDimn")
                                    val mColor = backstack.arguments?.getString("mColor")
                                    val mDesign = backstack.arguments?.getString("mDesign")
                                    InsertMoquette2(mTitle,mCode,mDimn,mColor,mDesign,navController)
                                }

                                composable("categoryinsertadv"){
                                    CategoryInsertAdv(navController)
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}