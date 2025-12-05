package ch04_classes_interfaces.companion

class MyClass {
    var index = 0

    companion object {
        fun printHi() {
            println("Hi!")
        }
    }
}

fun main() {
    MyClass.printHi()

    val myClass = MyClass()
//    myClass.printHi() // Kotlin: Unresolved reference 'printHi'.
}
