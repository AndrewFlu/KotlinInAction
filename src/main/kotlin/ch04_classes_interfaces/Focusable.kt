package ch04_classes_interfaces

interface Focusable {

    fun setFocus(b: Boolean) =
        println("I ${if(b) "got" else "lost"} focus")

    fun printProperty() = println("I am a Focusable element!")
}