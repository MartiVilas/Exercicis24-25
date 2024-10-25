package controllers.JOEL.Iteratius2

import java.util.Scanner

fun main() {

    val scanner:Scanner=Scanner(System.`in`)
    // Llegeix el nombre de casos de prova
    val numCasos = scanner.nextInt()

    // Itera sobre cada cas
    repeat(numCasos) {
        // Llegeix la línia d'entrada
        val entrada = scanner.nextLine()
        // Imprimeix la línia tal com s'ha llegit
        println(entrada)
    }
}