package error_handling_and_testing.error_handling.coroutine_exception_handler

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

class ComponnentWithScope(dispatcher: CoroutineDispatcher = Dispatchers.Default) {
    private val exceptionHandler = CoroutineExceptionHandler{ _, throwable -> println("[ERROR] ${throwable.message}")}

    private val scope = CoroutineScope(SupervisorJob() + dispatcher + exceptionHandler)

    fun action() {
        // базовой корутиной является launch
        scope.launch {
            async {
                throw UnsupportedOperationException("Throw USO exception")
            }
        }
    }
}

fun main() {
    runBlocking {
        val supervisor = ComponnentWithScope()
        supervisor.action()
        delay(1.seconds)
    }
}