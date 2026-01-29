package ch_16_threads.common_vs_state_threads_comparison

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class BroadCaster {
    private val _messages = MutableSharedFlow<String>()
    val messages = _messages.asSharedFlow() // общий поток

    fun beginBroadcasting(scope: CoroutineScope) {
        scope.launch {
            _messages.emit("Привет!")
            _messages.emit("Здаврова!")
            _messages.emit("Whats Up!")
        }
    }
}

fun main() {
    runBlocking {
        val broadCaster = BroadCaster()
        broadCaster.beginBroadcasting(this)

        // абонент не сможет получить сообщения из потока,
        // т.к. он подключился к нему уже после того,
        // как эти сообщения появились в потоке
        delay(150.milliseconds)
        broadCaster.messages.collect {
            println("Message: $it")
        }
    }
}