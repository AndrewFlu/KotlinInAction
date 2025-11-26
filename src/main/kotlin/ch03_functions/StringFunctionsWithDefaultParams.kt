package ch03_functions

fun <T> joinToStringWithDefaultParams(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
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
    val colleges = listOf("Viktor", "Mike", "Artem")
    println(colleges)
}