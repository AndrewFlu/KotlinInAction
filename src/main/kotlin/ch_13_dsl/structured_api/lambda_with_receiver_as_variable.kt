package ch_13_dsl.structured_api

val appendChip: StringBuilder.() -> Unit = {
    this.append("M1 Pro")
}

fun main() {
    val sb = StringBuilder("MacBook Air ")
    sb.appendChip() // переменную можно вызывать как функцию-расширение
    println(sb)

    println(buildString(appendChip)) // можно передавать переменную в качестве аргумента
}