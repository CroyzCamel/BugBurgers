package com.example.bugbusters.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bugbusters.presentation.navigation.NavigationItem
import com.example.bugbusters.presentation.ui.theme.primary
import org.w3c.dom.Text

@Composable
fun ButtonYes(
    modifier: Modifier = Modifier,
    navigate: () -> Unit,
    text: String = "Sim"
) {
    Column {
        Button(
            modifier = modifier
                .width(350.dp)
                .height(60.dp),
            colors = ButtonColors(
                containerColor = primary,
                contentColor = primary,
                disabledContentColor = primary,
                disabledContainerColor = primary
            ), onClick = navigate
        ) {
            Text(text = text, fontSize = 20.sp, fontWeight = FontWeight.W900, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ButtonYesPreview() {
    ButtonYes(navigate = {
        NavigationItem.ScreenOneYes.route
    })
}