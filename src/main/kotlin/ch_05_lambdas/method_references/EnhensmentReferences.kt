package ch_05_lambdas.method_references

fun Person.isAdult() = age >= 18
val predicate = Person::isAdult

fun main() {
    val person = Person("Olga", 39)
    println("Person ${person.name} is adult? : ${person.isAdult()}")
}