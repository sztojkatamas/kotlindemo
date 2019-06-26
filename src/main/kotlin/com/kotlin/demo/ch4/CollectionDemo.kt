package com.kotlin.demo.ch4

fun main() {

    // Subtract lists
    val numbers = "1234567890".toList()
    val blabla = "a34c55b6346d6e63f67".toList()

    for (i in numbers.indices) println(numbers.get(i))
    println((blabla - numbers).sorted())
    println()

    // Mutability
    val names = mutableListOf("Fred", "Mary")
    names.add("Bob")
    names.add("Tom")
    println(names)

    // Immutability
    val primes = listOf(2,3,5,7,11,13,17,19)
    println(primes)


    // Filtering
    val actors = listOf("Tim", "Robert", "Fred", "Billy", "Bob", "Andrew")
    println(actors.filter { it.startsWith("B")})
    println(actors.filter { it.length > 4})

    // Filtering 2
    val people = mutableListOf<Muki>()
    for (n in 1..10) {
        people.add(Muki(
                listOf("Kovács", "Balogh", "Szabó").random(),
                listOf("Tamás", "Steve", "András").random()))
    }
    println(people.filter { it.kerName.contains("dr")})
    people.forEach{ println("$it beceneve ${it.nickName()}")}
}

data class Muki(val vezName:String, val kerName:String) {

//    val vName:String = vezName
//    val kName:String = kerName

    fun nickName(): String {
        when(kerName) {
            "Tamás" -> return "Tomi"
            "Steve" -> return "Pityu"
            "András" -> return "Bandi"
            else   -> return "Csávó"
        }
    }
}