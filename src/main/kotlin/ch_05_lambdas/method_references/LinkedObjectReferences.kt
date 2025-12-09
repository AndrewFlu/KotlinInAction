package ch_05_lambdas.method_references

fun main() {
    val sebastian = Person("Sebastian", 26)
    val personsAgeFunction = Person::age // ссылка на член для возврата возраста переданного в аргументе человека
    println(personsAgeFunction(sebastian))

    val sebastianAgeFunction = sebastian::age // ссылка на член возвращает возраст КОНКРЕТНОГО человека
    println(sebastianAgeFunction()) // связана с определённым человеком и не принимает аргументов

}