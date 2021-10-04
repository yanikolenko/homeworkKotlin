package FirstBlock

import FifthBlock.square
import java.lang.Math.sqrt

fun main() {
    val firstK = 4
    val secondK = 3

    var hypotenuse = kotlin.math.sqrt((square(firstK, 2) + square(secondK, 2)).toDouble())
    var P = firstK +secondK + hypotenuse

    println(hypotenuse)
    println(P)


}