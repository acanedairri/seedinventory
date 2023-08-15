package com.irri.seed_inventory.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.irri.seed_inventory.app.ui.theme.ColorBlack
import com.irri.seed_inventory.app.ui.theme.ColorBlueIceberg
import com.irri.seed_inventory.app.ui.theme.ColorChineseBlack
import com.irri.seed_inventory.app.ui.theme.ColorRedFleryRose
import com.irri.seed_inventory.app.ui.theme.ColorWhiteCultured
import com.irri.seed_inventory.app.ui.theme.Pink40
import com.irri.seed_inventory.app.ui.theme.Pink80
import com.irri.seed_inventory.app.ui.theme.Purple40
import com.irri.seed_inventory.app.ui.theme.Purple80
import com.irri.seed_inventory.app.ui.theme.PurpleGrey40
import com.irri.seed_inventory.app.ui.theme.PurpleGrey80
import com.irri.seed_inventory.app.ui.theme.customTypography

private val DarkColorScheme = darkColorScheme(
    primary = ColorWhiteCultured,
    secondary = ColorBlueIceberg,
    tertiary = ColorRedFleryRose,
    background = ColorBlack,
    surface = ColorBlack,
    onPrimary = ColorChineseBlack,
    onSecondary = ColorWhiteCultured,
    onTertiary = ColorWhiteCultured,
    onBackground = ColorWhiteCultured,
    onSurface = ColorChineseBlack,
    surfaceTint = ColorWhiteCultured
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun SeedInventoryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        val currentWindow = (view.context as? Activity)?.window
            ?: throw Exception("Not in an activity - unable to get Window reference")

        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.background.toArgb()
            (view.context as Activity).window.navigationBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(currentWindow, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme, typography = customTypography, content = content
    )
}