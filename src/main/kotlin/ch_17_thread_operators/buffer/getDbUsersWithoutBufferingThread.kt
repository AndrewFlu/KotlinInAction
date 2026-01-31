package ch_17_thread_operators.buffer

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun getAllUserIds(): Flow<Int> {
    return flow{
        repeat(3) {
            delay(250.milliseconds) // задержка базы данных
            log("Выбрасываем значение в холодный поток")
            emit(it)
        }
    }
}

suspend fun getProfileFromNetwork(id: Int): String {
    delay(2.seconds) // сетевая задержка
    return "Профиль пользователя в id: [$id]"
}

fun main() {
    val ids = getAllUserIds()
    runBlocking {
        ids
            .buffer(3)
            .map {
                getProfileFromNetwork(it)
            }
            .collect {
                log("Получен профиль пользователя с id: [$it]")
            }
    }
}