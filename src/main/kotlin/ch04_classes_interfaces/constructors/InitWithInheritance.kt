package ch04_classes_interfaces.constructors

open class User(val name: String) {}

class SocialUser(nickname: String) : User(nickname)

fun main() {
    println(SocialUser("Mike").name)
}