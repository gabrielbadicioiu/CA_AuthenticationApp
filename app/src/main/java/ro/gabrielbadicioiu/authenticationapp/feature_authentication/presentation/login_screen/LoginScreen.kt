package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ro.gabrielbadicioiu.authenticationapp.R
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.DefaultOutlinedTextField
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.RememberForgotSection
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.SignInButton
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components.SignUpTxt
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.util.Screens

@Composable
fun LoginScreen(
viewModel: LoginScreenViewModel,
navController: NavController

)
{
    val context: Context =LocalContext.current
    LaunchedEffect(key1 = true) {
        viewModel.evetFlow.collect{
            event->
            when(event)
            {
                is LoginScreenViewModel.UiEvent.SignUp->{
                    navController.navigate(Screens.SignUpScreen)
                }
                is LoginScreenViewModel.UiEvent.ShowToast->
                {
                    Toast.makeText(context, event.message, Toast.LENGTH_LONG).show()
                }

            }
        }
    }

        Column(modifier = Modifier
            .fillMaxSize(),
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
            SignUpTxt { viewModel.onEvent(LoginScreenEvent.OnSignUpClick) }
            SignInButton(){viewModel.onEvent(LoginScreenEvent.OnLoginClick)}


        }
    }

