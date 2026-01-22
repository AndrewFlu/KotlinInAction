package ch_14_coroutines.coroutines_constructors

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    log("Starting the async computation")
    // запуска новой корутины для каждого вызова async
    val firstDeferredNumber = async { slowlyAddNumbers(5, 2) }
    val secondDeferredNumber = async { slowlyAddNumbers(2, 7) }
    log("Waiting for deferred value to be available")

    log("The first result: ${firstDeferredNumber.await()}")
    log("The second result: ${secondDeferredNumber.await()}")
}

private suspend fun slowlyAddNumbers(a: Int, b: Int): Int {
    log("Waiting a bit before calculating $a + $b")
    delay(100.milliseconds * a)
    return a + b
}
