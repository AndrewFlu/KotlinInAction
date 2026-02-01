package ch_17_thread_operators.conflate

import ch_14_coroutines.coroutines_constructors.log
import ch_16_threads.hot_threads.getTemperatures
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {
        val temps = getTemperatures()
        temps
            .onEach { log("Read from sensor: $it") }
            .conflate()
            .collect {
                log("Collected: $it")
                delay(1.seconds)
            }

    }
}