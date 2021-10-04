package SixthBlock

fun main() {
    val symbol = 'c'
    val text = "tgtgthhjc"
    var newtext = ""

    for (i in text){
        if (i == symbol){
            newtext+="$i$i"
        }else{
            newtext+=i
        }
    }
    print(newtext)
}