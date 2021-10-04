package SixthBlock

fun main() {
    val number = 123
    val arr = mutableListOf<String>()
    var amount:Int = 0

    for (i in number.toString()){
        amount += i.toString().toInt()
    }

    print(amount)
}