package ch03_functions

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0)
            result.append(separator) // перед первым элементом разделитель не добавляется
        result.append(element)
    }
    result.append(postfix)

    return result.toString()
}

fun main() {
    val list = listOf(1, 5, 100)
    println(joinToString(list, " | ", "< ", " >"))

    val macbooks = listOf("MacBook Air 13 M1", "MacBook Pro 16 M1 Pro", "MacBook Air 15 M4")
    println(
        joinToString(collection = macbooks, prefix = "\"", postfix = "\"", separator = " / ")
    )
}