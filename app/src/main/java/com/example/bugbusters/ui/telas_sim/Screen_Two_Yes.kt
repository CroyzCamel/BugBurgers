package com.example.bugbusters.ui.telas_sim

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bugbusters.components.ButtonNo
import com.example.bugbusters.components.ButtonYes
import com.example.bugbusters.ui.theme.primary

@Composable
fun ScreenTwo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 13.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Sintomas \n e \n Diagnostico",
            fontSize = 40.sp,
            color = primary,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(10.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Os sintomas da diabetes incluem sede excessiva, urinação frequente, fadiga e visão embaçada. \n" +
                    "O diagnóstico pode ser feito por meio de exames como a dosagem de glicose no sangue em jejum, teste de tolerância à glicose ou hemoglobina glicada (HbA1c). É crucial fazer o diagnóstico precoce para evitar complicações.",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(top = 100.dp)
        )
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "Você concorda ?",
            fontSize = 20.sp,
            fontWeight = FontWeight.W900,
            modifier = modifier.padding(top = 10.dp)
        )
        Spacer(modifier = modifier.height(20.dp))

        ButtonYes()
        Spacer(modifier = modifier.height(10.dp))
        ButtonNo()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ScreenTwoPreview() {
    ScreenTwo()
}