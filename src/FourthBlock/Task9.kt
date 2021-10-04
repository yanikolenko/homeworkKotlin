package FourthBlock

fun main() {
    val percent = 20
    var summ = 1000
    var K = 1

    while (summ <= 1100){
        summ = summ * (percent/100 + 1)
        K = K + 1
    }

    println(K)
    println(summ)
}