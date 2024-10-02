package controllers.Algoritmica1

import utils.*

fun main(){
    /**
     * Algoritme que demana una paraula a l'usuari i la mostra 100 vegades.
     * @author: Martí Vilàs
     * @since: 2 d'Octubre de 2024
     */
    println("Exercici 2")
    print("Digues una paraula i te la repetiré 100 vegades: ")
    val paraula:String = readln()
    for (i in 1..100){
        println("$i. $paraula")
    }

}