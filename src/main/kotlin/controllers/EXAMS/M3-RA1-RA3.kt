package controllers.EXAMS

import utils.*
import java.util.Scanner
fun main() {
    val files: Int = 9
    val columnes: Int = 8

    /**
     * Declarem una matriu que és de tipus array d'arrays de string.
     */
    val matriu: Array<Array<String>> = Array(files) { Array(columnes) { "." } }

    do {
        println("""
        Benvingut al menu del teatre de Foment Gracienc de les Arts a continuació et donarem unes opcions que pots fer servir: 
         1. Ocupar un seient
         2. Reservar un seient
         3. Alliberar un seient
         4. Reservar una fila
         5. Veure sala
         6. Veure ocupació actual de la sala
         7. Sortir
    """.trimIndent())
        print("Quina opció vols triar: ")

        var opcioUsuari: Int
        do {
            val scanner: Scanner = Scanner(System.`in`)
            var error: Boolean = true
            opcioUsuari = 0
            if (scanner.hasNextInt()){
                opcioUsuari = scanner.nextInt()
                error = false
            }else{
                println("Opicó invàlida")
            }
        }while (error)

        when(opcioUsuari){
            1->{
                println("""
                    Has escollit la opció de ocupar un seient.
                    A continuació digues quina fila i quina seient de la fila vols.
                    Tenint en compte que hi han 9 file i per cada fila 8 seients.
                """.trimIndent())
                print("Quina fila vols: ")
                var filaOcupacio: Int

                do{
                    var errorOcupacio: Boolean = true
                    val scanner: Scanner = Scanner(System.`in`)
                    filaOcupacio = 0
                    if (scanner.hasNextInt()){
                        filaOcupacio = scanner.nextInt()
                        errorOcupacio = false
                    }else{
                        println("Error reserva no realitzada")
                    }
                    if(filaOcupacio>9){
                        errorOcupacio = true
                        println("Error reserva no realitzada")
                    }
                }while(errorOcupacio)

                println("Quin seient vols de la fila $filaOcupacio: ")
                var colOcupacio: Int
                do{
                    var errorOcupacio: Boolean = true
                    val scanner: Scanner = Scanner(System.`in`)
                    colOcupacio = 0
                    if (scanner.hasNextInt()){
                        colOcupacio = scanner.nextInt()
                        errorOcupacio = false
                    }else{
                        println("Error reserva no realitzada")
                    }
                    if(colOcupacio>8){
                        errorOcupacio = true
                        println("Error reserva no realitzada")
                    }
                }while(errorOcupacio)

                println("D'acord vols la fila $filaOcupacio i el seient $colOcupacio")
                for (fila in matriu.indices){
                    for (columna in matriu.indices){
                        if(fila == filaOcupacio){
                            matriu[filaOcupacio-1][colOcupacio-1]= "O"
                        }
                    }
                }
                println("Seient Ocupat per tu!")

            }
            2->{
                println("""
                    Has escollit la opció de alliberar un seient.
                    A continuació digues quina fila i quina seient de la fila vols.
                    Tenint en compte que hi han 9 files i per cada fila 8 seients.
                """.trimIndent())
                print("Quina fila vols: ")
                var filaReserva: Int

                do{
                    var errorReserva: Boolean = true
                    val scanner: Scanner = Scanner(System.`in`)
                    filaReserva = 0
                    if (scanner.hasNextInt()){
                        filaReserva = scanner.nextInt()
                        errorReserva = false
                    }else{
                        println("Error reserva no realitzada")
                    }
                    if(filaReserva>9){
                        errorReserva = true
                        println("Error reserva no realitzada")
                    }
                }while(errorReserva)

                println("Quin seient vols de la fila $filaReserva: ")
                var colReserva: Int
                do{
                    var errorReserva: Boolean = true
                    val scanner: Scanner = Scanner(System.`in`)
                    colReserva = 0
                    if (scanner.hasNextInt()){
                        colReserva = scanner.nextInt()
                        errorReserva = false
                    }else{
                        println("Error reserva no realitzada")
                    }
                    if(colReserva>8){
                        errorReserva = true
                        println("Error reserva no realitzada")
                    }
                }while(errorReserva)

                println("D'acord vols la fila $filaReserva i el seient $colReserva")
                for (fila in matriu.indices){
                    for (columna in matriu.indices){
                        if(fila == filaReserva){
                            matriu[filaReserva-1][colReserva-1]= "R"
                        }
                    }
                }
                println("Seient Reservat!")

            }
            3->{
                println("""
                    Has escollit la opció de reservas un seient.
                    A continuació digues quina fila i quina seient de la fila vols.
                    Tenint en compte que hi han 9 file i per cada fila 8 seients.
                """.trimIndent())
                print("Quina fila vols: ")
                var filaAlliberacio: Int

                do{
                    var errorAlliberacio: Boolean = true
                    val scanner: Scanner = Scanner(System.`in`)
                    filaAlliberacio = 0
                    if (scanner.hasNextInt()){
                        filaAlliberacio = scanner.nextInt()
                        errorAlliberacio = false
                    }else{
                        println("Error reserva no realitzada")
                    }
                    if(filaAlliberacio>9){
                        errorAlliberacio = true
                        println("Error reserva no realitzada")
                    }
                }while(errorAlliberacio)

                println("Quin seient vols de la fila $filaAlliberacio: ")
                var colAlliberacio: Int
                do{
                    var errorAlliberacio: Boolean = true
                    val scanner: Scanner = Scanner(System.`in`)
                    colAlliberacio = 0
                    if (scanner.hasNextInt()){
                        colAlliberacio = scanner.nextInt()
                        errorAlliberacio = false
                    }else{
                        println("Error reserva no realitzada")
                    }
                    if(colAlliberacio>8){
                        errorAlliberacio = true
                        println("Error reserva no realitzada")
                    }
                }while(errorAlliberacio)

                println("D'acord vols la fila $filaAlliberacio i el seient $colAlliberacio")
                for (fila in matriu.indices){
                    for (columna in matriu.indices){
                        if(fila == filaAlliberacio){
                            matriu[filaAlliberacio-1][colAlliberacio-1]= "."
                        }
                    }
                }
                println("Seient alliberat!")

            }
            4->{
                println("""
                    Has escollit la opció de reservar una fila.
                    A continuació digues quina fila vols reservas
                    Tenint en compte que hi han 9 files.
                """.trimIndent())
                print("Quina fila vols reservar: ")
                var filaReserva: Int
                do{
                    var errorReserva: Boolean = true
                    val scanner: Scanner = Scanner(System.`in`)
                    filaReserva = 0
                    if (scanner.hasNextInt()){
                        filaReserva = scanner.nextInt()
                        errorReserva = false
                    }else{
                        println("Error reserva no realitzada")
                    }
                    if(filaReserva>9){
                        errorReserva = true
                        println("Error reserva no realitzada")
                    }
                }while(errorReserva)

                println("D'acord vols la fila $filaReserva")
                for (fila in matriu.indices){
                    for (columna in matriu[fila].indices){
                        if(fila == filaReserva - 1){
                            matriu[filaReserva - 1][columna]= "R"
                        }
                    }
                }
                println("Fila Reservat!")
            }
            5->{
                println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
                for (i in matriu.indices) {
                    print("| ")
                    print("Fila ${i+1}:            ")
                    for (j in matriu[i].indices) {
                        print("Columna:  ${BLUE_BOLD_BRIGHT}  ${matriu[i][j]} $RESET  |  ")
                    }
                    println("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
                    println()
                }
            }
            6->{
                var contadorOcupacio: Int = 0
                var contadorReservas: Int = 0
                for (fila in matriu.indices){
                    for (columna in matriu[fila].indices){
                        if(matriu[fila][columna] == "R"){
                            contadorReservas++
                        }else if(matriu[fila][columna] == "O"){
                            contadorOcupacio++
                        }
                    }
                }
                println("Hi ha $contadorReservas seients reservats i $contadorOcupacio seients ocupats.")
            }
            7->{
                println("Adéu!")
            }
        }
    }while (opcioUsuari != 7)



}
