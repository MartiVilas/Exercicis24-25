package controllers.JOEL.Iteratius2

import java.util.Scanner

fun main(){
    val scanner:Scanner=Scanner(System.`in`)
    // Llegeix la quantitat de diners
    val diners = scanner.nextInt()

    // Compta milió a milió fins a la quantitat de diners
    for (i in 1..diners step 1_000_000) {
        println(i * 1_000_000)
    }
}