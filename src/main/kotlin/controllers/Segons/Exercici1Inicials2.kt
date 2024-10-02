package controllers.Segons

import utils.*

/**
 * @author: Martí Vilàs
 * @since 2 d'octubre 2024
 */
fun main(){
    println("Exercici 1")

    println("Introdueix la teva edat!")
    var edat:Int= llegirInt()

    if (edat>=18){
        println("${GREEN_BOLD}Pots entrar a drogarte :) $RESET")
    } else{
        println("${RED}No pots drogarte encara! :(((($RESET")
    }

}