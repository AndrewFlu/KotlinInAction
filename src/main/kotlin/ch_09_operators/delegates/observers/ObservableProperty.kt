package ch_09_operators.delegates.observers

import kotlin.reflect.KProperty

class ObservableProperty (
    var propValue: Any,
    val observable: Observable
) {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): Any = propValue

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: Any) {
        val oldValue = propValue
        propValue = newValue
        observable.notifyObservers(prop.name, oldValue, newValue)
    }
}