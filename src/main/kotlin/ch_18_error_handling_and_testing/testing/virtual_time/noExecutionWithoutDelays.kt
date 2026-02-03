package ch_18_error_handling_and_testing.testing.virtual_time

import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals

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
}
