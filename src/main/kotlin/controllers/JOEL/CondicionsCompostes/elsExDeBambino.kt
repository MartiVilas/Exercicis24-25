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

    /**
     * Cada cas de prova consisteix en 4 números, 𝐴, B, 𝐶, N, sent 𝐴, 𝐵, 𝐶 l'edat dels exs de bambino,
     * que sempre seran diferents i iguals o majors de 18, i 𝑁 l'edat del seu últim interès,
     * també igual o major de 18.
     */

    if(a!=b && b!=c && c!=n) {
        if (a<=18 && b<=18 && c<=18 && n<=18){
            println("SI")
        }else{
            println("NO")
        }
    }
}