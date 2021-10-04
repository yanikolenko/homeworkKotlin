package FifthBlock

fun main() {

    val arr = mutableListOf<Int>()
    for (i in 1..10){
        var number = (0..10).random()
        arr.add(number)
    }
    var min = arr[0]
    println(arr)

    for (i in 1..9 step 2){
        if (arr[i] < min){
            min = arr[i]
        }
    }
    print(min)
}