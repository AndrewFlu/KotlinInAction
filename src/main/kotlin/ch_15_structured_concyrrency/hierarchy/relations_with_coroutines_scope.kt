package ch_15_structured_concyrrency.hierarchy

import ch_10_higher_order_functions.refactoring_by_lambdas.log
import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking<Unit> {
        log("A's job: ${coroutineContext.job}")
        coroutineScope {
            log("B's parent: ${coroutineContext.job.parent}")
            log("B's job: ${coroutineContext.job}")
            launch {
                log("C's parent: ${coroutineContext.job.parent}")
            }
        }
    }
}