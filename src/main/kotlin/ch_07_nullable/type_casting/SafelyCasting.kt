package ch_07_nullable.type_casting

class Person(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val person1 = Person("Mark", "Yurich")
    val person2 = Person("Mark", "Yurich")

    val person3 = Person("Viktor", "Yurich")

    println("person1 == person2: ${person1 == person2}")
    println("person1.equals(person2): ${person1.equals(person2)}")
    println("person1.equals(person3): ${person1.equals(person3)}")
}