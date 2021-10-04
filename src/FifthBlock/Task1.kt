package FifthBlock

fun main() {
    val N = 5
    var numbers = mutableListOf<Int>()
    if (N % 2 == 1){
        for (i in 1..N step 2){
            numbers.add(i)
        }
    }
    print(numbers)
}