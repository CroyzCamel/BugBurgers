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
fun ScreenTwoNo(modifier: Modifier = Modifier, navController: NavController, paddingValues: PaddingValues,) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Sintomas e \n\n" +
                    "Diagnóstico",
            fontSize = 40.sp,
            color = primary,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(10.dp)
        )
        Spacer(modifier = modifier.height(50.dp))
        Text(
            modifier = modifier.fillMaxWidth(), textAlign = TextAlign.Justify,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 32.sp, fontWeight = FontWeight.W900)) {
                    append("Os sintomas ")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("da diabetes incluem sentir muita sede, ter que urinar frequentemente, sentir-se muito cansado e, em alguns casos, ter a visão embaçada. Se você notar esses sintomas, é importante consultar um médico.")
                }
            }
        )
        Spacer(modifier = modifier.height(30.dp))
        Text(
            modifier = modifier.fillMaxWidth(), textAlign = TextAlign.Justify,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 32.sp, fontWeight = FontWeight.W900)) {
                    append("O diagnóstico ")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("de diabetes é feito com exames de sangue que medem a quantidade de açúcar no seu sangue. O médico pode pedir um exame de glicose em jejum ou um teste de hemoglobina glicada, que mostra como seu açúcar no sangue tem estado ao longo do tempo.")
                }
            }
        )
        Spacer(modifier.height(18.dp))
        CustomButton {
            navController.navigate(NavigationItem.ScreenThreeNo.route)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ScreenTwoNoPreview() {
    val rememberNavController = rememberNavController()
    ScreenTwoNo(paddingValues = PaddingValues(10.dp),navController = rememberNavController)
}