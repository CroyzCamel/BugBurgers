package com.example.bugbusters.ui.telas_nao

import androidx.compose.foundation.layout.Column
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
import com.example.bugbusters.ui.telas_sim.ScreenThree
import com.example.bugbusters.ui.theme.primary

@Composable
fun ScreenThreeNo(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            " Tratamento e \n" +
                    "Controle",
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
                withStyle(style = SpanStyle(fontSize = 32.sp, fontWeight = FontWeight.W900)) {
                    append("O tratamento ")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("da diabetes pode incluir mudanças na dieta, atividade física e medicamentos.")
                }
            }
        )
        Spacer(modifier = modifier.height(30.dp))
        Text(
            modifier = modifier.fillMaxWidth(), textAlign = TextAlign.Justify,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 32.sp, fontWeight = FontWeight.W900)) {
                    append("Diabetes tipo 1 \n")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("As pessoas precisam tomar insulina todos os dias")
                }
            }
        )
        Spacer(modifier = modifier.height(30.dp))
        Text(
            modifier = modifier.fillMaxWidth(), textAlign = TextAlign.Justify,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 32.sp, fontWeight = FontWeight.W900)) {
                    append("Diabetes tipo 2 \n")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("Muitas vezes é possível controlar a doença com uma alimentação saudável e exercícios, mas algumas pessoas também podem precisar de medicamentos.")
                }
            }
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ScreenThreeNoPreview() {
    ScreenThreeNo()
}