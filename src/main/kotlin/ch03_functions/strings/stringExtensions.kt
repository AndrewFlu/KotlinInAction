package ch03_functions.strings

fun String.lastChar() : Char = this.get(this.length - 1)

fun main() {
    println("MacBook".lastChar())
}