package ch_09_operators.delegates.observers

open class Observable {
    val observers = mutableListOf<Observer>()

    fun notifyObservers(propName: String, oldValue: Any?, newValue: Any?) {
        for (obs in observers)
            obs.onChange(propName, oldValue, newValue)
    }
}