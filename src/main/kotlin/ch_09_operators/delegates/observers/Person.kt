package ch_09_operators.delegates.observers

class Person(name: String, val age: Int, salary: Int): Observable() {
    val _name = ObservableProperty("name", name, this)
    var name: Any
        get() = _name.getValue()
        set(newValue) {
            _name.setValue(newValue)
        }

    val _salary = ObservableProperty("salary", salary, this)
    var salary: Any
        get() = _salary.getValue()
        set(newValue) {
            _salary.setValue(newValue)
        }
}