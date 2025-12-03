package ch04_classes_interfaces.override_methods

class Customer(val name: String, val postalCode: String) {

    override fun toString(): String {
        return "Customer(name=$name, postalCode=$postalCode)"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Customer)
            return false
        return name == other.name && postalCode == other.postalCode
    }
}

fun main() {
    val zhenya1 = Customer("Zhenya", "Yo, Uraeva 6b")
    val zhenya2 = Customer("Zhenya", "Yo, Uraeva 6b")

    println(zhenya1 == zhenya2)
}
