package com.kotlin.demo

import java.io.File

fun main() {

    File.createTempFile("valami","txt").writeText("Hello...")


    val file = File.createTempFile("qqq","txt")
    file.writeText("""Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sed tortor id ante mattis dictum. Nulla facilisi. Proin vel sagittis mi. Vestibulum ipsum felis, maximus nec ante sed, pulvinar dapibus lectus. Suspendisse sagittis massa vel risus ultricies ultricies. Duis ac ex nec mauris pulvinar tincidunt. Proin condimentum, sem non viverra sollicitudin, tortor dolor imperdiet nunc, at iaculis sapien ligula sit amet erat. Donec lacus justo, luctus sit amet tempor ut, consectetur quis quam. Suspendisse eu porta ligula. Donec dapibus ante non nisi tempus ultricies. Quisque sodales hendrerit libero sed efficitur. Curabitur sit amet rutrum felis, at condimentum nisi. Donec euismod, metus et posuere efficitur, massa ligula cursus quam, vitae consequat elit est at neque. Maecenas bibendum, massa non luctus cursus, orci enim elementum lorem, sit amet feugiat orci mauris quis neque. Sed ultricies lectus mauris, eu blandit purus consequat sed. Duis sit amet eros ullamcorper, eleifend massa eget, ornare felis.

Fusce felis velit, ultrices a scelerisque vel, vehicula eget nunc. Vivamus faucibus libero ut nisl luctus, vel commodo turpis maximus. Nullam commodo nibh sed ligula ullamcorper mollis. Ut varius lobortis nisl, quis vulputate leo egestas finibus. Morbi iaculis, ante in tempus viverra, tortor nibh accumsan dui, vitae pharetra elit tortor a neque. Nunc vel tincidunt lacus. Vivamus feugiat erat a ex rutrum euismod. Vivamus congue dolor id aliquet ultricies. Nam non commodo mauris. Curabitur fermentum neque eget massa consequat imperdiet. Duis ultricies pharetra est. Maecenas porta, velit id pulvinar pretium, quam massa cursus justo, vitae egestas magna magna quis lorem. Vivamus nulla erat, volutpat in purus ac, gravida ultricies ligula. Maecenas egestas est ut ornare congue.

Nullam in sem odio. Integer nec maximus nibh, quis aliquam enim. Fusce molestie, lacus ut pellentesque fringilla, nibh magna feugiat neque, et interdum sem lectus nec arcu. Duis vitae erat eu arcu sodales suscipit eget eget odio. Aliquam placerat tempor tempus. Nulla vel egestas augue. Vestibulum a nulla sed mauris tempor accumsan vitae non purus. Aliquam sed vestibulum augue.""")
    println(File(file.path).readText())
    println()
    println(File(file.path).readText().split(" ").filter{it.startsWith("vel")})



}
