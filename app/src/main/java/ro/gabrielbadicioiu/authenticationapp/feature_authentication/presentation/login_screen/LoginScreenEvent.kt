package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen

sealed class LoginScreenEvent{
    data class EnteredEmail(val value:String):LoginScreenEvent()
    data class EnteredPassword(val value:String):LoginScreenEvent()
    object OnSignUpClick:LoginScreenEvent()
    object OnLoginClick:LoginScreenEvent()

}
