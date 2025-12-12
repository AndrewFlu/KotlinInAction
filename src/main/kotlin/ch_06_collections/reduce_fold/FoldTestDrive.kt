package ch_06_collections.reduce_fold

import ch_05_lambdas.method_references.Person

fun main() {
    val people = listOf(
        Person("Mike", 33),
        Person("Robert", 34),
        Person("Kim", 24)
    )
    val foldedNames = people.fold("people: ") { acc, person ->
        acc + person.name
    }
    val runningFoldedNames = people.runningFold(initial = "", operation = {acc, person -> acc + person.name})
    println(foldedNames)
    println(runningFoldedNames)
}