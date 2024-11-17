package com.example.bugbusters.presentation.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bugbusters.R
import com.example.bugbusters.components.ButtonYes
import com.example.bugbusters.components.CustomButton
import com.example.bugbusters.presentation.navigation.NavigationItem
import com.example.bugbusters.presentation.ui.theme.primary
import com.example.bugbusters.presentation.ui.theme.primaryFontFamily


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    navController: NavController,
) {
    val annotationString = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = 48.sp,
                fontWeight = FontWeight.W900,
                color = primary,
            )
        ) {
            append("Você Sabe")
        }
        append("\n\n")
        withStyle(
            style = SpanStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = primary,
            )
        ) {
            append("o que é ")
        }
        withStyle(
            style = SpanStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.W900,
                color = primary
            )
        ) {
            append("diabetes ?")
        }
    }
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            painter = painterResource(id = R.drawable.vector_diabets),
            contentDescription = stringResource(R.string.icone_diabetes)
        )
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues = paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(text = annotationString,
                fontFamily = primaryFontFamily)
            Spacer(modifier.height(100.dp))
            ButtonYes(navigate = { navController.navigate(NavigationItem.ScreenOneYes.route) })
            Spacer(modifier = modifier.height(26.dp))
            CustomButton(navigate = { navController.navigate(NavigationItem.ScreenOneNo.route) })
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    val rememberNavController = rememberNavController()
    HomeScreen(paddingValues = PaddingValues(10.dp), navController = rememberNavController)
}
