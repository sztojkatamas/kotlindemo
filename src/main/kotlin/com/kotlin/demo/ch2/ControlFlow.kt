package com.kotlin.demo.ch2

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
    val temperature:Short = (Math.random() * 25).toShort()
    val isCold:Boolean = Termostat().isCold(temp = temperature)

    //val isCold2 = (temperature < Termostat().COLDLIMIT)

    println("Is it cold? ($temperature): " + isCold)
}