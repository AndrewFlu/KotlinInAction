package ch_09_operators.comparable

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::lastName)
    }
}

fun main() {
    val zhenya = Person("Zhenya", "Starikov")
    val juran = Person("Juran", "Bahtin")

    println(juran > zhenya)

    // сравнение строк
    println("Air" < "Pro")
}