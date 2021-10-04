package ThirdBlock

fun main() {
    val A = 3
    val B = 1
    val C = 2

    if ((A < B && A > C) || (A > B && A < C)){
        print("Middle number: $A")
    }else if ((B < A && B > C) || (B > A && B < C)){
        print("Middle number: $B")
    }else if ((C < A && C > B) || (C > A && C < B)){
        print("Middle number: $C")
    }else{
        print("Maybe some numbers equal-sized")
    }
}