package ch02.language_bases

fun main() {
    val mike = Person("Mike", true);
    println("name: ${mike.name}")
    println("is student?: ${mike.isStudent}")
    mike.isStudent = false
    println("is student?: ${mike.isStudent}")
}