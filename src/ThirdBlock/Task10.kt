package ThirdBlock

fun main() {
    val x = 5
    var f = 0

    if (x < -2 || x > 2){
        f = 2*x
    }else{
        f = -3*x
    }
    print(f)
}