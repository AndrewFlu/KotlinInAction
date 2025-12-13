package ch_06_collections.sequence

import ch_05_lambdas.method_references.Person

fun main() {
    val persons = listOf(
        Person("Robert", 67),
        Person("Mike", 67),
        Person("Kim", 57),
        Person("Andrew", 37),
        Person("Zhenya", 38),
        Person("Alex", 47)
    )
    // создаётся две промежуточных коллекции (результат map() и результат filter())
    println(persons.map { it.name }.filter { it.startsWith("A") })

    // оптимизированное выччисление, благодаря отложенному выполнению
    println(persons.asSequence().map { it.name }.filter { it.startsWith("A") }.toList())

}