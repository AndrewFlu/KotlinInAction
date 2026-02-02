package error_handling_and_testing.error_handling.coroutine_exception_handler

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

val intermediateHandler: CoroutineContext = CoroutineExceptionHandler { _, e ->
    println("[INTERMEDIATE] ${e.message}")
}
val topLevelHandler = CoroutineExceptionHandler { _, e ->
    println("[TOP] ${e.message}")
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(topLevelHandler) {
        launch(intermediateHandler) {
            throw UnsupportedOperationException("Doesn't support")
        }
    }
    Thread.sleep(1_000)
}