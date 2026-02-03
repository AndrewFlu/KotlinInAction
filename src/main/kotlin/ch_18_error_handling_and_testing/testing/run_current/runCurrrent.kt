package ch_18_error_handling_and_testing.testing.run_current

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.milliseconds

class RunCurrentTest {
    @Test
    fun testDelay() = runTest {
        var x = 0
        launch {
            x++
            launch {
                x++
            }
        }
        launch {
            delay(250.milliseconds)
            x++
        }


        runCurrent() // зупускает запланированные на данный момент корутины
        assertEquals(2, x)

        advanceUntilIdle() // запускает в том числе и отложенные корутины
        assertEquals(3, x)

    }

}