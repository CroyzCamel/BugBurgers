package com.example.bugbusters.ui

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bugbusters.components.ButtonNo
import com.example.bugbusters.components.ButtonYes
import com.example.bugbusters.ui.theme.primary


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

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

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Text(text = annotationString)
        Spacer(modifier.height(100.dp))
        ButtonYes()
        Spacer(modifier = modifier.height(26.dp))
        ButtonNo()
    }
}


@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}