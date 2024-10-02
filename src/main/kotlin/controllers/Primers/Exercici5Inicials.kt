package controllers.Primers

fun main(){

    /**
     * Algoritme que demana les dades d'una piscina
     * i mostra el volum en metres cúbics i en litres d'aigua.
     * @author: Martí Vilàs
     */

    println("Exercici 5")

    println("Introdueix la la alçada de la piscina")
    val alcada:Int= readln().toInt()

    println("Introdueix l'amplada de la piscina")
    val amplada:Int= readln().toInt()

    println("Introudeix el llarg de la teva piscina")
    val llarg:Int= readln().toInt()

    val metresCubics:Int=llarg*alcada*amplada
    println("Els metres cúbics de la piscina són: ${metresCubics*1000}")

}