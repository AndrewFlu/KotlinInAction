package ch_16_threads.synch_nature_of_coroutines

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

suspend fun createValues(): List<Int> {
    return buildList {
        add(1)
        delay(1.seconds)
        add(2)
        delay(1.seconds)
        add(3)
        delay(1.seconds)
    }
}

fun main() {
    runBlocking {
        val values = createValues()
        values.forEach {
            log(it) // все значения выводятся только спустя 3 секунды
        }
    }
}