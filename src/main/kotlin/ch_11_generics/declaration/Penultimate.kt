package ch_11_generics.declaration

// обобщённое свойство-расширение можно вызвать для любого списка
val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    val list = listOf(11, 1, 111)
    println(list.penultimate)
}