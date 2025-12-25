package ch_09_operators.delegates.observers

fun interface Observer {
    fun onChange(name: String, oldValue: Any?, newValue: Any?)
}
