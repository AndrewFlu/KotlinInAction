package ch_17_thread_operators.debaunce

import ch_10_higher_order_functions.refactoring_by_lambdas.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

val searchQuery = flow {
    emit("k")
    delay(100.milliseconds)
    emit("kot")
    delay(155.milliseconds)
    emit("kotl")
    delay(255.milliseconds)
    emit("Java")
    delay(450.milliseconds)
}

fun main() = runBlocking {
    searchQuery
        .debounce(250.milliseconds)
        .collect {
            println("Send search request for: [$it]")
        }
}
