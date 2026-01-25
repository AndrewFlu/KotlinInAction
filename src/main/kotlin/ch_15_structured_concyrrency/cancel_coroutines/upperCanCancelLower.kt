package ch_15_structured_concyrrency.cancel_coroutines

import ch_10_higher_order_functions.refactoring_by_lambdas.log
import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    runBlocking {
        val coroutine_2 = launch {
            launch {
                launch {
                    launch {
                        log("Coroutine_5 started")
                        delay(500.milliseconds)
                        log("Coroutine_5 Done!")
                    }
                }
            }
        }

        delay(250.milliseconds)
        coroutine_2.cancel()
        println("Upper Coroutine_2 cancelled and their lower correspondently")
    }
}