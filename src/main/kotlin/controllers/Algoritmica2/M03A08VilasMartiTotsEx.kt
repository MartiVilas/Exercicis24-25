package controllers.Algoritmica2
import utils.*

/**
 * Tots els exercicis d'Algoritmica 2
 * @author Martí Vilàs
 * @since  07/10/2024
 * @see
 */

fun main(){

    do {
        println("""
            Ara presentarem la segona tanda d'exercicis d'Algorítmica.
                 ${YELLOW_BRIGHT}1.${RESET} ${GREEN_BOLD}Algoritme que demana 10 números (amb un bucle) entre 0 i 10 i al final mostra per pantalla quants d'aquests eren inferiors a 5 i quants iguals o superiors. ${RESET}
                 ${YELLOW_BRIGHT}2.${RESET} ${GREEN_BOLD} Algoritme igual a l'anterior, però al final diu quants insuficients, quants suficients, quants bé, quants notables i quants excel·lents.${RESET}
                 ${YELLOW_BRIGHT}3.${RESET} ${GREEN_BOLD} Algoritme d'una aplicació que demana el preu de 10 productes, i finalment mostra el preu mitjà.${RESET}
                 ${YELLOW_BRIGHT}4.${RESET} ${GREEN_BOLD} Algoritme igual a l'anterior, mostrant al final el preu menor i el major. ${RESET}
                 ${CYAN_BRIGHT}5. Per sortir${RESET}
        """.trimIndent())
        print("Quin exercici vols veure: ")
        val opcio:Int= llegirInt()

        if (opcio in 1..5){
            when (opcio){
                1 -> ex1()
                2 -> ex2()
                3 -> ex3()
                4 -> ex4()
                5 -> println("${PURPLE_BRIGHT}D'acrod, espero que t'hagin agradat els exercicis $RESET")
            }
        } else{
            println("$RED ERA FÀCIL, ERA UN NÚMERO ENTRE 1 I 7!!!!$RESET")
            println()
        }


        }while (opcio != 5)
}

/**
 * Algoritme que demana 10 números (amb un bucle) entre 0 i 10 i
 * al final mostra per pantalla quants d'aquests eren inferiors a 5 i quants iguals o superiors.
 * @author Marti Vilas
 * @since 3 d'Oct 2024
 */

fun ex1(){

    println("Exercici 1")
    println("Dónam 10 números entre 0 i 10 i et diré quins són més grans que 5 i quins són més petits.")

    var majorDe5:Int = 0
    var menorDe5:Int = 0
    var igualA5:Int = 0

    for (i in 1..10){

        print("Introdueix el $i número: ")
        val num:Int = llegirInt()
        if (num<0 || num>10){
            println("El número ha de ser entre 1 i 10, este número no se cuenta.")
        } else {
            if (num > 5) {
                majorDe5++
                println("Majors de 5: +1")
            } else if (num < 5) {
                menorDe5++
                println("Menors de 5: +1")
            } else if (num == 5) {
                igualA5++
                println("Iguals de 5: +1")
            }
        }
    }

    println("La quantitat de números que son majors de 5 són: $GREEN_BOLD$majorDe5$RESET")
    println("La quantitat de números que son menors de 5 són: $GREEN_BOLD$menorDe5$RESET")
    println("La quantitat de números que son igual de 5 són: $GREEN_BOLD$igualA5$RESET")
    println()

}

/**
 * Algoritme igual a l'anterior, però al final diu quants insuficients,
 * quants suficients, quants bé, quants notables i quants excel·lents.
 * @author Marti Vilas
 * @since 3 d'Oct 2024
 */

fun ex2(){

    println("Exercici 2")
    print("Dónam 10 de les teves notes")

    var suspes:Double=0.0
    var aprovat:Double=0.0
    var be:Double=0.0
    var excelent:Double=0.0
    var notable:Double=0.0


    for (i in 1..10){
        print("Introdueix el $i número: ")
        val nota:Double = llegirDouble()
        if (nota<0.0 || nota>10.0){
            println("El número ha de ser entre 1 i 10, este número no se cuenta.")
        } else {
            when (nota) {
                in 0.0 .. 5.0-> suspes++
                5.0 -> aprovat++
                6.0 -> be++
                7.0, 8.0 -> notable++
                9.0, 10.0 -> excelent++
            }
        }
    }

    println("La quantitat de notes suspeses són: ${RED}$suspes${RESET}")
    println("La quantitat de notes aprovades són: ${YELLOW}$aprovat${RESET}")
    println("La quantitat de notes bé són: ${GREEN_BOLD}$be${RESET}")
    println("La quantitat de notes notables són: ${BLUE_BOLD}$notable${RESET}")
    println("La quantitat de notes excelents són: ${CYAN_BOLD}$excelent${RESET}")
    println()

}

/**
 * Algoritme d'una aplicació que demana el preu de 10 productes,
 * i finalment mostra el preu mitjà.
 * @author Martí Vilàs
 * @since 3 d'Oct 2024
 */

fun ex3(){
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
    println()
}

/**
 * Algoritme igual a l'anterior, mostrant al final el preu menor i el major.
 * @author Martí Vilàs
 * @since 3 d'Oct 2024
 */
fun ex4(){
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

    val media= total/cantidadDeProducto

    println("La media de precio de los productos es: $media")
    println("El precio mas grande que nos has dado es: $precioMayor")
    println("El precio mas pequeño que nos has dado es: $precioMenor")
    println("Gracias por la información, la venderemos!")
    println()
}