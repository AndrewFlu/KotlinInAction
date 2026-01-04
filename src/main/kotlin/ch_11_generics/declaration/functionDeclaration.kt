package ch_11_generics.declaration

fun main() {
    val letters = listOf('a', 'b', 'c')
    println(letters.slice(0..2)) // автоматическое выведение типа
    println(letters.slice<Char>(0..2)) // явное объявление типа
}