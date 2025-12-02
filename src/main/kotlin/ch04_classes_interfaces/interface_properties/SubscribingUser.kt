package ch04_classes_interfaces.interface_properties

class SubscribingUser(val email: String) : User {

    override val nickname: String
        get() = email.substringBefore('@') // пользовательский геттер
}