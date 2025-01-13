package Recursivitat

import utils.*

fun main() {
    val random: Int = (0..100).random()
    println(random)
    trobarRandom(random)
}

fun trobarRandom(numRand: Int) {

    print("Intente endivinar quin número és: ")
    val opcioUsuari = llegirInt()
    if (opcioUsuari < numRand) {
        println("El número es més gran")
        trobarRandom(numRand)
    } else if (opcioUsuari > numRand) {
        println("El número es més petit")
        trobarRandom(numRand)
    } else {
        return println("Correcte el número era $numRand")
    }
}

