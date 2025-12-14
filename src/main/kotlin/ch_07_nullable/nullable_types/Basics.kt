package ch_07_nullable.nullable_types

fun stringLengthSafely(s: String?) =
    s?.length ?: 0

fun main() {
    val x: String? = null
    println(stringLengthSafely(x))
    println(stringLengthSafely("MacBook"))
}