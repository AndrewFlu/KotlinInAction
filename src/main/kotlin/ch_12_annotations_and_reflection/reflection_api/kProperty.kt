package ch_12_annotations_and_reflection.reflection_api

var autoCounter = 0

fun main() {
    val counter = ::autoCounter
    println(counter.get())
    counter.setter.call(1)
    println(counter.get())

}