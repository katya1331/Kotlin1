fun main(){
    try {
        println("number:")
        var num = readLine()!!.toInt()
        when (num) {
            (0) -> print("zero")
            (1) -> print("one")
            (2) -> print("two")
            (3) -> print("three")
            (4) -> print("four")
            (5) -> print("five")
            (6) -> print("six")
            (7) -> print("seven")
            (8) -> print("eight")
            (9) -> print("nine")
            else -> print("error")
        }
    }catch(e:Exception){
        println("error")
    }
}