package controllers.JOEL.AlternativesIV

import java.util.Scanner

fun main(){

    val scanner:Scanner=Scanner(System.`in`)
    val num:Int=scanner.nextInt()

    when(num){
        in 1..4->{
            println("Suspes")
        }
        in 5..6->{
            println("Aprovat")
        }
        in 7..8->{
            println("Notable")
        }
        in 9..10->{
            println("Excellent")
        }
    }


}