package ch_17_thread_operators.thread_phases

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        process(flowOf(1, 2, 3))

        process(flowOf())
    }
}

private suspend fun  process(flow: Flow<Int>) {
    flow
        .onEmpty {
            println("Поток пуст! Добавляем значение по умолчанию...")
            emit(0)
        }
        .onStart {
            println("Начало работы")
        }
        .onEach {
            println("Элемент $it")
        }
        .onCompletion {
            println("Готово!")
        }
        .collect{
            println()
        }
}
