package controllers.Segons

import utils.*


/**
 * @author: Martí Vilàs
 * @since 2 d'Octubre de 2024
 */

fun main(){
    /**
     * Algoritme que demana una nota entre 0 i 10, i mostra si és un suspès (0-4), un suficient (5), un bé (6), un notable (7-8) o un excel·lent (9-10).
     * @author: Martí Vilàs
     * @since: 2 d'Octubre de 2024
     */

    println("Exercici 3")

    print("Dime la nota que has sacado y te diré si esta suspendida o aprovada: ")
    val nota:Int= llegirInt()
    if (nota>10 || nota<0) {
        println("No me creo tu nota")
    }
   when (nota) {
       1,2,3,4 -> println("${RED}Has suspendido${RESET}")
       5-> println("${YELLOW_BOLD}Has aprovado justito${RESET}")
       6-> println("${GREEN_BOLD}Bien hecho!${RESET}")
       7,8-> println("${BLUE_BOLD}Notablee olee!${RESET}")
       9,10 -> println("${CYAN_BOLD}Excelente sigue así!${RESET}")
   }

}