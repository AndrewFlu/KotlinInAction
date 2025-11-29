package ch03_functions.local_functions

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    // валидация полей продублирована
    if (user.name.isEmpty())
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty name"
        )
    if (user.address.isEmpty())
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty address"
        )
}

// сохранение данных пользователя в базе данных
fun main() {
    saveUser(User(1, "", ""))
}
