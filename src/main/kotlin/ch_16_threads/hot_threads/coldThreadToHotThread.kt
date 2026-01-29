package ch_16_threads.hot_threads

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

fun querySensor(): Int = Random.nextInt(-10, 30)

fun getTemperatures(): Flow<Int> {
    return flow {
        while(true) {
            emit(querySensor())
            delay(500.milliseconds)
        }
    }
}

fun celsiusToFahrenheit(celsius: Int) =
    celsius * 9.0 / 5.0 + 32.0

// работа с ДВУМЯ разными холодными потоками
//fun main() {
//    val temps = getTemperatures()
//    runBlocking {
//
//        launch {
//            temps.collect { log("$it Celsius") }
//        }
//
//        launch {
//            temps.collect { log ("${celsiusToFahrenheit(it)} Fahrenheit")}
//        }
//    }
//}

// работа с ОДНИМ, общим (горячим) потоком
fun main() {
    val temps = getTemperatures()

    runBlocking {
        val sharedTempsFlow = temps.shareIn(this, SharingStarted.Lazily)

        launch {
            sharedTempsFlow.collect { println("$it Celsius")}
        }

        launch {
            sharedTempsFlow.collect { println("${celsiusToFahrenheit(it)} Fahrenheit")}
        }
    }
}