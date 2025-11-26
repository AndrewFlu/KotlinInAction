package ch03_functions

fun main() {
    val strings = listOf("first", "second", "third")

    println(strings.last())
    println(strings.shuffled())

    val numbers = listOf(1_000_000, 500_000, 450_000)
    println(numbers.sum())
}