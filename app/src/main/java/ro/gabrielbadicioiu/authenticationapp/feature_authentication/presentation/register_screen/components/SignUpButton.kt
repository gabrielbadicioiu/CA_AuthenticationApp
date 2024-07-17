package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.register_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SignUpButton(
    onButtonClick:()->Unit
){

    Box {
        Button(
            onClick = { onButtonClick() }
            ) {
            Text(text = "Sign Up")
        }
    }

}