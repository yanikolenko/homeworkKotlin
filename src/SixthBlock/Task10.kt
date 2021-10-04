package SixthBlock

fun main() {
    val stroka1 = "ABBA"
    val str1Reverse = stroka1.reversed()

    val stroka2 = "ABBBWQ"
    val str2Reverse = stroka2.reversed()

    if (stroka1 == str1Reverse){
        println("PALINDROM")
    }else{
        println("NOT PALINDROM")
    }

    if (stroka2 == str2Reverse){
        println("PALINDROM")
    }else{
        println("NOT PALINDROM")
    }
}