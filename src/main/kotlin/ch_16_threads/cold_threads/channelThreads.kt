package ch_16_threads.cold_threads

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

suspend fun getRandomNumber(): Int {
    delay(500.milliseconds)
    return Random.nextInt()
}

// последовательная отправка элементов в поток
//val randomNumbers = flow {
//    repeat(10) {
//        emit(getRandomNumber())
//    }
//}

// конкурентная отправка элементов в канальный поток
val randomNumbers = channelFlow { // создание нового канального потока
    repeat(10) {
        launch { // запускаем 10 разных корутин
            send(getRandomNumber()) // в каждой корутине предлагаем канальному потоку произведённое случайное число
        }
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