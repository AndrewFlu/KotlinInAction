package ch_15_structured_concyrrency.cancel_coroutines

import ch_10_higher_order_functions.refactoring_by_lambdas.log
import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    runBlocking {
        val launchedJob = launch {
            log("Launched job start")
            delay(1_000.milliseconds)
            log("Launched job done!")
        }

        val asyncJob = async {
            log("Async job start")
            delay(1_000.milliseconds)
            log("Async job done!")
        }

        delay(250.milliseconds)
        launchedJob.cancel()
        asyncJob.cancel()

        log("Runblocking coroutine stopped")
    }
}