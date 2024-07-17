package ro.gabrielbadicioiu.authenticationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.androidx.viewmodel.ext.android.getViewModel
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.LoginScreen
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.LoginScreenViewModel
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.register_screen.RegisterScreen
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.util.Screens
import ro.gabrielbadicioiu.authenticationapp.ui.theme.AuthenticationAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            AuthenticationAppTheme {
                val loginScreenViewModel=getViewModel<LoginScreenViewModel>()
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = { TopAppBar(title = {
                        Text(text =loginScreenViewModel.currentScreen,
                            modifier = Modifier.fillMaxWidth(), fontSize = 24.sp, fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center) },
                        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Blue)
                    )}) {
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center) {
                        val navController= rememberNavController()
                        NavHost(
                            navController = navController,
                            startDestination = Screens.LoginScreen)
                        {
                            composable<Screens.LoginScreen> {
                                LoginScreen(viewModel =loginScreenViewModel , navController = navController)
                            }
                            composable<Screens.SignUpScreen> { 
                                 RegisterScreen()
                                }
                            }
                        }

                    }
                }

            }
        }
    }


