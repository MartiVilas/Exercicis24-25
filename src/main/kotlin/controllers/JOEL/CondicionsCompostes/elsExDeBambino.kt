package controllers.JOEL.CondicionsCompostes
import java.util.Scanner

fun main(){

    val scanner:Scanner=Scanner(System.`in`)
    print("Digues a: ")
    val a:Int=scanner.nextInt()
    print("Digues b: ")
    val b:Int=scanner.nextInt()
    print("Digues c: ")
    val c:Int=scanner.nextInt()
    print("Digues n: ")
    val n:Int=scanner.nextInt()

    if(a!=b && b!=c && a!=c) {
        if (a>=18 && b>=18 && c>=18 && n>=18){
            println("SI")
        }else{
            println("NO")
        }
    }
}