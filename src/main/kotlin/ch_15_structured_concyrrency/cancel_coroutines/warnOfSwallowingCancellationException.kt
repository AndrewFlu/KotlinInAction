package ch_15_structured_concyrrency.cancel_coroutines

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

suspend fun doSomeWork() {
    delay(500.milliseconds)
    throw UnsupportedOperationException("This action do not allowed")
}

fun main() {
    runBlocking {
        withTimeoutOrNull(2.seconds) {
            while(true) {
                try {
                    doSomeWork()
                }
                // перехват более узкого типа исключения позволяет корректно отменить действие корутины
                catch (ex: UnsupportedOperationException) {
                    println(ex)
                }
                // а перехват верхнего типа "проглатывает" специализированное исключение и не позволяет корректно отменить работу корутины
//                catch (e: Exception) {
//                    println("Cancellation exception swallowed. exception: $e")
//                }
            }
        }
    }
}