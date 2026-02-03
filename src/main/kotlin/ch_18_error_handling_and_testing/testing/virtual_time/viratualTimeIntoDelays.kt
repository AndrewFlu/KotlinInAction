package ch_18_error_handling_and_testing.testing.virtual_time

import kotlinx.coroutines.test.*
import kotlinx.coroutines.*
import org.junit.Test
import kotlin.test.*
import kotlin.time.Duration.Companion.seconds

class PlaygroundTest {

    @Test
    fun testDelay() {
        runTest{
            val startTime = System.currentTimeMillis()
            delay(20.seconds)
            println(System.currentTimeMillis() - startTime)
        }
    }
}