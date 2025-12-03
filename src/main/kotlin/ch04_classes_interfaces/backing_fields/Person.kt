package ch04_classes_interfaces.backing_fields

class Person(var birthYear: Int) {
    var ageIn2050
        get() = 2050 - birthYear
        set(value) {
            birthYear = 2050 - value
        }
}

fun main() {
    val person = Person(2000)
    println("Person will be ${person.ageIn2050} years old in 2050")
}