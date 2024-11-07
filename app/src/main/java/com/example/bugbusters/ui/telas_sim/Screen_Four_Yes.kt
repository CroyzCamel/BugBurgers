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
fun ScreenFourYes(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 13.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Complicações \n da \n Diabetes",
            fontSize = 40.sp,
            color = primary,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(10.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "A diabetes mal controlada pode levar a várias complicações, incluindo doenças cardiovasculares, neuropatia, retinopatia e problemas renais. A prevenção dessas complicações envolve um gerenciamento adequado da glicose, acompanhamento médico regular e estilo de vida saudável.",
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ScreenFourYesPreview() {
    ScreenFourYes()
}