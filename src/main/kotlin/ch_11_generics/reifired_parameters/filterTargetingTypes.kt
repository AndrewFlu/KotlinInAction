package ch_11_generics.reifired_parameters

inline fun <reified T> Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this)
        if (element is T)
            destination.add(element)

    return destination
}

fun main() {
    val items = listOf("one", 2, "three", "four", 5, "six", 7, "eight", "night", 10)
    println(items.filterIsInstance<String>())
    println(items.filterIsInstance<Int>())
}