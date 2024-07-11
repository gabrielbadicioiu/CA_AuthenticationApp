package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow


class LoginScreenViewModel(
 //   private val useCases: AuthenticationUseCases
):ViewModel() {
var email by mutableStateOf("")
    private set
    var password by mutableStateOf("")
        private set

    private val _eventFlow= MutableSharedFlow<UiEvent>()
    val evetFlow=_eventFlow.asSharedFlow()

    sealed class UiEvent{
        data class ShowToast(val message:String):UiEvent()
    }
    fun onEvent(event: LoginScreenEvent)
    {
        when(event)
        {
            is LoginScreenEvent.EnteredEmail->{
                email=event.value

            }
            is LoginScreenEvent.EnteredPassword->{
                password=event.value
            }
        }
    }
}