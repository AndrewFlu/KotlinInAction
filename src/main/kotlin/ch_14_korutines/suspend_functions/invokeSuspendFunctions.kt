package ch_14_korutines.suspend_functions

// модификатор suspend помечает функцию как функцию приостановки
suspend fun suspendingFunction() {}

fun main() {
// функции приостановки (suspend functions) могут быть вызваны
// только ил корутин или других функций приостановки
//    suspendingFunction()
}
