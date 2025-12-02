package ch04_classes_interfaces.interface_properties

class SocialUser(val accountId: Int) : User {

    override val nickname = getNameFromSocialNetwork(accountId) // инициализатор свойства

    fun getNameFromSocialNetwork(accountId: Int) = "kodee$accountId"
}