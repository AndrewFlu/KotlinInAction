package ch_10_higher_order_functions.closures

data class Person(val name: String, val age: Int)


fun findZhenya(people: List<Person>) {
    for (person in people) {
        if (person.name == "Zhenya") {
            println("Found!")
            return
        }
    }
    println("Zhenya is not found!")
}

fun main() {
val people = listOf(Person("Juran", 42), Person("Zhenya", 38))
    findZhenya(people)
}