package controllers.Algoritmica2

import utils.*

/**
 * @author: Martí Vilàs
 * @since: 2 d'octubre 2024
 */

fun main(){
    println("Exercici 4")

    print("Hola dame la cantidad de productos que vas a introducir: ")
    var total = 0.0
    val cantidadDeProducto= llegirInt()
    var precioMayor=0.0
    var precioMenor=9999.9

    if (cantidadDeProducto>0) {
        println("Vas a introducir $cantidadDeProducto precios")
        for (i in 1..cantidadDeProducto) {
            print("Dame el precio del producto que has comprado: ")
            val preu = llegirDouble()
            if (preu>precioMayor){
                precioMayor=preu
            }else if (preu<precioMenor){
                precioMenor=preu
            }
            println("Preu $i = $preu")
            total += preu
        }
    } else{
        println("${RED}Han de haber minimo 1 producto!${RESET}")
    }

    var media= total/cantidadDeProducto

    println("La media de precio de los productos es: $media")
    println("El precio mas grande que nos has dado es: $precioMayor")
    println("El precio mas pequeño que nos has dado es: $precioMenor")
    println("Gracias por la información, la venderemos!")

}