package ch_16_threads.hot_threads

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class RadioStation {
    // определение нового изменяемого потока в качестве приватного свойства
    private val _messageFlow = MutableSharedFlow<Int>()

    // предоставление общего потока в виде, доступном только для чтения
    val messageFlow = _messageFlow.asSharedFlow()

    fun beginBroadCasting(scope: CoroutineScope) {
        scope.launch {
            while (true) {
                delay(500.milliseconds)
                val number = Random.nextInt(0, 10)
                log("Emiting $number")
                _messageFlow.emit(number) // выброс значения в изменяемый общий поток из корутины
            }
        }
    }
}

fun main() {
    runBlocking {
        val radioStation = RadioStation()
        radioStation.beginBroadCasting(this)

        // добавляем подписчика
        launch {
            delay(1.seconds)
            radioStation.messageFlow.collect {
                println("A collecting $it")
            }
        }

        // добавляем ещё одного подписчика
        launch {
            delay(3.seconds)
            radioStation.messageFlow.collect {
                println("B collecting $it")
            }
        }
    }
}