package ch_05_lambdas.basics

fun main() {
    val girls = listOf(
        People("Nastya", 35),
        People("Olga", 39),
        People("Julia", 37),
    )

    println(girls.minByOrNull ({ girl: People -> girl.age })) // 1. Базовая конструкция с лямбдой в круглых скобках
    println(girls.minByOrNull() { girl: People -> girl.age }) // 2. Выносим лямбду за скобки
    println(girls.minByOrNull { girl: People -> girl.age }) // 3. Убираем круглые скобки
    println(girls.minByOrNull { girl -> girl.age }) // 4. Убираем тип
    println(girls.minByOrNull { it.age }) // 4. Используем скрытое имя it для единственного параметра лямбды
    println(girls.minByOrNull(People::age)) // 5. Используем ссылку на член без вызова
}