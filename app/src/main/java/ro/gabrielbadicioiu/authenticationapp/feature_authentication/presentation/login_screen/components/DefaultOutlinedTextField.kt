package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun DefaultOutlinedTextField(
label:String,
icon:ImageVector,
isPasswordVisibile:Boolean,
value:String,
onValueChange:(value:String)->Unit
)
{
    val visualTransformation=if(isPasswordVisibile) VisualTransformation.None else PasswordVisualTransformation()
    Box(modifier = Modifier.wrapContentSize()) {
        OutlinedTextField(

            value = value,
            onValueChange ={onValueChange(it)},
            colors = TextFieldDefaults.colors(focusedSuffixColor = Color.Cyan),
            label ={ Text(text = label)},
            leadingIcon ={ Icon(imageVector =icon , contentDescription = null)},
            visualTransformation = visualTransformation
        )
    }

}