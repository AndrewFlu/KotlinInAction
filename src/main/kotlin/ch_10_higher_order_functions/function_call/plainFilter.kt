package ch_10_higher_order_functions.function_call

fun String.filter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@filter) // посимвольный перебор входящей строки
            if (predicate(char))
                append(char) // вызов фукнкции, переданной в качестве аргумента для параметра предиката
    }
}

fun main() {
    println("abcd12345efghij67890klmnopqrstuvwxuz".filter { it in 'a'..'z' })
}