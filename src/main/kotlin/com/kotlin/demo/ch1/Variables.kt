package com.kotlin.demo.ch1

class SimpleClass {
    var whatAmI:String = "I am Mutable"
    val dontTouchMe = "I am Immutable"
}

fun main() {
    val simple = SimpleClass()
    simple.whatAmI = "Blablabla"
    println(simple.whatAmI)
    println(simple.dontTouchMe)
}