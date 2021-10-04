package ThirdBlock

fun main() {
    val x = 22
    var y = 0

    if (x <= 0 ){
        y = -x
    }else if (x > 0 && x < 2){
        y = x*x
    }else if (x >= 2){
        y = 4
    }
    print(y)
}