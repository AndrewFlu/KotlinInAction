package ch_14_coroutines.coroutines_constructors

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

private var startTime = System.currentTimeMillis()

fun log(message: Any?) =
    println("Прошло времени со старта программы: ${System.currentTimeMillis() - startTime} \n" +
            "Thread: ${Thread.currentThread().name} \n" +
            "Message: $message\n")

fun main() {
    runBlocking {
        log("Стартует первая, главная корутина")
        launch {
            log("Стартует вторая корутина. Готова к приостановке")
            delay(100.milliseconds)
            log("Вторая корутина восстановила свою работу")
        }
        launch {
            log("Третья корутина может выполняться в то же время")
        }
        log("Первая корутина запустила 2 других корутины")
    }
}