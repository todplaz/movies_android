package com.example.moviescompose.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviescompose.R
import com.example.moviescompose.ui.theme.MoviesTheme
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue



@Composable
fun ProfileScreen() {
    var password by remember { mutableStateOf("") }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Coucou")

            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Avatar"
            )

            OutlinedTextField(value = password,
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = { text ->
                    password = text
                    println("value changed. text=$text")
                })

            Button(onClick = { }) {
                Text("Update password")
            }


        }
    }
}

@Preview
@Composable
fun PreviewProfileScreen() {
    MoviesTheme {
        ProfileScreen()
    }
}

