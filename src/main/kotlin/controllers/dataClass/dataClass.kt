package dataClass

import models.Persona
import utils.*

fun main(){
    val persona: Persona = Persona("Martí","Vilàs",21)
    val persona2: Persona = persona.copy(nom = "Víctor", edat = 27, adreca = "Avinguda Rivoli 24")

    println("La persona ${persona.nom} ${persona.cognom} té ${persona.edat} anys i viu a ${persona.adreca}")
    println()

    println("La persona ${BLUE_BRIGHT}${persona2.nom} ${persona2.cognom}${RESET} té ${persona2.edat} anys i viu a ${persona2.adreca}")
    println()

    println(persona)
    println()



}

