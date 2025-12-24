package ch_09_operators.delegates

class Email {/* ... */ }

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")

    return listOf(/* ... */)
}

class Person(val name: String) {
    private var _emails: List<Email>? = null // здесь хранятся данные. К нему свойство emails делегирует задачи

    val emails: List<Email>
        get() {
            if (_emails == null)
                _emails = loadEmails(this) // загрузка данных при обращении
            return _emails!! // если данные были загружены заранее, то оператор их возвращает
        }
}

fun main() {
    val p = Person("Alice")
    p.emails // загружаются адреса (первое обращение)

    p.emails // считывается свойство, но самой загрузки не происходит
}