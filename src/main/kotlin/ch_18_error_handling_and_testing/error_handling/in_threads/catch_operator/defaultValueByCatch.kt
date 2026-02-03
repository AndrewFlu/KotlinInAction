package ch_18_error_handling_and_testing.error_handling.in_threads.catch_operator

import ch_18_error_handling_and_testing.error_handling.in_threads.exceptionalFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        exceptionalFlow
            .catch { cause ->
                println("Handled: $cause")
                emit(-1) // значение по умолчанию в случае перехвата исключения
            }
            .collect {
                println("$it ")
            }
    }
}