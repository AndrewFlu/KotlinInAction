package ch_06_collections.filter_map

import ch_05_lambdas.basics.People
import ch_05_lambdas.method_references.Person

fun main() {
    val people = listOf(People("Alice", 15), People("Robert", 20), People("Mike", 21))
    println("Совершеннолетние: ${people.filter { it.age > 18 }}")

    val income = listOf(400, 45, 1300)
    println("После вычета НДФЛ 18%: ${income.map { it * 0.82 }}")

    println("Имена: ${people.map(People::name)}")

    println("Имена совершеннолетних: ${people.filter { it.age >= 18 }.map { it.name }}")

    println("Самый большой возраст в списке: ${people.maxByOrNull(People::age)?.age}")

    // неоптимальная функция: поиск будет выполняться для КАЖДОГО элемента в коллекции
    val unoptimizedOldestPerson = people.filter {
        val oldestPerson = people.maxByOrNull(People::age)
        it.age == oldestPerson?.age
    }
    println("Самый старший человек: ${unoptimizedOldestPerson}")

    // оптимальный код: вычисляет максимальный возраст всего оддин раз
    val maxAge = people.maxByOrNull(People::age)?.age
    val oldestPerson = people.filter { it.age == maxAge }
    println("Самый старший человек: ${oldestPerson}")

}