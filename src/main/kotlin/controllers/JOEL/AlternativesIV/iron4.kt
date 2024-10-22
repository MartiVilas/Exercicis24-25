package controllers.JOEL.AlternativesIV

import java.util.Scanner

fun main() {
    val scanner:Scanner = Scanner(System.`in`)
    val input = scanner.nextLine().uppercase() // Llegeix l'entrada i la converteix a majúscules
    when (input) {
        "Q" -> println("Skill 1")
        "W" -> println("Skill 2")
        "E" -> println("Skill 3")
        "R" -> println("Ultimate")
        "B" -> println("Recall")
        "D", "F" -> println("Bronzes never use summoners")
        else -> println("Error")
    }
}
