package controllers.JOEL.AlternativesIV

import java.util.Scanner

fun main() {
    val scanner:Scanner=Scanner(System.`in`)
    val year = scanner.nextInt()
    val lastTwoDigits:Int = year.toString().takeLast(2).toInt()
    if (lastTwoDigits in  90..99){
        println("SI")
    }else{
        println("NO")
    }
}