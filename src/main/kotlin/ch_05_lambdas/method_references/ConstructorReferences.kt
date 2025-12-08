package ch_05_lambdas.method_references

data class Person(val name: String, val age: Int)

fun main() {
    val createPerson = ::Person

    val p = createPerson("Elena", 37)
    println(p)
}