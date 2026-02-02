package error_handling_and_testing.error_handling.inside_coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            try {
                throw UnsupportedOperationException("Ouch!")
            } catch (e: UnsupportedOperationException) {
                println("Handled: $e")
            }
        }
    }
}