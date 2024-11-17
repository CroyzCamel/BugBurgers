package com.example.bugbusters.presentation.ui.screens.form

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bugbusters.R
import com.example.bugbusters.data.SendMessageRepository
import com.example.bugbusters.factory.MessageViewModelFactory
import com.example.bugbusters.presentation.ui.theme.primary
import com.example.bugbusters.presentation.viewModel.MessageViewModel

@Composable
fun FormMessageScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    messageRepository: SendMessageRepository
) {

    val messageViewModel: MessageViewModel = viewModel(
        factory = MessageViewModelFactory(messageRepository)
    )
    var message by remember { mutableStateOf("") }
    val isLoading by messageViewModel.isLoading.collectAsStateWithLifecycle()
    val errorMessage by messageViewModel.errorMessage.collectAsStateWithLifecycle()
    val current: Context = LocalContext.current



    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Faça aqui sua contribuição",
            modifier = modifier.padding(top = 50.dp),
            fontSize = 30.sp,
            color = primary,
            fontWeight = FontWeight.W900,
        )
        Image(
            painter = painterResource(id = R.drawable.from_icon),
            contentDescription = stringResource(R.string.icone_formulario),

            )
        TextField(
            label = { Text(text = "Digite aqui", fontWeight = FontWeight.SemiBold) },
            value = message,
            onValueChange = { newMessage ->
                message = newMessage
            },
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = (15.dp)),
            shape = CircleShape,
            maxLines = 10,
            textStyle = TextStyle(
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            ),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
        )
        if (isLoading) {
            CircularProgressIndicator()
        } else {
            Button(
                onClick = {
                    if (message.isEmpty()){
                        Toast.makeText(current, "Por favor, enviar", Toast.LENGTH_SHORT).show()
                    } else {
                        messageViewModel.sendMessage(message)
                        message = ""
                    }
                },
                enabled = message.isNotBlank(),
                colors = ButtonColors(
                    containerColor = primary,
                    contentColor = primary,
                    disabledContentColor = primary,
                    disabledContainerColor = primary
                ),
            ) {
                Text(text = "Enviar", color = Color.White)
            }
            errorMessage?.let {
                Text(
                    text = it,
                    color = MaterialTheme.colorScheme.error,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun FormMessagePreview() {
    val rememberNavController = rememberNavController()

    val fakeRepository = object : SendMessageRepository {
        override suspend fun sendMessage(message: String): Boolean {
            return true
        }
    }
    FormMessageScreen(navController = rememberNavController, messageRepository = fakeRepository)
}