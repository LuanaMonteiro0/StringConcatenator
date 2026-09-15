package br.edu.ifsp.scl.prdm.sc3029972.stringconcatenator.navigation

sealed class Screen (val route: String){

    object Home: Screen (route = "home_screen")

    object AddWord: Screen (route = "add_word_screen")

}