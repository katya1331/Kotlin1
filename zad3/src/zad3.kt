fun main(){
    try {
        println("your age:")
        var age = readLine()!!.toInt()
        when {
            (age >= 0) && (age <= 2) -> println("ты младенец")
            (age >= 3) && (age <= 7) -> println("ты дошкольник")
            (age >= 8) && (age <= 13) -> println("ты ребeнок(школьник)")
            (age >= 14) && (age <= 17) -> println("ты подросток")
            (age >= 18) && (age <= 40) -> println("ты взросый")
            (age >= 41) && (age <= 65) -> println("ты зрелый")
            (age >= 65) -> println("ты пожилой")
        }
    }catch(e:Exception){
        print("error")
    }
}