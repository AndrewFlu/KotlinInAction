package ch_09_operators.delegates.observers

class ObservableProperty (
    val propName: String,
    var propValue: Any,
    val observable: Observable
) {
    fun getValue(): Any = propValue
    fun setValue(newValue: Any) {
        val oldValue = propValue
        propValue = newValue
        observable.notifyObservers(propName, oldValue, newValue)
    }
}