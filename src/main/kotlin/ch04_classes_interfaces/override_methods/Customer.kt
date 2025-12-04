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

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode.hashCode()

    fun copy(name: String = this.name, postalCode: String = this.postalCode) =
        Customer(name, postalCode)
}

fun main() {
    val zhenya1 = Customer("Zhenya", "Yo, Uraeva 6b")
    val zhenya2 = Customer("Zhenya", "Yo, Uraeva 6b")
    val hipstersSet = hashSetOf(zhenya1)

    println(zhenya1)
    println(zhenya2)
    println("zhenya1 == zhenya2: ${zhenya1 == zhenya2}")
    println("hipstersSet contains zhenya2: ${hipstersSet.contains(zhenya2)}")
    println()

    println(zhenya1.copy(postalCode = "Yo, Petrova 22"))
}
