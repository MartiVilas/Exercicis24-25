package controllers.JOEL.Bucles3

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


    val casos = scanner.nextInt()

    for (i in 1..casos) {
        val pisos = scanner.nextInt()

        var totalFerreros = 0
        for (n in 1..pisos) {
            val ferrerosPis = n * (n + 1) / 2
            totalFerreros += ferrerosPis
        }
        println(totalFerreros)
    }
}
