package ch03_functions.strings

// функция-расширение
fun String.lastChar(): Char = get(length - 1)

// свойство-расширение
val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.tailChar: Char
    get() = this.get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }


fun main() {
    println("MacBook".lastChar())
    println("Kotlin".lastChar)

    val sb: StringBuilder = StringBuilder("Kotlin?")
    println(sb.tailChar)
    sb.tailChar = '!'
    println(sb)
}