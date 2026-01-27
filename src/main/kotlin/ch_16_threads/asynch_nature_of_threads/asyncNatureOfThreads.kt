package ch_16_threads.asynch_nature_of_threads

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

fun createValues(): Flow<Int> {
    return flow {
        emit(1)
        delay(1.seconds)
        emit(2)
        delay(1.seconds)
        emit(3)
        delay(1.seconds)
        emit(4)
        delay(1.seconds)
    }
}

fun main() {
    runBlocking {
        val values = createValues()
        values.collect { log(it) }
    }
}