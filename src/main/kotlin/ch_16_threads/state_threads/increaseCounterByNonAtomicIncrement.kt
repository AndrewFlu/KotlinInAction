package ch_16_threads.state_threads

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val viewCounter = ViewCounter()
    runBlocking(Dispatchers.Default) {
        repeat(10_000) {
            launch {
                viewCounter.incrementNonAtomic()
            }
        }
    }

    println(viewCounter.counter.value)
}