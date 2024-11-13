package controllers.Matrius

import utils.*

fun main() {
    val matriu: Array<Array<String>> = Array(6) { Array<String>(6) { "-" } }
    matriu[0][1] = "Mon"
    matriu[0][2] = "Tue"
    matriu[0][3] = "Wed"
    matriu[0][4] = "Thu"
    matriu[0][5] = "Fri"
    matriu[0][5] = "Sat"
    for (i in matriu) {
        println(i.contentToString())
    }

    print("Digues en quin dia vols la X")
    val dia: Int = llegirInt()
    print("Digues en quina hora vols la X")
    val hora: Int = llegirInt()

    matriu[dia][hora - 1] = "X"

    for (i in matriu) {
        println(i.contentToString())
    }
}