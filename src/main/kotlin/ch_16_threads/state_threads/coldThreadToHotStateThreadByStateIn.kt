package ch_16_threads.state_threads

import ch_16_threads.hot_threads.getTemperatures
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    val temps = getTemperatures()

    runBlocking {
        val tempState = temps.stateIn(this)
        println(tempState.value)

        delay(800.milliseconds)
        println(tempState.value)
    }
}