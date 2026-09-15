package br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.navigation

import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.composable.AddWordScreen
import br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.ui.composable.HomeScreen

private const val TEXT_TO_CONCATENATE= "text_to_CONCATENATE"
private const val TEXT_TO_SHOW= "text_to_show"

@Composable
fun MainNavHost(navHostController: NavHostController, modifier: Modifier){
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route,
    ) {

        composable(
            route = Screen.Home.route
        ){ backStackEntry ->

            val textToConcatenate = backStackEntry.savedStateHandle.get<String>(TEXT_TO_CONCATENATE) ?: ""
            val textToShow = backStackEntry.savedStateHandle.get<String>(TEXT_TO_SHOW) ?: ""

            HomeScreen(
                modifier = modifier,
                textToShow = textToShow,
                textToConcatenate = textToConcatenate,
                onAddWordClick = {textToShow ->
                    navHostController.navigate(
                        route = "${Screen.AddWord.route}/${Uri.encode(textToShow)}"
                    )
                },
            )

        }

        composable(
            route = "${Screen.AddWord.route}/{textReceived}",
            arguments = listOf(
                navArgument(
                    name = "textReceived",
                    builder = {
                        type = NavType.StringType
                    }
                )
            )
        ){ backStackEntry ->

            AddWordScreen(
                modifier = modifier,
                textReceived = backStackEntry.arguments?.getString("textReceived") ?: "",
                onConcatenateClick = {
                    textToConcatenate ->
                    navHostController.previousBackStackEntry?.savedStateHandle?.set(TEXT_TO_CONCATENATE, textToConcatenate)
                    navHostController.popBackStack()
                }
            )

        }

    }
}


