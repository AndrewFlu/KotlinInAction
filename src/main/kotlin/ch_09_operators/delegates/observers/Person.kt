package ch_09_operators.delegates.observers

class Person(name: String, val age: Int, salary: Int): Observable() {
    var name: String = name
        set(newValue) {
            val oldValue = field // field позволяет получить доступ к теневому полю свойства
            field = newValue
            notifyObservers("name", oldValue, newValue)
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObservers("salary", oldValue, newValue) // уведомление наблюдателей об изменении свойства
        }
}