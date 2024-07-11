package ro.gabrielbadicioiu.authenticationapp.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.domain.use_cases.AuthenticationUseCases
import ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.LoginScreenViewModel

val appModule= module {

    single {
        AuthenticationUseCases(get())
    }
    viewModel {
        LoginScreenViewModel()
    }

    }