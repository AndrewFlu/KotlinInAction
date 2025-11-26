package ch03_functions

@JvmOverloads
fun <T> joinToStringByOverloads(
    collection: Collection<T>,
    separator: String = " | ",
    prefix: String = "< ",
    postfix: String = " >"
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString();
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(joinToStringByOverloads(numbers, separator = " || "))
    println(joinToStringByOverloads(numbers, prefix = "("))
}