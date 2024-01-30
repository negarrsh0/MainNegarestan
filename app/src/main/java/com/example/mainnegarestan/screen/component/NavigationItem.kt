package com.example.mainnegarestan.screen.component

import com.example.mainnegarestan.R

open class NavigationItem(var route: String, var icon:Int, var title: String){
    object home: NavigationItem("home", R.drawable.baseline_home_24,"خانه")
    object adv: NavigationItem("advertise", R.drawable.baseline_star_24,"آگهی ها")
    object cate: NavigationItem("category", R.drawable.baseline_list_24,"دسته بندی")
    object prof: NavigationItem("profile", R.drawable.baseline_person_24,"پروفایل")
}