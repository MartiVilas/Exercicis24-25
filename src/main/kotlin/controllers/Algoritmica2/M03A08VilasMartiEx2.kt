package controllers.Algoritmica2

import utils.*

fun main(){

    /**
     * Algoritme igual a l'anterior, però al final diu quants insuficients,
     * quants suficients, quants bé, quants notables i quants excel·lents.
     * @author Marti Vilas
     * @since 3 d'Oct 2024
     */

    print("Dónam 10 de les teves notes")

    var suspes:Double=0.0
    var aprovat:Double=0.0
    var be:Double=0.0
    var excelent:Double=0.0
    var notable:Double=0.0


    for (i in 1..10){
        print("Introdueix el $i número: ")
        val nota:Double = llegirDouble()
        if (nota<0.0 || nota>10.0){
            println("El número ha de ser entre 1 i 10, este número no se cuenta.")
        } else {
            when (nota) {
                0.0, 1.0, 2.0, 3.0, 4.0 -> suspes++
                5.0 -> aprovat++
                6.0 -> be++
                7.0, 8.0 -> notable++
                9.0, 10.0 -> excelent++
            }
        }
    }

    println("La quantitat de notes suspeses són: ${RED}$suspes${RESET}")
    println("La quantitat de notes aprovades són: ${YELLOW}$aprovat${RESET}")
    println("La quantitat de notes bé són: ${GREEN_BOLD}$be${RESET}")
    println("La quantitat de notes notables són: ${BLUE_BOLD}$notable${RESET}")
    println("La quantitat de notes excelents són: ${CYAN_BOLD}$excelent${RESET}")

}