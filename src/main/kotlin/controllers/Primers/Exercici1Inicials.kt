package org.example.controllers

fun main() {

    /**
     * Algoritme d'una aplicació que demana un número
     * i mostra per pantalla els números anterior
     * i posterior a aquest.
     * @author: Martí Vilàs
     */
    println("Exercici 1")

    println("Escriu un número: ")
    var num1:Int = readln().toInt()
    var numMajor:Int = num1+1
    var numMenor:Int = num1-1

    println("El número que has donat es el número $num1")
    println("El número posterior al $num1 és: $numMajor")
    println("El número anterior al $num1 és: $numMenor")

}