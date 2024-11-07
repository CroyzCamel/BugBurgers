package com.example.bugbusters.ui.telas_sim

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bugbusters.components.ButtonNo
import com.example.bugbusters.components.ButtonYes
import com.example.bugbusters.ui.theme.primary

@Composable
fun ScreenOne(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 13.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Tipos de Diabetes",
            fontSize = 40.sp,
            color = primary,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(10.dp)
        )
        HorizontalDivider(modifier = modifier.width(350.dp), thickness = 2.dp, color = Color.Black)
        Text(
            "Como você sabe, existem 2 tipos de \n diabetes ",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(15.dp)
        )
        Text(
            text = "Diabetes tipo 1",
            Modifier
                .fillMaxWidth()
                .width(359.dp)
                .height(51.dp)
                .background(primary)
                .padding(top = 15.dp, start = 10.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            color = Color.White
        )
        Text(
            text = "É uma condição autoimune onde o corpo não produz insulina",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = "Diabetes tipo 2",
            Modifier
                .fillMaxWidth()
                .width(359.dp)
                .height(51.dp)
                .background(primary)
                .padding(top = 15.dp, start = 10.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            color = Color.White
        )
        Text(
            text = "É mais comum e geralmente está" +
                    " relacionado ao estilo de vida e à resistência à insulina",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp)
        )

        Text(
            text = "Além disso",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 25.dp, start = 10.dp),
        )
        HorizontalDivider(modifier = modifier.width(350.dp), thickness = 2.dp, color = Color.Black)

        Text(
            text = "Existe a diabetes gestacional, que ocorre durante a gravidez.",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp)
        )
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
private fun ScreenOnePreview() {
    ScreenOne()
}