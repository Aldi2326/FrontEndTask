package com.aldi.frontendtask.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object List: Screen("list")
    data object About: Screen("about")
    data object Detail: Screen("detail_anime")
}