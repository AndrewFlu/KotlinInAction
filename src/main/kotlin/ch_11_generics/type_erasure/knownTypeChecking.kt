package ch_11_generics.type_erasure

fun printSum(collection: Collection<Int>) {
    when(collection) {
        is List<Int> -> println("List sum: ${collection.sum()}")
        is Set<Int> -> println("Set sum: ${collection.sum()}")
    }
}

fun main() {
    printSum(listOf(7, 8, 9))
    printSum(setOf(7, 8, 9))
}