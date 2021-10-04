package FirstBlock

import FifthBlock.square

fun main() {
    val L = 8
    val Pi = 3.14

    val R = L/2*Pi
    val S = Pi* square(R.toInt(), 2)

    println(R)
    println(S)

}