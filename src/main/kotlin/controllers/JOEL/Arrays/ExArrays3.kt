package controllers.JOEL.Arrays

import java.util.Scanner

fun main(){
    val scanner: Scanner = Scanner(System.`in`)
    val numElements: Int = scanner.nextInt()

    /**
     * Creem un array de strings buit per
     * i amb l'argument numElements per tal de indicar el tamany del array
     */
    var arrayStrings = arrayOfNulls<String>(numElements)

    for (i in arrayStrings.indices){
        arrayStrings[i] = scanner.nextLine()
    }

    val numArray = scanner.nextInt()
    for (i in arrayStrings.indices){
        print(i)
    }
    println(arrayStrings[numArray])

}