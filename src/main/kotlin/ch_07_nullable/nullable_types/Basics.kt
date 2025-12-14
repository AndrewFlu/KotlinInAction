package ch_07_nullable.nullable_types

fun stringLengthSafely(s: String?) =
    if (s != null) s.length else 0

fun main() {
    val x: String? = null
    println(stringLengthSafely(x))
    println(stringLengthSafely("MacBook"))
}