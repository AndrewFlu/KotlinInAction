package ch_15_structured_concyrrency.CoroutineScope_upper

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

class ComponentWithScope(dispatcher: CoroutineDispatcher = Dispatchers.Default) {

    private val scope = CoroutineScope(dispatcher + SupervisorJob())

    fun start() {
        log("Starting!")
        scope.launch {
            while (true) {
                delay(500.milliseconds)
                log("Component working!")
            }
        }
        scope.launch {
            log("Doing a one-off task...")
            delay(500.milliseconds)
            log("Task done!")
        }
    }

    fun stop() {
        log("Stopping!")
        scope.cancel()
    }
}


fun main() {
    val component = ComponentWithScope()
    component.start()
    Thread.sleep(2_000)
    component.stop()
}