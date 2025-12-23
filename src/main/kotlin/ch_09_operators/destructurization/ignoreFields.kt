package ch_09_operators.destructurization

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val city: String,
)

fun introducePerson(person: Person) {
//    val (firstName, lastName, age, city) = person
    val (firstName, _, age) = person // оптимизация деструктуризации: последний аргумент не указан, промежуточный проигнорирован с помощью '_'
    println("This is $firstName, aged $age")
}

fun main() {
    val robert = Person("Robert", "Kiyosaki", 65, "Ney-York")
    introducePerson(robert)
}