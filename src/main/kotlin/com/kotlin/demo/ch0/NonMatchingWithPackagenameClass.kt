package com.kotlin.demo.ch0

/**
 * Defining Packages
 * Defining Classes
 * Defining Functions
 * */

class NonMatchingWithPackageNameClass {

    fun doSomething() {
        println("Hard work")
    }

    fun functionThatReturnsSomething():String {
        return "I am returned"
    }
}
class MultipleClassInASingleFile {
    fun multiClass(): String {
        return "I am a class too!"
    }
}


fun main() {
    val noMatchForU = NonMatchingWithPackageNameClass()
    val otherClass = MultipleClassInASingleFile()

    noMatchForU.doSomething()
    println(noMatchForU.functionThatReturnsSomething())
    println(otherClass.multiClass())
}
