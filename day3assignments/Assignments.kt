package com.example.day3assignments

fun assignment2 ( operand1:Double , operand2:Double , operator: String = "+")  {
    when (operator)
    {
        "+" -> println("Result = ${operand1 + operand2}")
        "-" -> println("Result = ${operand1 - operand2}")
        "*" -> println("Result = ${operand1 * operand2}")
        "/" -> println("Result = ${operand1 / operand2}")
        else -> println("Illegal operator!!!")
    }
}

fun main()
{

    //******************** Assignment#1 ********************
    println("---------- Assignment#1 ----------")
    var nums = arrayListOf(1.1,1.2,1.3,1.4,1.5)
    println("Average = ${nums.average()}")

    //Alternative solution
    var sum = 0.0
    for( i in nums)
        sum += i
    println("\nAlternative solution: \nAverage = ${sum/nums.size}\n\n")



    //******************** Assignment#2 ********************
    println("---------- Assignment#2 ----------")
    assignment2(5.5,5.5)
    assignment2(5.5,5.5,"+")
    assignment2(5.5,5.5,"-")
    assignment2(5.5,5.5,"*")
    assignment2(5.5,5.5,"/")
    assignment2(5.5,5.5,"BOO")
}
