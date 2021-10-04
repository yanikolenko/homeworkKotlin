package SecondBlock

fun main() {
    val number = 321
    val firstNumber = number / 100
    val secondNumber = (number % 100) / 10
    val threeNumber = number % 10
    val finalNumber = "$secondNumber" + "$firstNumber" + "$threeNumber"
    print(finalNumber)
}
