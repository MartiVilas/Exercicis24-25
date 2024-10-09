package controllers.Scanner

import utils.*

fun main(){
    var anyUsuari:Int
    var mesUsuari:Int

    do {
        var error:Boolean=false

        println("""
            Benvingut al informatiu del zodiac.
            Necesitaré que em diguis en quin mes vas neixer, 
            i a continuació a quin dia. Al final et diré de quin signe del zodiac ets.
            """.trimIndent())
        println()

        /**
         * Amb el següent do while comprovem que l'usuari introdueix l'any en el que va neixer
         * i comprobem també que sigui entre uns valor donats per nosaltres.
         * @author Martí Vilàs
         * @since 8 d'Oct 2024
         * @see llegirInt()
         */

        do {
            println("Digues el teu any de neixement, ha de estar entre 1900 i 2024, si us plau")
            print("Quin any vas neixer:")
            anyUsuari = llegirInt()
            var error:Boolean= true
            if (anyUsuari<1900 || anyUsuari>2024){
                println("Has introduit un any que es una mica dificil que sigui veritat")
            } else{
                println("L'any de neixament es $anyUsuari")
                error=false
            }
        }while(error)

        /**
         * Amb el següent do while comprovem que l'usuario introdueixi el mes en el que va neixer
         * i comprobem també que sigui entre 1 i 12 que son els mesos de l'any
         * @author Martí Vilàs
         * @since 9 d'Oct  2024
         * @see llegirInt()
         */
        do {
            var error:Boolean=true
            println("Ara et demanaré que em donis el teu mes de neixament en números enters")
            print("Si us plau introdueix el teu mes (repeteixo en números): ")
            mesUsuari = llegirInt()
            if (mesUsuari <=0 || mesUsuari>12){
                println("Dubto molt que sigui el mes que m'estàs dient")
            }else {
                println("El mes de neixament es $mesUsuari")
                error=false
            }
        }while(error)

        /**
        * Aries: 21 de marzo al 19 de abril
        * Tauro: 20 de abril y al 20 de mayo
        * Géminis: 21 de mayo al 20 de junio
        * Cáncer: 21 de junio al 22 de julio
        * Leo: 23 de julio al 22 de agosto
        * Virgo: 23 de agosto al 22 de septiembre
        * Libra: 23 de septiembre al 22 de octubre
        * Escorpio: 23 de octubre al 21 de noviembre
        * Sagitario: 22 de noviembre al 21 de diciembre
        * Capricornio: 22 de diciembre al 19 de enero
        * Acuario: 20 de enero al 18 de febrero
        * Piscis: 19 de febrero al 20 de marzo
        */

        /**
         *
         */

        when(mesUsuari) {
            1,3,5,7,8,10,12 -> {
                val diaNeix:Int = llegirInt()
                if (diaNeix<=0 || diaNeix>31){
                    println("Jo no crec que sigui aquest dia")
                }else{
                    when(mesUsuari){
                        1-> {
                            if (diaNeix in 1..19){
                                println("Capricornio")
                            }else {
                                println("Acuario")
                            }
                        }
                        3-> {
                            if (diaNeix in 1..20){
                                println("Piscis")
                            } else {
                                println("Aries")
                            }
                        }
                        5-> {
                            if (diaNeix in 1..20){
                                println("Tauro")
                            } else {
                                println("Géminis")
                            }
                        }
                        7->{
                            if (diaNeix in 1..20){
                                println("Cancer")
                            } else {
                                println("Leo")
                            }
                        }
                        8->{
                            if (diaNeix in 1..22){
                                println("Leo")
                            } else {
                                println("Virgo")
                            }
                        }
                        10->{
                            if (diaNeix in 1..22){
                                println("Libra")
                            }else{
                                println("Escorpio")
                            }
                        }
                        12->{
                            if (diaNeix in 1..21){
                                println("Sagitario")
                            }else {
                                println("Capricornio")
                            }
                        }
                    }
                }
            }
            4,6,9,11 -> {
                val diaNeix:Int = llegirInt()
                if (diaNeix<=0 || diaNeix>30){
                    println("Jo no crec que sigui aquest dia")
                }else{
                    when(mesUsuari){
                        4->{
                            if (diaNeix in 1..19){
                                println("Aries")
                            }else {
                                println("Tauro")
                            }
                        }
                        6->{
                            if (diaNeix in 1..20){
                                println("Geminis")
                            }else{
                                println("Cancer")
                            }
                        }
                        9->{
                            if (diaNeix in 1..22){
                                println("Virgo")
                            }else {
                                println("Libra")
                            }
                        }
                        11->{
                            if (diaNeix in 1..21){
                                println("Escorpio")
                            }else{
                                println("Sagitario")
                            }
                        }
                    }
                }
            }
            2 -> {
                val diaNeix:Int = llegirInt()
                if (anyUsuari%4==0 || anyUsuari%400==0){
                    if (diaNeix<=0 || diaNeix>29){
                        println("Jo no crec que sigui aquest dia")
                    }else {
                        if (diaNeix in 1..18) {
                            println("Acuario")
                        } else  {
                            println("Piscis")
                        }
                    }
                }
                if (diaNeix<=0 || diaNeix>28){
                    println("Jo no crec que sigui aquest dia")

                }else{
                    if (diaNeix in 1..18){
                        println("Acuario")
                    }else {
                        println("Piscis")
                    }
                }
            }
            else -> {
                println("${RED}ERROR NO FAS CAS AL QUE S'HA DIT!!!${RESET}")
            }
        }
        error=true
    }while (error)

}