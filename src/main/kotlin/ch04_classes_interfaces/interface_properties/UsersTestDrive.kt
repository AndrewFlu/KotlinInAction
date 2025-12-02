package ch04_classes_interfaces.interface_properties

fun main() {

    println(PrivateUser("kodee").nickname)

    println(SubscribingUser("test@kotlinlang.org").nickname)

    println(SocialUser(12345).nickname)
}