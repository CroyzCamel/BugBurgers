package com.example.bugbusters.presentation.ui.screens.telasNao

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
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
import com.example.bugbusters.R
import com.example.bugbusters.components.CustomButton
import com.example.bugbusters.presentation.navigation.NavigationItem
import com.example.bugbusters.presentation.ui.theme.primary
import com.example.bugbusters.presentation.ui.theme.secondary

@Composable
fun ScreenOneNo(
    modifier: Modifier = Modifier,
    navController: NavController,
    paddingValues: PaddingValues,
) {
    var expandedCard1 by remember { mutableStateOf(false) }
    var expandedCard2 by remember { mutableStateOf(false) }
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.tipos_de_diabetes),
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
                    append(stringResource(R.string.diabetes_mellitus))

                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append(stringResource(R.string.um_grupo_de))
                }
                withStyle(
                    style = SpanStyle(
                        color = primary,
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append(stringResource(R.string.doen_as_metab_licas))
                }
                withStyle(style = SpanStyle(fontSize = 20.sp)) {
                    append(stringResource(R.string.que_resultam_em))
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic
                    )
                ) {
                    append(stringResource(R.string.n_veis_elevados_de_glicose_no_sangue))
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
        Card(
            colors = CardDefaults.cardColors(
                containerColor = secondary
            ),
            onClick = {
                expandedCard1 = !expandedCard1
            }
        ) {
            Column(
                modifier = modifier.padding(5.dp)
            ) {
                Text(
                    text = "Diabetes Tipo 1", modifier = modifier.fillMaxWidth(),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W900,
                    color = primary
                )
                if (expandedCard1) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "É uma condição autoimune onde o corpo não produz insulina.",
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = secondary
            ),
            onClick = {
                expandedCard2 = !expandedCard2
            }
        ) {
            Column(
                modifier = modifier.padding(5.dp)
            ) {
                Text(
                    text = "Diabetes Tipo 2", modifier = modifier.fillMaxWidth(),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W900,
                    color = primary
                )
                if (expandedCard2) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(modifier = modifier.fillMaxWidth(),
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Italic
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
                }
            }
        }

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
        Spacer(modifier.height(18.dp))
        CustomButton {
            navController.navigate(NavigationItem.ScreenTwoNo.route)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ScreenOneNoPreview() {
    val rememberNavController = rememberNavController()
    ScreenOneNo(paddingValues = PaddingValues(10.dp), navController = rememberNavController)
}