package controllers.Algoritmica1

import utils.*

fun main(){

    /**
     * Exercici 6
     * Algoritme que demana un número i mostra per pantalla la seva taula de multiplicar.
     * @author Marti Vilas
     * @since 3 d'Oct 2024
     */

    do {
        print("Digues un número entre el 1 i el 10 i et mostraré la seva taula de multiplicar: ")

        val numUsuari: Int = llegirInt()

        if (numUsuari > 10 || numUsuari < 0) {
            println("He dit entre el 1 i el 10 :)")
        } else {
            println("TAULA DE MULTIPLICAR DEL $numUsuari")
            for (i in 1..10) {
                println("$i x $numUsuari = ${i * numUsuari}")
            }
        }
    } while (numUsuari > 10 || numUsuari < 0)


}