import utils.*
import java.time.LocalDateTime
import kotlin.math.pow

val date = LocalDateTime.now()


fun main() {
/*
    // Exercici 1
    print("Dime un número para que te de el mismo número al cuadrado: ")
    val num: Double = llegirDouble()
    println("$num al cuadrado es ${pow(num)}")

    //Exercici 2
    print("Dime 2 números después te diré si el primero es mayor que el segundo")
    val num1: Int = llegirInt()
    val num2: Int = llegirInt()
    println("El primer número es ${majorONo(num1, num2)} que sea mayor que el segundo")

    //Exercici 3
    print("Dime un radio para una esfera y te calcularé su volumen")
    val radi: Int = llegirInt()
    println("El volumen de la esfera es: ${radioEsfera(radi.toDouble())} con un radio de $radi")

    //Exercici4
    println("Ara passem a la calculadora, digues 2 números")
    print("Num 1: ")
    val num1Calc: Int = llegirInt()
    val num2Calc: Int = llegirInt()
    calculadora(num1Calc, num2Calc)

    //Exercici5
    noNegatiu()

    //Exercici6
    val preu: Int = llegirInt()
    descompte(preu)

    //Exercici7
    val nens: Int = llegirInt()
    val nenes: Int = llegirInt()
    for (i in percNensNenes(nens, nenes)) {
        println(i)
    }
*/
    //Exercici 8
    var preu: Double = llegirDouble()
    preuFigura(preu)

}

fun pow(num: Double): Double {
    val numSquare: Double = num.pow(2.0)

    return numSquare
}

fun majorONo(num1: Int, num2: Int): Boolean {
    var boolean: Boolean = false
    if (num1 > num2) {
        boolean = true
        return boolean
    } else {
        boolean = false
        return boolean
    }
}

fun radioEsfera(radi: Double): Double {
    var pow: Double = radi
    val calculRadi: Double = ((4.0 / 3.0) * Math.PI * (radi.pow(3)))

    return calculRadi
}

fun calculadora(num1: Int, num2: Int): Double {
    var res: Double = 0.0
    do {
        var error = true
        println("Benvingut a la calucadora pots fer els següents calculs")
        println(
            """
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Sortir
        """.trimIndent()
        )
        print("quina opció vols fer: ")
        val opcioUsuari: Int = llegirInt()
        if (opcioUsuari in 1..5) {
            error = false
            println("Has escogido la opcion $opcioUsuari")
        } else {
            error = true
            println("Error: Opción inválida")
        }
        when (opcioUsuari) {
            1 -> {
                res = suma(num1, num2)
            }

            2 -> {
                res = resta(num1, num2)
            }

            3 -> {

                res = mult(num1, num2)
            }

            4 -> {
                if (num2 == 0) {
                    return num1.toDouble()
                }
                res = div(num1, num2)
            }

            5 -> {
                println("Adéu!")
            }
        }
    } while (error)
    return res
}

fun suma(num1: Int, num2: Int): Double {
    val suma: Double = num1.toDouble() + num2
    return suma
}

fun resta(num1: Int, num2: Int): Double {
    val resta: Double = num1 - num2.toDouble()
    return resta
}

fun mult(num1: Int, num2: Int): Double {
    val mult: Double = num1.toDouble() * num2.toDouble()
    return mult
}

fun div(num1: Int, num2: Int): Double {
    val div: Double = num1.toDouble() / num2.toDouble()
    return div
}

fun noNegatiu() {
    do {
        var error: Boolean = true
        val num: Int = llegirInt()
        if (num < 0) {
            println("Error el número ha de ser positivo")
        } else if (num !in 1..10) {
            println("Error el número ha de estar entre 1 i 10")
        } else {
            error = false
        }
    } while (error)


}

fun descompte(num1: Int): Double {
    var res: Double = 0.0
    println("Ets VIP?")
    val esVip: Boolean = llegirSioNo()
    if (esVip) {
        res = num1 * (0.2)
    } else if (num1 > 200) {
        res = num1 * (0.2)
    } else {
        res = num1.toDouble()
    }

    if (date.dayOfYear == 29 / 11 / 2024) {
        res = num1 * (0.5)
    }


    return res
}

fun percNensNenes(num1: Int, num2: Int): IntArray {
    val total = num1 + num2
    var arrayPerc = IntArray(2)
    val totalNens: Int = (num1 * 100) / total
    val totalNenes: Int = (num2 * 100) / total

    arrayPerc[0] = totalNens
    arrayPerc[1] = totalNenes

    return arrayPerc
}

fun bonEstat(bool: Boolean): Boolean{
    var res = false
    if (bool){
        res = true
    }

    return res
}

fun preuFigura(preu: Double): Double{
    println("Esta la teva figura en bon estat?")
    val ESTAT: Boolean= bonEstat(llegirSioNo())
    var preu: Double = preu
    if (ESTAT){
        preu += (preu * 0.25)
    }else{
        preu += (preu * 0.1)
    }
    return preu
}