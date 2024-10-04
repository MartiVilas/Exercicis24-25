package controllers.Algoritmica2

import utils.*

fun main(){
    /**
     * Algoritme que demana 10 números (amb un bucle) entre 0 i 10 i
     * al final mostra per pantalla quants d'aquests eren inferiors a 5 i quants iguals o superiors.
     * @author Marti Vilas
     * @since 3 d'Oct 2024
     */

    println("Dónam 10 números entre 0 i 10 i et diré quins són més grans que 5 i quins són més petits.")

    var majorDe5:Int = 0
    var menorDe5:Int = 0
    var igualA5:Int = 0


    for (i in 1..10){

        print("Introdueix el $i número: ")
        val num:Int = llegirInt()
        if (num<0 || num>10){
            println("El número ha de ser entre 1 i 10, este número no se cuenta.")
        } else {
            if (num > 5) {
                majorDe5++
                println("Majors de 5: +1")
            } else if (num < 5) {
                menorDe5++
                println("Menors de 5: +1")
            } else if (num == 5) {
                igualA5++
                println("Iguals de 5: +1")
            }
        }
    }

    println("La quantitat de números que son majors de 5 són: ${GREEN_BOLD}$majorDe5${RESET}")
    println("La quantitat de números que son menors de 5 són: ${GREEN_BOLD}$menorDe5${RESET}")
    println("La quantitat de números que son igual de 5 són: ${GREEN_BOLD}$igualA5${RESET}")

}