package ch04_classes_interfaces.companion.fabric_methods

class Person(val name: String) {

    companion object : JSONFactory<Person> {
        override fun fromJSON(json: String): Person {
            val substringAfter = json.substringAfter("name")
            val name = substringAfter.replace("[^A-Za-zА-Яа-яЁё]+".toRegex(), "")
            return Person(name)
        }
    }
}