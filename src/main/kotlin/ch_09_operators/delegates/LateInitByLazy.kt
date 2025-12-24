package ch_09_operators.delegates

fun loadEmails(person: PersonByLazy): List<Email> {
    println("Load emails for ${person.name}")

    return listOf(/* ... */)
}

class PersonByLazy (val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun main() {
    val person = PersonByLazy("Juran")
    person.emails // первое обращение — выполняется считывание
    person.emails // второе обращение — считывание уже не выполняется. Возвращается значение свойства, записанное при первом обращении
}
