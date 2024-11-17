package com.example.bugbusters.presentation.ui.screens.telasSim

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
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
fun ScreenThree(modifier: Modifier = Modifier, navController: NavController, paddingValues: PaddingValues,) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 13.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Tratamento \n\n e \n\n Controle",
            fontSize = 40.sp,
            color = primary,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(10.dp),
            textAlign = TextAlign.Center,
            fontFamily = primaryFontFamily,

        )
        Text(
            text = stringResource(R.string.tratamento_e_controle),
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(top = 100.dp),
            fontFamily = primaryFontFamily,
        )
        Text(
            text = "Você concorda ?",
            fontSize = 20.sp,
            fontWeight = FontWeight.W900,
            modifier = modifier.padding(top = 10.dp)
        )
        Spacer(modifier = modifier.height(20.dp))

        ButtonYes(navigate = { navController.navigate(NavigationItem.ScreenFourYes.route) })
        Spacer(modifier = modifier.height(10.dp))
        ButtonNo {
            navController.navigate(NavigationItem.ScreenForm.route)
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ScreenThreePreview() {
    val rememberNavController = rememberNavController()
    ScreenThree(paddingValues = PaddingValues(10.dp),navController = rememberNavController)
}