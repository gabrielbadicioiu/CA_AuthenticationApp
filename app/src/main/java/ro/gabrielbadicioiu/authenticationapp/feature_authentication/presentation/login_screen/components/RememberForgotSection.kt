package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.LoginScreenViewModel

@Composable
fun RememberForgotSection(
   // viewModel: LoginScreenViewModel
)
{
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        RememberMeCheckBox(checkedState = false)//todo din viewmodel
        ForgotPasswordTxt()
    }
}