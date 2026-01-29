package ch_16_threads.state_threads

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViewCounter {
    private val _counter = MutableStateFlow<Int>(0)
    val counter = _counter.asStateFlow()

    fun increment() {
        return _counter.update { it + 1 }
    }
}

fun main() {
    val viewCounter = ViewCounter()
    viewCounter.increment()

    println("${viewCounter.counter.value}")
}

