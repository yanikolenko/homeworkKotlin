package FirstBlock

fun main() {
    val a = 5
    val b = 6
    val c = 7

    var V = a*b*c
    var S = 2*(a*b + b*c + a*c)

    println("Volume: $V")
    println("Square: $S")
}