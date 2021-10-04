package FourthBlock

fun main() {
    val N = 8
    var f1 = 1
    var f2 = 1

    while (N > f2){
        var f = f2
        f2 = f1 + f2
        f1 = f
    }
    if (N == f2)  {
        print("True")
    }else{
        print("False")
    }
}