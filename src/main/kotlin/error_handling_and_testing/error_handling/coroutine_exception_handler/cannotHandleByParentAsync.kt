package error_handling_and_testing.error_handling.coroutine_exception_handler

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

class ComponentWithScopeByAsync(dispatcher: CoroutineDispatcher = Dispatchers.Default) {

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        println("[ERROR] ${throwable.message}")
    }

    private val scope = CoroutineScope(SupervisorJob() + dispatcher + exceptionHandler)

    fun action(): Deferred<Unit> {
        // базовой корутиной явзяется async
        return scope.async {
            launch {
                throw UnsupportedOperationException("Throw USO exception")
            }
        }
    }
}

fun main() {
    runBlocking {
        val supervisor = ComponentWithScopeByAsync()
        supervisor.action()
        delay(1.seconds)
    }
}