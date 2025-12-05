package ch04_classes_interfaces.factory

// первичный конструктор помечен private: его нельзя вызвать за пределами класса
class User private constructor(val nickname: String) {

    // объявление объекта-компаньона
    companion object {
        // фабрика 1
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        // фабрика 2
        fun newSocialUser(accountId: Int) =
            User(getSocialNetworkName(accountId))
    }

    override fun toString(): String {
        return "User(nickname='$nickname')"
    }

}

private fun getSocialNetworkName(socialAccountId: Int): String {
    return "Starikov VK account"
}

fun main() {
    val socialUser = User.newSocialUser(123450105)
    val subscribingUser = User.newSubscribingUser("strsv@yandex.ru")

    println(socialUser)
    println(subscribingUser)
}
