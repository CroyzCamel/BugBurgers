package com.example.bugbusters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.bugbusters.presentation.navigation.AppNavHost
import com.example.bugbusters.presentation.ui.theme.BugBustersTheme
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BugBustersTheme {
                Scaffold { innerPadding ->
                    AppNavHost(paddingValues = innerPadding, navController = rememberNavController())
                }
            }
        }
    }
}



