import java.lang.Exception
import kotlin.math.pow
fun main(){
    try {
        println("num1:")
        var num1 = readLine()!!.toDouble()
        println("num2:")
        var num2 = readLine()!!.toDouble()

    when{
        num1 > num2 -> num1=num1+1
        num2 > num1 -> num2=num2+1
        else -> num1=num1.pow(3)
    }
        println("num1:$num1 num2:$num2")
    }catch (e:Exception){
        println("error")
    }
}