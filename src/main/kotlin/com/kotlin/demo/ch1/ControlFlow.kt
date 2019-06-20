package com.kotlin.demo.ch1

class Termostat() {

    fun isCold(temp:Int):Boolean {
        if (temp < 16){
            return true
        }
        return false
    }
}


fun main() {
    val temperature:Int = (Math.random() * 25).toInt()
    val isCold:Boolean = Termostat().isCold(temp = temperature)
    //val isCold:Boolean = if (temperature < 16) true else false

    println("Is it cold? ($temperature): " + isCold)
}