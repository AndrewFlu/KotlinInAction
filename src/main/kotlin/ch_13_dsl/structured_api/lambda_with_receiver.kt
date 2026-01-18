package ch_13_dsl.structured_api

fun buildString(builderAction: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    builderAction(sb) // передача экземпляра StringBuilder в качестве аргумента в лямбду
    return sb.toString()
}

fun main() {
    val s = buildString {
        it.append("MacBook ")
        it.append("Pro 16 ")
        it.append("M1 Pro")
    }
    println(s)
}