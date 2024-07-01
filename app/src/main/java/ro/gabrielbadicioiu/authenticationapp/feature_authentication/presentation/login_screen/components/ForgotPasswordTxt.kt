package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ForgotPasswordTxt()
{
    Box(modifier = Modifier.clickable { }
        .wrapContentSize()){
        Text(text = "Forgot password?",
            color = Color.Cyan,
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
    }
}