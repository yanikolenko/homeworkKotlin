package SixthBlock

fun main() {
    val text = "3jgj5mv88"
    var amount = 0

    var numbers = text.filter { it.isDigit() }
    amount = numbers.length

    print(amount)
}