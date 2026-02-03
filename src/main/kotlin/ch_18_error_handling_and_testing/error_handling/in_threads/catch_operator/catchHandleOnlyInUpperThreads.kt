package ch_18_error_handling_and_testing.error_handling.in_threads.catch_operator

import ch_18_error_handling_and_testing.error_handling.in_threads.exceptionalFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        exceptionalFlow
            .map { it + 1 }
            .catch { cause -> println("Handled: $cause") }
            .onEach { throw RuntimeException("Runtime Exception") }
            .collect({})
    }
}