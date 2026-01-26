package ch_15_structured_concyrrency.yield

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun doCpuHeavyWork(): Int {
    log("Cpu working!")
    var counter = 0
    val startTime = System.currentTimeMillis()
    while (System.currentTimeMillis() < startTime + 500) {
        counter++
    }
    return counter
}

fun main() {
    runBlocking {
        launch {
            repeat(3) {
                doCpuHeavyWork()
            }
        }
        launch {
            repeat(3) {
                doCpuHeavyWork()
            }
        }
    }
}