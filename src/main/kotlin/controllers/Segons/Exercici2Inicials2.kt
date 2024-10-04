package controllers.Segons

import utils.*

fun main(){

    /**
     * Algoritme que demana un número entre 0 i 10,
     * i dona error si és menor de 0 o major de 10.
     * @author: Martí Vilàs
     * @since: 2 d'octubre 2024
     */
    println("Exercici 2")

    print("Introdueix un número entre 1 i 10: ")
    val num:Int = llegirInt()

    if (num>10){
        println("${RED}ERROR, el número ha de ser menor de 10${RESET}")
    }else if (num<1){
        println("${RED}ERROR, el número ha de ser mayor de 0${RESET}")
    }else {
        println("El número que has dado es: ${YELLOW_BOLD}$num${RESET}")
    }

}