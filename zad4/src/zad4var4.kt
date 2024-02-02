fun main() {
    try {
        println("number:")
        var truenumber = readLine()!!.toInt()
        var reversenumber = 0
        var tempnumber = truenumber
        while(tempnumber != 0) {
            val num = tempnumber % 10
            reversenumber = reversenumber * 10 + num
            tempnumber /= 10
        }
        if (truenumber == reversenumber) {
            println("number is palindrome")
        } else {
            println("number is not palindrome")
        }
    }catch(e:Exception){
        print("error")
    }
}