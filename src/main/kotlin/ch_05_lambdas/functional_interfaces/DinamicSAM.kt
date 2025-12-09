package ch_05_lambdas.functional_interfaces

fun checkCondition(i: Int, condition: IntCondition): Boolean {
    return condition.check(i)
}

fun main() {

    // функциональный интерфейс передаётся напрямую
    println(checkCondition(5, IntCondition { it % 5 != 0 }))

    val isOdd: (Int) -> Boolean = { it % 2 != 0 }

    // передаётся ссылка на лямбду с подходящей сигнатурой
    println(checkCondition(1, isOdd))
}