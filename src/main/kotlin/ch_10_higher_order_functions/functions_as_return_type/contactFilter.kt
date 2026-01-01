package ch_10_higher_order_functions.functions_as_return_type

data class Person(
    val firstName: String,
    val lastName: String,
    val phone: String?
)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix) }
        if (!onlyWithPhoneNumber)
            return startsWithPrefix // возврат переменной типа Функция
        return { startsWithPrefix(it) && it.phone != null }
    }
}

fun main() {
    val contacts = listOf(
        Person("Juran", "Bahtin", "+79075070107"),
        Person("Zhenya", "Starikov", "+79251000105"),
        Person("Anatoly", "Sidorkin", null)
    )

    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Ju"
        onlyWithPhoneNumber = true
    }

    println(contacts.filter(contactListFilters.getPredicate()))

}