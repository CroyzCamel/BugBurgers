package com.example.bugbusters.presentation.ui.screens.telasNao

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bugbusters.components.CustomButton
import com.example.bugbusters.presentation.navigation.NavigationItem
import com.example.bugbusters.presentation.ui.theme.primary

@Composable
fun ScreenFiveNo(modifier: Modifier = Modifier, navController: NavController, paddingValues: PaddingValues,) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            " Complicações da \n\n " +
                    "Diabetes",
            fontSize = 40.sp,
            color = primary,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(10.dp)
        )
        Spacer(modifier = modifier.height(100.dp))
        Text(
            modifier = modifier.fillMaxWidth(), textAlign = TextAlign.Justify,
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontSize = 32.sp,
                        fontWeight = FontWeight.W900,
                        color = primary
                    )
                ) {
                    append("Se a diabetes não for controlada, ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("pode levar a problemas de ")
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("saúde graves, ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("como doenças do ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp, fontWeight = FontWeight.W900)) {
                    append("coração, ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("problemas nos ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp, fontWeight = FontWeight.W900)) {
                    append("olhos, ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("nos ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp, fontWeight = FontWeight.W900)) {
                    append("rins ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("e danos aos ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp, fontWeight = FontWeight.W900)) {
                    append("nervos. ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("Portanto, ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("é ")
                }
                withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)) {
                    append("importante ")
                }
                withStyle(style = SpanStyle(fontSize = 24.sp)) {
                    append("seguir as orientações médicas e manter um ")
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("estilo de vida saudável.")
                }
            }
        )
        Spacer(modifier.height(18.dp))
        CustomButton {
            navController.navigate(NavigationItem.Home.route)
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ScreenThreeNoPreview() {
    val rememberNavController = rememberNavController()
    ScreenFiveNo(paddingValues = PaddingValues(10.dp),navController = rememberNavController)
}