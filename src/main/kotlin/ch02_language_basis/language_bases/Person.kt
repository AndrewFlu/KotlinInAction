package ch02_language_basis.language_bases

/**
 * @constructor Принимает два аргумента
 * @param [name] имя пользователя
 * @param [isStudent] является ли пользователь студентом
 */
data class Person(
    val name: String,
    var isStudent: Boolean
)
