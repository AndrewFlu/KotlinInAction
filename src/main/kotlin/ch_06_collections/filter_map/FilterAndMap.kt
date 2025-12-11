package ch_06_collections.filter_map

import ch_05_lambdas.basics.People

fun main() {
    val people = listOf(People("Alice", 15), People("Robert", 20), People("Mike", 21))
    println("Совершеннолетние: ${people.filter { it.age > 18 }}")

    val income = listOf(400, 45, 1300)
    println("После вычета НДФЛ 18%: ${income.map { it * 0.82 }}")

    println("Имена: ${people.map(People::name)}")

    println("Имена совершеннолетних: ${people.filter { it.age >= 18 }.map { it.name }}")

    println("Самый большой возраст в списке: ${people.maxByOrNull(People::age)?.age}")
}