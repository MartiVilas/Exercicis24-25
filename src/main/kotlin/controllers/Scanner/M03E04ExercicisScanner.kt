package controllers.Scanner

import utils.*

fun main(){

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
         * @see llegirInt()
         * @since 8 d'Oct 2024
         */

        do {
            println("Digues el teu any de neixement, ha de estar entre 1900 i 2024, si us plau")
            print("Quin any vas neixer:")
            val anyUsuari:Int = llegirInt()
            var error:Boolean= false
            if (anyUsuari<1900 || anyUsuari>2024){
                println("Has introduit un any que es una mica dificil que sigui veritat")
            } else{
                println("L'any de neixament es $anyUsuari")
                error=true
            }

            /**
             *
             */
            do {
                val error:Boolean=false
                println("Ara et demanaré que em donis el teu mes de neixament en números enters")
                print("Si us plau introdueix el teu mes (repeteixo en números): ")
                val mesUsuari:Int = llegirInt()
                when(mesUsuari) {
                    1,3,5,6,8,10,13 -> {
                        val diaNeix:Int = llegirInt()
                        if (diaNeix<0 || diaNeix>31){
                            println("Jo no crec que sigui aquest dia")
                        }else{

                        }
                    }
                    4,6,9,11 -> {
                        val diaNeix:Int = llegirInt()
                        if (diaNeix<0 || diaNeix>30){
                            println("Jo no crec que sigui aquest dia")
                        }else{

                        }
                    }
                    2 -> {
                        val diaNeix:Int = llegirInt()
                        if (diaNeix<0 || diaNeix>28){
                            println("Jo no crec que sigui aquest dia")
                        }else{

                        }
                    }

                    else -> {
                        println("${RED}ERROR NO FAS CAS AL QUE S'HA DIT!!!${RESET}")
                    }
                }

            }while(error)
        }while(error)
        error=true
    }while (error)

}