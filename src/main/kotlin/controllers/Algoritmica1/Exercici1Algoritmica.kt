package controllers.Algoritmica1

import utils.*

fun main(){
    /**
     * Algoritme que mostra els números del 10 al 0, i al final, BOOOOOM!!
     * @author: Martí Vilàs
     * @since: 2 d'Octubre de 2024
     */
    println("Exercici 1 algorítmica")

    for (i in 10 downTo 0){
        println("${YELLOW_BOLD}$i${RESET}")
        if(i==0){
            println("${RED}BOOOOOOOOM!!!!${RESET}")
        }
    }
}