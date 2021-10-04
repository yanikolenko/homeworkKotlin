package FirstBlock

import FifthBlock.square
import kotlin.math.sqrt

fun main() {
    val x1 = 2
    val y1 = 5
    val x2 = 7
    val y2 = 3

    val L = sqrt((square(x2-x1, 2) + square(y2-y1, 2)).toDouble())
    println(L)


}