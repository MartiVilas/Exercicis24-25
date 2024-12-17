package models

/**
 * Crear tipus de dades personalitzades (parecido a crear objetos pero sin setter i getters "ni metodos propios" )
 * Con funcion override del toString() para personalizar como sale.
 */

data class Persona(
    var nom: String,
    var cognom: String,
    val edat: Int,
    var adreca: String = "Josep Carner 13",
){
    override fun toString(): String {
        val text = """
            Nom:    $nom
            Cognom: $cognom
            Edat:   $edat 
            Adreça: $adreca
        """.trimIndent()
        return text
    }

}


data class Ordenador(
    var processador: String,
    var targetaGrafica: String,
    var placaBase: String,
    var ram: String = "16 GB",
    var refrigeracion: String,
    var almacenamiento: String = "1 TB",
)

