package com.example.bugbusters.ui.telas_nao

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bugbusters.ui.theme.primary

@Composable
fun ScreenOneNo(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Tipos de Diabetes",
            fontSize = 40.sp,
            color = primary,
            fontWeight = FontWeight.W900,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = primary,
                        fontSize = 36.sp,
                        fontWeight = FontWeight.W900
                    )
                ) {
                    append("Diabetes mellitus")

                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append(" é um grupo de ")
                }
                withStyle(
                    style = SpanStyle(
                        color = primary,
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append("doenças metabólicas ")
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append("que resultam em ")
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append("níveis elevados de glicose no sangue.")
                }
            },
            textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = modifier.fillMaxWidth()) {
            Text(text = "Existem principalmente ", fontSize = 20.sp)
            Text(text = "dois tipos", fontSize = 20.sp, fontWeight = FontWeight.W900)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Diabetes Tipo 1", modifier = modifier.fillMaxWidth(),
            fontSize = 40.sp,
            fontWeight = FontWeight.W900,
            color = primary
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "É uma condição autoimune onde o corpo não produz insulina.", fontSize = 20.sp,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Diabetes Tipo 2", modifier = modifier.fillMaxWidth(),
            fontSize = 40.sp,
            fontWeight = FontWeight.W900,
            color = primary
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(modifier = modifier.fillMaxWidth(),
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 30.sp, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic
                    )
                ) {
                    append("É mais comum ")
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append("e geralmente está relacionado ao estilo de vida e à resistência à insulina.")
                }
            })
        Spacer(modifier = Modifier.height(25.dp))
        Text(modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Justify,
            text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 36.sp,
                    color = primary,
                    fontWeight = FontWeight.W900
                )
            ) {
                append("Além disso, ")
            }
            withStyle(
                style = SpanStyle(
                    fontSize = 20.sp,
                )
            ) {
                append("existe outra condição, ")
            }
            withStyle(
                style = SpanStyle(
                    fontSize = 20.sp,
                    color = primary,
                    fontWeight = FontWeight.W900,
                    fontStyle = FontStyle.Italic
                )
            ) {
                append("bem peculiar, ")
            }
            withStyle(
                style = SpanStyle(
                    fontSize = 20.sp,
                )
            ) {
                append("a ")
            }
            withStyle(
                style = SpanStyle(
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.W900
                )
            ) {
                append("diabetes gestacional, ")
            }
            withStyle(
                style = SpanStyle(
                    fontSize = 20.sp,

                )
            ) {
                append("que ocorre durante a gravidez.")
            }
        })
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ScreenOneNoPreview() {
    ScreenOneNo()
}