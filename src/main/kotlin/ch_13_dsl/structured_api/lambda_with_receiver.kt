package ch_13_dsl.structured_api

// вариант функции,принимающей лямбду
fun buildString(builderAction: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    builderAction(sb) // передача экземпляра StringBuilder в качестве аргумента в лямбду
    return sb.toString()
}

// вариант той же функции, только на основе лямбды с приёмником
fun buildString2(builderAction: StringBuilder.() -> Unit): String { // объявление праметра типа функции с приёмником
    val sb = StringBuilder()
    sb.builderAction() // передача экземпляра StringBuilder в качестве приёмника в лямбду
    return sb.toString()
}

fun main() {
    val s = buildString {
        it.append("MacBook ")
        it.append("Pro 16 ")
        it.append("M1 Pro")
    }
    println(s)

    val x = buildString2 {
        this.append("Windows ") // можно сослаться на this — указатель на экземпляр StringBuilder
        append("10") // а можно не указывать this и ссылаться на StringBuilder
    }
    println(x)
}