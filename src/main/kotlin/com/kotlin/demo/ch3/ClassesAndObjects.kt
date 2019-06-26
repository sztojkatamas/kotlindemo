package com.kotlin.demo.ch3

sealed class SealedClass {
    val name = "Bob"
    fun secretFunction() {
        println("$name")
    }

}

data class Person(val secretName:SealedClass, val ageInYears:Short) {
    var name:String= secretName.name
    var age:Short = component2()
}


class OtherClass:SealedClass() {
// Works only in this file!
}

fun main() {

    val other = OtherClass()
    other.secretFunction()


}
