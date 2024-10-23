package controllers.JOEL.Iteratius1

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val numEntrades: Int = scanner.nextInt()
    var num: Int
    for (i in 1..numEntrades) {
        num = scanner.nextInt()
        println("${num + 1}")
    }
}