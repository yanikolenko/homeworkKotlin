package FifthBlock

fun main() {
    val sizeOfAr = 6
    val arr = mutableListOf<Int>()

    for (i in 1..sizeOfAr){
        val rnds = (0..10).random()
        arr.add(rnds)
    }
    println(arr)
    arr.reverse()
    println(arr)


}