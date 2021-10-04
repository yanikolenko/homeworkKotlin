package FifthBlock


fun main() {
 val N = 10
 val numbers = mutableListOf<Int>()
 for (i in 1..N){
     numbers.add(square(2, i))
 }
 print(numbers)


}

fun square(number:Int, stepin:Int):Int {
    var finalNumber = number

    if (stepin >= 2) {
        for (i in 2..stepin) {
            finalNumber *= number
        }
        return finalNumber
    } else if (stepin == 0) {
        return 1
    } else if (stepin == 1) {
        return number
    } else {
        print("Тільки додатні і нуль !!!")
        return 0
    }

}