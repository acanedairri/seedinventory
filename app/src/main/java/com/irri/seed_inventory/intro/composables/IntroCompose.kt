package com.irri.seed_inventory.intro.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.irri.seed_inventory.R
import com.irri.seed_inventory.app.ui.components.AppButton
import com.irri.seed_inventory.app.ui.components.BackButton
import com.irri.seed_inventory.app.ui.components.OnClickFunction


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntroCompose(
    navController: NavController,
    text: String,
    buttonText: Int = R.string.next,
    showBackButton: Boolean = true,
    onNext: OnClickFunction

) = Scaffold(topBar = {
    TopAppBar(title = {}, navigationIcon = {
        if (showBackButton){
            BackButton {
                navController.popBackStack()
            }
        }
    })
}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .padding(it),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.weight(1f))
        AppButton(
            modifier = Modifier.padding(bottom = 30.dp),
            text = buttonText,
            onClick = onNext
        )
    }
}

