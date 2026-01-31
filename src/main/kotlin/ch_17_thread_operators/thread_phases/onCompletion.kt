package ch_17_thread_operators.thread_phases

import ch_16_threads.hot_threads.getTemperatures
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val temps = getTemperatures()
        temps
            .take(5)
            .onCompletion { cause ->
                if (cause != null)
                    println("An error occurred: $cause")
                else
                    println("Completed")
            }
            .collect {
                println(it)
            }
    }
}