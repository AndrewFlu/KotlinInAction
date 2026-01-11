package ch_12_annotations_and_reflection.reflection_api

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Juran", 41)
    val personKClass = person::class // получаем экземпляр KClass<out Person>

    println(personKClass.simpleName)
    personKClass.members.forEach{ println(it.name) }
}