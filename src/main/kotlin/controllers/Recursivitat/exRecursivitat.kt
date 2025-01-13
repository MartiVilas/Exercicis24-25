package controllers.recursivitat

//EXERCICI 1
/*
fun main() {
    val numero: Int = 5
    val resultat: Int = factorial(numero)
    println("El factorial de $numero és: $factorial")
}

fun factorial(numero: Int, acumulat: Int = 1): Int {
    if (numero <= 1){
        return acumulat
    }else {
        return factorial(numero - 1, acumulat * numero)
    }
}
*/

//EXERCICI 2
/*
fun main(){
    val numero: Int = 2
    val resultat: Int = dobleFactorial(numero)
    println("El doble factorial de $numero és: $resultat")
}

fun dobleFactorial(numero: Int): Int{
    if (numero <= 1){
        return 1
    }else{
        return numero * dobleFactorial(numero - 2)
    }
}
*/

//EXERCICI 3
/*
fun main(){
    val numero: Int = 666850380
    val resultat: Int = numeroXifres(numero)
    println("El número de xifres que té el $numero és: $resultat")
}

fun numeroXifres(numero: Int): Int{
    if (numero < 10){
        return 1
    }else{
        return 1 + numeroXifres(numero/10)
    }
}
*/

//EXERCICI 4
/*
fun main(){
    var numero: Int = 1234
    val resultat: Int = numInvertit(numero)
    println("El número invertit del número $numero és: $resultat")
}

fun numInvertit(numero: Int, invertit: Int = 0): Int{
    if (numero == 0) {
        return invertit
    }else{
    return numInvertit(numero / 10, invertit * 10 + numero % 10)
    }
}
*/

//EXERCICI 5
/*
fun main(){
    val numero: Int = 4
    val resultat: Int = fibonacci(numero)
    println("La successió de Fibonacci del número $numero és: $resultat")
}

fun fibonacci(numero: Int): Int{
    when(numero){
        0 -> return 0
        1 -> return 1
        else -> return fibonacci(numero - 1) + fibonacci(numero - 2)
    }
}
*/

//EXERCICI 6

fun main(){
    val numero: Int = 303333445
    val resultat: Boolean = numeroCreixent(numero)
    println("El número $numero és creixent? $resultat")
}

fun numeroCreixent(numero: Int): Boolean{
    var ultimNumero: Int = 0
    var penultimNum: Int = 0
    if (numero < 10){
        return true
    }
    ultimNumero = numero % 10
    penultimNum = (numero / 10) % 10
    if (penultimNum > ultimNumero){
        return false
    }
    return numeroCreixent(numero / 10)
}