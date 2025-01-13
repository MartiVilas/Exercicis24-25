package controllers.recursivitat

import utils.llegirInt


fun main(){
/*
    var sortida: Boolean = false
    do {
        println("""
            MENU RECURSIU
            1. Ex1
            2. Ex2
            3. Ex3
            4. Ex4
            5. Ex5
            6. Ex6
            7. Sortir
        """.trimIndent())
        val numero: Int = llegirInt()
        when(numero){
            1-> {
                factorial(numero)
            }
            2-> {
                dobleFactorial(numero)
            }
            3-> {
                numeroXifres(numero)
            }
            4-> {
                numInvertit(numero)
            }
            5-> {
                fibonacci(numero)
            }
            6-> {
                numeroCreixent(numero)
            }
            else -> {
                println("Adéu!")
                sortida = true
            }
        }
    }while (!sortida)
*/


    reduccioDeDigits(5699)

}

fun factorial(numero: Int, acumulat: Int = 1): Int {
    if (numero <= 1){
        return acumulat
    }else {
        return factorial(numero - 1, acumulat * numero)
    }
}

fun dobleFactorial(numero: Int): Int{
    if (numero <= 1){
        return 1
    }else{
        return numero * dobleFactorial(numero - 2)
    }
}

fun numeroXifres(numero: Int): Int{
    if (numero/10 <= 0){
        return 1
    }else{
        return 1 + numeroXifres(numero/10)
    }
}

fun numInvertit(numero: Int, invertit: Int = 0): Int{
    if (numero == 0) {
        return invertit
    }else{
    return numInvertit(numero / 10, invertit * 10 + numero % 10)
    }
}

fun fibonacci(numero: Int): Int{
    when(numero){
        0 -> return 0
        1 -> return 1
        else -> return fibonacci(numero - 1) + fibonacci(numero - 2)
    }
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

fun reduccioDeDigits(numero:Int) {
    val llistaNumeros: MutableList<Int> = mutableListOf()
    var suma:Int = 0

    if (numero<10){
        print(suma)
    }else{
        llistaNumeros.add(numero%10)
    }
    for (i in llistaNumeros){
        suma += i
    }

}