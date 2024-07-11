package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ro.gabrielbadicioiu.authenticationapp.R
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.DefaultOutlinedTextField
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.RememberForgotSection
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.SignInButton
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.SignUpTxt

@Composable
fun LoginScreen(
viewModel: LoginScreenViewModel
)
{
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.ic_login), contentDescription ="login_logo" ,
            modifier = Modifier.size(220.dp))
        Spacer(modifier = Modifier.height(75.dp))
        DefaultOutlinedTextField(label = "Email", icon = Icons.Default.MailOutline,true, viewModel.email){email->
            viewModel.onEvent(LoginScreenEvent.EnteredEmail(email))
        }
        DefaultOutlinedTextField(label = "Password", icon =Icons.Default.Lock, false, viewModel.password){
            password->
            viewModel.onEvent(LoginScreenEvent.EnteredPassword(password))
        }
        RememberForgotSection()//todo val checkbox
        SignUpTxt()
        SignInButton()


    }
}