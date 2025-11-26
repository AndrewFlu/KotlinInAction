package ch03_functions

fun main() {
    val list = listOf(1, 5, 15)
    val set = setOf("one", "five", "fifteen")
    val map = mapOf(
        1 to "one",
        5 to "five",
        15 to "fifteen"
        )
    println(list.javaClass) // ArrayList
    println(set.javaClass) // LinkedHashSet
    println(map.javaClass) // LinkedHashMap
}