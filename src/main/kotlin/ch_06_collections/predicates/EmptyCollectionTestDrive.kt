package ch_06_collections.predicates

fun main() {
    val emptyCollection = emptyList<Int>()
    println("Пустая коллекция содержит какое-либо число, больше 11? : ${emptyCollection.any{ it > 11}}")
    println("В пустой коллекции нет ни одного числа, что больше 11? : ${emptyCollection.none{ it > 11}}")
    println("В пустой коллекции каждый элемент больше 11? : ${emptyCollection.all{ it > 11}}")
}