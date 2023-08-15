package com.irri.seed_inventory.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.irri.seed_inventory.app.ui.previews.AllScreenPreview
import com.irri.seed_inventory.intro.IntroNavOption
import com.irri.seed_inventory.ui.theme.SeedInventoryTheme

@Composable
fun WelcomeScreen(navController: NavController = rememberNavController()) = IntroCompose(
    navController = navController,
    text = "Welcome",
    showBackButton = false
) {
    navController.navigate(IntroNavOption.MotivationScreen.name)
}


@AllScreenPreview
@Composable
fun WelcomeScreenPreview() {
    SeedInventoryTheme {
        WelcomeScreen()
    }
}

