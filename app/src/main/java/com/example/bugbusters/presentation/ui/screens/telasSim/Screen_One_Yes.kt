package com.example.bugbusters.presentation.ui.screens.telasSim

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bugbusters.R
import com.example.bugbusters.components.ButtonYes
import com.example.bugbusters.presentation.navigation.NavigationItem
import com.example.bugbusters.presentation.ui.theme.primary
import com.example.bugbusters.presentation.ui.theme.primaryFontFamily


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenOneYes(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Scaffold(
        topBar = {
            TopAppBarDefaults.windowInsets
        }
    ) { paddingValues ->
        Column(
            modifier
                .fillMaxSize()
                .padding(paddingValues = paddingValues)
                .padding(horizontal = 13.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "TIPOS DE DIABETES",
                fontSize = 34.sp,
                color = primary,
                fontWeight = FontWeight.Normal,
                fontFamily = primaryFontFamily
            )

            Text(
                "Como você sabe, existem 2 tipos de \n diabetes ",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                fontFamily = primaryFontFamily,
                modifier = modifier.padding(15.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.diabetes_type1_type2),
                contentDescription = "logo_diabetes_type1_type2",
                modifier = Modifier.width(300.dp).height(300.dp)
            )
            Spacer(modifier = modifier.height(20.dp),)
            Card(
                modifier = modifier.padding(vertical = 5.dp),
                colors = CardColors(
                    contentColor = Color.White,
                    containerColor = primary,
                    disabledContentColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent
                ),
               elevation = CardDefaults.cardElevation(
                   defaultElevation = 1.dp
               )
            ) {
                Text(
                    text = "Diabetes tipo 1 é uma condição autoimune onde o corpo não produz insulina.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Justify,
                    fontFamily = primaryFontFamily,
                    modifier = modifier.padding(8.dp)
                )
            }

            Card(
                modifier = modifier.padding(top = 5.dp, bottom = 10.dp),
                colors = CardColors(
                    contentColor = Color.White,
                    containerColor = primary,
                    disabledContentColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 1.dp
                )
            ) {
                Text(
                    text = "Diabetes tipo 2 é mais comum e geralmente está relacionado ao estilo de vida e à resistência à insulina.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Justify,
                    fontFamily = primaryFontFamily,
                    modifier = modifier.padding(8.dp)
                )
            }

            ButtonYes(
                text = "Ainda assim",
                modifier = modifier,
                navigate = { navController.navigate(NavigationItem.ScreenOneOneYes.route) })

        }
    }
}


@Preview(
    showBackground = true, showSystemUi = true, apiLevel = 34,
    wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE,
)
@Composable
private fun ScreenOnePreview() {
    ScreenOneYes(navController = rememberNavController())
}