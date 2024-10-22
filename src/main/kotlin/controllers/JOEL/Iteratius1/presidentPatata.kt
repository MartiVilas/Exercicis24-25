package controllers.JOEL.Iteratius1

import java.util.Scanner

fun main() {

    val scanner: Scanner = Scanner(System.`in`)
    val contador:Int= scanner.nextInt()

    var i:Int=0
    do {
        val repeticiones:Int = scanner.nextInt()
        for (j in 1..repeticiones){
            println("No ofendre al president patata")
        }
        println()
        i++
    }while (i < contador)


}
