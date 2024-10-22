package controllers.JOEL.AlternativesIV

import java.util.Scanner
fun main(){

    val scanner:Scanner=Scanner(System.`in`)
    val num1:Int=scanner.nextInt()
    val num2:Int=scanner.nextInt()
    val num3:Int=scanner.nextInt()
    if (num1<0||num2<0||num3<0){
        println("NO")
    }
    if (num1 in 1..24 && num2 in 1..60 && num3 in 1..60){
        println("SI")
    }else{
        println("NO")
    }
}