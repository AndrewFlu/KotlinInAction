package ch_18_error_handling_and_testing.error_handling.cancel_coroutine_policy.by_supervisor_job

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {
        // declare supervisor scope
        supervisorScope {
            // coroutine 1
            launch {
                try {
                    while (true) {
                        println("Transmitting data!")
                        delay(250.milliseconds)
                    }
                } catch (ex: Exception) {
                    println("Transmitting date interrupted: $ex")
                    throw ex
                }
            }

            // coroutine 2
            launch {
                delay(1.seconds)
                throw UnsupportedOperationException("Ouch!")
            }
        }
    }
}