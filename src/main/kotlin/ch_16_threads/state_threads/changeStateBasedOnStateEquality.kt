package ch_16_threads.state_threads

import ch_14_coroutines.coroutines_constructors.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

enum class Direction {
    LEFT,
    RIGHT,
}

class DirectionSelector {
    private val _direction = MutableStateFlow(Direction.LEFT)
    val direction = _direction.asStateFlow()

    fun turn(dir: Direction) {
        _direction.update { dir }
    }
}

fun main() {
    runBlocking {
        val switch = DirectionSelector()

        launch {
            switch.direction.collect {
                log("Currect direction: $it")
            }
        }

        delay(250.milliseconds)
        switch.turn(Direction.RIGHT)

        delay(250.milliseconds)
        switch.turn(Direction.LEFT)

        // здесь не быдет изменено сосстояние в потоке, т.к. текущее и предлагаемое значения равны
        delay(250.milliseconds)
        switch.turn(Direction.LEFT)
    }

}

