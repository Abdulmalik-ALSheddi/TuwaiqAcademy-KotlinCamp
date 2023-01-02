package com.example.day2assignments

fun main()
{
    //************************** Assignment#1 **************************
//    (false && false) --> false
//    (10 % 3) ----------> 1
//    (5 >= 5) ----------> true
//    (false || true) ---> true
//    (5 - 3 * 2) -------> -1
//    (3 != 2 ) ---------> true
//    ((6 + 6)/ 3) ------> 4

    //************************** Assignment#2 **************************
    println("************************** Assignment#2 **************************\n")

    //----PART#1----
    println("\n Part#1")
    for (i in 0..100)
        if (i == 71){
            println("IT'S OVER 70")
            break
        }

    //----PART#2----
    println("\n Part#2")
    var temperature = 35
    while(temperature > 10)
    {
        when (temperature) {
            30 -> println("It's Hot")
            20 -> println("It's Comfy")
            15 -> println("It's COLD!!!")
            else -> println(temperature)
        }
        temperature--
    }
}