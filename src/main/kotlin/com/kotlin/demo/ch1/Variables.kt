package com.kotlin.demo.ch1

@ExperimentalUnsignedTypes
class VariableDemo {

    val iAmAnInteger: Int = 1   // Immediate assignment
    val iAmAnIntegerToo = 2     // Inferred tye

    val myDouble:Double = 123456789.0       // 64 bit
    val myFloat:Float = 99.99f              // 32 bit
    val myLong:Long = 987654321L            // 64 bit
    val myInt:Int = 2147483647              // 32 bit
    val myShort:Short = 32767               // 16 bit
    val myByte:Byte = 127                   // 8 bit

    val myULong:ULong = 18446744073709551615uL
    val myUInt:UInt = 4294967295u
    val myUShort:UShort = 65535u
    var myUByte:UByte = 255u

    val myUNumber = 42u

    // explicit conversion
    val a:Byte = 127
    val b:Int = a.toInt()       // 'a' has to be converted to Int, even 'b' is wider

    // Strings
    var whatAmI:String = "I am Mutable"
    val dontTouchMe = "I am Immutable"

    val raw = """
<!-- Google Tag Manager -->
<script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
})(window,document,'script','dataLayer','GTM-5P98');</script>
<!-- End Google Tag Manager -->
"""


    fun smartCastLengthChecker(valami: Any): Int? {
        if (valami is String) {
            // 'valami' is automatically cast to 'String' in this branch
            return valami.length
        } else if (valami is Boolean) {
            // 'valami' is Boolean here
            return if (valami) 1 else 0
        } else {
            // 'valami' is still of type 'Any' outside of the type-checked branch
            return null
        }

    }
}

@ExperimentalUnsignedTypes
fun main() {

    val vDemo = VariableDemo()

    println()
    println("Class type names")
    println(vDemo.myUNumber.javaClass.name)
    println(vDemo.myUNumber.javaClass.kotlin)
    println(vDemo.myUNumber.javaClass.kotlin.qualifiedName)

    println()
    println("Overflow -> ${(vDemo.myUByte )} incremented: ${(vDemo.myUByte.inc())}")



    println()
    var sss:Int? = vDemo.smartCastLengthChecker("19")
    println("Vale can be null $sss")
    println("Value can be null ${vDemo.smartCastLengthChecker(99)}")
    println("Value can be null ${vDemo.smartCastLengthChecker(true)}")

    println()
    println("Raw: ${vDemo.raw}")

}
