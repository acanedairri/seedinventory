package com.irri.seed_inventory.intro

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.irri.seed_inventory.NavRoutes

import com.irri.seed_inventory.intro.composables.MotivationScreen
import com.irri.seed_inventory.intro.composables.RecommendationScreen
import com.irri.seed_inventory.intro.composables.WelcomeScreen

fun NavGraphBuilder.introGraph(navController: NavController) {
    navigation(startDestination = IntroNavOption.WelcomeScreen.name, route = NavRoutes.IntroRoute.name) {
        composable(IntroNavOption.WelcomeScreen.name){
            WelcomeScreen(navController)
        }
        composable(IntroNavOption.MotivationScreen.name){
            MotivationScreen(navController)
        }
        composable(IntroNavOption.RecommendationScreen.name){
            RecommendationScreen(navController)
        }
    }
}

enum class IntroNavOption {
    WelcomeScreen,
    MotivationScreen,
    RecommendationScreen
}
