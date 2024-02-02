fun main(){
    try {
        println("a,b")
        var a= readLine()!!.toInt()
        var b= readLine()!!.toInt()
        println("c,d")
        var c= readLine()!!.toInt()
        var d= readLine()!!.toInt()
        if (a>c && b>d){
            println("Второй конверт можно вложить в первый")
        }else
        if (a<c && b<d){
            println("Первый конверт можно вложить во второй")
        }else if(a==c && b==d){println("Конверты имеют один размер, вложить один во второй не удасться") }
        else {println("вложить один во второй не удасться") }
    }catch(e:Exception)
    {
        print("error")
    }
}