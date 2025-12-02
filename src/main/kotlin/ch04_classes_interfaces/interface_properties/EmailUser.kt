package ch04_classes_interfaces.interface_properties

interface EmailUser {
    val email: String
    val nickname: String
        get() = email.substringBefore('@') // у свойства нет теневого поля — итоговое значение вычисляется при каждом доступе
}