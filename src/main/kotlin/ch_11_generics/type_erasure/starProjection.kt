package ch_11_generics.type_erasure

fun printSum(collection: Collection<*>) {
    val intList = collection as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main() {
    printSum(listOf(1, 2, 3, 4, 5))
    printSum(setOf(1, 2, 3, 4, 5)) // IllegalArgumentException: List is expected
    printSum(listOf("a", "b")) // ClassCastException
}