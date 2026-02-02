package error_handling_and_testing.error_handling.cancel_coroutine_policy.by_job

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {

        // coroutine 1
        launch {
            try {
                while (true) {
                    println("Transmitting data")
                    delay(250.milliseconds)
                }
            } catch (ex: Exception) {
                println("Transmitting data terminated: $ex")
                throw ex
            }
        }

        // coroutine 2
        launch {
            try {
                delay(1.seconds)
                throw UnsupportedOperationException("Coroutine 2 doesn't support operation")
            } catch (ue: UnsupportedOperationException) {
                println("Caught: $ue")
            }
        }
    }
}