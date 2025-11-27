package ch03_functions.strings

fun String.lastChar() : Char = get(length - 1)

fun main() {
    println("MacBook".lastChar())
}