package controllers.Segons

import utils.*

fun main(){
    /**
     * Algoritme que demana una nota entre 0 i 10, i mostra si és un aprovat o un suspès.
     * @author: Martí Vilàs
     * @since: 2 d'Octubre de 2024
     */

    println("Exercici 3")

    print("Dime la nota que has sacado y te diré si esta suspendida o aprovada: ")
    val nota:Double= llegirDouble()
    if (nota<10 || nota>0) {
        println("No me creo tu nota")
    }
    if (nota<5.0){
        println("Has ${RED}suspendido${RESET}")
    } else if(nota>5){
        println("Has ${GREEN_BOLD}aprovadoo${RESET}")
    } else{
        println("La nota que has introducido es incorrecta")
    }

}