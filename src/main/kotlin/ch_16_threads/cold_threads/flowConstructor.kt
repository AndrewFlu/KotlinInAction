package ch_16_threads.cold_threads

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

val letters = flow {
    log("Emitting A")
    emit("A")
    delay(250.milliseconds)
    log("Emitting B")
    emit("B")
}

fun main() {
    runBlocking {
        letters.collect {
            log("Collecting $it")
            delay(500.milliseconds)
        }
    }
}