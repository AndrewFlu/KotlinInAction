package ch_11_generics.contravariant

// Ключевое слово in используется для декларации контравариантности
interface Comparator<in T> {
    fun compare(first: T, second: T): Int {
        TODO("Логика сравнения двух экземпляров")
    }
}