package controllers.Arrays

fun main() {

    val array: Array<Int> = arrayOf(1,2,3,4)
    val arrayReversed = array.reversed()

    println(array.contentToString())
    println(arrayReversed.toString())

}