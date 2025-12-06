package ch04_classes_interfaces.companion

class Person(val name: String) {

    // объявление объекта-компаньона с именем Loader
    companion object Loader {
        fun fromJson(json: String): Person {
            val substringAfter = json.substringAfter("name")
            val name = substringAfter.replace("[^A-Za-zА-Яа-яЁё]+".toRegex(), "")
            return Person(name)
        }
    }
}

fun main() {
    val person = Person.Loader.fromJson(
        """
        {
            "name": "Robert"
        }
    """.trimIndent()
    )
    println(person.name)
}