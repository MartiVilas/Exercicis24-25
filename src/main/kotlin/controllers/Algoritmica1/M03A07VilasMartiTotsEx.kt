package controllers.Algoritmica1
import utils.*

fun main(){

    /**
     * Menú que mostra tots els 6 exercicis que hi ha de algoritmica 1
     * @author Martí Vilàs
     * @since 4 d'Oct 2024
     */

    do {
        println(
            """
            Hola benvinugt al menú dels exercicis d'algorítmica, aquí mostrarem els 6 primer exercicis de bucles.
            Per veure el exercici en concret introdueix els seguents números: 
            ${YELLOW_BRIGHT}1.${RESET} ${GREEN_BOLD}Algoritme que mostra els números del 10 al 0, i al final, BOOOOOM!!${RESET}
            ${YELLOW_BRIGHT}2.${RESET} ${GREEN_BOLD}Algoritme que demana una paraula a l'usuari i la mostra 100 vegades.${RESET}
            ${YELLOW_BRIGHT}3.${RESET} ${GREEN_BOLD}Algoritme que demana l'edat i mostra els anys que aquest ha anat complint (1, 2, 3...).${RESET}
            ${YELLOW_BRIGHT}4.${RESET} ${GREEN_BOLD}Algoritme que demana un número, i mostra seqüencialment des d'aquest número fins al 0 (inclòs).${RESET}
            ${YELLOW_BRIGHT}5.${RESET} ${GREEN_BOLD}Algoritme que mostra la taula de multiplicar del 3.${RESET}
            ${YELLOW_BRIGHT}6.${RESET} ${GREEN_BOLD}Algoritme que demana un número i mostra per pantalla la seva taula de multiplicar.${RESET}
            ${CYAN_BRIGHT}7.${RESET} Per sortir del menú.
        """.trimIndent())
        println()
        print("Quin exercici vols veure: ")
        val opcioUsuari: Int = llegirInt()

        if (opcioUsuari in 1..7) {
            when (opcioUsuari) {
                1 -> {
                    println("Exercici 1 algorítmica")

                    for (i in 10 downTo 0) {
                        println("$YELLOW_BOLD$i$RESET")
                        if (i == 0) {
                            println("${RED}BOOOOOOOOM!!!!$RESET")
                        }
                    }
                    println()
                }
                2 -> {
                    println("Exercici 2")
                    print("Digues una paraula i te la repetiré 100 vegades: ")
                    val paraula:String = readln()
                    for (i in 1..100){
                        println("${GREEN_BRIGHT}$i${RESET}. $paraula")
                    }
                    println()

                }
                3 -> {
                    do {
                        print("Hola, si us plau, diguem la teva edat : ")
                        val edat:Int = llegirInt()

                        if (edat <= 0) {
                            println("${YELLOW_BOLD}No m'ho crec${RESET}")
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
                    println()

                }
                4 -> {
                    println("Digues un número, jo contaré des de aquest número fins a 0")
                    val numUsuari:Int= llegirInt()

                    for(i in numUsuari downTo 0){
                        println("$i")
                    }
                    println()

                }
                5 -> {
                    println("A continuació et mostraré la taula de multiplicar del 3")
                    for (i in 1..10) {
                        println("3 x $i = ${i*3}")
                    }
                    println()

                }
                6 -> {
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
                    println()

                }
                7 -> println("${PURPLE_BRIGHT}D'acrod, espero que t'hagin agradat els exercicis $RESET")
            }
        } else{
            println("$RED ERA FÀCIL, ERA UN NÚMERO ENTRE 1 I 7!!!!$RESET")
            println()

        }
    } while (opcioUsuari != 7)
}


