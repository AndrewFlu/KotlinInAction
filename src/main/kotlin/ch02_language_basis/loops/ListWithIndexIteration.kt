package ch02_language_basis.loops

fun main() {
    val apartment = listOf("Первомайская 77", "Кирова 25")
    for ((index, flat) in apartment.withIndex())
        println("$index: $flat")
}