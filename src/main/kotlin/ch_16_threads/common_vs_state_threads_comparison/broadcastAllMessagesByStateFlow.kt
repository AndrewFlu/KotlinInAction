package ch_16_threads.common_vs_state_threads_comparison

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class Broadcaster {
    private val _messages = MutableStateFlow<List<String>>(emptyList())
    val messages = _messages.asStateFlow() // поток состояний

    fun broadcasting(scope: CoroutineScope) {
        scope.launch {
            _messages.update { it + "Привет!" }
            _messages.update { it + "Здарова!" }
            _messages.update { it + "Hi there!" }
        }
    }
}

fun main() {
    runBlocking {
        val broadcaster = Broadcaster()
        broadcaster.broadcasting(this)

        // подклюбчение абонента к потоку состояний
        delay(250.milliseconds)
        broadcaster.messages.collect { println(it) }
    }
}