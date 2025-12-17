package ch_08_basic_types_collections_arrays.primitives

data class Person(val name: String, val age: Int? = null) {

    fun isOlderThen(other: Person): Boolean? {
        if (other.age == null || age == null)
            return null
        return age > other.age
    }
}

fun main() {
    println(Person("Marty", 5).isOlderThen(Person("Alex", 7)))
    println(Person("Marty", 5).isOlderThen(Person("Skipper")))
}