package com.kotlin.demo

class App {
    val greeting: String
        get() {
            return "Hello Kotlin demo."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)
}
