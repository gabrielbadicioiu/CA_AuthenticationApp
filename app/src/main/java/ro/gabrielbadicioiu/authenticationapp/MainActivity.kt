package ro.gabrielbadicioiu.authenticationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.androidx.viewmodel.ext.android.getViewModel
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.LoginScreen
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.LoginScreenViewModel
import ro.gabrielbadicioiu.authenticationapp.ui.theme.AuthenticationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            AuthenticationAppTheme {
                val viewModel=getViewModel<LoginScreenViewModel>()
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center) {

                        LoginScreen(viewModel)
                    }
                }

            }
        }
    }
}

