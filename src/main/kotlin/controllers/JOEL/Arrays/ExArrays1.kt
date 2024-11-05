package controllers.JOEL.Arrays

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    repeat(casos) {

        val qArr = scanner.nextInt()
        val array = IntArray(qArr)

        /**
         * Introduïm els valors de cada una de les posicions del array
         */
        for (i in array.indices) {
            array[i] = scanner.nextInt()
        }
        val numCanvi1 = scanner.nextInt()
        val numCanvi2 = scanner.nextInt()
        /**
         * Busquem en el array el número que volem caniar numCanvi1 i el canviem per numCanvi2
         */
        for (i in array.indices) {
            if (array[i] == numCanvi1) {
                array[i] = numCanvi2
            }
        }
        /**
         * Printem l'array amb el número canviat
         */
        for (i in array) {
            print("$i ")
        }
        println()
    }
}
