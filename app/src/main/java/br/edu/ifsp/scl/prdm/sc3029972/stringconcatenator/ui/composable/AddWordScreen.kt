package br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.composable

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.theme.StringConcatenatorTheme

@Composable
fun AddWordScreen(modifier: Modifier) {

    Column(modifier = modifier.fillMaxSize()){
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = ""
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Digite o texto aqui"
                )
            },
            value = "",
            onValueChange = {}
        )

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Concatenar"
            )
        }
    }

}


@Preview(
    name = "light mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun AddWordScreenPreview(){
    StringConcatenatorTheme() {
        Surface{
            AddWordScreen(modifier = Modifier)
        }
    }
}