package FourthBlock

fun main() {
    val N = 10
    var i = 1
    var S = 1

    while (S < N){
        i++
        S = S + i
    }

    println(i)
    println(S)
}