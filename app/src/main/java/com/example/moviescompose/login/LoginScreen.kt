package com.example.moviescompose.login

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviescompose.movie.MovieListActivity
import com.example.moviescompose.ui.theme.MoviesTheme

@Composable
fun LoginScreen(){
    val context = LocalContext.current
    var password by remember { mutableStateOf("rocks") }
    var username by remember { mutableStateOf("kotlin") }

    val isLogged by vm.isLoggedFlow.collectAsState()

    if (username == "kotlin" && password == "rocks"){
        showToast(context, "Login OK ! Navigation vers la liste des films...")
        val intent = Intent(context, MovieListActivity::class.java)
        context.startActivity(intent)
    } else {
       Toast.make(context, "Nom d'utilisateur / mot de passe invalide")
    }

    Scaffold { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
        ) {
            Text("Login")

            OutlinedTextField(value = username,
                singleLine = true,
                onValueChange = {
                        text ->
                    username = text
                })

            PasswordField(value = password, onValueChange = {text ->
                password = text
            })

            Button(onClick = {

                vm.login

                if (username == "kotlin" && password == "rocks"){
                    showToast(context, "Login OK ! Navigation vers la liste des films...")
                    val intent = Intent(context, MovieListActivity::class.java)
                    context.startActivity(intent)
                } else {
                    showToast(context, "Nom d'utilisateur / mot de passe invalide")
                }
            }) {
                Text("Login")
            }
        }
    }
}

fun showToast(context: Context, text : String) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}

@Composable
fun PasswordField(value: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(value = value,
        singleLine = true,
        visualTransformation = PasswordVisualTransformation(),
        onValueChange = onValueChange
    )
}

@Preview
@Composable
fun PreviewLoginScreen() {
    MoviesTheme {
        LoginScreen()
    }
}