package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.util

import kotlinx.serialization.Serializable

sealed class Screens {
     @Serializable
     object LoginScreen:Screens()
    @Serializable
    object SignUpScreen:Screens()
}