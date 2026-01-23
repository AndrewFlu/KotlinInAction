package ch_15_structured_concyrrency.coroutineScope

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

fun main() {
    runBlocking {
        computeSum()
    }
}

private suspend fun computeSum() {
    log("Computing a sum...")
    val sum = coroutineScope {
        val a = async { generateValueWithDelay() }
        val b = async { generateValueWithDelay() }
        a.await() + b.await()
    }
    log("Sum is $sum")

}

private suspend fun generateValueWithDelay(): Int {
    delay(500.milliseconds)
    val nextInt = Random.nextInt(0, 10)
    log("Generated: $nextInt")
    return nextInt
}
