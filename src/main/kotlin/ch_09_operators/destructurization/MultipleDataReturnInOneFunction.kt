package ch_09_operators.destructurization

// объявление класса данных для хранения значений
data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)

    return NameComponents(name, extension) // возврат экземпляра данных из функции
}

fun main() {
    val (name, ext) = splitFileName("example.kt") // использование деструктуризации для распаковки класса
    println(name)
    println(ext)
}