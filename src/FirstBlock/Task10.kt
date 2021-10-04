package FirstBlock

import FifthBlock.square

fun main() {
    val a = 4
    val b = 5

    var amount = square(a, 2) + square(b, 2)
    var multiply = square(a, 2) * square(b, 2)
    var divide = square(a, 2) / square(b, 2)
    var minus = square(a, 2) - square(b, 2)

    println("amount: $amount")
    println("multiply: $multiply")
    println("divide: $divide")
    println("minus: $minus")
}