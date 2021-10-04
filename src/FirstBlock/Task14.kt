package FirstBlock

import kotlin.math.sqrt

fun main() {
    val S = 5
    val Pi = 3.14

    val R = sqrt(S/Pi)
    val D = 2*R
    val L = 2*Pi*R

    println(D)
    println(L)

}