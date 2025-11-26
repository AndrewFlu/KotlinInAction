package ch02_language_basis.loops

fun main() {
    val collection = listOf("reg", "green", "blue")
    for (color in collection) {
        print("$color ")
    }
}