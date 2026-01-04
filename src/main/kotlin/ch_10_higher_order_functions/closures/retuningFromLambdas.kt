package ch_10_higher_order_functions.closures

data class Person(val name: String, val age: Int)


fun findZhenya(people: List<Person>) {
    for (person in people) {
        if (person.name == "Zhenya") {
            println("Found!")
            return // возврат из функции
        }
    }
    println("Zhenya is not found!")
}

fun findJuran(people: List<Person>) {
    people.forEach{
        if (it.name == "Juran") {
            println("Juran found!")
            return // возврат из функции
        }
    }
    println("Juran is not found!")

}

fun main() {
val people = listOf(Person("Juran", 42), Person("Zhenya", 38))
    findZhenya(people)
    findJuran(people)
}