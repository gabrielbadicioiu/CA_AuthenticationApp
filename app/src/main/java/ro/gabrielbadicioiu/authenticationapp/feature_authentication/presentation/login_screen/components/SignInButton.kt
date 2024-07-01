package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SignInButton(
    modifier: Modifier=Modifier
)
{
    Button(modifier = modifier,
        onClick = { /*TODO*/ }) {
        Text(text = "Sign In")
    }
}