package controllers.Scanner

import utils.*

fun main(){
    var anyUsuari:Int
    var mesUsuari:Int

    do {
        var error:Boolean=true
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
                println()
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
                println()

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
         * Amb el següent when agafem el mes que ha introduit l'usuari i processem la informació que ens ha donat, depenent del mes que ens hagi donat
         * el mes tindrà o 30 o 31 dies, llavors si el mes te 31 dies entre a una part del when si en te 30 entrarà a una altre.
         * Una vegada dins del when demanem el dia de neixement i a partir del dia de neixement processem la informació i li diem quin signe del zodiac és.
         * @author Martí Vilàs
         * @since 9 d'Oct 2024
         * @see llegirInt()
         */

        when(mesUsuari) {
            1,3,5,7,8,10,12 -> {
                println("Ara et demanaré que em donis el teu dia de neixament en números enters")
                print("Si us plau introdueix el teu dia de neixement (repeteixo en números): ")
                val diaNeix:Int = llegirInt()
                if (diaNeix<=0 || diaNeix>31){
                    println("Jo no crec que sigui aquest dia")
                    println()
                }else{
                    when(mesUsuari){
                        1-> {
                            if (diaNeix in 1..19){
                                println("Capricornio")
                                println()
                            }else {
                                println("Acuario")
                                println()
                            }
                        }
                        3-> {
                            if (diaNeix in 1..20){
                                println("Piscis")
                                println()
                            } else {
                                println("Aries")
                                println()
                            }
                        }
                        5-> {
                            if (diaNeix in 1..20){
                                println("Tauro")
                                println()
                            } else {
                                println("Géminis")
                                println()
                            }
                        }
                        7->{
                            if (diaNeix in 1..20){
                                println("Cancer")
                                println()
                            } else {
                                println("Leo")
                                println()
                            }
                        }
                        8->{
                            if (diaNeix in 1..22){
                                println("Leo")
                                println()
                            } else {
                                println("Virgo")
                                println()
                            }
                        }
                        10->{
                            if (diaNeix in 1..22){
                                println("Libra")
                                println()
                            }else{
                                println("Escorpio")
                                println()
                            }
                        }
                        12->{
                            if (diaNeix in 1..21){
                                println("Sagitario")
                                println()
                            }else {
                                println("Capricornio")
                                println()
                            }
                        }
                    }
                }
            }
            4,6,9,11 -> {
                println("Ara et demanaré que em donis el teu dia de neixament en números enters")
                print("Si us plau introdueix el teu dia de neixement (repeteixo en números): ")
                val diaNeix:Int = llegirInt()
                if (diaNeix<=0 || diaNeix>30){
                    println("Jo no crec que sigui aquest dia")
                    println()
                }else{
                    when(mesUsuari){
                        4->{
                            if (diaNeix in 1..19){
                                println("Aries")
                                println()
                            }else {
                                println("Tauro")
                                println()
                            }
                        }
                        6->{
                            if (diaNeix in 1..20){
                                println("Geminis")
                                println()
                            }else{
                                println("Cancer")
                                println()
                            }
                        }
                        9->{
                            if (diaNeix in 1..22){
                                println("Virgo")
                                println()
                            }else {
                                println("Libra")
                                println()
                            }
                        }
                        11->{
                            if (diaNeix in 1..21){
                                println("Escorpio")
                                println()
                            }else{
                                println("Sagitario")
                                println()
                            }
                        }
                    }
                }
            }
            2 -> {
                println("Ara et demanaré que em donis el teu dia de neixament en números enters")
                print("Si us plau introdueix el teu dia de neixement (repeteixo en números): ")
                val diaNeix:Int = llegirInt()
                if (anyUsuari%4==0 || anyUsuari%400==0){
                    if (diaNeix<=0 || diaNeix>29){
                        println("Jo no crec que sigui aquest dia")
                        println()
                    }else {
                        if (diaNeix in 1..18) {
                            println("Acuario")
                            println()
                        } else  {
                            println("Piscis")
                            println()
                        }
                    }
                }
                if (diaNeix<=0 || diaNeix>28){
                    println("Jo no crec que sigui aquest dia")
                    println()

                }else{
                    if (diaNeix in 1..18){
                        println("Acuario")
                        println()
                    }else {
                        println("Piscis")
                        println()
                    }
                }
            }
            else -> {
                println("${RED}ERROR NO FAS CAS AL QUE S'HA DIT!!!${RESET}")
                println()
            }
        }
        error = false
    }while (error)

}