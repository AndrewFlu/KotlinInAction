package ch03_functions.local_functions

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty())
            throw IllegalArgumentException(
                "Can't save user ${id}: empty $fieldName"
            )
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
    // код сохранения данных пользователя в базе данных
}


fun main() {
    saveUser(User(1, "Robert", ""))
}
