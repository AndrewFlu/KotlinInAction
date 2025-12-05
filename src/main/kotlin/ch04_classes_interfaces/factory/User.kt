package ch04_classes_interfaces.factory

class User {
    val nickname: String

    // вторичные конструкторы
    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(socialAccountId: Int) {
        nickname = getSocialNetworkName(socialAccountId)
    }

    private fun getSocialNetworkName(socialAccountId: Int): String {
        TODO("Not yet implemented")
    }
}