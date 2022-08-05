import java.util.Scanner

fun main(){
    val version = " this is version 3"
    println(version)

    var scan = Scanner(System.`in`)
    println("enter the first number")
    var number1 : Double = scan.nextDouble()

    println("enter the second number")
    var number2 : Double = scan.nextDouble()

    var result = number1 + number2
    println("sum of the two numbers is = "+result)




}