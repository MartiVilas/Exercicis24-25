
import utils.*
import kotlin.math.pow

fun main(){

    print("Dime un número para que te de el mismo número al cuadrado: ")
    val num: Double = llegirDouble()
    println("$num al cuadrado es ${pow(num)}")

}

fun pow(num :Double): Double {
    var numSquare: Double = num.pow(2.0)

    return numSquare
}