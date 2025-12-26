package ch_09_operators.delegates.dinamic_attributes

class CanonicalPerson {
    private val _attributes = mutableMapOf<String, String>()

    fun setAttribute(attributeKey: String, attributeValue: String) {
        _attributes[attributeKey] = attributeValue
    }
    var name: String
        get() = _attributes["name"]!! // извлечение атрибута из карты
        set(value) {
            _attributes["name"] = value // сохранение атрибута в карте
        }
    var moto: String
        get() = _attributes["moto"] ?: "Нет мотоцикла"
        set(value) {
            _attributes["moto"] = value
        }
}