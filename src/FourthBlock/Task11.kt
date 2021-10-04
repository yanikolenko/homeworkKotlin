package FourthBlock

fun main() {
    var A = 5
    var B = 9

    while (A != 0 && B != 0){
        if (A>=B){
            A = A % B
        }else{
            B = B % A
        }
    }
    print(A + B)
}