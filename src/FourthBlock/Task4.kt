package FourthBlock

fun main(){
    var A = 5
    var stepinb = A
    val N = 3

    for (i in 1..N){
        A *= stepinb
        println("Степінь $i числа А: $A")
    }
}