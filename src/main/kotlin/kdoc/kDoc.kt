package kdoc

import ch02_language_basis.language_bases.Person
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

/**
 * Вычисление суммы двух чисел [a] и [b]
 */
fun sum(a: Int, b: Int) = a + b

/**
 * Функция приостановки. Получает данные пользователя по сети
 * @return холодный поток с данными пользователя
 */
suspend fun getUserData(): Flow<Person> {
    return flow {
        delay(1.seconds)
        emit(Person("Juran", false))
    }
}

fun main() {
    println (sum(5, 5))

    runBlocking {
        getUserData()
            .onEach { println(it) }
            .collect ({})
    }
}