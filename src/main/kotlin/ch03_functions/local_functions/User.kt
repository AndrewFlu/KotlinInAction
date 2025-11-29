package ch03_functions.local_functions

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    // объявление локальной функции для валидации полей
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty())
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName")
    }
    // вызов локальной функции для валидация опеределённых полей
    validate(user.name, "Name")
    validate(user.address, "Address")
}

// сохранение данных пользователя в базе данных
fun main() {
    saveUser(User(2, "", ""))
}
