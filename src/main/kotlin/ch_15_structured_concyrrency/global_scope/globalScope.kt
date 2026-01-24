package ch_15_structured_concyrrency.global_scope

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    // корутина_1
    runBlocking {
        // корутина_2
        GlobalScope.launch {
            delay(1_000)
            // корутина_3
            launch {
                delay(250.milliseconds)
                log("Coroutine_3 Done!")
            }
            log("Coroutine_2 Done!")
        }

        // корутина_4
        GlobalScope.launch {
            delay(500.milliseconds)
            log("Coroutine_4 Done!")
        }
        log("Coroutine_1 Done!")
    }
}