package ch_10_higher_order_functions.default_value

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() } // переметр, у которого тип = функция. Есть значение по умолчанию (лямбда)
): String {
    var result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0)
            result.append(separator)
        result.append(transform(element))
    }

    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("alpha", "beta")
    println(letters.joinToString()) // функция преобразования с дефолтными параметрами
    println(letters.joinToString { it.uppercase() }) // передача лямбды в качестве аргумента
    println(letters.joinToString(separator = " / ", postfix = "! ", transform = { it + " star"})) // использование именованных аргументов
}