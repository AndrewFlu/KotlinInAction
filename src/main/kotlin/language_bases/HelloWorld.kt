package language_bases

fun main() {
    println("Как вас зовут?")
    val input = readln();
    val name = if(input.isNotBlank()) input else "Kotlin"

    println("Hello, $name! You have an ${name.length}-letter name! :)")
}