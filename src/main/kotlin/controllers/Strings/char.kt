package controllers.Strings

/**
 * Un document que explica diferents forma de mostrar caracters amb
 */

fun main(){
    val nomChar: Array<Int> = arrayOf(77,97,114,116,105)
    val nom:String="Martí"
    println("La primera lletra del nom és: ${nom[0]}")
    println()

    for (i in 0..nom.length-1){
        println("Lletra $i del nom: ${nom[i]}")
    }

    println()

    for (i in nomChar.indices){
        print(nomChar[i].toChar())
    }

    /**
     * Para buscar a partir de que posición se encuentra lo añadio en los paretnesis.
     */
    println()
    println(nom.indexOf("tí"))


}