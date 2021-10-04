package ThirdBlock

fun main() {
    var A = 6
    var B = 8

    if (A != B){
        A = A + B
        B = A
    }else{
        A = 0
        B = 0
    }

    println(A)
    println(B)
}