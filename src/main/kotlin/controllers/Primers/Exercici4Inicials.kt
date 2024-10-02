package controllers.Primers

fun main(){

    /**
     * Algoritme que demana un preu en € i el torna en £
     * @author: Martí Vilàs
     */
    println("Exerici 4")

    println("Introdueix al cuantitat de euros que vols convertir a lliures")

    var euros:Double= readln().toDouble()
    var lliures:Double= euros*0.8330

    println("La quantitat de € que vols convertir a £  es $euros")
    println("$euros € en lliures són: $lliures £")

}