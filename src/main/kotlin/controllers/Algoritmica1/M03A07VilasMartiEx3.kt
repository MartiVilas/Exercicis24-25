package controllers.Algoritmica1

import utils.*
fun main(){
    /**
     * Exercici 3
     * Algoritme que demana l'edat i mostra els anys que aquest ha anat complint (1, 2, 3...).
     * @author Martí Vilàs
     * @since 3 d'Oct de 2024
     */

    do {
        print("Hola, si us plau, diguem la teva edat : ")
        val edat:Int = llegirInt()

        if (edat <= 0) {
            println("No m'ho crec")
        } else {
            for (i in 1..edat) {
                if (i == 1) {
                    println("${GREEN_BOLD}$i${RESET} any")
                } else {
                    println("${GREEN_BOLD}$i${RESET} anys")
                }
            }
        }
    } while (edat<0)



}