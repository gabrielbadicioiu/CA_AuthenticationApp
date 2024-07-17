package ro.gabrielbadicioiu.authenticationapp.feature_authentication.presentation.login_screen.components

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SignUpTxt(
    onTextClick:()->Unit
)
{
    Box(modifier = Modifier
        .wrapContentSize()
        ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(color = Color.White,
                text = "Don't have an account yet?",
                )
            Spacer(modifier =Modifier.width(2.dp))
            Text(color = Color.Cyan,
                text = "Create one",
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.clickable {
                    onTextClick()
                }
            )

        }
    }

}