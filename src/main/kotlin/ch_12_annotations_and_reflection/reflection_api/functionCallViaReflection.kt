package ch_12_annotations_and_reflection.reflection_api

fun printEngineVolume(volume: Int) {
    println("Volume: $volume")
}

fun main() {
    val function = ::printEngineVolume // получение ссылки типа KFunction1<Int, Unit> на функцию printEngineVolume
    function.call(2_000) // вызов функции, полученной через рефлексию
}