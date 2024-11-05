package controllers.JOEL.Arrays

import java.util.Scanner

fun main(){

    val scanner: Scanner = Scanner(System.`in`)
    val qArray: Int = scanner.nextInt()
    var array: IntArray = IntArray(qArray)

    /**
     * Introduïm els valor del array
     */
    for (i in array.indices) {
        array[i] = scanner.nextInt()
    }

    /**
     * Preguntem pel número que volem veure
     */
    val num: Int = scanner.nextInt()
    /**
     * Fem un bucle for per tal de printar la posició de l'array que demanem
     */

    for (i in array.indices){
        println("${array[i]} ")
    }
    println()
    println("${array[num]}")

}