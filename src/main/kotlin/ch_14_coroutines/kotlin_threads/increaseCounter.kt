package ch_14_coroutines.kotlin_threads

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.time.Duration.Companion.seconds

private const val REPEAT_TIMES = 5_000

fun main() {

    runBlocking {
        // запускает одну корутину на многопоточном диспетчере по умолчанию
        launch(Dispatchers.Default) {
            var x = 0
            repeat(REPEAT_TIMES) {
                x++
            }
            println("Result by single coroutines: $x")
        }
    }

    runBlocking {
        var x = 0
        repeat(REPEAT_TIMES) {
            // запуск корутин для многопоточного диспетчера по умолчанию
            launch(Dispatchers.Default) {
                x++
            }
        }
        delay(1.seconds)
        println("Result by multiple coroutines without locking: $x")
    }

    runBlocking {
        val mutex = Mutex()
        var x = 0
        repeat(REPEAT_TIMES) {
            launch(Dispatchers.Default) {
                mutex.withLock {
                    x++ }
            }
        }
        delay(1.seconds)
        println("Result by multiple coroutines with locking (mutex): $x")
    }
}