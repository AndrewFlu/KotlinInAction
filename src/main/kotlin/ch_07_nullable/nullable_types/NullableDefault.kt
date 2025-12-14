package ch_07_nullable.nullable_types

fun greet(name: String?) {
    val recipient: String = name ?: "unnamed"
    println(recipient)
}

fun main() {
    greet("Mike")
    greet(null)
}