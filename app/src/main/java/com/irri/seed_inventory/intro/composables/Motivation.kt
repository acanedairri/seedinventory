package com.irri.seed_inventory.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.irri.seed_inventory.app.ui.previews.AllScreenPreview
import com.irri.seed_inventory.intro.IntroNavOption
import com.irri.seed_inventory.ui.theme.SeedInventoryTheme


@Composable
fun MotivationScreen(navController: NavController) = IntroCompose(
    navController = navController,
    text = "Motivation"
) {
    navController.navigate(IntroNavOption.RecommendationScreen.name)
}

@AllScreenPreview
@Composable
fun MotivationPrivacyPreview() {
    val navController = rememberNavController()
    SeedInventoryTheme {
        MotivationScreen(navController = navController)
    }
}

