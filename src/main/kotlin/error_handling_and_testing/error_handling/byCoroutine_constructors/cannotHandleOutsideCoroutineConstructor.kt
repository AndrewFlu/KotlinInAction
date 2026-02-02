package error_handling_and_testing.error_handling.byCoroutine_constructors

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        try {
            // нельзя перехватить исключение, выброшенное ИЗ КОНСТРУКТОРА корутины
            launch {
                throw UnsupportedOperationException("Ouch!")
            }
        } catch (e: UnsupportedOperationException) {
            println("Handled: $e")
        }
    }
}