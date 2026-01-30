package ch_17_thread_operators.take

import ch_14_coroutines.coroutines_constructors.log
import ch_16_threads.hot_threads.getTemperatures
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

fun main() {
    val temps = getTemperatures()
    runBlocking {
        temps
            .take(5)
            .collect { log(it) }
    }
}