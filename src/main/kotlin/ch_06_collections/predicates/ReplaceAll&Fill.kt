package ch_06_collections.predicates

fun main() {
    val notes = mutableListOf("MacBook Pro 16 M1 Pro", "MacBook Air 15", "MacBook Pro 14 M4")
    println(notes)

    notes.replaceAll{ it.uppercase() }
    println("replaceAll(): $notes")

    notes.fill("MacBook")
    println(notes)
}