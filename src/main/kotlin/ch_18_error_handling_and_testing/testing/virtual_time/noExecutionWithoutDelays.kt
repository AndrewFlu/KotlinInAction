package ch_18_error_handling_and_testing.testing.virtual_time

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.currentTime
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class DelayTest {
    @Test
    fun testDelayWithoutDelayedFunctions(): Unit = runTest{
        var x = 0
        launch {
            x++
        }
        launch {
            x++
        }

        assertEquals(2, x)
    }

    @Test
    fun testDelay() {
        runTest {
            var x = 0
            launch {
                delay(500.milliseconds)
                x++
            }
            launch {
                delay(1.seconds)
                x++
            }
            println(currentTime) // 0

            delay(600.milliseconds)
            assertEquals(1, x) // т.к. успеет отработать первый инкремент
            println(currentTime) // 600

            delay(500.milliseconds)
            assertEquals(2, x) // т.к. уже отработают оба инкремента
            println(currentTime) // 1100
        }

    }
}
