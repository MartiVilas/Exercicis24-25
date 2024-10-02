package controllers.Primers

import utils.*


fun main(){
    /**
     * Algoritme que demana una distància en metres
     * i mostra per pantalla la conversió a milles marines.
     * @author: Martí Vilàs
     * @since: 2 d'Octubre de 2024
     */

    println("Exercici 3")
    do {
        println("Quieres convertir metro a millas o millas a metros")
        println("""
            1. Para pasar de millas a metros
            2. Para pasar de metros a millas
            3. Para salir
        """.trimIndent())
        print("Quina opció vols escollir: ")
        val opcioUsuari = llegirInt()

        when (opcioUsuari){
            1 -> {
                print("Introdueix el número de milles que vols convertir a metres: ")
                val milles:Int= llegirInt()
                val metres:Int= milles*1852
                println("Les milles que has introduit són: ${YELLOW_BOLD}$milles${RESET}")
                println("Els metres que són aquestes milles és: ${YELLOW_BOLD}$metres${RESET}")
                println("")
            }
            2 -> {
                print("Introdueix el número de metres que vols convertir a milles: ")
                val metres= llegirInt()
                val milles:Float = metres*0.000621371f
                println("Els metres que has introduït són: ${YELLOW_BOLD}$metres${RESET}")
                println("Les milles que són aquests metres són: ${YELLOW_BOLD}$milles${RESET}")
                println("")

            }
            3-> println("${GREEN_BOLD}Espero que hagi servit els meus serveis :)${RESET}")
            else -> println("${RED}ERROR, aquesta opció no existeix${RESET}\n")
        }

    }while (opcioUsuari!=3)

}