package controllers.Algoritmica2

import utils.*

/**
 * @author: Martí Vilàs
 * @since: 2 d'octubre 2024
 */

fun main(){
    println("Exercici 3")

    print("Hola dame la cantidad de productos que vas a introducir: ")
    var total = 0.0
    val cantidadDeProducto = llegirInt()


    if (cantidadDeProducto>0) {
        println("Vas a introducir $cantidadDeProducto precios")
        for (i in 1..cantidadDeProducto) {
            print("Dame el precio del producto que has comprado: ")
            val preu = llegirDouble()
            println("Preu $i = $preu")
            total += preu
        }
    } else{
        println("${RED}Han de haber minimo 1 producto!${RESET}")
    }

    val media = total/cantidadDeProducto

    println("La media de precio de los productos es: $media")
    println("Gracias por la información, la venderemos!")

}