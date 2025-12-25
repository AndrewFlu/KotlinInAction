package ch_09_operators.delegates.observers

class Person(name: String, val age: Int, salary: Int): Observable() {
    var name by ObservableProperty(name, this)

    var salary by ObservableProperty(salary, this)
}