package error_handling_and_testing.error_handling.cancel_coroutine_policy.by_job

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {

        // child coroutine 1
        launch {
            try {
                while (true) {
                    println("Sensor data transaction")
                    delay(500.milliseconds)
                }
            } catch (e: Exception) {
                println("Data transaction terminated")
                throw e
            }
        }

        // child coroutine 2
        launch {
            delay(1.seconds)
            throw UnsupportedOperationException("Ouch!")
        }
    }
}