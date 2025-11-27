package ch03_functions.strings

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