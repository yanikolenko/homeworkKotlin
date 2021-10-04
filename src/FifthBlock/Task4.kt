package FifthBlock

fun main() {
    val sizeOfAr = 10
    var counter = 0
    val arr = mutableListOf<Int>()

    for (i in 1..sizeOfAr){
        val rnds = (0..10).random()
        arr.add(rnds)
    }
    println(arr)
    for (i in arr){
        if (i % 2 != 0){
            println(i)
            counter++
        }
    }
    println("Count: $counter")


}