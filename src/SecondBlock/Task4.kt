package SecondBlock

fun main() {
    val number = 322
    val firstNumber = number / 100
    val twoOfThree = number % 100
    val newNumber = "$twoOfThree" + "$firstNumber"
    print(newNumber)


}
