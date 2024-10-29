package controllers.JOEL.Bucles2

import java.util.*

fun main(){
    val scanner:Scanner = Scanner(System.`in`)
    val numIteracions:Int = scanner.nextInt()
    var contadorPositiu:Int = 0

    for (i in 0 until numIteracions){
        val nums:Int = scanner.nextInt()
        if(nums>0){
            contadorPositiu++
        }
    }
    println(contadorPositiu)
}