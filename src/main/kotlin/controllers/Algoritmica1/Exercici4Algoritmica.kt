package controllers.Algoritmica1

import utils.*

fun main(){
    /**
     * Exercici 4
     * Algoritme que demana un número, i mostra seqüencialment des d'aquest número fins al 0 (inclòs)
     * @author Marti Vilas
     * @since 3 d'Oct 2024
     */

    println("Digues un número, jo contaré des de aquest número fins a 0")
    val numUsuari:Int= llegirInt()

    for(i in numUsuari downTo 0){
        println("$i")
    }

}