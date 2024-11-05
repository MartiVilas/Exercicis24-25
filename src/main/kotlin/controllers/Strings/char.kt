package controllers.Strings

/**
 * Un document que explica diferents forma de mostrar caracters amb
 */

fun main(){
    val nomChar: Array<Int> = arrayOf(77,97,114,116,105)
    val nom:String="Martí"
    println("La primera lletra del nom és: ${nom[0]}")
    println()

    for (i in nom.indices){
        println("Lletra ${i+1} del nom: ${nom[i]}")
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



    val cars= arrayOf("Volvo","BMW","FORD","MAZDA")

    /**
     * En el primer ford recorremos el array,
     * dentro del primer for tenemos otro
     * que recorre todas las marcas de coche y las imprime letra a letra
     * @author Martí Vilàs
     * @since  05/11/2024
     */
    for (i in cars){
        println("El cotxe és un: $i")
        for (j in i) {
            print("$j ")
        }
        println()
    }


}