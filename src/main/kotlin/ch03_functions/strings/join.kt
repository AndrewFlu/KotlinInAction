@file:JvmName("StringUtils")

package ch03_functions.strings

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0)
            result.append(separator) // перед первым элементом разделитель не добавляется
        result.append(element)
    }
    result.append(postfix)

    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {
    // функцию-расширение можно вызвать как член класса (любого класса, являющегося Collection)
    val motoCompanies = listOf("Yamaha", "Harley-Davidson", "Suzuki")
    println(motoCompanies.joinToString())

    println(motoCompanies.join(" : "))
//    println(listOf(1, 2, 3, 4, 5).join()) // doesn't work cause type mismatch
}