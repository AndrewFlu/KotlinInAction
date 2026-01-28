package ch_16_threads.cold_threads

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

suspend fun getRandomNumber(): Int {
    delay(500.milliseconds)
    return Random.nextInt()
}

val randomNumbers = flow {
    repeat(10) {
        emit(getRandomNumber())
    }
}

// Exception in thread "main" java.lang.IllegalStateException: Flow invariant is violated:
//		Emission from another coroutine is detected.
//val randomNumbers = flow {
//    coroutineScope {
//        repeat(10) {
//            launch {
//                emit(getRandomNumber())
//            }
//        }
//    }
//}

fun main() {
    runBlocking {
        randomNumbers.collect {
            println(it)
        }
    }
}