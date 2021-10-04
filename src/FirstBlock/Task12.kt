package FirstBlock

import FifthBlock.square

fun main() {
    val R1 = 15
    val R2 = 12

    val Pi = 3.14

    val S1 = Pi* square(R1, 2)
    val S2 = Pi* square(R2, 2)

    val S3 = S1 - S2

    println(S1)
    println(S2)
    println(S3)

}