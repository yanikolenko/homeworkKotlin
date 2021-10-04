package ThirdBlock

fun main() {
    val A = 3
    val B = 4
    val C = 5

    if (A < B && A < C){
        print("The smallest number: $A")
    }else if (B < A && B < C){
        print("The smallest number: $B")
    }else if (C < A && C < B){
        print("The smallest number: $C")
    }else{
        print("Maybe some numbers equal-sized")
    }
}