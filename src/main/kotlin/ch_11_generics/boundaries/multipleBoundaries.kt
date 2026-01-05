package ch_11_generics.boundaries

fun <T> ensureTrailingPeriod(sequence: T) where T: CharSequence, T: Appendable {
    if (!sequence.endsWith('.')) // функция-расширение для интерфейса CharSequence
        sequence.append('.') // метод интерфейса Appendable
}

fun main() {
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}