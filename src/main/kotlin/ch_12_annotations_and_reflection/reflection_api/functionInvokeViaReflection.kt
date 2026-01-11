package ch_12_annotations_and_reflection.reflection_api

fun sum(x: Int, y: Int) = x + y

fun main() {
    val function = ::sum
    println(function.invoke(1, 2) + function(3, 4))
//    function(1) // No value passed for parameter y
}