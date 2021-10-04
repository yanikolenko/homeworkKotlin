package FirstBlock

import FifthBlock.square

fun main() {
    val x = 3

    val y = 4 * square(x-3, 6) - 7* square(x-3, 3) + 2

    print(y)
}