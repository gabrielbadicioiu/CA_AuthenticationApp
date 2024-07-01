package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun DefaultOutlinedTextField(
label:String,
icon:ImageVector
)
{
    Box(modifier = Modifier.wrapContentSize()) {
        OutlinedTextField(

            value = "",
            onValueChange ={},
            colors = TextFieldDefaults.colors(focusedSuffixColor = Color.Cyan),
            label ={ Text(text = label)},
            leadingIcon ={ Icon(imageVector =icon , contentDescription = null)}
        )
    }

}