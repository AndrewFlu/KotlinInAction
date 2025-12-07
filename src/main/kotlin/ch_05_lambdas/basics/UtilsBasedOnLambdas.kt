package ch_05_lambdas.basics

fun main() {
    val sum = { x: Double, y: Double -> x + y }
    val ndfl_18 = { income: Double -> income - (income / 100 * 18) }

    val salary = 100_000.0
    val passive_income = 10_000.0
    println("Оклад: ${salary}, после вычета НДФЛ (18%): ${ndfl_18(salary)}")
    println("Общий доход: ${sum(passive_income, ndfl_18(salary))}")

    run { println("Lambda with 'run' operator")}
}