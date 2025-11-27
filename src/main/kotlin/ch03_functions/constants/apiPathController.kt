package ch03_functions.constants

const val BASE = "https://sber.ru"
const val SEPARATOR = "/"
const val OPERATIONS = BASE + SEPARATOR + "operations"


fun main() {
    println("Web-API URL for all operations: $OPERATIONS")
}