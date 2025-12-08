package ch_05_lambdas.method_references

import ch04_classes_interfaces.companion.Person

fun salute() = println("Salute!")

fun sendEmail(person: Person, message: String) {
    println("Message was sent to ${person.name}")
}

val action = { person: Person, message: String ->
    sendEmail(person, message)
}

val nextAction = ::sendEmail // ссылка на член

fun main() {
    run(::salute)

    action(Person("Anna"), "Hi!")
    nextAction(Person("Nastya"), "Come here")
}