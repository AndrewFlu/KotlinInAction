package ch04_classes_interfaces.access_modificators

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val counter = LengthCounter()
    val word = "MacBook"
    counter.addWord(word)
    println(
        """
            Длина слова "$word" = ${counter.counter} символов
    """.trimIndent()
    )
//    counter.counter = 5 // установить значение в поле нельзя, т.к. сеттер приватный
}