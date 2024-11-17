package com.example.bugbusters.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bugbusters.presentation.ui.theme.primary

@Composable
fun CustomButton(modifier: Modifier = Modifier, navigate: () -> Unit) {
    Button(
        modifier = modifier
            .width(350.dp)
            .height(60.dp),
        colors = ButtonColors(
            containerColor =Color(0x0F0C0B0B),
            contentColor = Color(0x0F0C0B0B),
            disabledContentColor = Color(0x0F0C0B0B),
            disabledContainerColor = Color(0x0F0C0B0B),
        ), onClick = navigate
    ) {
        Text(text = "Clique aqui para saber mais", color = Color.Black)
    }
}

@Preview(showSystemUi = false, showBackground = true)
@Composable
private fun CustomButtonPreview() {
    CustomButton(Modifier, { })
}