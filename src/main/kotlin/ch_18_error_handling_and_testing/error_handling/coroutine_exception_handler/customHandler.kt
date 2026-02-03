package ch_18_error_handling_and_testing.error_handling.coroutine_exception_handler

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {
        val supervisor = ComponentWithScope()
        supervisor.action()
        delay(1.seconds)
    }
}

class ComponentWithScope(dispatcher: CoroutineDispatcher = Dispatchers.Default) {
    private val exceptionHandler = CoroutineExceptionHandler {
        _, e -> println("[ERROR] ${e.message}")
    }

    private val scope = CoroutineScope(SupervisorJob() + dispatcher + exceptionHandler)

    fun action() = scope.launch {
        throw UnsupportedOperationException("Ouch!")
    }

}
