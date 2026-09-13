package br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.composable

import android.content.res.Configuration
import androidx.compose.foundation.gestures.draggable2D
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.theme.StringConcatenatorTheme

@Composable
fun HomeScreen(modifier: Modifier) {

    Column(modifier = modifier.fillMaxSize()){
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = ""
        )

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Adicionar Palavra"
            )
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
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
            HomeScreen(modifier = Modifier)
        }
    }
}