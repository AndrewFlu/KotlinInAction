package ch_15_structured_concyrrency.hierarchy

import ch_10_higher_order_functions.refactoring_by_lambdas.log
import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {
        launch {
            delay(1.seconds)
            launch {
                delay(250.milliseconds)
                log("Child of 'Child 1' Done")
            }
            log("Child 1 Done")
        }
        launch {
            delay(500.milliseconds)
            log("Child 2 Done")
        }
        log("Base coroutine Done!")
    }
}