package controllers.Scanner

import utils.*

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

        var control:Boolean=true
        println("""
            Benvingut a la calculadora de números primers.
            Diguem un número major a 1 i et diré si es primer o no.
            I quin es el seu número primer inmediatament següent.
            Quan vulguis sortir introdueix 0.
        """.trimIndent())
        print("Digues quin número vols saber: ")
        var num:Int= llegirInt()

        if (num<=1){
            println("${RED_BRIGHT}ERROR, HA DE SER UN NÚMERO MAJOR A 1${RESET}")
        }else{
            println("El número és: ${PURPLE_BRIGHT}$num${RESET}")
            control=false
        }

        /**
         * El següent do while el que fa es asegurarse si el número és primer o no.
         * Si és primer, diu que es true que és primer. Si no diu que és false.
         * @author Marti Vilas & David Marin
         * @since 11/10/2024
         */

        var bool:Boolean=true
        var iterator:Int=2
        do {
            if (num%iterator==0){
                bool=false
            }
            iterator++
        }while (iterator<num && bool)
        println("El numero $num és $bool que sigui primer.")

        do {
            num++
            bool = true
            for (i in 2 until num) {
                if (num % i == 0) {
                    bool = false
                }
            }
        } while (!bool)
        println("El sigüent número primer és: $num")


    }while (control)
}