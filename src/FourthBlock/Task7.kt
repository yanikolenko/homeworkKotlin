package FourthBlock

fun main() {
    var N = 5
    var K = 7
    var dil = 0

    while (N - K >= 0){
        N = N - K
        dil = dil + 1
    }

    println(dil)
    println(N)
}