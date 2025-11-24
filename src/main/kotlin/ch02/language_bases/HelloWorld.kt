package ch02.language_bases

fun main() {
    println("Как вас зовут?")
    val name = readln();

    println("Hello, ${ if (name.isNotBlank()) name else "Kotlin"}!")
}