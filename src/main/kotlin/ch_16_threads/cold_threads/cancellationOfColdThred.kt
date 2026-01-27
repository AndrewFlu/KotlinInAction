package ch_16_threads.cold_threads

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

val counterFlow = flow {
    var x = 0
    while(true) {
        emit(x++)
        delay(1.seconds)
    }
}

fun main() {
    runBlocking {
        val collector = launch {
            counterFlow.collect {
                println(it)
            }
        }
        delay(5.seconds)
        collector.cancel()
    }
}