package ThirdBlock

fun main() {
    val year = 2021

    if (year % 4 == 0){
        if ( year % 100 == 0){
            if (year % 400  != 0){
                print(365)
            }else{
                print(366)
            }
        }else{
            print(366)
        }
    }else{
        print(365)
    }
}