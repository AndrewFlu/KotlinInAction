package ch02.range

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '1'..'9'

fun main() {
    println(isLetter('y'))
    println(isNotDigit('7'))
    println(isNotDigit('q'))

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}