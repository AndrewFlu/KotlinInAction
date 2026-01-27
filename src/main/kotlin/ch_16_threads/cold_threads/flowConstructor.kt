package ch_16_threads.cold_threads

import ch_10_higher_order_functions.refactoring_by_lambdas.log
import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    val letters = flow {
        log("Emitting A")
        emit("A")
        delay(250.milliseconds)
        log("Emitting B")
        emit("B")
    }
}