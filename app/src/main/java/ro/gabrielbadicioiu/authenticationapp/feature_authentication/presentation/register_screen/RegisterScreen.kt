package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.register_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.DefaultOutlinedTextField
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.register_screen.components.SignUpButton

@Composable
fun RegisterScreen()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        DefaultOutlinedTextField(label = "First Name", icon =Icons.Default.Person, isPasswordVisibile =true , value = "") {

        }
        DefaultOutlinedTextField(label = "Last Name", icon =Icons.Default.Person, isPasswordVisibile =true , value = "") {

        }
        DefaultOutlinedTextField(label = "Password", icon =Icons.Default.Lock, isPasswordVisibile =false , value = "") {

        }
        DefaultOutlinedTextField(label = "Confirm password", icon =Icons.Default.Lock, isPasswordVisibile =false , value = "") {

        }
        SignUpButton {
            /*TODO*/
        }
    }
}