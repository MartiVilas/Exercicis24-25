package controllers.JOEL.Iteratius2

fun main() {
    // Llegeix la línia d'entrada
    val entrada = readLine()!!.split(" ").map { it.toInt() }

    var strikeCount = 0
    var videoCount = 0

    // Itera sobre cada número de la línia d'entrada
    for (num in entrada) {
        if (num == -1) {
            strikeCount++
            // Si arriba al tercer strike, atura el bucle
            if (strikeCount == 3) {
                break
            }
        } else {
            videoCount++
        }
    }

    // Imprimeix el nombre de vídeos fets fins al tercer strike
    println(videoCount)
}