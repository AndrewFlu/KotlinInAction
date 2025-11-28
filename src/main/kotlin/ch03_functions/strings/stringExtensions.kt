package ch03_functions.strings

// функция-расширение
fun String.lastChar() : Char = get(length - 1)

// свойство-расширение
val String.lastChar: Char
    get() = get(length - 1)


fun main() {
    println("MacBook".lastChar())
    println("Kotlin".lastChar)
}