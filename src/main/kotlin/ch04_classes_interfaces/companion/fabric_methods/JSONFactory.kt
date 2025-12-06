package ch04_classes_interfaces.companion.fabric_methods

interface JSONFactory<T> {
    fun fromJSON(json: String): T
}