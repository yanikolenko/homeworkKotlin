package FifthBlock

fun main() {
    val M = 6
    val N = 7
    var counter = 0

    val arr = mutableListOf<Int>()

    for (i in 1..N){
        for (j in 1..M){
            arr.add(10*i)
        }
    }
    for (i in arr){
        print("$i ")
        counter++
        if (counter % M == 0){
            println()
        }

    }

}