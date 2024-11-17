package com.example.bugbusters.presentation.ui.screens.telasSim

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bugbusters.R
import com.example.bugbusters.components.ButtonNo
import com.example.bugbusters.components.ButtonYes
import com.example.bugbusters.presentation.navigation.NavigationItem
import com.example.bugbusters.presentation.ui.theme.primary
import com.example.bugbusters.presentation.ui.theme.primaryFontFamily

@Composable
fun ScreenOneONeYes(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold { paddingValues ->
        Column (
            modifier = modifier
                .padding(paddingValues)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Além disso",
                fontSize = 36.sp,
                color = primary,
                fontWeight = FontWeight.W900,
                fontFamily = primaryFontFamily,
            )
            Image(
                painter = painterResource(id = R.drawable.gravida),
                contentDescription = stringResource(R.string.icone_gravida)
            )
            Text(
                text = "Existe a diabetes gestacional, que ocorre durante a gravidez.",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Justify,
                fontFamily = primaryFontFamily,
                modifier = modifier.padding(horizontal = 20.dp, vertical = 10.dp)
            )
            Spacer(modifier = modifier.height(10.dp))
            ButtonYes(navigate = { navController.navigate(NavigationItem.ScreenTwoYes.route) })
            Spacer(modifier = modifier.height(10.dp))

            ButtonNo {
                navController.navigate(NavigationItem.ScreenForm.route)
            }
        }


    }
}

@Preview
@Composable
private fun ScreenOneONeYesPreview() {
    ScreenOneONeYes(navController = rememberNavController())
}