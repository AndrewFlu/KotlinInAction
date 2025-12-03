package ch04_classes_interfaces.override_methods

data class Client(val name: String, val postalCode: Int)

fun main() {
    val yaromir = Client("Yaromir", 424000)
    val yar = Client("Yaromir", 424000)
    val viktor = Client("Viktor", 421005)

    println(yaromir)
    println("yaromir == yar ?: ${yaromir == yar}")
    println("yaromir == viktor ?: ${yaromir == viktor}")

    println("yar.hashCode() = ${yar.hashCode()}")
    println("yaromir.hashCode() = ${yaromir.hashCode()}")
    println("viktor.hashCode() = ${viktor.hashCode()}")
}