package ch_07_nullable.platform_types

fun yellAtPerson(person: Person) {
    println((person.name ?: "Anyone").uppercase() + "!!!")
}

fun main() {
    yellAtPerson(Person("Vasiliy"))
    yellAtPerson(Person(null))
}