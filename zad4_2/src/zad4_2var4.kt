fun main(){
    try {
        println("num:")
        var num= readLine()!!.toInt()
        var F=0
        if (num<=7){
            F += -3 * num + 9
            print("F($num):$F")
        }
        else {
            F += 1 / (num - 7)
                print("F($num):$F")
            }
    }catch(e:Exception)
    {
        print("error")
    }
}