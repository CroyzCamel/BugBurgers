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
fun ScreenFourNo(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            " Prevenção e \n" +
                    "Cuidados",
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
                    append("É importante ")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("cuidar da diabetes para evitar complicações de saúde. Isso inclui manter uma dieta equilibrada, fazer exercícios regularmente e monitorar os níveis de açúcar no sangue")
                }
            }
        )
        Spacer(modifier = modifier.height(30.dp))
        Text(
            modifier = modifier.fillMaxWidth(), textAlign = TextAlign.Justify,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 32.sp, fontWeight = FontWeight.W900)) {
                    append("Consultas ")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("médicas regulares também são essenciais para um bom controle da doença.")
                }
            }
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ScreenThreeNoPreview() {
    ScreenFourNo()
}