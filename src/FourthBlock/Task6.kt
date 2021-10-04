package FourthBlock

fun main() {

    val N = 6
    var A1 = 1
    var A2 = 2
    var A3 = 3


    for (i in 4..N+1){
        var Ak = A3  + A2 - 2*A1
        println(Ak)
        A1 = A2
        A2 = A3
        A3 = Ak
    }
}
