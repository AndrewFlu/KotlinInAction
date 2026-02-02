package error_handling_and_testing.error_handling.by_coroutine_constructors

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val myDeferredInt: Deferred<Int> = async {
            throw UnsupportedOperationException("Ouch!")
        }

        try {
            val i: Int = myDeferredInt.await()
            println("i: $i")
        } catch (e: UnsupportedOperationException) {
            println("Handled: $e")
        }
    }
}