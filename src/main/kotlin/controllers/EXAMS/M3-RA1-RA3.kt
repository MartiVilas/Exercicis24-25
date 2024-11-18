package controllers.EXAMS

/**
 * Crear un array de 9x8 en el que direm si esta lliure amb un '.' ocupat amb una 'O' o reservat amb 'R'
 *  Volem que l’aplicació permeti les operacions:
 *  Ocupar un seient
 *  Reservar un seient
 *  Alliberar un seient
 *  Reservar una fila
 *  Veure sala
 *  Veure ocupació actual de la sala
 *  Sortir
 *  La forma en la que volem veure la sala seria:
 */

fun main() {
    val FILES: Int = 9
    val COLUMNES: Int = 8

    /**
     * Declarem una matriu que és de tipus array d'arrays de string.
     */
    val MATRIU: Array<Array<String>> = Array(FILES) { Array(COLUMNES) { "." } }


    for (i in MATRIU.indices) {
        print("Fila $i: ")
        for (j in MATRIU[i].indices) {
            print("Columna: ${MATRIU[i][j]} ")
        }
        println()
    }
}
