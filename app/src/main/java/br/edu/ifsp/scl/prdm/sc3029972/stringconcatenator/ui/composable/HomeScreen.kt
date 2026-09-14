package br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.composable

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.theme.StringConcatenatorTheme

@Composable
fun HomeScreen(modifier: Modifier, textToShow: String = "", textToConcatenate: String = "", onAddWordClick: (String) -> Unit) {

    var textToShow by remember { mutableStateOf(value = textToShow) }

    if(textToConcatenate != ""){
        textToShow = "$textToShow $textToConcatenate"
    }

    Column(modifier = modifier.fillMaxSize()){
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = textToShow
        )

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                onAddWordClick(textToShow)
            }
        ) {
            Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Adicionar Palavra"
            )
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                textToShow = ""
            }
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Reiniciar"
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
fun HomeScreenPreview(){
    StringConcatenatorTheme() {
        Surface{
            HomeScreen(
                modifier = Modifier,
                textToShow = "",
                textToConcatenate = "",
                onAddWordClick = {}
            )
        }
    }
}