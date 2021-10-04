package FirstBlock

fun main() {
    var A = 1
    var B = 2
    var C = 3
    var D = 0

    D = B
    B = A
    A = C
    C = D

    println(A)
    println(B)
    println(C)

}