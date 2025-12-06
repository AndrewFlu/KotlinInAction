package ch04_classes_interfaces.companion.fabric_methods

class FabricTestDrive {
    fun <T> loadFromJSON(factory: JSONFactory<T>): T {
        return TODO("Provide the return value")
    }
}

fun main() {
    FabricTestDrive().loadFromJSON(Person) // передача объекта-компаньона в функцию
}