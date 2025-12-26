package ch_09_operators.delegates.dinamic_attributes

class DelegatedPerson {

    private val _attributes = mutableMapOf<String, String>()

    fun setAttribute(attributeKey: String, attributeValue: String) {
        _attributes[attributeKey] = attributeValue
    }
    val name: String by _attributes // использование карты как делегированного свойства
    var moto by _attributes
    var auto by _attributes
}