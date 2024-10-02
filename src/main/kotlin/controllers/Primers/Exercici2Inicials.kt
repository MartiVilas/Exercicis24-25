package controllers.Primers

fun main() {

    /**
     * Algoritme que demana dos números i mostra el resultat de la suma,
     * la resta, la multiplicació i la divisió d'ells dos.
     * @author: Martí Vilàs
     */
    println("Exercici 2")

    println("Escriu un número: ")
    var num1:Int = readln().toInt()
    var num2:Int = readln().toInt()
    var suma:Int= num1+num2
    var resta:Int= num1-num2
    var mult:Int= num1*num2
    var div:Int = num1/num2

    println("Les solucions de les operacions son les següents")
    println("La suma de $num1 i $num2 és: $suma")
    println("La resta de $num1 i $num2 és: $resta")
    println("La multiplicació de $num1 i $num2 és: $mult")
    println("La divisió de $num1 i $num2 és: $div")


}