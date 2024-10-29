package controllers.JOEL.Bucles2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val casosDeProva = scanner.nextInt()

    for (i in 1..casosDeProva) {
        var categoria = "H"

        for (j in 1..5) {
            val energia = scanner.nextInt()
            if (energia >= 10000) {
                categoria = "M"
            } else if (energia >= 1000 && categoria != "M") {
                categoria = "B"
            }
        }

        println(categoria)
    }
}