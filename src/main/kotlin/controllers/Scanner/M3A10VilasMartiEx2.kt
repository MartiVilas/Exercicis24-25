package controllers.Scanner
import utils.*
import java.awt.datatransfer.UnsupportedFlavorException
import java.time.temporal.IsoFields
import kotlin.math.*

fun main() {

    /**
     * Exercici 2
     * @author Martí Vilàs
     * @since 9 d'Oct 2024
     * Farem un programa que tingui 5 opcion 4 d'entrada de dades i una altre de sortida del menú
     */

    do {
        println("""
            ${GREEN_BOLD_BRIGHT}Benvigut a${RESET} ${YELLOW_BRIGHT}l'Art del Triangle${RESET}, ${GREEN_BOLD_BRIGHT}aqui tens els diferents programes que tenim:${RESET}
                ${PURPLE_BRIGHT}1.${RESET} ${BLUE_BOLD_BRIGHT}Introduir longituds d'un triangle:${RESET} Demana 3 números i comprova que puguin ser els costats d'un triangle
                ${PURPLE_BRIGHT}2.${RESET} ${BLUE_BOLD_BRIGHT}Comprovar si és triangle rectangle:${RESET} Comprova si les longituds poden correspondre a un triangle rectangle
                ${PURPLE_BRIGHT}3.${RESET} ${BLUE_BOLD_BRIGHT}Classificar d'acord als seus costats:${RESET} classifica els triangles en equilàter, iscòceles o escalè.
                ${PURPLE_BRIGHT}4.${RESET} ${BLUE_BOLD_BRIGHT}Calcular el perímetre i àrea.${RESET}
                ${CYAN_BRIGHT}5.${RESET} ${RED_BOLD_BRIGHT}Sortir${RESET}
        """.trimIndent())
        print("Quina opció vols escollir: ")
        val opcioUsuari:Int = llegirInt()

        when(opcioUsuari) {
            1->{
                println("Comprovarem si poden ser els costats d'un triangle")
                println()
                println("Introdueix el valor de a")
                val a:Float = llegirFloat()

                println("Introdueix el valor de b")
                val b:Float = llegirFloat()

                println("Introdueix el valor de c")
                val c:Float = llegirFloat()
                val desigualtatTriangular:Boolean =  ((abs(a-c) < b) && (b < (a+c)))


                if (desigualtatTriangular) {
                    println("El triangle en el que el costat a és: $a, el costat b és: $b i el costat c és: $c, és un triangle ")
                }else{
                    println("El triangle en el que el costat a és: $a, el costat b és: $b i el costat c és: $c, no és un triangle ")

                }

            }
            2->{
                println("Comprovarem si poden ser els costats d'un triangle rectangle")
                println()

                print("Introdueix el valor de a: ")
                var a2:Double = llegirDouble()
                a2= a2.pow(2.0)
                print("Introdueix el valor de b: ")
                var b2:Double = llegirDouble()
                b2= b2.pow(2.0)
                print("Introdueix el valor de c: ")
                var c2:Double = llegirDouble()
                c2= c2.pow(2.0)

                if(a2 == (b2+c2)){
                    println()
                    println("El triangle en el que el costat a és: $a2, el costat b és: $b2 i el costat c és: $c2, és un triangle rectangle")
                    println()
                }else{
                    println()
                    println("No es un triangle rectangle")
                    println()
                }

            }
            3->{
                println("Mirarem si es equilàter, iscòceles o escalè")
                println()
                println("Introdueix el valor de a")
                val a:Float = llegirFloat()

                println("Introdueix el valor de b")
                val b:Float = llegirFloat()

                println("Introdueix el valor de c")
                val c:Float = llegirFloat()

                if (a==b&&b==c){
                    println("El triangle és equilàter perquè $a ,$b i $c son iguals.")
                } else if (a==b||b==c||a==c){
                    println("El triangle és isòsceles perquè té dos costats de entre $a,$b o $c son iguals.")
                }else if (a!=b&&b!=c){
                    println("El triangle és un triangle escalè ja que cap del costas es igual a l'altre")
                }



            }
            4->{
                println("Calcularem el perímetre i l'àrea")
                println()

                println("Introdueix el valor de a")
                val a:Float = llegirFloat()

                println("Introdueix el valor de b")
                val b:Float = llegirFloat()

                println("Introdueix el valor de c")
                val c:Float = llegirFloat()

                val s:Float = (a+b+c)/2f
                val area:Float = sqrt(s*(s-a)*(s-b)*(s-c))

                println("L'area en el que el costat a és: $a, el costat b és: $b i el costat c és: $c és igual a: $area")
                println()

            }
            5->{
                println()
                println("Moltes gràcies per utilitzar el nostre programa, fins aviat! \uD83D\uDE0A")
                println()



            }
            else -> {
                println()
                println("${BLACK_BACKGROUND}${RED_BOLD}ERROR NO ÉS UNA DE LES OPCIONS!!!${RESET}")
                println()
            }
        }

    }while (opcioUsuari != 5)


}