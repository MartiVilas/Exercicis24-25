package controllers.Scanner

import utils.*
import javax.print.attribute.standard.PrinterURI

fun main() {

    /**
     * Fes un programa que demani un número enter major que 1 a l'usuari i digui si el nombre és primer o no.
     * Després, ens dirà quin és el nombre primer immediatament superior.
     * Exemple:
     * Introdueix un número: 8
     * 8 no és primer. El primer immediatament superior a 8 és el 11.
     * Introdueix un número: 5
     * 5 és primer. El primer immediatament superior a 5 és el 7.
     */


    do {
        println("""
            Benvingut a la calculadora de números primers.
            Diguem un número major a 1 i et diré si es primer o no.
            I quin es el seu número primer inmediatament següent.
            Quan vulguis sortir introdueix 0.
        """.trimIndent())
        print("Digues quin número vols saber: ")
        val opcioUsuari:Int= llegirInt()

        if (opcioUsuari<=1){
            println("${RED_BRIGHT}ERROR, HA DE SER UN NÚMERO MAJOR A 1${RESET}")
        }else{
            println("El número és: ${PURPLE_BRIGHT}$opcioUsuari${RESET}")
        }


        var bool:Boolean=true
        var iterator:Int=2
        do {
            if (opcioUsuari%iterator==0){
                bool=false
                iterator++
            }
        }while (iterator<opcioUsuari && bool)

        println("El numero $opcioUsuari és $bool que sigui primer.")




    }while (bool != false)




}