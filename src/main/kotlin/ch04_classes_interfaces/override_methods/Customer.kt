package ch04_classes_interfaces.override_methods

class Customer(val name: String, val postalCode: String) {

    override fun toString(): String {
        return "Customer(name=$name, postalCode=$postalCode)"
    }
}

fun main() {
    val zhenya = Customer("Zhenya", "Yo, Uraeva 6b")
    println(zhenya)
}
