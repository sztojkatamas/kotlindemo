package com.kotlin.demo.ch2

import kotlin.random.Random

class Termostat() {

    val COLDLIMIT:Short = 16

    fun isCold(temp:Short):Boolean {
        if (temp <= COLDLIMIT){
            return true
        }
        return false
    }

    fun isColdShort(temp:Short):Boolean {
        return (temp <= COLDLIMIT)
    }

    fun isColdWhen(temp:Short):Boolean {
        when(temp) {
            in 0..COLDLIMIT -> return true
            else -> return false
        }
    }
}


fun main() {
    val temperature:Short = Random.nextInt(1,25).toShort()
    val isCold:Boolean = Termostat().isCold(temp = temperature)
    val isCold2 = (temperature < Termostat().COLDLIMIT)
    println("Is it cold? ($temperature): $isCold")
    println("Is it cold? ($temperature): $isCold2")

    val baseString = "AB1C2D3E4F5G6H7K8I9J"
    var c:Char
    for (x in 1..5){
        c = baseString.random()
        when (c) {
            'I' -> {
                println("$c is an I")
            }
            in '1'..'9' -> {
                println("$c is a number")
            }
            in 'A'..'C' -> {
                println("$c is A or B or C")
            }
            else -> {
                println("$c is something else")
            }
        }
    }

    // while and do-while
    var i = 10
    while (i>0) {
        print(".")
        i--
    }

    do {
        print("-")
        i++
    }while (i<10)


    println()
    // for downto step
    for (a in 1..10 step 2) {
        println("Number is $a")

    }
}