package FifthBlock

fun main() {
    val N = 10
    val arr = mutableListOf<Int>()
    var flag = true
    var counter = 0

    for (i in 1..10){
        var number = (0..10).random()
        arr.add(number)
    }

    while (counter <= arr.size-1 && flag){
        if (arr[counter] < arr[arr.size-1]){
            println(arr[counter])
            flag = false
        }else if (counter == arr.size-1){
            println(0)
        }
        counter++
    }
}