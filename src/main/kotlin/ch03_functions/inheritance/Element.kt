package ch03_functions.inheritance

open class Element {
    open fun click() = println("I'm a base element")

    fun printBaseInfo() {
        println("Base Info from Element")
    }
}