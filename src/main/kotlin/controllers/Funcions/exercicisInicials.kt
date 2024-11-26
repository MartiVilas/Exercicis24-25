
import utils.*
import kotlin.math.pow

fun main(){
    // Exercici 1
    print("Dime un número para que te de el mismo número al cuadrado: ")
    val num: Double = llegirDouble()
    println("$num al cuadrado es ${pow(num)}")

    //Exercici 2
    print("Dime 2 números después te diré si el primero es mayor que el segundo")
    val num1 : Int = llegirInt()
    val num2 : Int = llegirInt()
    println("El primer número es ${majorONo(num1,num2)} que sea mayor que el segundo")

    //Exercici 3
    print("Dime un radio para una esfera y te calcularé su volumen")
    val radi: Int = llegirInt()
    println("El volumen de la esfera es: ${radioEsfera(radi.toDouble())} con un radio de $radi")

}

fun pow(num :Double): Double {
    val numSquare: Double = num.pow(2.0)

    return numSquare
}


fun majorONo(num1: Int, num2: Int): Boolean{
    var boolean: Boolean = false
    if (num1>num2){
        boolean=true
        return boolean
    }else{
        boolean = false
        return boolean
    }
}

fun radioEsfera(radi: Double) : Double{
    var pow: Double= radi
    val calculRadi: Double = ((4.0/3.0)*Math.PI*(radi.pow(3)))

    return calculRadi
}

fun calculadora(num1: Int, num2: Int): Double{
    val resultat: Double = 1.0
    do {
        var error = true
        println("Benvingut a la calucadora pots fer els següents calculs")
        println("""
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
        """.trimIndent())
        print("quina opció vols fer: ")
        val opcioUsuari: Int = llegirInt()
        if (opcioUsuari in 1..4){
            error = false
            println("Has escogido la opcion $opcioUsuari")
        }else{
            error = true
            println("Error: Opción inválida")
        }
        when(opcioUsuari){
            1->{}
        }

    }while(error)


    return resultat
}

