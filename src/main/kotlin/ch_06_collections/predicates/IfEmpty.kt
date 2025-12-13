package ch_06_collections.predicates

fun main() {
    val empty = emptyList<String>()
    val full = listOf("apple", "banana", "coconat")
    println(empty.ifEmpty { listOf("no", "values", "here") })
    println(full.ifEmpty { listOf("no", "values", "here") })
}