package com.example.bugbusters.presentation.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bugbusters.data.SendMessageRepository
import com.example.bugbusters.data.SendMessageRepositoryImpl
import com.example.bugbusters.presentation.ui.screens.form.FormMessageScreen
import com.example.bugbusters.presentation.ui.screens.home.HomeScreen
import com.example.bugbusters.presentation.ui.screens.telasNao.ScreenFiveNo
import com.example.bugbusters.presentation.ui.screens.telasNao.ScreenFourNo
import com.example.bugbusters.presentation.ui.screens.telasNao.ScreenOneNo
import com.example.bugbusters.presentation.ui.screens.telasNao.ScreenThreeNo
import com.example.bugbusters.presentation.ui.screens.telasNao.ScreenTwoNo
import com.example.bugbusters.presentation.ui.screens.telasSim.ScreenFourYes
import com.example.bugbusters.presentation.ui.screens.telasSim.ScreenOneONeYes
import com.example.bugbusters.presentation.ui.screens.telasSim.ScreenOneYes
import com.example.bugbusters.presentation.ui.screens.telasSim.ScreenThree
import com.example.bugbusters.presentation.ui.screens.telasSim.ScreenTwoYes
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route,
    paddingValues: PaddingValues
) {
    Scaffold { padding ->
        Box(modifier = modifier.padding(padding)) {
            NavHost(
                modifier = modifier,
                navController = navController,
                startDestination = startDestination
            ) {
                composable(route = NavigationItem.Home.route) {
                    HomeScreen(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenOneYes.route) {
                    ScreenOneYes(
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenOneOneYes.route) {
                   ScreenOneONeYes(navController = navController)
                }
                composable(route = NavigationItem.ScreenTwoYes.route) {
                    ScreenTwoYes(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenThreeYes.route) {
                    ScreenThree(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenFourYes.route) {
                    ScreenFourYes(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenOneNo.route) {
                    ScreenOneNo(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenTwoNo.route) {
                    ScreenTwoNo(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenThreeNo.route) {
                    ScreenThreeNo(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenFourNo.route) {
                    ScreenFourNo(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenFiveNo.route) {
                    ScreenFiveNo(
                        paddingValues = paddingValues,
                        navController = navController
                    )
                }
                composable(route = NavigationItem.ScreenForm.route) {
                    val messageRepository = SendMessageRepositoryImpl(Firebase.firestore)
                    FormMessageScreen(
                        navController = navController,
                        messageRepository = messageRepository
                    )
                }
            }
        }
    }
}