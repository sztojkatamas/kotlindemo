package com.kotlin.demo.ch1

class SimpleClass {

    val iAmAnInteger: Int = 1   // Immediate assignment
    val iAmAnIntegerToo = 2     // Inferred tye


    var whatAmI:String = "I am Mutable"
    val dontTouchMe = "I am Immutable"

    fun doSomething() {
        println(iAmAnInteger.dec().dec())
    }

    fun autoCastLengthChacker(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        } else if (obj is Boolean) {
            when(obj){
                true -> return 1
                false -> return 0
            }
            return null
        } else {
            // `obj` is still of type `Any` outside of the type-checked branch
            return null
        }

    }
}

fun main() {

    val simple = SimpleClass()
    simple.whatAmI = "Blablabla"
    println(simple.whatAmI)
    println(simple.dontTouchMe)
    simple.doSomething()

    var sss:Int? = simple.autoCastLengthChacker("19")
    println("Vale can be null $sss")

    println("Value can be null ${simple.autoCastLengthChacker(99)}")
    println("Value can be null ${simple.autoCastLengthChacker(true)}")
}
