package ThirdBlock

fun main() {
    val A = 3
    val B = 1
    val C = 2

    if (A < B && A < C){
        print(B + C)
    }else if (B < C){
        print(C + A)
    }else{
        print(A + B)
    }

}