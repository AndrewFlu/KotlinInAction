package ch_07_nullable.elvis


class Address(val country: String, val city: String, val street: String, val zipCode: Int)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun printShippingLabel(person: Person) {
    println("${person.name} company shipping address:")
    val address = person.company?.address ?: throw IllegalArgumentException("No address")

    with(address) {
        println(country)
        println("$city $street $zipCode")
    }
}

fun main() {
    val monetaAddress = Address("RU", "Yo", "Gogolya", 424000)
    val moneta = Company("Moneta LLC", monetaAddress)
    val juran = Person("Juran", moneta)

    printShippingLabel(juran)

    printShippingLabel(Person("Alexey Kazarinov", null))

}

