package controllers.JOEL.Iteratius1

import java.util.Scanner
// no acabat, amb chatGPT :(((((((((((((( si, acabaar a casa.
fun main(){
    val scanner:Scanner=Scanner(System.`in`)
    var usuari:Int
    var numGran:Int = 0
    var numPetit:Int = 0

    for (i in 1..10){
        usuari=scanner.nextInt()
        if (usuari>numGran){
            numGran=usuari
        }else if (usuari<numPetit){
            numPetit=usuari
        }
    }

    println("$numGran $numPetit")
}