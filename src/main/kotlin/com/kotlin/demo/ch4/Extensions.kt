package com.kotlin.demo.ch4

fun main() {
    val names = listOf("Tim", "Bob", "Steve", "Herbert", "Samuel", "James")
    names.forEach{ println(it.doubleCapitalize())}
}

fun String.doubleCapitalize():String {
    return this.reversed().capitalize().reversed()
}