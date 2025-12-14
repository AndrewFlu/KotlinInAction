package ch_07_nullable.nullable_types

class Address(val country: String, val city: String, val street: String, val zipCode: Int)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

// функция-расширение
fun Person.getCountry(): String {
//    val country = this.company?.address?.country // вызов операторов безопасного вызова в цепочке
//    return if (country != null) country else "unknown"

    return company?.address?.country ?: "Unknown"
}

fun main() {
    val luba = Person("Luba", null)
    val zhenya = Person("Zhenya", Company("Moneta", Address("Russia", "Yo", "Gogolya", 424000)))

    println("${luba.name} has a country: ${luba.getCountry()}")
    println("${zhenya.name} has a country: ${zhenya.getCountry()}")
}