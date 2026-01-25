package ch_15_structured_concyrrency.cancel_coroutines

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            repeat(5) {
                doCpuHeavyWork()
                ensureActive()
                log("Launch coroutine Done!")
            }
        }
        log("RunBlocking coroutine Done!")
    }
}
